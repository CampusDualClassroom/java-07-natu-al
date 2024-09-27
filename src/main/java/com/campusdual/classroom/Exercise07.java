package com.campusdual.classroom;
import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(10);
        positionInAList(15);
        sumFirstNaturalNumbers(10);
        showFirstNaturalNumbers(20);
    }
//----------------------------------------------------------------------------------------------------
    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.

    public static void positionInAList(int num) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 10; i > 0; i--) {
            lista.add(i);
        }

        if (!lista.contains(num)) {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        } else {
            int pos = lista.indexOf(num);
            System.out.println("El elemento " + num + " se encuentra en la posición: " + pos);
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int suma = 0;

        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros números " + num + "es igual a : " + suma);
    }


    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        System.out.println("Los primeros " + num + " números positivos son:");

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

}
