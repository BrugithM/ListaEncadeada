public class ListaEncadeada<T>{

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public void adicionarInicio(T elemento ) {

        if(this.tamanho == 0){
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;

        }else {
            No<T> novoNo = new No<>(elemento, this.inicio);
        }
        this.tamanho++;
    }

    public void adicionarProximo(T elemento) {
        if (this.ultimo == this.inicio) {
            No<T> novoNo = new No<>(elemento);
            this.ultimo = novoNo;
        } else {
            No<T> novoNo = new No<>(elemento, this.ultimo);
        }
        this.ultimo = ultimo;
        System.out.println("Inicio:" + inicio);
        System.out.println("Ultimo" + ultimo);
        this.tamanho++;
    }
}
