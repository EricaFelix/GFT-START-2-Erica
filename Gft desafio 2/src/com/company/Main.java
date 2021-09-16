package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double entrada = 0;
        System.out.printf("Digite um Valor: ");
        entrada = sc.nextDouble();
        System.out.println("");
        ICMS icms = new ICMS();
        IPI ipi = new IPI();
        COFINS cofins = new COFINS();
        double vIcms = icms.calculaImposto(entrada);
        double VIpi = ipi.calculaImposto(entrada);
        double vCofins = cofins.calculaImposto(entrada);
        System.out.println("ICMS sobre seu valor: " + vIcms);
        System.out.println("ICMS sobre seu valor: " + VIpi);
        System.out.println("ICMS sobre seu valor: " + vCofins);
        System.out.println("---------------------------\n");
        double vTotal = vIcms + VIpi + vCofins;
        System.out.println("Somatorio com Impostos: " + vTotal);



        sc.close();
    }
}
