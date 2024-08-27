class Node{
    private String data;
    private Node parent, left, right;

    // Construtores
    public Node(){
        this(null, null, null, null);
    }

    public Node(String data, Node parent, Node left, Node right){
        setData(data);
        setParent(parent);
        setLeft(left);
        setRight(right);
    }

    // Setters e Getters
    public void setData(String data){this.data = data;}
    public void setParent(Node parent){this.parent = parent;}
    public void setLeft(Node left){this.left = left;}
    public void setRight(Node right){this.right = right;}

    public String getData(){return this.data;}
    public Node getParent(){return this.parent;}
    public Node getleft(){return this.left;}
    public Node getRight(){return this.right;}

    // Métodos
    public boolean isRoot(){return getParent() == null;} // Verifica se é o nó raiz
    public boolean isLeaf(){return (getleft() == null && getRight() == null);} // verifica se é o nó folha

    public int getDegree(){ // busca o grau do nó
        if(getleft() != null && getRight() != null) return 2;
        if(getleft() != null || getRight() != null) return 1;
        return 0;
    }
    
    public int getLevel(){ // busca o nivel do nó
        if(isRoot())return 0;
        return getLevel()+1;
    }

    public int getHeight(){ // encontra a altura do nó
        if(isLeaf())return 0;
        return calc.max(getleft().getHeight(), getRight().getHeight());
    }
}

class calc{
    public static int max(int a, int b){
        if(a > b)return a;
        return b;
    }
}