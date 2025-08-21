public class Main {


    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionarInicio("guy");
        System.out.println("Inicio1: "+ lista.getInicio());
        System.out.println("Ultimo1: "+ lista.getUltimo());

        lista.adicionar(1,"next" );
        System.out.println("Inicio2: "+ lista.getInicio());
        System.out.println("Ultimo2: "+ lista.getUltimo());

        lista.adicionar(1,"help");

        System.out.println("Inicio3: "+ lista.getInicio());
        System.out.println("Ultimo3: "+ lista.getUltimo());

        System.out.println("No 1: "+ lista.buscarNo(2));
    }
}