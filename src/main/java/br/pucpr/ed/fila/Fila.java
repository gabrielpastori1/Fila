package br.pucpr.ed.fila;

public interface Fila {

    void add(Integer e);

    Integer remove();

    Integer first();

    Integer size();

    Boolean isEmpty();
    
    void dump();
}
