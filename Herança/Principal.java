public class Principal {
    public static void main(String[] args) {
        Funcionario Hayrton = new Funcionario();
        Gerente Jusyanny = new Gerente();

        Hayrton.setNome("Hayrton Chagas");
        Hayrton.setCpf("706.010.176-24");
        Hayrton.setDepartamento("compras");
        Hayrton.setSalario(1212.0);

        System.out.println(Hayrton.getNome());
        System.out.println(Hayrton.getCpf());
        System.out.println(Hayrton.getDepartamento());
        System.out.println(Hayrton.getSalario());
        System.out.println(Hayrton.bonificacao(200.0));

        Jusyanny.setNome("Jusyanny Nunes");
        Jusyanny.setCpf("195.427.777-69");
        Jusyanny.setDepartamento("RH");
        Jusyanny.setSalario(4500.0);
        Jusyanny.setSenha(1234);

        System.out.println(Jusyanny.getNome());
        System.out.println(Jusyanny.getCpf());
        System.out.println(Jusyanny.getDepartamento());
        System.out.println(Jusyanny.getSalario());
        System.out.println(Jusyanny.getSenha());
        System.out.println(Jusyanny.autenticacao(7070));
        System.out.println(Jusyanny.autenticacao(1234));
    }
}
