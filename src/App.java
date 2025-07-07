import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Java", "Aprenda tudo sobre java",30);
        Curso curso2 = new Curso("Java Web", "Entre no mundo da web através do java",40);
        Mentoria mentoria = new Mentoria("Entrando no desenvolvimento de software","iniciando no mundo do desencolvimento de software");

        Dev dev1 = new Dev("Leonardo");
        Dev dev2 = new Dev("Gabriel");

        Bootcamp bootcamp = new Bootcamp("Bootcamp java junior","Java Júnior");
        bootcamp.setConteudosInscritos(curso1);
        bootcamp.setConteudosInscritos(curso2);
        bootcamp.setConteudosInscritos(mentoria);

        dev1.inscreverBoocamp(bootcamp);
        System.out.println("Conteudos bootcamp" + bootcamp.getDevsInscritos());
        dev1.progredir();
        System.out.println("--------------------------");
        System.out.println("Conteudo Leonardo: " + dev1.getConteudosInscritos());
        System.out.println("Conteudo Concluido Leonardo: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());

        System.out.println("====================================================");

        dev2.inscreverBoocamp(bootcamp);
        System.out.println("Conteudo Gabriel: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-------------------------");
        System.out.println("Conteudo Gabriel: " + dev2.getConteudosInscritos());
        System.out.println("Conteudo Gabriel: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2 .calcularXp());



    }
}
