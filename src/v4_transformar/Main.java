/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_transformar;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v4_transformar.clases.AlCubo;
import v4_transformar.clases.Alcuadrado;

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
        List<Integer> numeros = SuperFunciones.proveer(10, new Naturales());
        System.out.println(numeros);
        //2.-Quedarme solo con los pares
        List<Integer> filtrados = SuperFunciones.filtrar(numeros, new SoloPares());
        System.out.println(filtrados);
        //3.-Obtener de cada número al cuadrado
        List<Integer> transformar = SuperFunciones.transformar(filtrados,new AlCubo());
        System.out.println(transformar);
        // 4.-Mostrar cada cuadrado por pantalla
        List<Integer> mostrados = mostrarLista(transformar);
        // 5.-Obtener la suma de los cuadrados
        int total = sumarLista(mostrados);
        System.out.println("Suma de Cuadrados: " + total);
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
