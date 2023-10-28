public class BTree <T extends Comparable<T>> {
    private BNode<T> raiz;
    //caso em que o nó é null    
    public boolean isEmpty(){
        return raiz == null;
    }
    public void inserir(T chave){
        if(raiz.getInfos()== null){
            raiz = new BNode<>();
        }
    }
    public void remover(){

    }
    public void maiorChave(){

    }
    public void menorChave(){

    }
    public void altura(){

    }
    public void encontrarChave(int chave){

    }
    public void buscaPorNivel(){

    }
    public void buscaPreOrdem(){

    }

}
