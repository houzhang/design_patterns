import java.util.HashMap;
import java.util.Map;

public class WorkerPool {

    private static long expTime = 6000;
    public static HashMap<Worker, Long> available = new HashMap<>();
    public static HashMap<Worker, Long> inUse = new HashMap<>();

    public synchronized static Worker getWorker() {
        long now = System.currentTimeMillis();
        if (available.isEmpty()) {
            Worker worker = new Worker();
            inUse.put(worker, now);
            return worker;
        } else {
            for (Map.Entry<Worker, Long> entry: available.entrySet()) {

                System.out.println("Checking working: " + entry);
                if (now - entry.getValue() > expTime) {
                    System.out.println("expired");
                    popElement(available);
                } else {
                    Worker worker = popElement(available, entry.getKey());
                }
            }
        }
        return null;
    }

    public synchronized static void releaseWorker(Worker worker) {
        cleanUp(worker);
        available.put(worker, System.currentTimeMillis());
        inUse.remove(worker);
    }

    private static Worker popElement(HashMap<Worker, Long> map) {
        Map.Entry<Worker, Long> entry = map.entrySet().iterator().next();
        Worker key = entry.getKey();
        map.remove(entry.getKey());
        return key;
    }

    private static Worker popElement(HashMap<Worker, Long> map, Worker key) {
        map.remove(key);
        return key;
    }

    private static void cleanUp(Worker worker) {
        worker.setStatus(null);
    }


}