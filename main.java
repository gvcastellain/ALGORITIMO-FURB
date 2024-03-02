class main {
    public static void main(String[] args) {
        listaEstatica list = new listaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        System.out.println(list.obterElemento(3));
        }
    }