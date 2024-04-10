package listaencadeada;

public class ListaEncadeada<T> {
    private NoLista<T> primeiro;

    public ListaEncadeada() {
        this.primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {
        NoLista<T> novoNo = new NoLista<>(info);
        novoNo.setProximo(primeiro);
        primeiro = novoNo;
    }

    public void retirarTodos(T valor) {
        if (primeiro.getInfo().equals(valor)) {
            primeiro = primeiro.getProximo();
        }

        NoLista<T> anterior = primeiro;
        NoLista<T> atual = primeiro.getProximo();

        while (true) {
            if (atual == null) {
                if (anterior.getInfo().equals(valor)) {
                    retirar((anterior.getInfo()));
                    return;
                }
            }

            if (atual.getInfo().equals(valor)) {
                anterior.setProximo(atual.getProximo());
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public NoLista<T> buscar(T info) {
        NoLista<T> atual = primeiro;
        while (atual != null) {
            if (atual.getInfo().equals(info)) {
                return atual;
            }
            atual = atual.getProximo();
        }
        return null;
    }

    public void retirar(T info) {
        if (primeiro == null) {
            return;
        }

        if (primeiro.getInfo().equals(info)) {
            primeiro = primeiro.getProximo();
            return;
        }

        NoLista<T> anterior = primeiro;
        NoLista<T> atual = primeiro.getProximo();

        while (atual != null) {
            if (atual.getInfo().equals(info)) {
                anterior.setProximo(atual.getProximo());
                return;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public int obterComprimento() {
        int comprimento = 0;
        NoLista<T> atual = primeiro;
        while (atual != null) {
            comprimento++;
            atual = atual.getProximo();
        }
        return comprimento;
    }

    public NoLista<T> obterNo(int posicao) {
        if (posicao < 0 || posicao >= obterComprimento()) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        NoLista<T> atual = primeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        NoLista<T> atual = primeiro;
        while (atual != null) {
            builder.append(atual.getInfo());
            if (atual.getProximo() != null) {
                builder.append(", ");
            }
            atual = atual.getProximo();
        }
        return builder.toString();
    }
}
