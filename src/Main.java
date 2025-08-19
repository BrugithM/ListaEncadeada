public class Main {


    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionarInicio("guy");

        System.out.println(lista.toString());

        ListaEncadeada lista2 = new ListaEncadeada();
        lista2.adicionarProximo("next");
        System.out.println(lista2.toString());

        ListaEncadeada lista3 = new ListaEncadeada();
        lista3.adicionarProximo("help");
        System.out.println(lista3.toString());
    }
}