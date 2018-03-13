/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author entrar
 */
@WebService(serviceName = "WSFactorial")
public class WSFactorial {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "factorial")
    public int factorial(@WebParam(name = "num") double num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
