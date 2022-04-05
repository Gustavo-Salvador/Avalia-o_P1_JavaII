public class Principal {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        Aluno a1 = new Aluno();
        
        System.out.println(p1.getPessoas());
        p1.adicionar("Nathallya");
        System.out.println(p1.getPessoas());
        p1.adicionar("Louissy");
        p1.adicionar("Jorge");
        System.out.println(p1.getPessoas());
        System.out.println(p1.pesquisar("Louissy"));
        System.out.println(p1.pesquisar("Nathallya"));
        System.out.println(p1.pesquisar("Hestewão"));
        p1.excluir("Louissy");
        System.out.println(p1.getPessoas());

        System.out.println(a1.getPessoas());
        a1.adicionar("Wanderkreysson");
        System.out.println(a1.getPessoas());
        a1.adicionar("Joseswaldo");
        a1.adicionar("Uyllian");
        System.out.println(a1.getPessoas());
        System.out.println(a1.pesquisar("Wanderkreysson"));
        System.out.println(a1.pesquisar("Joseswaldo"));
        System.out.println(a1.pesquisar("Valdisnei"));
        a1.excluir("Wanderkreysson");
        System.out.println(a1.getPessoas());
        a1.excluir("Lolrenço");
    }
}
