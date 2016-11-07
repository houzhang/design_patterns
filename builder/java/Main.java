public class Main {

    public static void main(String args[]) {
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.numberOfFloors(1);
        houseBuilder.numberOfRooms(2);
        houseBuilder.numberOfWindows(3);

        House house = houseBuilder.house();
        System.out.println(house);
    }
}