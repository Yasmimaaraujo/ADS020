/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

import java.io.Serializable;

/**
 *
 * @author 17214290008
 */
public class Aluno implements Serializable {
    
    private int matricula;
    private int id;
    private String nome;
    
    public int getMatricula (){
        return matricula;
        
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public int getId (){
        return id;
        
    }
    public void serId(int id){
        this.id = id;
        
    }
    
    public String getNome (){
        return nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome; 
    }
}
    