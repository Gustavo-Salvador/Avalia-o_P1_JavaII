public class Funcionario {
    private String nome;
    private String cpf;
    private String departamento;
    private double salario;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    public double getSalario() {
        return this.salario;
    }

    public double bonificacao(double acrescimo) {
        return this.salario + acrescimo;
    }
}