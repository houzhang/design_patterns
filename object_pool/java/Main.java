public class Main {

    public static void main(String[] args) {

        Worker w1 = WorkerPool.getWorker();

        System.out.println("Got worker: " + w1);
        System.out.println("available: " + WorkerPool.available);
        System.out.println("inUse: " + WorkerPool.inUse);

        WorkerPool.releaseWorker(w1);
        System.out.println("released workder: " + WorkerPool.available);
        System.out.println("available: " + WorkerPool.available);
        System.out.println("inUse: " + WorkerPool.inUse);

        Worker w2 = WorkerPool.getWorker();

        System.out.println("Got worker: " + w2);
        System.out.println("available: " + WorkerPool.available);
        System.out.println("inUse: " + WorkerPool.inUse);

        WorkerPool.releaseWorker(w2);
        System.out.println("released workder: " + WorkerPool.available);
        System.out.println("available: " + WorkerPool.available);
        System.out.println("inUse: " + WorkerPool.inUse);

    }
}