public class Pessoa implements IPessoa{
    private String pessoas = "";
    
    public void setPessoas(String pessoas) {
        this.pessoas = pessoas;
    }
    public String getPessoas() {
        return this.pessoas;
    }

    @Override
    public void adicionar(String pessoaNova) {
        if (this.pessoas != "") {
            this.pessoas += ", " + pessoaNova;
        } else {
            this.pessoas += pessoaNova;
        }
    }

    @Override
    public void excluir(String pessoaExcomungada) {
        if (this.pesquisar(pessoaExcomungada)) {
            if (this.pessoas.indexOf(pessoaExcomungada) != 0) {
                this.pessoas = this.pessoas.substring(0, this.pessoas.indexOf(pessoaExcomungada) - 2) + this.pessoas.substring(this.pessoas.indexOf(pessoaExcomungada) + pessoaExcomungada.length(), this.pessoas.length());
            } else {
                this.pessoas = this.pessoas.substring(0, this.pessoas.indexOf(pessoaExcomungada)) + this.pessoas.substring(this.pessoas.indexOf(pessoaExcomungada) + pessoaExcomungada.length() + 2, this.pessoas.length());
            }
        } else {
            System.out.println("pessoa não encontrada");
        }
    }

    @Override
    public boolean pesquisar(String pessoaCacada) {
        String[] i = this.pessoas.split(", ");
        boolean achou = false;
        for(String j : i) {
            if (j.trim().toLowerCase().equals(pessoaCacada.trim().toLowerCase())) {
                achou = true;
                break;
            }
        }

        return achou;
    }
    
}
