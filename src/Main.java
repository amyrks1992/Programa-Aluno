import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userTeclado = new Scanner(System.in);

        System.out.println("Bem vindo aluno. Comece sua matrícula.");
        System.out.println("Digite o seu nome: ");
        String nome = userTeclado.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = userTeclado.nextLine();

        System.out.println("Digite a sua matrícula: ");
        String matricula = userTeclado.nextLine();

        System.out.println("Aluno " + nome + " " + sobrenome);
        System.out.println("Sua matrícula foi realizada com sucesso!");

    }
}
