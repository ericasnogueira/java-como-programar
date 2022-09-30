package cap03.exercicicio.LojaInformatica.application;

import cap03.exercicicio.LojaInformatica.entities.Fatura;

import java.util.Locale;

public class TesteFatura {
    public static void main(String[] args) {
        /*
        Classe Invoice) Crie uma classe chamada Invoice para que uma loja de suprimentos de inform�tica a utilize
        para representar uma fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das
        informa��es como vari�veis de inst�ncia � o n�mero (tipo String), a descri��o (tipo String), a quantidade
         comprada de um item (tipo int) e o pre�o por item (double). Sua classe deve ter um construtor que inicializa
         as quatro vari�veis de inst�ncia. Forne�a um m�todo set e um get para cada vari�vel de inst�ncia. Al�m disso,
         forne�a um m�todo chamado getInvoiceAmount que calcula o valor de fatura (isto �, multiplica a quantidade pelo
         pre�o por item) e depois retorna esse valor como double. Se a quantidade n�o for positiva, ela deve ser
          configurada como 0. Se o pre�o por item n�o for positivo, ele deve ser configurado como 0.0. Escreva um
           aplicativo de teste chamado InvoiceTest que demonstra as capacidades da classe Invoice
         */

        Locale.setDefault(Locale.US);

    Fatura fatura = new Fatura(156,"SSD",15,350.0);

    int numero = fatura.getNumero();
    String descricao = fatura.getDescricao();
    int  quantidade = fatura.getQuantidade();
    double preco = fatura.getPreco();


        System.out.print("Produto : ");
        System.out.println(numero);
        System.out.println("Descri��o : "+ descricao);
        System.out.println( "Quantidade : "+ quantidade);
        System.out.println("Pre�o :" + preco);
        System.out.println( "Total a pagar : " + fatura.valorFatura());
    }
}
