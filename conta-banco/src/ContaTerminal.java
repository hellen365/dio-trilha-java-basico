import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("------------ CONTA BANCÁRIA -------------");
        System.out.println();

        System.out.println( "Por favor, digite o número da Conta !");
        numeroConta = teclado.nextInt();

        System.out.println( "Por favor, digite o número da Agência !");
        agencia = teclado.next();

        System.out.println( "Por favor, digite o nome do Cliente !");
        nomeCliente = teclado.next();
        teclado.nextLine();

        System.out.println( "Por favor, digite o valor do Saldo !");
        saldo = teclado.nextDouble();

        System.out.println();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta "+ numeroConta +" e seu saldo de "+saldo +" já está disponível para saque");

        teclado.close();

    }
}