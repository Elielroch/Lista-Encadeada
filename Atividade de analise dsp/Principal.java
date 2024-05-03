public class Principal {
    public static void main(String[] args) {
        int[] valores = {1 ,5 ,6, 8, -10 ,9 ,11, 13, 22, 10 ,2};

        ListaEncadeada listaEncadeada = new ListaEncadeada();
        for (int valor : valores) {
            listaEncadeada.inserirNoFinal(valor);
        }
    
        listaEncadeada.adicionarNaPosicao(3, 10);
        listaEncadeada.adicionarNaPosicao(6, -50);

        listaEncadeada.removerPrimeiraOcorrencia(22);

        listaEncadeada.imprimirLista();
    }
}

