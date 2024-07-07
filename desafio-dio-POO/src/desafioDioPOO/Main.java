package desafioDioPOO;

import java.time.LocalDate;

//
public class Main {
    public static void main(String[] args) {
        Curso cursoUm = new Curso();
         cursoUm.setTitulo("Curso java");
         cursoUm.setDescricao("descrição curso java");
         cursoUm.setCargaHoraria(8);

         Curso cursoDois = new Curso();
         cursoDois.setTitulo("Curso java");
         cursoDois.setDescricao("descrição curso js");
         cursoDois.setCargaHoraria(4);

         
         
         Mentoria mentoria = new Mentoria();
         mentoria.setTitulo("mentoria de java");
         mentoria.setDescricao("descrição mentoria java");
         mentoria.setData(LocalDate.now());

        //  System.out.println(cursoUm);
        //  System.out.println(cursoDois);
        //  System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoUm);
        bootcamp.getConteudos().add(cursoDois);
        bootcamp.getConteudos().add(mentoria);

        Dev devMel =  new Dev();
        devMel.setNome("Mel");
        devMel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Mel: " + devMel.getConteudosInscritos());
        devMel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Mel: " + devMel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Mel: " + devMel.getConteudosConcluidos());
        System.out.println("XP: " + devMel.calcularTotalXp());

       System.out.println("-----");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Joao: " + devMel.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        
  
    }
}
