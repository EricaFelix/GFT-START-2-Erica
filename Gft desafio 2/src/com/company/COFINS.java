package com.company;

public class COFINS implements Imposto{
    @Override
    public double calculaImposto(double valor) {
        if (valor > 12000){
            return valor - (valor * 4 / 100);
        } else {
            return valor;
        }
    }

}
