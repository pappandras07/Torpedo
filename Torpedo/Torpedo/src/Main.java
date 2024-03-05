import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Battlefield battlefield = InizilazeBattlefield();
        ArrayList<Ship> ships = InizilazeShips(battlefield);
        for (int i = 0; i < ships.size(); i++) {
            System.out.println(ships.get(i).occupiedFields);
        }
        MyFrame frame = new MyFrame(ships,battlefield);

    }



    public static Battlefield InizilazeBattlefield() {
        Battlefield battlefield = new Battlefield();
        battlefield.GenerateFields();
        battlefield.GenerateBoolFields();
        return battlefield;
    }
    public static ArrayList<Ship> InizilazeShips(Battlefield battlefield) {
        Random rnd = new Random();

        ArrayList<Ship> ships = new ArrayList<>();


        //Carrier
        Carrier carrier = new Carrier();


        int x = rnd.nextInt(10);
        int y = rnd.nextInt(10);

        carrier.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, carrier, x, y, carrier.occupancy);
        ships.add(carrier);


        //Battleships
        ArrayList<Battleship> battleships = new ArrayList<>();

        Battleship battleship1 = new Battleship();
        Battleship battleship2 = new Battleship();

        while(!battlefield.bollfields[x][y] == false){
        x = rnd.nextInt(10);
        y = rnd.nextInt(10);}
        battleship1.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, battleship1, x, y, battleship1.occupancy);
        battleships.add(battleship1);

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        battleship2.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, battleship2, x, y, battleship2.occupancy);
        battleships.add(battleship2);


        //Cruisers
        ArrayList<Cruiser> cruisers = new ArrayList<>();
        Cruiser cruiser1 = new Cruiser();
        Cruiser cruiser2 = new Cruiser();
        Cruiser cruiser3 = new Cruiser();


        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        cruiser1.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, cruiser1, x, y, cruiser1.occupancy);
        cruisers.add(cruiser1);

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        cruiser2.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, cruiser2, x, y, cruiser2.occupancy);
        cruisers.add(cruiser2);

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        cruiser3.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, cruiser3, x, y, cruiser3.occupancy);
        cruisers.add(cruiser3);

        //Submarines
        ArrayList<Submarine> submarines = new ArrayList<>();
        Submarine submarine1 = new Submarine();
        Submarine submarine2 = new Submarine();
        Submarine submarine3 = new Submarine();
        Submarine submarine4 = new Submarine();

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        submarine1.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, submarine1, x, y, submarine1.occupancy);
        submarines.add(submarine1);

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        submarine2.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, submarine2, x, y, submarine2.occupancy);
        submarines.add(submarine2);

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        submarine3.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, submarine3, x, y, submarine3.occupancy);
        submarines.add(submarine3);

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        submarine4.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, submarine4, x, y, submarine4.occupancy);
        submarines.add(submarine4);


        //Destroyers
        ArrayList<Destroyer> destroyers = new ArrayList<>();
        Destroyer destroyer1 = new Destroyer();
        Destroyer destroyer2 = new Destroyer();
        Destroyer destroyer3 = new Destroyer();
        Destroyer destroyer4 = new Destroyer();
        Destroyer destroyer5 = new Destroyer();

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        destroyer1.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, destroyer1, x, y, destroyer1.occupancy);
        destroyers.add(destroyer1);

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        destroyer2.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, destroyer2, x, y, destroyer2.occupancy);
        destroyers.add(destroyer2);

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        destroyer3.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, destroyer3, x, y, destroyer3.occupancy);
        destroyers.add(destroyer3);

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        destroyer4.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, destroyer4, x, y, destroyer4.occupancy);
        destroyers.add(destroyer4);

        while(!battlefield.bollfields[x][y] == false){
            x = rnd.nextInt(10);
            y = rnd.nextInt(10);}
        destroyer5.occupiedFields.add(battlefield.fields[x][y]);
        battlefield.bollfields[x][y] = true;
        GenarateShip(battlefield, destroyer5, x, y, destroyer5.occupancy);
        destroyers.add(destroyer5);

        ships = LoadShips(ships,battleships,cruisers,submarines,destroyers);

        return ships;

    }
    public static void GenarateShip(Battlefield battlefield, Ship ship, int x, int y, int shipLength){
        Random rnd = new Random();
        List<ShipMovement> shipMovements = new ArrayList<>();

        int i = 0;
        while (shipMovements.isEmpty()){
            if (i > 0){
                ship.occupiedFields.remove(0);
                while(!battlefield.bollfields[x][y] == false){
                    x = rnd.nextInt(10);
                    y = rnd.nextInt(10);}
                ship.occupiedFields.add(battlefield.fields[x][y]);
            }
            if (EnoughPlacesToTheTop(x, y, battlefield, shipLength)){
                int finalX = x;
                int finalY = y;
                shipMovements.add((battlefield1, carrier1, x1, y1, shipLength1)
                        -> LetsGoUp(battlefield, ship, finalX, finalY, shipLength));
            }
            if (EnoughPlacesToTheRight(x, y, battlefield, shipLength)){
                int finalY1 = y;
                int finalX2 = x;
                shipMovements.add((battlefield1, carrier1, x1, y1, shipLength1)
                        -> LetsGoRight(battlefield, ship, finalX2, finalY1, shipLength));
            }
            if (EnoughPlacesToTheBottom(x, y, battlefield, shipLength)){
                int finalX1 = x;
                int finalY2 = y;
                shipMovements.add((battlefield1, carrier1, x1, y1, shipLength1)
                        -> LetsGoDown(battlefield, ship, finalX1, finalY2, shipLength));
            }
            if (EnoughPlacesToTheLeft(x, y, battlefield, shipLength)){
                int finalX3 = x;
                int finalY3 = y;
                shipMovements.add((battlefield1, carrier1, x1, y1, shipLength1)
                        -> LetsGoLeft(battlefield, ship, finalX3, finalY3, shipLength));
            }
            i++;
        }
        int z = rnd.nextInt(shipMovements.size());
        shipMovements.get(z).moveShip(battlefield, ship, x, y, shipLength);
    }
    public static boolean EnoughPlacesToTheRight(int x,int y,Battlefield battlefield,int shipLength){
        if (battlefield.fields.length-y >= shipLength){
            for (int i = 1; i < shipLength; i++) {
                if (battlefield.bollfields[x][y+i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static boolean EnoughPlacesToTheLeft(int x,int y,Battlefield battlefield,int shipLength){
        if ((y+1)>=shipLength){
            for (int i = 1; i < shipLength; i++) {
                if (battlefield.bollfields[x][y-i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static boolean EnoughPlacesToTheTop(int x,int y,Battlefield battlefield,int shipLength){
        if ((x+1)>=(shipLength)){
            for (int i = 1; i < shipLength; i++) {
                if (battlefield.bollfields[x-i][y]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static boolean EnoughPlacesToTheBottom(int x,int y,Battlefield battlefield,int shipLength){
        if (battlefield.fields.length-x >=shipLength){
            for (int i = 1; i < shipLength; i++) {
                if (battlefield.bollfields[x+i][y]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void LetsGoUp(Battlefield battlefield, Ship ship, int x, int y, int shipLength){
        for (int i = 0; i < shipLength-1; i++) {
            ship.occupiedFields.add(battlefield.fields[x-(i+1)][y]);
            battlefield.bollfields[x-(i+1)][y] = true;
        }
    }
    public static void LetsGoRight(Battlefield battlefield, Ship ship, int x, int y, int shipLength){
        for (int i = 0; i < shipLength-1; i++) {
            ship.occupiedFields.add(battlefield.fields[x][y+(i+1)]);
            battlefield.bollfields[x][y+(i+1)] = true;
        }
    }
    public static void LetsGoDown(Battlefield battlefield, Ship ship, int x, int y, int shipLength){
        for (int i = 0; i < shipLength-1; i++) {
            ship.occupiedFields.add(battlefield.fields[x+(i+1)][y]);
            battlefield.bollfields[x+(i+1)][y] = true;
        }
    }
    public static void LetsGoLeft(Battlefield battlefield, Ship ship, int x, int y, int shipLength){
        for (int i = 0; i < shipLength-1; i++) {
            ship.occupiedFields.add(battlefield.fields[x][y-(i+1)]);
            battlefield.bollfields[x][y-(i+1)] = true;
        }
    }
    public static ArrayList<Ship> LoadShips(ArrayList<Ship> ships,ArrayList<Battleship> battleships,ArrayList<Cruiser> cruisers,ArrayList<Submarine> submarines,ArrayList<Destroyer> destroyers){
        for (int i = 0; i < battleships.size(); i++) {
            ships.add(battleships.get(i));
        }
        for (int i = 0; i < cruisers.size(); i++) {
            ships.add(cruisers.get(i));
        }
        for (int i = 0; i < submarines.size(); i++) {
            ships.add(submarines.get(i));
        }
        for (int i = 0; i < destroyers.size(); i++) {
            ships.add(destroyers.get(i));
        }

        return ships;
    }


}