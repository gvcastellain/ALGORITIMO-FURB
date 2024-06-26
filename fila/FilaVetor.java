package fila;

public class FilaVetor<T> implements Fila<T> {

	private int tamanho;
	private int limite;
    private int incio;
	private T[] info;   
    
    public FilaVetor(int limite) {
        super();
        this.tamanho = 0;
        this.incio = 0;
        this.limite = limite;
        this.info = (T[]) new Object[limite];
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new FilaCheiaException();
        }

        int indice;

        indice = (incio + tamanho) % limite;

        info[indice] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        }

        return false;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }

        return (T) info[incio];
    }

    @Override
    public T retirar() {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }

        T valor = peek();
        info[incio] = null;

        incio = (incio + 1) % limite;
        tamanho--;

        return valor;
    }

    @Override
    public void liberar() {
        this.tamanho = 0;
        this.incio = 0;
        this.info = (T[]) new Object[limite];
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public String toString() {
        String retorno = "";
        
        for (int i = 0; i < tamanho - 1; i++) {
            retorno += info[i] + ",";
        }

        return retorno + info[tamanho - 1];
    }

    public FilaVetor criarFilaConcatenada(FilaVetor f2) {
        int limite = this.limite + f2.limite;
        FilaVetor<Object> FilaVetor = new FilaVetor<>(limite);
        
        FilaVetor<Object> f1Copy = (FilaVetor<Object>) FilaVetor.this;
        FilaVetor<Object> f2Copy = backup(f2);

        while (true) {
            try {
                FilaVetor.inserir(f1Copy.peek());
                f1Copy.retirar();
            } catch (Exception e) {
                break;
            }
        }

        while (true) {
            try {
                FilaVetor.inserir(f2Copy.peek());
                f2Copy.retirar();
            } catch (Exception e) {
                break;
            }
        }


        return FilaVetor;
    }

    public int getLimite() {
        return this.limite;
    }

    public FilaVetor backup(FilaVetor fila) {
        FilaVetor<Object> filaCopy = fila;
        
        return filaCopy;
    }

}
