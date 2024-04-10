package listaDuplaEncadeada;


public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla() {

    }

    public void inserir(T valor) {

        NoListaDupla<T> novo = new NoListaDupla<T>();

        novo.setInfo(valor);
        
        novo.setProx(getPrimeiro());
        
        novo.setAnterior(null);
        
        if (getPrimeiro() != null) {
            getPrimeiro().setAnterior(novo);
        }
        
        primeiro = novo;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public NoListaDupla<T> getUltimo(){
        NoListaDupla<T> ultimo = primeiro;
        
        NoListaDupla<T> p = primeiro;

        while (p != null){
            ultimo = p;
            p = p.getProx();
        }
        
        return ultimo;
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> p = primeiro;
        
        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            
            p = p.getProx();

        }

        return null;
    }

    public void retirar(T valor) {
        NoListaDupla<T> p = buscar(valor);
       
        if (p != null) {
            if (primeiro == p) {
                primeiro.getProx();
            } else { 
                p.getAnterior().setProx(p.getProx());
            }

            if (p.getProx() != null) {
                p.getProx().setAnterior(p.getAnterior());
            }
        }
    }

    public void exibirOrdemInversa() {
        NoListaDupla<T> p = getPrimeiro();
        // leva p ao ultimo
        while (p != null && p.getProx() != null) {
            p = p.getProx();
        }
        // desce a lista exibindo seus valores
        while (p != null) {
            System.out.println(p.getInfo().toString());
            p = p.getAnterior();
        }
    }

    public void liberar() {
        NoListaDupla<T> p =primeiro;
       
        while (p != null) {
            p.setAnterior(null);

            NoListaDupla<T> backup = p.getProx();
            p.setProx(null);

            p = backup;
        }
        primeiro = null;
    }

    public String toString() {

        NoListaDupla<T> p = getPrimeiro();
        String str = "";

        while (p != null) {
            if (p.getAnterior() == null) {
                str = str + p.getInfo().toString();
                p = p.getProx();
            }
            else {
            str = str + ", " + p.getInfo().toString();
            p = p.getProx();
            }
        }
        return str;
    }

    public static void main(String[] args) {
        ListaDupla<Integer> lista = new ListaDupla<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        // lista.exibirOrdemInversa();

        // System.out.println(lista.buscar(10).getInfo().toString());

        // System.out.println(lista.toString());
        // System.out.println(lista.getPrimeiro().getInfo());
        // lista.liberar();
        System.out.println(lista.toString());
        lista.retirar(5);
       // lista.retirar(20);
        System.out.println(lista.toString());
        System.out.println(lista.getPrimeiro().getInfo());

    }

}