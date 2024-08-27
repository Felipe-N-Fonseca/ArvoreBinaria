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
        return getParent().getLevel()+1;
    }

    public int getHeight(){ // encontra a altura do nó
        if(isLeaf())return 0;
        if(getleft() == null) return getRight().getHeight()+1;
        if(getRight() == null)return getleft().getHeight()+1;
        return calc.max(getleft().getHeight(), getRight().getHeight())+1;
    }
}

class calc{
    public static int max(int a, int b){
        if(a > b)return a;
        return b;
    }
}

class ArvoreBinaria{
    public static void main(String[] args) {
        Node root = new Node();
        root.setLeft(new Node());
        root.getleft().setParent(root);
        root.setRight(new Node());
        root.getRight().setParent(root);
        root.getRight().setRight(new Node());
        root.getRight().getRight().setParent(root.getRight());
        root.getRight().setLeft(new Node());
        root.getRight().getleft().setParent(root.getRight());
        root.getRight().getRight().setRight(new Node());
        root.getRight().getRight().getRight().setParent(root.getRight().getRight());

        System.out.println("O root é raiz: " + root.isRoot());
        System.out.println("O filho direito do root é raiz: " + root.getRight().isRoot());
        System.out.println("O root é folha: " + root.isLeaf());
        System.out.println("O filho esquerdo do root é folha: " + root.getleft().isLeaf());
        System.out.println("O grau do root é: " + root.getDegree());
        System.out.println("O grau filho esquerdo do root é: " + root.getleft().getDegree());
        System.out.println("O nível do root é: " + root.getLevel());
        System.out.println("O nível do neto mais a direita do root é: " + root.getRight().getRight().getLevel());
        System.out.println("A altura da arvore é: " + root.getHeight());

    }


}