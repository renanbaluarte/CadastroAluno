/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renan.cadastroalunoc;

/**
 *
 * @author rdias
 */
public class Estudante {
    
    private String nome;
    private String matricula;
    private String email;
    private String endereço;
    private String telefone;
    

    
  

    public String obterNome(){
        return nome;
    }

    public String obterMatricula(){
        return matricula;
    }
    
    public String obterTelefone(){
        return telefone;
    }
    
    public String obterEmail(){
        return email;
    }
    
    public String obterEndereco(){
        return endereço;
    }
    
    
    public void alterarNome(String nome){
        this.nome = nome;
    }
    
    public void gerarMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void alterarTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void alterarEndereco(String endereço){
        this.endereço = endereço;
    }
    public void alterarEmail(String email){
        this.email = email;
              
    }
    
}