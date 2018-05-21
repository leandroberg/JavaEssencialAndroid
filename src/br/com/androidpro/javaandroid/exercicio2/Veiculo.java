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
public class Veiculo implements IVeiculo {
    
    private int velocidade;
    private int marcha;
    
    public Veiculo(int velocidade, int marcha){
        this.velocidade = velocidade;
        this.marcha = marcha;
    }
    
    @Override
    public void acelear(int incremento){
        this.velocidade = this.velocidade + incremento;
    }
    
    @Override
    public void trocarMarcha(int novaMarcha){
        this.marcha = novaMarcha;
    }
    
    public void mostrar(){
        System.out.println("Veiculo: Velocidade " + this.velocidade + " Marcha " + this.marcha);
    }
    
}
