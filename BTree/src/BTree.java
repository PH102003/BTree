public class BTree<T extends Comparable<T>> {
    private BNode<T> raiz;

    // caso em que o nó é null
    public boolean isEmpty() {
        return raiz == null;
    }

    public void insercao(T chave) {
        if (raiz.getInfos() == null) {
            raiz = new BNode<>(5, 1);
             // ordem 5 , m = 5
             // primeira inserção, n = 1
             // settar número de chaves (com base no 'n' que é o número de chaves)
            // agora vou inserir na primeira posição. Como a árvore está vázia, a primeira posição está vázia
            raiz.getInfos()[0] = chave;
        }else{
            raiz = insercao(raiz, chave);
        }
    }

    private BNode<T> insercao(BNode<T> raiz, T chave) {
        return raiz;
    }
    private void insercaoEmNo(BNode <T> raiz, T chave){
        
    }
    private BNode<T> cisao(BNode<T> raiz, T chave){
        return raiz;
    }

    public void remover() {

    }

    public void maiorChave() {

    }

    public void menorChave() {

    }

    public void altura() {

    }

    public void encontrarChave(int chave) {

    }

    public void buscaPorNivel() {

    }

    public void buscaPreOrdem() {

    }

}
