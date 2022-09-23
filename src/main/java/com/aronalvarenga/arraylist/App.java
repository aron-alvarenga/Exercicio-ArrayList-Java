package com.aronalvarenga.arraylist;

import java.util.ArrayList;

public class App {

    public static Pessoa p1, p2, p3, p4, p5;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        Pessoa p5 = new Pessoa();

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        //A)ADICIONE 5 PESSOAS
        p1.setIdade(18);
        p1.setNome("Fulano - p1");
        pessoas.add(0,p1);

        p2.setIdade(19);
        p2.setNome("Beltrano - p2");
        pessoas.add(1,p2);

        p3.setIdade(20);
        p3.setNome("Ciclano - p3");
        pessoas.add(2,p3);

        p4.setIdade(21);
        p4.setNome("João - p4");
        pessoas.add(3,p4);

        p5.setIdade(22);
        p5.setNome("Maria - p5");
        pessoas.add(4,p5);

        //TESTANDO - tamanho da lista
        System.out.println("Tamanho da lista: "+pessoas.size());

        //B)REMOVA A ULTIMA PESSOA
        pessoas.remove(p5);

        //C)ALTERE A SEGUNDA PESSOA P/ UMA NOVA
        Pessoa p7 = new Pessoa();

        p7.setIdade(38);
        p7.setNome("Joana");
        pessoas.add(1,p7);

        //D)CONSULTE O NOME DA PESSOA NA POSIÇÃO 3
        System.out.println("Nome pessoa Posição 3: "+pessoas.get(3).getNome());
        System.out.println("Idade pessoa Posição 3: "+pessoas.get(3).getIdade());

        //E)LIMPE O ARRAYLIST
        pessoas.clear();

        System.out.println("Tamanho da lista: "+pessoas.size());
    }

}
