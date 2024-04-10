package listaestatica;

import java.util.List;

class main {
    public static void main(String[] args) {

        listaEstatica list = new listaEstatica();
        list.inserir(1);
        list.inserir(2);
        list.inserir(3);
        list.inserir(4);
        list.inserir(5);
        list.inserir(6);
        list.inserir(7);
        
        list.retirarElementos(2, 4);
        System.out.println(list.toString());
       
    }
    }