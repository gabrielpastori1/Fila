package br.pucpr.ed.fila;

public class FilaListaEncadeada implements Fila {
    private Node inicio;
    private Node fim;
    private int quantidade = 0;


    @Override
    public void add(Integer e) {
        Node nNode = new Node(e);
        if(quantidade == 0) {
            inicio = nNode;
            fim = nNode;
        }else{
            fim.setProximo(nNode);
            fim = nNode;
        }
        quantidade++;
    }
    
    @Override
    public Integer remove() {
        if(quantidade > 0) {
            int buffer = inicio.getValor();
            inicio = inicio.getProximo();
            quantidade--;
            return buffer;
        }
        return null;
    }

    @Override
    public Integer first() {
        return inicio.getValor();
    }

    @Override
    public Integer size() {
        return quantidade;
    }

    @Override
    public Boolean isEmpty() {
        return (quantidade == 0);
    }

    public void dump(){
        Node atual = inicio;
        int i = 0;
        while(atual != null){
            System.out.println(i+": "+ atual.getValor());
            atual = atual.getProximo();
            i++;
        }
    }
}
