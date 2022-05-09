package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);
    /*
        System.out.println("Ejercicio 1");
        int N = 10;
        double A = 350000;
        char C = 'a';
        System.out.println("Valores de cada Variable");
        System.out.println("N = " + N);
        System.out.println("A = " + A);
        System.out.println("C = " + C);

        System.out.println("Ejercicio 2");

        int X =24;
        int Y =12;
        double N =150000;
        double M = 225000;
        int multiplica = X * Y;
        double suma = N + M;
        System.out.println(String.format("La suma de N %s + M %s  es igual a %s", N, M,suma));
        System.out.println(String.format("La multiplicacion de X %s e Y %s es igual a %s",X, Y , multiplica));


        System.out.println("Ejercicio 3");

        int N = 10;
        int suma = N + 77;
        int restar3 = suma - 3;
        int porDos = restar3 * 2;
        System.out.println(String.format("N = %s", N));
        System.out.println(String.format("%s + 77 = %s", N, suma));
        System.out.println(String.format("Restar a %s - 3 = %s", suma, restar3));
        System.out.println(String.format("Multiplicar a %s por dos = %s", restar3, porDos));

        System.out.println("Ejercicio 4");
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;
        System.out.println(String.format("A= %s, B= %s, C= %s, D=%s", A, B, C, D));
        B = C;
        C = A;
        A = D;
        D = A;
        System.out.println(String.format("A= %s, B= %s, C= %s, D=%s", A, B, C, D));


        System.out.println("Ejercicio 5");
        int E = 15;
        String parImpar = "par";
        if (E % 2 != 0) {
            parImpar = "impar";
        }
        System.out.println(String.format("El numero elegido es %s",parImpar));


        System.out.println("Ejercicio 6");
        int F = 49;
        String signo= "Negativo";
        if (F >= 0) {
            signo= "Positivo";
        }
        System.out.println(String.format("El numero elegido es %s", signo));


        System.out.println("Ejercicio 7");
        int G = -35;
        String positivo = (G >= 0) ? "positivo" : "negativo";
        String paridad = (G % 2 == 0 ) ? "par" : "impar";
        String multiplo5 = (G % 5 == 0 ) ? "multiplo de 5" : "no es multiplo de 5";
        String multiplo10 = (G % 10 == 0 )? "multiplo de 10" : "no es multiplo de 10";
        System.out.println(String.format("El numero %s es %s, %s, %s y %s", G, positivo, paridad, multiplo5, multiplo10));

        System.out.println("Ejercicio 8");
        System.out.println("Por favor ingrese su nombre");
        String nombre = lee.next();
        System.out.println(String.format("Buenos días %s",nombre));

        System.out.println("Ejercicio 9");
        lee.reset();
        int entero;
        System.out.println("Ingrese un numero entero");
        entero = lee.nextInt();
        int doble =(entero * 2);
        int triple = (entero * 3);
        System.out.printf(String.format("El numero es %s, su doble es %s y su triple es %s", entero, doble, triple));

        System.out.println("Ejercicio 10");
        lee.reset();
        System.out.println("Ingrese la temperatura en Fahrenheit");
        int fahrenheit = lee.nextInt();
        int pasaje= (fahrenheit - 32) * 5/9;
        System.out.println(String.format("%s Fahrenheit equivalen a %s grados centigrados", fahrenheit,pasaje));

        System.out.println("Ejercicio 11");
        System.out.println("Ingrese medida del radio");
        lee.reset();
        float radio;
        radio= lee.nextFloat();
        double longitud = (2 * Math.PI * radio) ;
        double area= Math.PI* (Math.pow(radio,2));
        System.out.println(String.format("Radio = %s, Longitud = %s, Area = %s",radio,longitud,area));
*/
        System.out.println("Ejercicio 12");
        System.out.println("ingrese la velocidad en km/h que desea transformar a m/s");
        lee.reset();
        double km = lee.nextDouble();
        double metroXseg = (km * .28);
        System.out.println(String.format("La velocidad %s km/h equivale a %s m/s",km,metroXseg));

        System.out.println("Ejercicio 13");
        double cateto1;
        double cateto2;
        lee.reset();
        System.out.println("Ingrese cateto 1");
        cateto1 = lee.nextInt();
        System.out.println("Ingresde cateto 2");
        lee.reset();
        cateto2 = lee.nextInt();
        double hipotenusa = Math.pow(cateto1,2) + Math.pow(cateto2,2);
        System.out.println(String.format("La Hipotenusa del escar"));


    }
}
