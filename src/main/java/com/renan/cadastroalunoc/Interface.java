package com.renan.cadastroalunoc;

import java.awt.*;
import java.util.Scanner;
import com.renan.cadastroalunoc.Cores;

public class Interface {

    static void tempo(int tempo){
        try { Thread.sleep (tempo * 1000); } catch (InterruptedException ex) {}
    }

    static void linhas(){
        System.out.println("----------------------------------------------------");

    }
    public void Interface(){   //Precisa ser com "I" maiusculo, mesmo sendo um método, pois o termo interface já é usado.

        Cores cor = new Cores();

        while (true){

            Scanner respostaEntrada = new Scanner(System.in);


            System.out.println("Seja bem vindo ao cadastro de aluno inteligente!");
            tempo(1);
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Cadastrar um novo aluno");
            System.out.println("2 - Localizar um aluno");
            System.out.println("3 - Listar todos os alunos");
            System.out.println(cor.VERMELHO + "4 - Exluir um aluno" + cor.RESET);
            System.out.println("5 - Sair");

            int respostaInput = respostaEntrada.nextInt();

            if(respostaInput == 1){
                CadastrarAluno cad = new CadastrarAluno();
                cad.cadastrar();


            }

            if(respostaInput == 2){
                LocalizarAluno local = new LocalizarAluno();
                local.Localizar();

            }

            if(respostaInput == 3){
                LeituraAluno leitura = new LeituraAluno();
                leitura.Ler();
            }

            if(respostaInput == 4){
                ExcluirAluno excluir = new ExcluirAluno();
                excluir.excluir();
            }

            if(respostaInput == 5){
                break;



            }
        }











    }



}
