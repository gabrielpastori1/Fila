package br.pucpr.ed.fila;

public class FilaArray implements Fila {
    private int capacity;
    private Integer[] fila;
    private int inicio;
    private int quantidade;
    
    FilaArray(int capacidade){
        capacity = capacidade;
        fila = new Integer[capacity];
        inicio = 0;
        quantidade = 0;
    }

    @Override
    public void add(Integer e) {
        fila[normalize(inicio+quantidade)] = e;
        quantidade++;
    }

    @Override
    public Integer remove() {
        if(quantidade > 0){
            int buffer = fila[inicio];
            fila[inicio] = null;
            quantidade--;
            inicio++;
            normalize();
            return buffer;
        }
        return null;
    }

    @Override
    public Integer first() {
        return fila[inicio];
    }

    @Override
    public Integer size() {
        return quantidade;
    }

    @Override
    public Boolean isEmpty() {
        return (quantidade == 0);
    }
    private int normalize(int index){
        return index % capacity;
    }

    private void normalize(){
        inicio = inicio%capacity;
    }

    public void dump(){
        for(int i=0; i<capacity; i++){
            System.out.println(i + ": " + fila[i]);

        }
    }
}
