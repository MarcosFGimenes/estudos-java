import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) {
        int idade;
        String CPF;
        double altura;
        char sexo;
        String nome;

        System.out.println("Digite um nome.");
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Digite seu CPF: ");
        CPF = scanner.next();

        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();

        System.out.println("Digite seu sexo (M ou F) ");
        sexo = scanner.next().charAt(0);

    System.out.println("Digite Sim para casado ou Não para solteiro: ");
    scanner.nextLine();
    String casado = scanner.nextLine();

    System.out.println("Retornando seus dados...");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("CPF: " + CPF);
    System.out.println("Altura: " + altura);
    System.out.println("Sexo: " + sexo);
    if (casado.equalsIgnoreCase("Sim")) {
        System.out.println("Casado");
    } else {
        System.out.println("Solteiro");
    }
    scanner.close();
    }
}
