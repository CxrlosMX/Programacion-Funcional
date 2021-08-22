/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package v6_reducir;

import v5_actuar_consumir.*;



/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 17/08/2021
 * 
 */
public class AlCubo implements Funcion{

    @Override
    public Integer transformar(Integer valor) {
    return (int)(Math.pow(valor,3));
    }

}
