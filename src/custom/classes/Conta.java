package custom.classes;

import java.util.Scanner;
import java.util.Locale;

public class Conta {
    static int numero;
    static String agencia;
    static String nomeCliente;
    static double saldo;
    

    public static void coletaDados() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o número da conta: ");
        numero = sc.nextInt();
        System.out.println("Digite a agência: ");
        agencia = sc.next();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.next();
        System.out.println("Digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo));
        sc.close();
    }
}

    

