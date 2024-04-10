package listaestatica;

public class aluno {
    private String nome;
    private int matricula;
    
    public aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;

    }
}
