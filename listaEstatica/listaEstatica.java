package listaestatica;

import java.util.List;

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

    public void retirarElementos(int inicio, int fim) { 
        for (int i = inicio; i <= fim; i++) {
            info[i] = info[fim + 1 + i - inicio];
            info[fim + 1 + i - inicio] = null;
            tamanho --;
        }
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
        for (int i = 0; i < tamanho; i++) { 
            if (info[i].equals(valor)) {
                return i;
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

    public void inverter() {
        ClasseInformada valorFinal;

        for (int i = tamanho-1; i > 1; i--) {
            valorFinal = (ClasseInformada) info[i];
            info[i] = info[tamanho - i -1];
            info[tamanho - i -1] = valorFinal; 
        } 
        exibir();
        
    }

} 