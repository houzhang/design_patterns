public class HouseBuilder {

    private House house;

    public HouseBuilder() {
        house = new House();
    }

    public void numberOfFloors(int n) {
        house.setNumberOfFloors(n);
    }

    public void numberOfRooms(int n) {
        house.setNumberOfRooms(n);
    }

    public void numberOfWindows(int n) {
        house.setNumberOfWindows(n);
    }

    public House house() {
        return house;
    }

}