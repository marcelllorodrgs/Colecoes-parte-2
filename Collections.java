package br.com.modulos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections {


    public static void main(String[] args) {

        Boolean flag = true;

        List<Pessoa> clubdoBolinha = new ArrayList<>();
        List<Pessoa> clubdaLuluzinha = new ArrayList<>();
        Scanner linha = new Scanner(System.in);

        while (flag){

            System.out.println("Por favor entre com seu nome e sexo separando por , ");
            String pessoa = linha.next();
            String[] dados = pessoa.split(",");

            if ( dados.length > 1){
                String nome = dados[0];
                String sexo = dados[1];

                Pessoa novaPessoa = new Pessoa(nome, sexo);

                if (novaPessoa.getSexo().contains("feminino") || novaPessoa.getSexo().contains("Feminino")){
                    clubdaLuluzinha.add(novaPessoa);
                } else if (novaPessoa.getSexo().contains("masculino") || novaPessoa.getSexo().contains("Masculino") ){
                    clubdoBolinha.add(novaPessoa);
                }else{
                    System.out.println("Erro na descrição do sexo, tente novamente!");
                }

            } else {
                System.out.println("Erro formato incorreto");
            }

            System.out.println("Pressione a tecla p adicionar mais pessoas.");
            flag = false;
            if (linha.next().equals("p")){
                flag = true;
            }
        }

        if (!clubdoBolinha.isEmpty())
            imprimirLista(clubdoBolinha);

        if (!clubdaLuluzinha.isEmpty())
            imprimirLista(clubdaLuluzinha);

    }

    public static void imprimirLista(List<Pessoa> pessoas){
        System.out.println("**********************************************************");
        System.out.println("Imprimir Lista de pessoas: ");
        System.out.println("**********************************************************");
        pessoas.forEach( p -> {
            System.out.println("Nome: " + p.getNome() + " - Sexo: " + p.getSexo());
        });
    }


}
