public class No {

    private No direita;
    private No esquerda;
    private int valor;

    public No(){

        super();

    }

    public No(int valor){

        super();
        this.valor=valor;

    }

    public No(No direta, No esquerda, int valor){

        super();
        this.direita=direta;
        this.esquerda=esquerda;
        this.valor=valor;

    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    

}