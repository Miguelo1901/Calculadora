/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface CalBeanLocal 
{
    
    Integer sumar(int valor1, int valor2);

    Integer restar(int v1, int v2);

    Integer multiplicar(int val1, int val2);

    Double dividir(double v1, double v2);

    Integer modulo(int val1, int val2);

    Integer potencia(int va1);
    
    
}
