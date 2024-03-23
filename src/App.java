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
        }
        teclado.close();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
