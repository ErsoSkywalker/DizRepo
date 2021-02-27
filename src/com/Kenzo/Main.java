package com.Kenzo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String entrada;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        entrada = scanner.nextLine();
        System.out.println("Numero romano = ");
        Romanos(Integer.parseInt(entrada));
    }

    public static void Romanos(int entrada) {
        String[][] list = {
                new String[] {"","M","MM","MMM"},
                new String[] {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                new String[] {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                new String[] {"","I","II","III","IV","V","VI","VII","VIII","IX"}
        };



        for(int i = 1000, j = 0; i >= 1; i/=10, j++)
            System.out.print(list[j][(entrada/i)%10]);


        /*
        int millares = (entrada/1000)%10;
        int centenas = (entrada/100)%10;
        int decenas = (entrada/10)%10;
        int unidades = (entrada/1)%10;

        RegExp matcher
        matches();

        for(int i = 0; i < 4; i++)
            System.out.println(list[i][Integer.toString(entrada).charAt(i)]);


        System.out.println(list[0][millares] + list[1][centenas] + list[2][decenas] + list[3][unidades]);
        */
    }
}