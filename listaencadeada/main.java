package listaencadeada;

class main {
    public static void main(String[] args) {

    ListaEncadeada lista = new ListaEncadeada<>();

    lista.inserir(10);
    lista.inserir(20);
    lista.inserir(30);
    lista.inserir(10);
    lista.inserir(20);
    lista.retirarTodos(10);

    System.out.println(lista.toString());
    }
}
