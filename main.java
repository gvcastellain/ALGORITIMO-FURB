class main {
    public static void main(String[] args) {
        listaEstatica<aluno> alunos = new listaEstatica();

        alunos.inserir(new aluno("sda", 33));
        alunos.inserir("asd");

        listaEstatica<veiculos> veiculos = new listaEstatica();

        veiculos.inserir(new veiculos("1231", "aaaa"));
        veiculos.inserir(new aluno("sda", 33));
    }
    }