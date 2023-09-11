/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renan.cadastroalunoc;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import com.renan.cadastroalunoc.Interface.*;

/**
 *
 * @author rdias
 */
public class LeituraAluno {

    Interface Inter = new Interface();
    public void Ler(){
        String dirPath = "";
        String extension = ".nome";

        
        try{
        List<Path> files = Files.walk(Paths.get(dirPath))
                .filter(p -> p.toString().endsWith(extension))
                .collect(Collectors.toList());

        for (Path file : files) {
            String nomes;
            nomes = file.toString();
            //System.out.println(file.getFileName());
            
            String nomefinal = nomes.substring(0, nomes.length() - 5);
            System.out.println(nomefinal);
        }
        Inter.linhas();

        }catch(java.io.IOException e){
            System.out.println("Erro ao localiazr alunos, talvez esteja vazio.");
                
                }
        
        
        }
    }
        
        
        
       
        
        

    
    
    
    
        