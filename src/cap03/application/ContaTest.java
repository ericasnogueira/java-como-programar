package cap03.application;

import cap03.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        //criando um objeto do tipo Conta e atribuindo a minhaConta
        Conta minhaConta = new Conta();

        System.out.println(minhaConta.getNome());// exibe o valor inicial do nome (null)

        //pedido e lendo o nome
        System.out.println("Por favor o seu nome");
        String nome = entrada.nextLine();
        minhaConta.setNome(nome);// inserindo o nome em minhaConta

        System.out.print("Seu nome é : ");
        System.out.println(minhaConta.getNome());
    }
}
