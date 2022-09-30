package cap03.exercicicio.LojaInformatica.entities;

public class Fatura {
    private int numero;
    private String descricao;
    private int quantidade;
    private  double preco;

    //construtor
    public Fatura(int numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //get e set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // metodos
    public double valorFatura(){
        double valor = quantidade * preco;
        if(quantidade < 0){
            quantidade = 0;
        } else if (preco < 0) {
            preco = 0;
        }
        return valor;
    }
}
