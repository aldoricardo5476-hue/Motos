public class Pila {
    private Motocicleta pila [];
    private int cima;

    public Pila(){
    pila = new Motocicleta [10];
    cima = -1;
}
    public Pila(int tam){
    pila = new Motocicleta [tam];
    cima = -1;
}
    public void apilar(Motocicleta nuevo){
       if(!isLlena())
       {
        cima ++;
        pila[cima] = nuevo;
       } else {
           System.out.println("Pila llena, no se apiló dato");
       }
    }
    public boolean isLlena(){
        // La cima máxima válida es pila.length - 1
                return cima >= pila.length - 1;
    }
    public int getCima(){
        return cima;
    }
    public void mostrarPila(){
        if(isVacia()) {
        System.out.println("Pila vacía");
       } else {
           for (int i=cima; i >= 0; i--){
               System.out.println(pila[i]);
           }
       }
    }
    public boolean isVacia(){
        if(cima==-1)
                return true;
        else 
            return false;
    }
    public void desapilar(){
        if(isVacia())
       {
        System.out.println("Pila vacía, no se desapiló dato");
       } else {
           pila[cima] = null;
           cima --;
           System.out.println("Dato desapilado");
       }
    }

    // Devuelve la cantidad de elementos en la pila
    public int size() {
        return cima + 1;
    }

    // Devuelve el elemento en la cima sin desapilar
    public Motocicleta peek() {
        if (isVacia()) return null;
        return pila[cima];
    }

    // Devuelve el elemento en la posición dada (0..cima) o null si índice inválido
    public Motocicleta getElemento(int index) {
        if (index < 0 || index > cima) return null;
        return pila[index];
    }
}
