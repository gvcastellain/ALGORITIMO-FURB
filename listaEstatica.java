public class listaEstatica {
    private int tamanho = 0;
    private int[] info;

    public listaEstatica() {
        instanciaArray();
    }

    public void inserir(int valor) {
        if (tamanho == info.length) {
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho++;
    }

    public void redimensionar() {
        int[] vetor = new int[tamanho + 10];    
        for (int i = 0; i < info.length; i++) {
            vetor[i] = info[i];
        } 
        info = vetor;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);    
        }
    }   

    public int buscar(int valor) {
        int posicao = -1;
        for (int i = 0; i < info.length; i++) { 
            if (info[i] == valor) {
                posicao = i;
            } 
        }
        return posicao;
    }

    public void retirar(int valor) {
        int posicao = 0;
        boolean temNoArray = false;

        for (int i = 0; i < info.length; i++) { 
            if (info[i] == valor) {
                posicao = i;
                temNoArray = true;
                break;
            } 
        }

        if (temNoArray == false) {
            return;
        }

        for (; posicao < info.length- posicao; posicao++) {
            info[posicao] = info[posicao + 1];
        }

        tamanho--;
    }

    public void liberar() {
        instanciaArray();
    }
    
    public int obterElemento(int posicaoElemento) {

        if (posicaoElemento >= tamanho) {
            throw new IndexOutOfBoundsException();
        }

        return info[posicaoElemento];
    }

    public boolean estaVazia() {
        if (tamanho == 0) {
            return false;
        } 
        return true;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String toString() {
        String vetorFormatado = "";

        for (int i = 0; i < tamanho; i++) {
            vetorFormatado += info[i];

            if (i < tamanho - 1) {
                vetorFormatado += ",";
            }
        }

        return vetorFormatado;
    }

    private void instanciaArray() {
        info = new int[10]; 
    }

} 
