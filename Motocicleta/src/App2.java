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
        /*Scanner sc = new Scanner(System.in);
        Motocicleta[] motos = new Motocicleta [2];
        int cilindros;
        int velocidadMaxima;    
        boolean encendida;
        Color color;

        System.out.println("Ingrese los datos de las motocicletas:");
        for (int i = 0; i < motos.length; i++) {
            System.out.println("Motocicleta " + (i+1) + ":");
            System.out.print("Ingrese el color (R G B): ");
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();
            color = new Color(r, g, b);
            System.out.print("Ingrese el número de cilindros: ");
            cilindros = sc.nextInt();
            System.out.print("Ingrese la velocidad máxima: ");
            velocidadMaxima = sc.nextInt();
            System.out.print("¿Está encendida? (true/false): ");
            encendida = sc.nextBoolean();
            motos[i] = new Motocicleta(color, cilindros, velocidadMaxima, encendida);
        }

        System.out.println("Datos de las motocicletas ingresadas:");
        for (int i = 0; i < motos.length; i++) {
            System.out.println(motos[i]);
        } 
        sc.close();*/
        /*motos[0] = new Motocicleta(Color.BLACK, 4, 180, false);
        motos[1] = new Motocicleta(Color.RED, 2, 160, true);
        motos[2] = new Motocicleta(Color.BLUE, 6, 200, false);
        motos[3] = new Motocicleta(new Color(128,128,0), 1, 120, true);
        motos[4] = new Motocicleta(new Color(0,128,0), 4, 140, false);          
        
        System.out.println(motos[0]);
        System.out.println(motos[1]);
        System.out.println(motos[2]);
        System.out.println(motos[3]);
        System.out.println(motos[4]);*/
        
        
        //for (int i = 0; i < motos.length; i++) {
            //System.out.println(motos[i]);
        }                                                              
    }

