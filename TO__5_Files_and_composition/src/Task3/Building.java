package Task3;

import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfFloors;

    Building(ArrayList rooms, int numberOfFloors){
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    public void setRooms(ArrayList rooms){
        this.rooms = rooms;
    }

    public void setNumberOfFloors(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }

    public ArrayList<Room> getRooms(){
        return this.rooms;
    }

    public int getNumberOfFloors(){
        return this.numberOfFloors;
    }


}
