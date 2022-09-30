package cap03.entities;

//classe conta que contém uma variavel de instância nome
//e metodos para configurar e obter seu valor

public class Conta {
    private String nome;// variável de instância
    private double saldo;// variavel de instância


    //construtor padrão
    public Conta(){
        super();
    }

    //o construtor de Conta receber dois parametros
    public Conta(String nome, double saldo) { // o nome do construtor é o nome da classe
        this.nome = nome;

        //valida que saldo é maior que 0.0; se não for,
        // a variavel de instância saldo mantém seu valor inicial
        if(saldo > 0.0){
            this.saldo = saldo;
        }
    }

    //método para recuperar o nome do objeto
    public String getNome() {
        return nome;//retorna o valor do nome para o chamador
    }

    //método para definir o nome no objeto
    public void setNome(String nome) {
        this.nome = nome; // armazenar o nome
    }

    // metodo retorna o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // método de deposita apenas uma quantia válida no saldo
    public void deposita(double depositaDinheiro){
        if(depositaDinheiro > 0.0){
            saldo = saldo + depositaDinheiro;
        }
    }

    public void saque(double saque){
        if(saque > saldo){
            System.out.println("Valor do saque excedeu o saldo da conta");
        } else {
            saldo = saldo - saque;
            System.out.println("Saldo disponivel atual : " +saldo);
        }
    }

}
