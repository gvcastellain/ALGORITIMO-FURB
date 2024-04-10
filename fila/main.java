package fila;

class main {
    public static void main(String[] args) {

        FilaVetor<Object> FilaVetor = new FilaVetor<>(2);
        FilaVetor.inserir(5);
        FilaVetor.inserir(10);
        FilaVetor.retirar();


        System.out.println(FilaVetor.toString());
       
    }
    }
