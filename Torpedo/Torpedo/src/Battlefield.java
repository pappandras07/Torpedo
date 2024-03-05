import java.util.ArrayList;

public class Battlefield {
    String[][] fields = new String[10][10];
    Boolean[][] bollfields = new Boolean[10][10];


    public void GenerateFields(){
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields.length; j++) {
                switch (i){
                    case 0:
                        fields[i][j] = "A"+(j+1);
                        break;
                    case 1:
                        fields[i][j] = "B"+(j+1);
                        break;
                    case 2:
                        fields[i][j] = "C"+(j+1);
                        break;
                    case 3:
                        fields[i][j] = "D"+(j+1);
                        break;
                    case 4:
                        fields[i][j] = "E"+(j+1);
                        break;
                    case 5:
                        fields[i][j] = "F"+(j+1);
                        break;
                    case 6:
                        fields[i][j] = "G"+(j+1);
                        break;
                    case 7:
                        fields[i][j] = "H"+(j+1);
                        break;
                    case 8:
                        fields[i][j] = "I"+(j+1);
                        break;
                    case 9:
                        fields[i][j] = "J"+(j+1);
                        break;

                }
            }
        }
    }
    public void GenerateBoolFields(){
        for (int i = 0; i < bollfields.length; i++) {
            for (int j = 0; j < bollfields.length; j++) {
                bollfields[i][j] = false;
            }
        }
    }
    public static void DisplayBoolFields(ArrayList<Ship> ships, Battlefield battlefield){


        for (int i = 0; i < battlefield.bollfields.length; i++) {
            int z = 0;
            for (int j = 0; j < battlefield.bollfields.length; j++) {
                if (battlefield.bollfields[i][j]){
                    System.out.print(" 1 ");
                }
                else {
                    System.out.print(" 0 ");
                }
                z++;
                if (z>=10){
                    System.out.println();
                    z=0;
                }
            }

        }
        System.out.println();
    }
}