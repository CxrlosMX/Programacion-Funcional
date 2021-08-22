/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v6_reducir;



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
        List<Integer> numeros = SuperFunciones.proveer(10, new Aleatorio());
        System.out.println(numeros);
        //2.-Quedarme solo con los pares
        List<Integer> filtrados = SuperFunciones.filtrar(numeros, new SoloPares());
        System.out.println(filtrados);
        //3.-Obtener de cada número al cuadrado
        List<Integer> transformados= SuperFunciones.transformar(filtrados,new AlCubo());
        System.out.println(transformados);
        // 4a.-Mostrar cada cuadrado por pantalla y retornar lista
        List<Integer> actuados = SuperFunciones.actuar(transformados,new Impresor() );
        //4b.-Mostrar cada cuadrado por pantalla y no retornar nada
         SuperFunciones.consumir(transformados,new Impresor() );
        // 5.-Obtener la suma de los cuadrados
        int total =SuperFunciones.reducir(actuados,0,new Sumador());
        System.out.println("Reducción : " + total);
    }

  

  

    private int sumarLista(List<Integer> numeros) {
        int total = 0;
        for (Integer numero : numeros) {
            total += numero;
        }
        return total;
    }

}
