package br.pucpr.ed.fila;

public class MainApp {
    
    public static void main(String[] args) {
        // Fila fila = new FilaArray(5);
        Fila fila = new FilaListaEncadeada();
        fila.add(5);
        fila.add(3);
        fila.remove();
        fila.add(2);
        fila.add(8);
        fila.remove();
        fila.remove();
        fila.add(9);
        fila.add(1);
        fila.remove();
        fila.add(7);
        fila.add(6);
        fila.remove();
        fila.remove();
        fila.add(4);
        fila.remove();
        fila.remove();
        fila.add(5);
        fila.add(11);
        fila.add(10);
        fila.dump();
    }
}
