import java.util.Objects;

public class Pessoa {
    private String nome;
    private Byte idade;
    private String telefone;
    private String cpf;
    private String email;
    public Pessoa(){
    }

    public Pessoa(String nome, Byte idade, String telefone, String cpf, String email) {
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

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
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
}
