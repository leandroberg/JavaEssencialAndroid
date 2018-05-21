/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.androidpro.javaandroid.exercicio2;

/**
 *
 * @author leand
 */
public class Carro extends Veiculo{
    
    private int numeroLugares;
    
    public Carro(int velocidade, int marcha, int numeroLugares){
        super(velocidade, marcha);
        this.numeroLugares = numeroLugares;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Carro: Lugares " + this.numeroLugares);
    }
    
}
