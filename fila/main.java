package fila;

class main {
    public static void main(String[] args) {

        FilaVetor<Object> FilaVetor = new FilaVetor<>(2);
        FilaVetor.inserir(5);
        FilaVetor.inserir(10);
        
        FilaVetor<Object> FilaVetor2 = new FilaVetor<>(4);
        FilaVetor2.inserir(2);   
        FilaVetor2.inserir(4);
        FilaVetor2.inserir(7);
        FilaVetor2.inserir(9);

        FilaVetor f3 = FilaVetor.criarFilaConcatenada(FilaVetor2);
        System.out.println(f3.toString());
       
    }
    }
