import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Curso curso= new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição do curso");
        curso.setCargaHoraria(8);



        Mentoria mentoria= new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição data");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Deceloper");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudoIncritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudoIncritos());
        System.out.println("Conteúdos Concluidos Camila: " + devCamila.getConteudoConcluidos());
        System.out.println("XP: "+ devCamila.calculaXp());


        System.out.println("-----------------------------------");


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudoIncritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudoIncritos());
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudoConcluidos());
        System.out.println("XP: "+ devJoao.calculaXp());




//






    }
}