public class House {

    private int numberOfFloors;
    private int numberOfRooms;
    private int numberOfWindows;

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }
}