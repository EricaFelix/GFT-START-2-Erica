package com.company;

public class ICMS implements Imposto{
    @Override
    public double calculaImposto(double valor) {
        return valor - (valor * 24 / 100);
    }
}
