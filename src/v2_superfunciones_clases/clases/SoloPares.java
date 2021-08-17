/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v2_superfunciones_clases.clases;

import v2_superfunciones_clases.interfaces.Predicado;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 12/08/2021
 *
 */
public class SoloPares implements Predicado {

    @Override
    public boolean test(Integer valor) {
        return (valor % 2 == 0);
    }

}
