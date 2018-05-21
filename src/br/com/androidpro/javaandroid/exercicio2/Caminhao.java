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
public class Caminhao extends Veiculo{
    
    private int capacidadeCarga;
    
    public Caminhao(int velocidade, int marcha, int capacidadeCarga){
        super(velocidade, marcha);
        this.capacidadeCarga = capacidadeCarga;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Caminhao: Capacidade " + this.capacidadeCarga);
    }
    
}
