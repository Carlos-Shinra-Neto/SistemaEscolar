import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double x, a , y, b ;
//        System.out.println("Digite o valor de x");
//        x = scanner.nextDouble();
//        System.out.println("Digite o valor de y");
//        y = scanner.nextDouble();
//        System.out.println("Digite o valor de b");
//        b = scanner.nextDouble();
//        //Soma +
//        a = x + y;
//        System.out.println("Soma " + a);
//        // Subtração -
//        a = x - y;
//        System.out.println("Subtração " + a);
//        //Divisão /
//        a = x/y;
//        System.out.println("Divisão " + a);
//        //Multiplicação *
//        a = x*y;
//        System.out.println("Multiplicação " + a);
//        // Resto %
//        a = y % b;
//        System.out.println("Resto " + b);
//         Se, se algo for correto, faça algo
//          if (x <= 6){
//    System.out.print("X é menor ou igual a 6");
// }
// Else, se não
// else if ( x >= 10 && x != 7)
//
//   System.out.println("X é maior que 7 e não é 10");
// }


        //Media

        //double media = 0;

        //media = (x + y + b)/3;

        // if( media >= 7){
//            System.out.println("O aluno passou com a média de: " + media );
        // } else {
        //      System.out.println("O aluno não passou com a média de: " + media );
        // }
// Cadastro dos alunos
        System.out.println("Vamos cadastrar os alunos!");

        // Cadastrar o primeiro aluno
        String aluno1Nome = cadastrarAluno(scanner, 1);
        String aluno1Email = cadastrarEmail(scanner, 1);

        // Cadastrar o segundo aluno
        String aluno2Nome = cadastrarAluno(scanner, 2);
        String aluno2Email = cadastrarEmail(scanner, 2);

        // Cadastrar o terceiro aluno
        String aluno3Nome = cadastrarAluno(scanner, 3);
        String aluno3Email = cadastrarEmail(scanner, 3);

        System.out.println("----------------------------------");

        // Notas dos alunos
        System.out.println("Agora, vamos dar as notas dos alunos, vamos dar 3 notas para eles.");

        // Obter as notas do primeiro aluno
        int[] notasAluno1 = obterNotas(scanner, aluno1Nome);

        // Obter as notas do segundo aluno
        int[] notasAluno2 = obterNotas(scanner, aluno2Nome);

        // Obter as notas do terceiro aluno
        int[] notasAluno3 = obterNotas(scanner, aluno3Nome);

        System.out.println("----------------------------------");

        // Média e status dos alunos
        System.out.println("Agora vamos pegar a média dos alunos e descobrir o resultado.");

        // Verificar status do primeiro aluno
        verificarStatus(aluno1Nome, calcularMedia(notasAluno1));

        // Verificar status do segundo aluno
        verificarStatus(aluno2Nome, calcularMedia(notasAluno2));

        // Verificar status do terceiro aluno
        verificarStatus(aluno3Nome, calcularMedia(notasAluno3));
    }

    // Função para cadastrar o nome do aluno
    private static String cadastrarAluno(Scanner scanner, int numeroAluno) {
        System.out.println("Qual o nome do aluno " + numeroAluno + "?");
        return scanner.nextLine();
    }

    // Função para cadastrar o email do aluno
    private static String cadastrarEmail(Scanner scanner, int numeroAluno) {
        System.out.println("E qual o email dele(a)?");
        return scanner.nextLine();
    }

    // Função para obter as 3 notas de um aluno
    private static int[] obterNotas(Scanner scanner, String alunoNome) {
        System.out.print("Coloque as 3 notas do aluno " + alunoNome + " separadas por espaço: ");
        int[] notas = new int[3];

        for (int i = 0; i < 3; i++) {
            notas[i] = scanner.nextInt();
        }

        // Consumir a quebra de linha pendente após a leitura das notas
        scanner.nextLine();

        return notas;
    }

    // Função para calcular a média
    private static double calcularMedia(int[] notas) {
        int soma = 0;

        for (int nota : notas) {
            soma += nota;
        }

        return soma / 3.0;
    }

    // Função para verificar o status do aluno
    private static void verificarStatus(String alunoNome, double media) {
        System.out.println("Resultados para o aluno " + alunoNome + ":");

        if ((media >= 0.0) && (media <= 10.0)) {
            if (media >= 7.0) {
                System.out.println("Parabéns, " + alunoNome + ", você passou direto. Por acaso você programa em Java?");
            } else if (media >= 5.0) {
                System.out.println("Infelizmente, " + alunoNome + ", você vai ter que fazer recuperação.");
            } else {
                System.out.println("Você foi reprovado, " + alunoNome + ". Ainda bem que é só simulação, hein?");
            }
        } else {
            System.out.println("Nota inválida para o aluno " + alunoNome + ". Fechando aplicativo.");
        }

        System.out.println("----------------------------------");
    }
}

