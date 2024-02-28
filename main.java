class main {
    public static void main(String[] args) {
        listaEstatica vetor = new listaEstatica();
        vetor.inserir(10);
        vetor.inserir(20);
        vetor.inserir(30);
        vetor.inserir(40);
        vetor.inserir(50);
        vetor.inserir(60);
        vetor.inserir(70);
        vetor.inserir(80);
        vetor.inserir(90);
        vetor.inserir(100);
        vetor.inserir(110);
        vetor.inserir(120);
        vetor.inserir(130);
        vetor.inserir(140);
        vetor.exibir();
        System.out.println(vetor.buscar(10));
        System.out.println(vetor.buscar(11230));
        }
    }