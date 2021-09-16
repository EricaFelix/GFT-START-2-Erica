package com.company;

public class IPI implements Imposto{
    @Override
    public double calculaImposto(double valor) {
        if (valor < 20000){
            return valor - (valor * 5 / 100);
        } else {
            return valor - (valor * 11 / 100);
        }
    }
}
