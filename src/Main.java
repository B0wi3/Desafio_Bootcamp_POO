import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição 2");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeo = new Dev();
        devLeo.setNome("Léo");
        devLeo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos: " + devLeo.getConteudosInscritos());
        devLeo.progreir();
        devLeo.progreir();
        devLeo.progreir();
        System.out.println("-");
        System.out.println("Conteúdos: " + devLeo.getConteudosConcluidos());
        System.out.println("Conteúdos: " + devLeo.getConteudosInscritos());
        System.out.println("XP: " + devLeo.calcularTotalXp());

        System.out.println("-------");

        Dev devLevi = new Dev();
        devLevi.setNome("Levi");
        devLevi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos: " + devLevi.getConteudosInscritos());
        devLevi.progreir();
        devLevi.progreir();
        System.out.println("-");
        System.out.println("Conteúdos: " + devLevi.getConteudosConcluidos());
        System.out.println("Conteúdos: " + devLevi.getConteudosInscritos());
        System.out.println("XP: " + devLevi.calcularTotalXp());
    }
}
