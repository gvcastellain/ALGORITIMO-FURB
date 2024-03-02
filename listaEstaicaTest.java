import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.*;

public class listaEstaicaTest {
    @Test 
    public void teste1() {
        listaEstatica list = new listaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        Assert.assertEquals("5,10,15,20", list.toString());
    }

    @Test 
    public void teste2() {
        listaEstatica list = new listaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        Assert.assertEquals(4, list.getTamanho());
    }

    @Test 
    public void teste3() {
        listaEstatica list = new listaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        Assert.assertEquals(2, list.buscar(15));
    }

    @Test 
    public void teste4() {
        listaEstatica list = new listaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        Assert.assertEquals(-1, list.buscar(30));
    }

    @Test 
    public void teste5() {
        listaEstatica list = new listaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        list.retirar(10);
        Assert.assertEquals("5,15,20", list.toString());
        Assert.assertEquals(3, list.getTamanho());
    }

    @Test 
    public void teste6() {
        listaEstatica list = new listaEstatica();
        for (int i = 1; i <= 15; i++) {
            list.inserir(i);
        }
        Assert.assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15", list.toString());
        Assert.assertEquals(15, list.getTamanho());
    }

    @Test 
    public void teste7() {
        listaEstatica list = new listaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        Assert.assertEquals(20, list.obterElemento(3));
    }

    @Test 
    public void teste8() {
        listaEstatica list = new listaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        assertThrows(IndexOutOfBoundsException.class, () -> list.obterElemento(5));
    }

    @Test 
    public void teste9() {
        listaEstatica list = new listaEstatica();
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        list.liberar();
        Assert.assertEquals(true, list.estaVazia());
    }
}
