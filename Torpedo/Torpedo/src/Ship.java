import java.util.ArrayList;

public class Ship {
    public Ship(int occupancy, int numberOfShips, ArrayList<String> occupiedFields) {
        this.occupancy = occupancy;
        this.numberOfShips = numberOfShips;
        this.occupiedFields = occupiedFields;

    }

    int occupancy;
    int numberOfShips;
    ArrayList<String> occupiedFields = new ArrayList<>();
    ArrayList<String> ClickedOccupiedFields = new ArrayList<>();

    public static void DiplayShipsList(ArrayList<Ship> ships){
        for (int i = 0; i < ships.size(); i++) {
            System.out.println(ships.get(i).occupiedFields + " ");
        }
    }



}
