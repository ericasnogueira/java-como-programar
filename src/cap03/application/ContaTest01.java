package cap03.application;


import cap03.entities.Conta;

// Usando o construtor de Conta para inicializar a instancia nome
//variavel no momento em que cada objeto conta é criado
public class ContaTest01 {
    public static void main(String[] args) {

        //criando dois objetos Conta
        Conta conta1 = new Conta("Jane Green");
        Conta conta2 = new Conta("John Blue");

        //exibindo o valor inicial de nome para cada Conta
        System.out.println("Conta 1 : "+ conta1.getNome());
        System.out.println("Conta 2 : "+ conta2.getNome());
    }
}
