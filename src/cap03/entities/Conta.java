package cap03.entities;

//classe conta que cont�m uma variavel de inst�ncia nome
//e metodos para configurar e obter seu valor

public class Conta {
    private String nome;// vari�vel de inst�ncia
    private double saldo;// variavel de inst�ncia


    //construtor padr�o
    public Conta(){
        super();
    }

    //o construtor de Conta receber dois parametros
    public Conta(String nome, double saldo) { // o nome do construtor � o nome da classe
        this.nome = nome;

        //valida que saldo � maior que 0.0; se n�o for,
        // a variavel de inst�ncia saldo mant�m seu valor inicial
        if(saldo > 0.0){
            this.saldo = saldo;
        }
    }

    //m�todo para recuperar o nome do objeto
    public String getNome() {
        return nome;//retorna o valor do nome para o chamador
    }

    //m�todo para definir o nome no objeto
    public void setNome(String nome) {
        this.nome = nome; // armazenar o nome
    }

    // metodo retorna o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // m�todo de deposita apenas uma quantia v�lida no saldo
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
