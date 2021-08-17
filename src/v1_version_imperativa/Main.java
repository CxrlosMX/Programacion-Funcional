/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1_version_imperativa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 9/08/2021
 *
 */
public class Main {

    public static void main(String[] args) {
        new Main(); //Instrucción para no poner los métodos estaticos
    }

    public Main() {
        /*
         ¿QUE QUEREMOS HACER?
         1.-Crear una Lista de Enteros
         2.-Quedarme solo con los pares
         3.-Pasar cada número al cuadrado
         4.-Mostrar cada cuadrado por pantalla
         5.-Obtener la suma de los cuadrados
         */

        //-----INICIO PROYECTO
        //1.-Crear una Lista de Enteros
        List<Integer> numeros = crearLista();
        System.out.println(numeros);
        //2.-Quedarme solo con los pares
        List<Integer> pares = filtrarPares(numeros);
        System.out.println(pares);
        //3.-Pasar cada número al cuadrado
        List<Integer> cuadrados = elevarAlCuadrado(pares);
        System.out.println(cuadrados);
        // 4.-Mostrar cada cuadrado por pantalla
        List<Integer> mostrados = mostrarLista(cuadrados);
        // 5.-Obtener la suma de los cuadrados
        int total = sumarLista(mostrados);
        System.out.println("Suma de Cuadrados: "+total);
    }

    private List<Integer> crearLista() {
        return Arrays.asList(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
    }

    private List<Integer> filtrarPares(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        //Recorro la Lista y se agrega a la lista resultado solo los numeros pares
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                resultado.add(numero);
            }
        }
        return resultado;
    }

    private List<Integer> elevarAlCuadrado(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer numero : numeros) {
            resultado.add((int) Math.pow(numero, 2));
        }
        return resultado;
    }

    private List<Integer> mostrarLista(List<Integer> numeros) {
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        return numeros;
    }

    private int sumarLista(List<Integer> numeros) {
        int total = 0;
        for (Integer numero : numeros) {
            total += numero;
        }
        return total;
    }

}
