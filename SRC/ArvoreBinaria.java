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