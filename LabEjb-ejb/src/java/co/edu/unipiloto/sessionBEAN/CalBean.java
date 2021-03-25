/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Stateless;

/**
 *
 * @author jorge_j3qr4sd
 */
@Stateless
public class CalBean implements CalBeanLocal {

    @Override
    public Integer sumar(int valor1, int valor2) {
        
        return valor1 + valor2; 
    }

    @Override
    public Integer restar(int v1, int v2) {
        return v1-v2;
    }

    @Override
    public Integer multiplicar(int val1, int val2) {
        return val1*val2;
    }

    @Override
    public Double dividir(double v1, double v2) {
        return v1/v2;
    }

    @Override
    public Integer modulo(int val1, int val2) {
        return val1%val2;
    }

    @Override
    public Integer potencia(int va1) {
        return va1*va1;
    }

   
   
    
}
