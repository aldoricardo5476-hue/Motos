import java.awt.Color;

public class App {
    public static void main(String[] args) throws Exception {
        Motocicleta m1 = new Motocicleta(Color.BLACK, 4, 180, false);
        Motocicleta m2 = new Motocicleta(Color.RED, 2, 160, true);
        Motocicleta m3 = new Motocicleta(Color.BLUE, 6, 200, false);
        Motocicleta m4 = new Motocicleta(new Color(128,128,0), 1, 120, true);
        Motocicleta m5 = new Motocicleta(new Color(0,128,0), 4, 140, false);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
    }
}
