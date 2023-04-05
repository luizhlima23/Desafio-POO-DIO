package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("descricao da mentoria java");
        mentoria1.setData(LocalDate.now());

  /*      System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1); */

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricao do bootcamp");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz Henrique");
        devLuiz.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos : "+devLuiz.getConteudosInscritos());

        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos : "+devLuiz.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: "+devLuiz.getConteudosConcluidos());
        System.out.println("XP: "+devLuiz.calcularTotalXp());

        System.out.println(" ------------------------------- ");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos : "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos : "+devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos : "+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXp());

    }
}
