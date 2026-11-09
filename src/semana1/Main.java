package semana1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //ver si un número es par o impar

        int numero = 5;

        if(numero % 2 == 0){
            System.out.println("El número es par");

        }else{
            System.out.println("El número es impar");
        }

        //tabla de multiplicar
        System.out.println("Tabla de multiplicar de: "+numero);
        for(int i = 0; i < 10; i++){

            System.out.println(numero + " x "+ i + " = "+numero*i);
        }



        for(int i = 0; i <=100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }


        int[] numeros = {4, 9, 2, 7};

        System.out.println(mayor(numeros));
    }

    public static int mayor(int[] numeros){
        int max = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        return max;
    }
}
