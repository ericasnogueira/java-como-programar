package cap03.entities;

//classe conta que cont�m uma variavel de inst�ncia nome
//e metodos para configurar e obter seu valor

public class Conta {
    private String nome;// vari�vel de inst�ncia

    //construtor padr�o
    public Conta(){
        super();
    }

    //o construtor inicializa nome com o nome do par�metro
    public Conta(String nome) { // o nome do construtor � o nome da classe
        this.nome = nome;
    }

    //m�todo para recuperar o nome do objeto
    public String getNome() {
        return nome;//retorna o valor do nome para o chamador
    }

    //m�todo para definir o nome no objeto
    public void setNome(String nome) {
        this.nome = nome; // armazenar o nome
    }
}
