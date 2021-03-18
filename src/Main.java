import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userTeclado = new Scanner(System.in);

        Aluno al01 = new Aluno();

        System.out.println("Bem vindo. Vamos começar a sua matrícula." + "\n");
        System.out.println("Digite o seu nome: ");
        String nome = userTeclado.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = userTeclado.nextLine();

        System.out.println("Digite a sua matrícula: ");
        String matricula = userTeclado.nextLine();

        System.out.println(nome + " " + sobrenome + "\n");
        System.out.println("Sua matrícula foi realizada com sucesso! Bem vindo aluno!"+ "\n");

        Scanner userTeclado02 = new Scanner(System.in);

        Professor prof01 = new Professor();

         System.out.println("Bem vindo professor. Vamos começar o seu registro." + "\n");
         System.out.println("Digite o seu nome: ");
         String nomeprof01 = userTeclado02.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobreprof01 = userTeclado02.nextLine();

        System.out.println("Digite o seu ID: ");
        String IDprof01 = userTeclado02.nextLine();

        System.out.println("Digite a sua disciplina: ");
        String disprof01 = userTeclado02.nextLine();

        System.out.println(nomeprof01 + " " + sobreprof01 + "\n");
        System.out.println("Seu registro foi realizado com sucesso! Bem vindo professor!"+ "\n");



    }
}
