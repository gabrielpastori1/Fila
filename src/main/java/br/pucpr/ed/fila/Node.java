package br.pucpr.ed.fila;

public class Node {
    Integer valor;
    Node proximo;

    public Node(Integer valo) {
        valor = valo;
    }
    public Node(Integer valo, Node proxim) {
        valor = valo;
        proximo = proxim;
    }

    public Integer getValor() {
        return valor;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setValor(Integer valo) {
        valor = valo;
    }

    public void setProximo(Node proxim) {
        proximo = proxim;
    }
}