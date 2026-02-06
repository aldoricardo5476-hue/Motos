import java.awt.Color;
public class Motocicleta {
        Color color;
        int cilindros;
        int velocidadMaxima;
        boolean encendida;
       
        Motocicleta(Color color, int cilindros, int velocidadMaxima, boolean encendida) {
         this.color = color;
         this.cilindros = cilindros;
         this.velocidadMaxima = velocidadMaxima;
         this.encendida = encendida;
         
        }
        void encender() {
         System.out.println("La motocicleta está encendida.");
        }
        void arrancar() {
         System.out.println("La motocicleta ha arrancado.");
        }
        void acelerar() {
         System.out.println("La motocicleta está acelerando.");
        }
        void frenar() {
         System.out.println("La motocicleta está frenando.");
        }
        void apagar() {
         System.out.println("La motocicleta está apagada.");
        }
        public boolean isEncendida() {
            return encendida;
        }
        public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
        public String toString() {
            return "Motocicleta [color=" + color + ", cilindros=" + cilindros + ", velocidadMaxima=" + velocidadMaxima
                    + ", encendida=" + encendida + "]";
        }
    }
