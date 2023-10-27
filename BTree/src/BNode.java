public class BNode<T extends Comparable<T>> {
    private int n;
    private Object[] infos;
    private BNode<T>[] filhos;
    
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public Object[] getInfos() {
        return infos;
    }
    public void setInfos(Object[] infos) {
        this.infos = infos;
    }
    public BNode<T>[] getFilhos() {
        return filhos;
    }
    public void setFilhos(BNode<T>[] filhos) {
        this.filhos = filhos;
    }
     public BNode (int m) {
        infos = new Object[m-1];
        filhos = new BNode[m];
    
    }

    }