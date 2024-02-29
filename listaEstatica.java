public class listaEstatica {
    private int tamanho = 0;
    private int[] info;

    public listaEstatica() {
        info = new int[10]; 
    }

    public void inserir(int valor) {
        if (tamanho == info.length) {
            System.out.println("redimensionar");
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho++;
        // System.out.println(info[0] + " - " + tamanho);
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

        for (int i = 0; i < info.length; i++) { 
            if (info[i] == valor) {
                posicao = i;
                break;
            } 
        }

        for (; posicao < info.length- posicao; posicao++) {
            info[posicao] = info[posicao + 1];
        }

        for (int i = 0; i < info.length; i++) {
            System.out.print(info[i] + ",");
        }

        tamanho--;
    }
    
} 
