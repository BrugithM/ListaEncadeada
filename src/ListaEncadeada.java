public class ListaEncadeada<T>  {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;
//    private No<T> posicao;


    public int getTamanho() {
        return tamanho;
    }
//    public No<T> getPosicao() {return posicao; }
    public No<T> getInicio() {
        return inicio;
    }
    public No<T> getUltimo() {
        return ultimo;
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
        if (this.tamanho == 0) {
            adicionarInicio(elemento);
        } else {
            No<T> novoNo = new No<>(elemento);
            this.ultimo.setProximo(novoNo);
            this.ultimo = novoNo;
        }
        this.tamanho++;
    }

    public No<T> buscarNo(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida: " + posicao);
        }

        No<T> atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void adicionar(int posicao, T elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Posição inválida: " + posicao);
        }

        if (posicao == 0) {
            adicionarInicio(elemento);
        } else if (posicao == tamanho) {
            adicionarProximo(elemento);
        } else {
            No<T> anterior = buscarNo(posicao - 1);
            No<T> novoNo = new No<>(elemento, anterior.getProximo());
            anterior.setProximo(novoNo);
            this.tamanho++;
        }
    }
}

