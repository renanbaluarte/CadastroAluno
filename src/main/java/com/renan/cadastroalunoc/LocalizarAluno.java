/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renan.cadastroalunoc;

import static com.renan.cadastroalunoc.Interface.linhas;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rdias
 */
public class LocalizarAluno {
    
    public void Localizar(){
        
        while(true){
            Scanner metdo = new Scanner(System.in);
            
            
            System.out.println("Bom, Você gostaria de realizar a consulta por qual método?");
            System.out.println("1 - Matrícula");
            System.out.println("2 - Nome");
            System.out.println("3 - Voltar ");
            
            int metEs = metdo.nextInt();
            
            //Método de Localização por Matrícula
            
            if(metEs == 1){
                Scanner localNome = new Scanner(System.in);
                
                System.out.println("Certo, por favor, digite a matrícula numérica para a localização ");
            
                String local = localNome.nextLine();
                String lo = local + ".mat";
                ArrayList<String> Result = new ArrayList<String>();
               
                //List<String> Lista =new ArrayList<String>();
                
               
            
                
                
                
                try {
                FileInputStream fis = new FileInputStream(lo);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Result = (ArrayList) ois.readObject();
                
                ois.close();
                fis.close();
                 
                linhas();
            
                }catch (IOException ioe){
                    System.out.println("Aluno não encontrado");
                    linhas();
                    continue;
                }catch(ClassNotFoundException c){
                    System.out.println("Aluno não encontrado");
                    
                    continue;
                                
                }
                
                linhas();
                //for (String item : Result) {
                ///System.out.println(item);
                
                System.out.println("Nome:" + Result.get(1));
                System.out.println("Matrícula:" + Result.get(0));
                //for(String item : Result){
                    //Lista.add(item);
                    
                
                //System.out.println(Result.get(1));
                linhas();
                
            
            }
            
            if(metEs == 2){
                Scanner localNome = new Scanner(System.in);
                
                System.out.println("Insira o nome completo do Aluno: ");
            
                String local = localNome.nextLine();
                String lo = local + ".nome";
                ArrayList<String> Result = new ArrayList<String>();
            
                try {
                FileInputStream fis = new FileInputStream(lo);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Result = (ArrayList) ois.readObject();
                ois.close();
                fis.close();
                          
                }catch (IOException ioe){
                    System.out.println("Aluno não encontrado");
                    linhas();
                    continue;
                }catch(ClassNotFoundException c){
                    System.out.println("Aluno não encontrado");
                    linhas();
                    continue;         
                }
                linhas();
                System.out.println("Nome:" + Result.get(0));
                System.out.println("Matrícula:" + Result.get(1));
                linhas();
                break;
                
            }
            
            if(metEs == 3){
            break;
            }
            
        
        
        
        }
        
        
    }
    
}
