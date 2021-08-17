/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3_proveer;

import java.util.Random;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 13/08/2021
 *
 */
public class Aleatorio implements Proveedor {

    Random random = new Random();

    @Override
    public Integer obtener() {
        //Nos retorna un valor entre 1000
        return random.nextInt(1000);
    }

}
