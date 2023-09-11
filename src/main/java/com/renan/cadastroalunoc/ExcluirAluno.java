/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renan.cadastroalunoc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import com.renan.cadastroalunoc.Interface.*;

/**
 *
 * @author rdias
 */
public class ExcluirAluno {

    Interface inter = new Interface();
    
    public void excluir(){
    
    while(true){
    Scanner metdo = new Scanner(System.in);
            
            
        System.out.println("Bom, Você gostaria de apagar por qual método?");
        System.out.println("1 - Matrícula");
        System.out.println("2 - Nome");
        System.out.println("3 - Voltar");
            
        int metEs = metdo.nextInt();
        
        if(metEs == 3){
            break;}
        
        if (metEs == 1){
            
            System.out.println("Digite a Matrícula do Aluno: ");
            Scanner Mat = new Scanner(System.in);
            String Matr = Mat.nextLine();
            
                           
                            
                String lo = Matr + ".mat";
                ArrayList<String> Result = new ArrayList<String>();
            
                try {
                FileInputStream fis = new FileInputStream(lo);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Result = (ArrayList) ois.readObject();
                ois.close();
                fis.close();
                           
            
                }catch (IOException ioe){
                    System.out.println("Aluno não encontrado");
                    continue;
                   
                }catch(ClassNotFoundException c){
                    System.out.println("Aluno não encontrado");      
                    continue;
                }
                
            
            
                File Obj1 = new File(Matr + ".mat");
                if (Obj1.delete()){
                    System.out.println("Aluno removido!");
                }else {
                    System.out.println("Falha ao Localizar Nome");
                } 
                
                File Obj2 = new File(Result.get(1) + ".nome");
                if (Obj2.delete()){
                    break;
                    //System.out.println("Aluno removido!" + Obj2.getName());
                }else {
                    System.out.println("Falha ao Localizar Matrícula");
                }
                
        
            
        
        }
        if(metEs == 2){
            System.out.println("Digite o Nome do Aluno: ");
            Scanner Nam = new Scanner(System.in);
            String Namer = Nam.nextLine();
            
                           
                            
                String lo = Namer + ".nome";
                ArrayList<String> Result = new ArrayList<String>();
            
                try {
                FileInputStream fis = new FileInputStream(lo);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Result = (ArrayList) ois.readObject();
                ois.close();
                fis.close();
                           
            
                }catch (IOException ioe){
                    System.out.println("Aluno não encontrado");
                    continue;
                }catch(ClassNotFoundException c){
                    System.out.println("Aluno não encontrado");
                    continue;
                                
                }
                
            
            
                File Obj1 = new File(Namer + ".nome");
                if (Obj1.delete()){

                    System.out.println("Aluno removido!");
                }else {
                    System.out.println("Falha ao Localizar Nome");
                } 
                
                File Obj2 = new File(Result.get(1)+ ".nome");
                if (Obj2.delete()){
                    break;
                }
                    //System.out.println("Aluno removido!" + Obj2.getName());
                }else {
                    System.out.println("Falha ao Localizar Matrícula");
                }
        
        
        
        
        
        }
    
    
    
    }
    
    }