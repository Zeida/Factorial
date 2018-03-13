/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsfactorialclient;

/**
 *
 * @author entrar
 */
public class WSFactorialClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=8;
        System.out.println(factorial(num));
    }

    private static int factorial(double num) {
        factorial.WSFactorial_Service service = new factorial.WSFactorial_Service();
        factorial.WSFactorial port = service.getWSFactorialPort();
        return port.factorial(num);
    }
    
}
