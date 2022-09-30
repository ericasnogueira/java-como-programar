package cap03.exercicicio.LojaInformatica.application;

import cap03.exercicicio.LojaInformatica.entities.Fatura;

import java.util.Locale;

public class TesteFatura {
    public static void main(String[] args) {
        /*
        Classe Invoice) Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize
        para representar uma fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das
        informações como variáveis de instância — o número (tipo String), a descrição (tipo String), a quantidade
         comprada de um item (tipo int) e o preço por item (double). Sua classe deve ter um construtor que inicializa
         as quatro variáveis de instância. Forneça um método set e um get para cada variável de instância. Além disso,
         forneça um método chamado getInvoiceAmount que calcula o valor de fatura (isto é, multiplica a quantidade pelo
         preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser
          configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. Escreva um
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
        System.out.println("Descrição : "+ descricao);
        System.out.println( "Quantidade : "+ quantidade);
        System.out.println("Preço :" + preco);
        System.out.println( "Total a pagar : " + fatura.valorFatura());
    }
}
