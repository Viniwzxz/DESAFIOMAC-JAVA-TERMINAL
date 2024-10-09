import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome da primeira pessoa");
       String nome01 = scanner.nextLine();
        System.out.println("Idade da primeira pessoa");
       int idade01 = Integer.parseInt(scanner.nextLine());

        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome da segunda pessoa");
       String nome02 = scanner.nextLine();
        System.out.println("Idade da segunda pessoa");
        int idade02 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if (idade01 != idade02){
            System.out.println("Nome01 é mais velho");
        } else {
            System.out.println("nome02 é mais velho");
        }

    }
}