import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso de JS");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso(); //Polimorfismo
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.increverBootcamp(bootcamp);
        devVictor.progredir();
        devVictor.progredir();
        System.out.println("Conteudo Incritos: "+devVictor.getConteudoInscritos());
        System.out.println("Conteudo Concluidos: "+devVictor.getConteudoConcluidos());
        System.out.println("XP: "+devVictor.calcularXp());


        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.increverBootcamp(bootcamp);
        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("Conteudo Incritos: "+devPaulo.getConteudoInscritos());
        System.out.println("Conteudo Concluidos: "+devPaulo.getConteudoConcluidos());
        System.out.println("XP: "+devPaulo.calcularXp());
    }
}