package cap03.entities;

//classe conta que cont�m uma variavel de inst�ncia nome
//e metodos para configurar e obter seu valor

public class Conta {
    private String nome;// vari�vel de inst�ncia

    //m�todo para recuperar o nome do objeto
    public String getNome() {
        return nome;//retorna o valor do nome para o chamador
    }

    //m�todo para definir o nome no objeto
    public void setNome(String nome) {
        this.nome = nome; // armazenar o nome
    }
}
