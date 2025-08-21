public class No<T> {
    private T elemento;
    private No<T> proximo;
    private int posicao;

    public No(T elemento, int posicao) {
        this.elemento = elemento;
        this.posicao = posicao;
    }

    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int elemento) {
        this.posicao = posicao;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
}
