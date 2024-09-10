class ArvoreBinaria{
    public static void main(String[] args) {
        BinaryTree arvore = new BinaryTree(new Node("A", null, null, null));
        arvore.getRoot().setLeft(new Node("B", arvore.getRoot(), null, null));
        arvore.getRoot().getleft().setLeft(new Node("D", arvore.getRoot().getleft(), null, null));
        arvore.getRoot().setRight(new Node("C", arvore.getRoot(), null, null));
        arvore.getRoot().getRight().setLeft(new Node("E", arvore.getRoot().getRight(), null, null));
        arvore.getRoot().getRight().setRight(new Node("F", arvore.getRoot().getRight(), null, null));


        // Informações dos nós
        System.out.println("\nInformações dos nós:");

        // Informações de A
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();

        // Informações de B
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();

        // Informações de C
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();

        // Informações de D
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();

        // Informações de E
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();

        // Informações de F
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();


        // Informações da arvore
        System.out.println("\nInformações da arvore:");

        // Se está vazia


        // Grau


        // Altura


        //Percurso em ordem


        //Percurso pré ordem


        //Percurso pós ordem

        
        // Percorrendo por nível 


        
    }
}