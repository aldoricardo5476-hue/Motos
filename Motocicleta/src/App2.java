import java.awt.Color;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
       
        ArrayList<Motocicleta> motos = new ArrayList<>();
        motos.add(new Motocicleta(Color.BLACK, 4, 180, false));
        motos.add(new Motocicleta(Color.RED, 2, 160, true));    
        motos.add(new Motocicleta(Color.BLUE, 6, 200, false));
        motos.add(new Motocicleta(new Color(128,128,0), 1, 120, true));
        motos.add(new Motocicleta(new Color(0,128,0), 4, 140, false));
        motos.add(new Motocicleta(new Color(255,0,255), 3, 150, true));
        motos.add(new Motocicleta(new Color(255,255,0), 5, 190, false));
        motos.add(new Motocicleta(new Color(0,255,255), 2, 170, true));
        motos.add(new Motocicleta(new Color(128,0,128), 4   , 160, false));
        motos.add(new Motocicleta(new Color(0,128,128), 6, 210, true));
            
        for (Motocicleta moto : motos) {
                System.out.println(moto);
            }
       
        }                                                              
    }

