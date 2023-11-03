public class BTree<T extends Comparable<T>> {
    private BNode<T> raiz;

    // caso em que o nó é null
    public boolean isEmpty() {
        return raiz == null;
    }

    public void insercaoB(T chave) {
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
        if(raiz.getN() < 5){
            insercaoEmNo(raiz, chave);
        }else{
            BNode<T> nocisao = cisao(raiz, chave);
            //insercao da chave que subiu por conta da cisão
            raiz = insercao(raiz, (T) nocisao.getInfos()[0]);
        }
        return raiz;
    }
    private void insercaoEmNo(BNode <T> raiz, T chave){
        
    }
    private BNode<T> cisao(BNode<T> raiz, T chave){
        BNode<T> novoNo = new BNode<>(raiz.getM(),raiz.getN());
        int posicaoNo = 0;
        while (posicaoNo < raiz.getN() && chave.compareTo((T) raiz.getInfos()[posicaoNo]) > 0) {
            posicaoNo++;
        }
        int noDoMeio = raiz.getN()/2;
        for (int i = noDoMeio + 1; i < raiz.getN(); i++) {
            novoNo.getInfos()[i - noDoMeio - 1] = raiz.getInfos()[i];
            raiz.getInfos()[i] = null; // Limpe as chaves do nó original
        }
    
        // Atualize o número de chaves nos dois nós
        raiz.setN(noDoMeio);
        novoNo.setN(noDoMeio);
    
        // Verifique em qual nó a chave pertence
        BNode<T> noDestino;
        if (posicaoNo <= noDoMeio) {
            noDestino = raiz;
        } else {
            noDestino = novoNo;
            posicaoNo -= noDoMeio + 1;
        }
    
        return novoNo;
    }

    public void remover() {

    }

    public BNode<T> maiorChave(BNode<T> raiz) {
        if(raiz == null){
            return null; //árvore vazia
        }
        //pega o último endereço do filho (mais a direita)
        while(raiz.getFilhos()[raiz.getN()] != null){
            raiz = raiz.getFilhos()[raiz.getN()];
        }
        return raiz;

    }

    public BNode<T> MenorChave(BNode<T> raiz) {
        if (raiz == null) {
            return null; // árvore vazia
        }
        //pega o primeiro endereço do filho (mais a esquerda)
        while (raiz.getFilhos()[0] != null) {
            raiz = raiz.getFilhos()[0];
        }
        
        return raiz;
    }
    

    public int calcularAltura(BNode<T> node) {
        if (node == null) {
            return -1; // árvore vazia, altura = -1
        }
        
        int altura = 0;
        BNode<T> noAtual = node;
        
        while (noAtual.getFilhos()[0] != null) {
            altura++;
            noAtual = noAtual.getFilhos()[0];
        }
        
        return altura;
    }
    

    public void encontrarChave(int chave) {

    }

    public void buscaPorNivel() {

    }

    public void buscaPreOrdem() {

    }

}
