public class listaEstatica<ClasseInformada> {
    private int tamanho;
    private Object[] info;

    public listaEstatica() {
        instanciaArray();
    }

    public void inserir(ClasseInformada valor) {
        if (tamanho == info.length) {
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho++;
    }

    public void redimensionar() {
        Object[] vetor = new Object[tamanho + 10];    
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

    public int buscar(ClasseInformada valor) {
        int posicao = -1;
        for (int i = 0; i < info.length; i++) { 
            if (info[i].equals(valor)) {
                posicao = i;
            } 
        }
        return posicao;
    }

    public void retirar(ClasseInformada valor) {
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
            info[posicao] = info[posicao + 1]; //talvez precisa setar o ultimo elemento pra null
        }

        tamanho--;
    }

    public void liberar() {
        instanciaArray();
    }
    
    public ClasseInformada obterElemento(int posicao) {

        if (posicao >= tamanho) {
            throw new IndexOutOfBoundsException();
        }

        return (ClasseInformada) info[posicao];
    }

    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        } 
        return false;
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

        return vetorFormatado.toString();
    }

    private void instanciaArray() {
        info = new Object[10]; 
        tamanho = 0;
    }

} 