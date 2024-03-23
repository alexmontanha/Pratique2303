import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);

        while (opcao != 9) {
            clearScreen();
            System.out.println("Bem-vindo ao Sistema de Auto Peças!");
            System.out.println("");
            System.out.println("");
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Cadastrar Peça");
            System.out.println("2 - Listar Peças");
            System.out.println("3 - Cadastrar Saída de Peça");
            System.out.println("4 - Listar Saídas de Peças");
            System.out.println("5 - Cadastrar Entrada de Peça");
            System.out.println("6 - Listar Entradas de Peças");
            System.out.println("9 - Sair");
            System.out.println("");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarPeca(teclado);
                    break;
            }
        }
        teclado.close();
    }

    private static void cadastrarPeca(Scanner teclado) {
        clearScreen();
        System.out.println("Cadastre uma nova peça:");
        System.out.println("");
        System.out.print("Nome: ");
        String nome = teclado.next();
        System.out.print("Descrição: ");
        String descricao = teclado.next();
        System.out.print("Preço: ");
        double preco = teclado.nextDouble();

        Peca peca = new Peca(0, nome, descricao, preco);

        System.out.println("");
        System.out.println("Peça cadastrada com sucesso!");
        System.out.println("");
        System.out.println(peca.toString());
        System.out.println("Pressione ENTER para continuar...");
        teclado.next();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
