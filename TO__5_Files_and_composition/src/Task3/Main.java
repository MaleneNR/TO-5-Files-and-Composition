package Task3;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
    Room kitchen = new Room(2,3);
    Room bathroom = new Room(2,1);
    Room livingRoom = new Room(3,4);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(kitchen);
        rooms.add(bathroom);
        rooms.add(livingRoom);

    Building house = new Building(rooms, 1);

        System.out.println("Lamps in building: " + countLampsInBuilding(house));
        System.out.println("Windows in building: " + countWindowsInBuilding(house));
        System.out.println("Rooms in building: " + countRoomsInBuilding(house));
        System.out.println("Building is normal: " + isNormal(house));

    }



    
    public static int countLampsInBuilding(Building building){
        int lampsInBuilding = 0;
        for (Room room : building.getRooms()){
            lampsInBuilding += room.getNumberOfLamps();
        }
        return lampsInBuilding;
    }

    public static int countWindowsInBuilding(Building building){
        int windowsInBuilding = 0;
        for(Room room : building.getRooms()){
            windowsInBuilding += room.getNumberOfWindows();
        }
        return windowsInBuilding;
    }

    public static int countRoomsInBuilding(Building building){
        return building.getRooms().size();
    }

    public static boolean isNormal(Building building){ //is it normal that numOfFloor is greater than og equals to numOfRooms?
        if (building.getNumberOfFloors() >= building.getRooms().size()){
            return true;
        } else{
            return false;
        }

    }

}

