import java.awt.Color;
import java.util.Scanner;

public class MenuPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();

        while (true) {
            System.out.println("\n--- Menú Pila de Motocicletas ---");
            System.out.println("1) Apilar");
            System.out.println("2) Desapilar");
            System.out.println("3) Buscar");
            System.out.println("4) Ver estado de la pila");
            System.out.println("5) Ver cima");
            System.out.println("6) Mostrar pila");
            System.out.println("7) Salir");
            System.out.print("Elija una opción: ");

            String line = sc.nextLine().trim();
            int opt = -1;
            try { opt = Integer.parseInt(line); } catch (Exception e) { opt = -1; }

            switch (opt) {
                case 1:
                    // Pedir datos de la motocicleta
                    System.out.println("Ingrese color (nombre o R G B): ");
                    String colorLine = sc.nextLine().trim();
                    Color color = parseColor(colorLine);

                    int cilindros = readInt(sc, "Ingrese el número de cilindros: ", 1);
                    int velocidadMaxima = readInt(sc, "Ingrese la velocidad máxima: ", 0);

                    System.out.print("¿Está encendida? (si/no): ");
                    boolean encendida = parseBoolean(sc.nextLine().trim());

                    Motocicleta m = new Motocicleta(color, cilindros, velocidadMaxima, encendida);
                    pila.apilar(m);
                    break;

                case 2:
                    pila.desapilar();
                    break;

                case 3:
                    // Buscar por diferentes atributos
                    System.out.println("Buscar por: 1) color 2) cilindros 3) velocidadMaxima 4) encendida");
                    System.out.print("Elija tipo de búsqueda: ");
                    String tline = sc.nextLine().trim();
                    int t = -1; try { t = Integer.parseInt(tline); } catch (Exception e) { t = -1; }
                    boolean found = false;
                    if (pila.isVacia()) {
                        System.out.println("La pila está vacía. Nada que buscar.");
                        break;
                    }
                    switch (t) {
                        case 1: // color
                            System.out.print("Ingrese color (nombre o R G B): ");
                            String cLine = sc.nextLine().trim();
                            Color searchColor = parseColor(cLine);
                            for (int i = 0; i < pila.size(); i++) {
                                Motocicleta e = pila.getElemento(i);
                                if (e != null && e.getColor().equals(searchColor)) {
                                    System.out.println("Encontrado en posición " + i + ": " + e);
                                    found = true;
                                }
                            }
                            break;
                        case 2: // cilindros
                            int scil = readInt(sc, "Ingrese número de cilindros a buscar: ", -1);
                            for (int i = 0; i < pila.size(); i++) {
                                Motocicleta e = pila.getElemento(i);
                                if (e != null && e.getCilindros() == scil) {
                                    System.out.println("Encontrado en posición " + i + ": " + e);
                                    found = true;
                                }
                            }
                            break;
                        case 3: // velocidadMaxima
                            int svel = readInt(sc, "Ingrese velocidad máxima a buscar: ", -1);
                            for (int i = 0; i < pila.size(); i++) {
                                Motocicleta e = pila.getElemento(i);
                                if (e != null && e.getVelocidadMaxima() == svel) {
                                    System.out.println("Encontrado en posición " + i + ": " + e);
                                    found = true;
                                }
                            }
                            break;
                        case 4: // encendida
                            System.out.print("Buscar encendida? (si/no): ");
                            boolean senc = parseBoolean(sc.nextLine().trim());
                            for (int i = 0; i < pila.size(); i++) {
                                Motocicleta e = pila.getElemento(i);
                                if (e != null && e.isEncendida() == senc) {
                                    System.out.println("Encontrado en posición " + i + ": " + e);
                                    found = true;
                                }
                            }
                            break;
                        default:
                            System.out.println("Tipo de búsqueda inválido.");
                    }
                    if (!found) System.out.println("No se encontraron coincidencias.");
                    break;

                case 4:
                    System.out.println("Estado de la pila:");
                    System.out.println("Tamaño (cantidad de elementos): " + pila.size());
                    System.out.println(pila.isVacia() ? "La pila está vacía." : "La pila NO está vacía.");
                    System.out.println(pila.isLlena() ? "La pila está llena." : "La pila NO está llena.");
                    break;

                case 5:
                    Motocicleta top = pila.peek();
                    if (top == null) System.out.println("La pila está vacía.");
                    else System.out.println("Cima -> " + top);
                    break;

                case 6:
                    pila.mostrarPila();
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private static Color parseColor(String s) {
        if (s == null || s.isEmpty()) return Color.BLACK;
        s = s.trim().toLowerCase();
        switch (s) {
            case "black": return Color.BLACK;
            case "red": return Color.RED;
            case "blue": return Color.BLUE;
            case "green": return Color.GREEN;
            case "yellow": return Color.YELLOW;
            case "gray": case "grey": return Color.GRAY;
            case "white": return Color.WHITE;
            case "orange": return Color.ORANGE;
            default:
                String[] parts = s.split("[,\\s]+");
                if (parts.length >= 3) {
                    try {
                        int r = Integer.parseInt(parts[0].trim());
                        int g = Integer.parseInt(parts[1].trim());
                        int b = Integer.parseInt(parts[2].trim());
                        r = Math.max(0, Math.min(255, r));
                        g = Math.max(0, Math.min(255, g));
                        b = Math.max(0, Math.min(255, b));
                        return new Color(r, g, b);
                    } catch (NumberFormatException ex) {
                        // fallthrough
                    }
                }
                System.out.println("Color no reconocido, se usará BLACK por defecto.");
                return Color.BLACK;
        }
    }

    private static boolean parseBoolean(String s) {
        if (s == null) return false;
        s = s.trim().toLowerCase();
        return s.equals("true") || s.equals("t") || s.equals("si") || s.equals("s") || s.equals("yes") || s.equals("y");
    }

    private static int readInt(Scanner sc, String prompt, int defaultValue) {
        System.out.print(prompt);
        String line = sc.nextLine().trim();
        try { return Integer.parseInt(line); } catch (Exception e) {
            System.out.println("Entrada inválida, se usará " + defaultValue);
            return defaultValue;
        }
    }

    
}
