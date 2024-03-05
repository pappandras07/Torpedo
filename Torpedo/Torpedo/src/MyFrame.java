import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MyFrame extends JFrame {
    JFrame frame = new JFrame();
    JButton[][] buttons = new JButton[10][10];
    static ArrayList<Ship> alredySunkenShips = new ArrayList<>();
    static int numberOfClicks = 0;


    MyFrame(ArrayList<Ship> ships, Battlefield battlefield) {
        JPanel Gridpanel = new JPanel();
        Gridpanel.setBounds(0, 0, 500, 500);
        Gridpanel.setBackground(Color.BLACK);
        Gridpanel.setLayout(new GridLayout(11, 11, 2, 2));

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (j == 0 && i == 0) {
                    Gridpanel.add(new JLabel(""));

                } else if (i > 0 && j == 0) {
                    JLabel label = new JLabel(String.valueOf(battlefield.fields[i - 1][j].charAt(0)), SwingConstants.CENTER);
                    label.setForeground(Color.white);
                    Gridpanel.add(label);
                } else if (j > 0 && i == 0) {
                    JLabel label = new JLabel(String.valueOf(j));
                    label.setHorizontalAlignment(SwingConstants.CENTER);
                    label.setForeground(Color.white);
                    Gridpanel.add(label);
                    Gridpanel.add(label);
                } else {
                    JButton button = new JButton();
                    button.setBackground(Color.white);
                    buttons[i-1][j-1] = button;
                    int finalI = i;
                    int finalJ = j;
                    button.addActionListener(new AbstractAction() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            numberOfClicks++;

                            if (CheckIfThereIsAShip(finalI - 1, finalJ - 1, ships, battlefield)) {
                                button.setBackground(Color.green);
                                button.setEnabled(false);
                                int sunkenShipIndex = WhichShipsSunk(ships);
                                if (sunkenShipIndex != -1){
                                   SetTheSunkenShipBlack(buttons,ships,sunkenShipIndex,battlefield);
                                }

                            }
                            else {
                                button.setBackground(Color.red);
                                button.setEnabled(false);
                            }
                            if (alredySunkenShips.size()==ships.size()){
                                String message = "Gratulálok nyertél ehhez mindössze: " + numberOfClicks + " kattintásra volt szükséged";
                                JOptionPane.showMessageDialog(null,message,"Győzelem",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    });
                    Gridpanel.add(button);
                }
            }
        }
        JFrame frame = new JFrame();
        frame.setSize(510, 535);
        frame.setBackground(Color.red);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Torpedo");
        ImageIcon image = new ImageIcon("logo.jpg");
        frame.setIconImage(image.getImage());
        frame.add(Gridpanel);
        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();
    }

    public static boolean CheckIfThereIsAShip(int x, int y, ArrayList<Ship> ships, Battlefield battlefield) {
        for (int i = 0; i < ships.size(); i++) {
            for (int j = 0; j < ships.get(i).occupancy; j++) {
                if (battlefield.fields[x][y].equals(ships.get(i).occupiedFields.get(j))){
                    ships.get(i).ClickedOccupiedFields.add(battlefield.fields[x][y]);
                }
            }
        }

        for (int i = 0; i < battlefield.bollfields.length * battlefield.bollfields.length; i++) {
            if (battlefield.bollfields[x][y]) {
                return true;
            }
        }
        return false;
    }
    public static int WhichShipsSunk(ArrayList<Ship> ships){
        for (int i = 0; i < ships.size(); i++) {
            for (int j = 0; j < ships.get(i).occupancy; j++) {
                if (!alredySunkenShips.contains(ships.get(i)) && ships.get(i).occupiedFields.size()==ships.get(i).ClickedOccupiedFields.size()){
                    alredySunkenShips.add(ships.get(i));
                    return i;
                }
            }
        }


        return -1;
    }
    public static void SetTheSunkenShipBlack(JButton[][] buttons,ArrayList<Ship> ships,int index,Battlefield battlefield){
        for (int i = 0; i < ships.get(index).ClickedOccupiedFields.size(); i++) {
            for (int j = 0; j < battlefield.fields.length; j++) {
                for (int k = 0; k < battlefield.fields.length; k++) {
                    if (battlefield.fields[j][k].equals(ships.get(index).ClickedOccupiedFields.get(i))){
                        buttons[j][k].setBackground(Color.black);
                    }
                }
            }
        }
    }




    }






