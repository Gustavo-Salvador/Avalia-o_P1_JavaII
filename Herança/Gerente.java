public class Gerente extends Funcionario{
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getSenha() {
        return senha;
    }

    public boolean autenticacao(int senhaDigitada) {
        if (this.senha == senhaDigitada) {
            return true;
        } else {
            return false;
        }
    }
}
