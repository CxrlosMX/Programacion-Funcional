/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v4_transformar.clases;

import v4_transformar.Funcion;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 17/08/2021
 *
 */
public class Alcuadrado implements Funcion {

    @Override
    public Integer transformar(Integer n) {
        return (int) (Math.pow(n, 2));
    }

}
