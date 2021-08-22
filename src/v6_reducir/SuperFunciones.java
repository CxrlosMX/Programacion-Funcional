/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v6_reducir;

import v5_actuar_consumir.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12/08/2021
 *
 */
public class SuperFunciones {

    //Ventaja es un método generico
    public static List<Integer> filtrar(List<Integer> valores, Predicado predicado) {
        List<Integer> resultado = new ArrayList<Integer>();
        for (Integer valor : valores) {
            if (predicado.test(valor)) {
                resultado.add(valor);
            }
        }
        return resultado;
    }

    public static List<Integer> proveer(int size, Proveedor proveedor) {
        List<Integer> resultado = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            resultado.add(proveedor.obtener());
        }

        return resultado;

    }

    public static List<Integer> transformar(List<Integer> valores, Funcion funcion) {
        List<Integer> resultado = new ArrayList<Integer>();

        for (Integer i : valores) {
            resultado.add(funcion.transformar(i));
        }
        return resultado;
    }

    public static List<Integer> actuar(List<Integer> valores, Consumidor consumidor) {
        for (Integer i : valores) {
            consumidor.aceptar(i);
        }
        return valores;
    }

    public static void consumir(List<Integer> valores, Consumidor consumidor) {
        for (Integer i : valores) {
            consumidor.aceptar(i);
        }

    }

    public static Integer reducir(List<Integer> valores, Integer identidad, FuncionBinaria funcionBinaria) {

        int total = identidad;
        for (Integer valor : valores) {
            total= funcionBinaria.aplicar(total,valor);
        }
        return total;
    }

}
