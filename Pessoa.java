import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;
    private String telefone;
    private String cpf;
    private String email;
    public Pessoa(){
    }

    public Pessoa(String nome, int idade, String telefone, String cpf,String email) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return cpf.equals(pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " +getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Cpf: "+getCpf());
        System.out.println("Email: "+getEmail());
        System.out.println("Telefone: "+getTelefone());
    }

}
