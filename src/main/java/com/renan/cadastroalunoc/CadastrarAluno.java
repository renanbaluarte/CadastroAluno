/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renan.cadastroalunoc;

import static com.renan.cadastroalunoc.Interface.linhas;
import static com.renan.cadastroalunoc.Interface.tempo;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rdias
 */
public class CadastrarAluno {
    
    
    public void cadastrar(){
        
        
        
        while(true){
        Random gerador = new Random();
        Estudante aluno = new Estudante();
        tempo(1);
        Scanner NomeInput = new Scanner(System.in);
        System.out.print("Digite o Nome completo do Aluno: ");
        String respInputNome = NomeInput.nextLine();
        aluno.alterarNome(respInputNome);
        
        
        Scanner EmailInput = new Scanner(System.in);
        System.out.print("Digite o Email Aluno: ");
        String respEmail = EmailInput.nextLine();
        aluno.alterarEmail(respEmail);
        
        Scanner TelInput = new Scanner(System.in);
        System.out.print("Digite o Telefone do Aluno: ");
        String respTel = TelInput.nextLine();
        aluno.alterarTelefone(respTel);
        
        
        Scanner EndInput = new Scanner(System.in);
        System.out.print("Digite o Endereço completo do Aluno: ");
        String respEnd = EndInput.nextLine();
        aluno.alterarEndereco(respEnd);
       
        
        tempo(1);
        System.out.println("Gerando matrícula e número de Matrícula...");
        tempo(1);
        int respGerado = gerador.nextInt((999999 - 100000) + 1) + 100000;
        aluno.alterarNome(respInputNome);
        aluno.gerarMatricula(Integer.toString(respGerado));
        
        
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> listaom = new ArrayList<String>();
            
        lista.add(aluno.obterNome());
        lista.add(aluno.obterMatricula());
        lista.add(aluno.obterEmail());
        lista.add(aluno.obterTelefone());
        lista.add(aluno.obterEndereco());
            
        listaom.add(aluno.obterMatricula());
        listaom.add(aluno.obterNome());
        listaom.add(aluno.obterEmail());
        listaom.add(aluno.obterTelefone());
        listaom.add(aluno.obterEndereco());
                
                
        try {
            FileOutputStream fos = new FileOutputStream(aluno.obterNome() + ".nome");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
            fos.close();
                
            FileOutputStream fosm = new FileOutputStream(aluno.obterMatricula() + ".mat");
            ObjectOutputStream oosm = new ObjectOutputStream(fosm);
            oosm.writeObject(listaom);
            oosm.close();                            
            fosm.close();
            linhas();
            System.out.println("Matrícula salva!!");
            System.out.println("Nome: " + aluno.obterNome());
            System.out.println("Matrícula: "+aluno.obterMatricula());
            System.out.println("Email: "+aluno.obterEmail());
            System.out.println("Telefone: "+aluno.obterTelefone());
            System.out.println("Endereço: "+aluno.obterEndereco());
            break;
                
                
                
                
                    
            } catch (IOException ioe){
                break;
            }
                
                
                
              
                
                
        }
        
    }
    
}
