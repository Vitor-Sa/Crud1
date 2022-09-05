import java.util.HashMap;
import java.util.Map;
public class MetodosCadastroPessoa {

    Pessoa pessoa = new Pessoa();
    Map <String, Pessoa> pessoas = new HashMap<>();

    public boolean adicionaPessoa(String cpf, Pessoa pessoa){
        try{
            pessoas.put(cpf,pessoa);
            System.out.println(pessoa.getNome()+" Salvo!");
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
    public boolean removePessoa(String cpf){
        try{
            pessoas.remove(pessoa);
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
    public Pessoa informacoes(String cpf){
        return pessoas.get(cpf);

    }
    public Pessoa atualizar(String cpf, Pessoa pessoa){
        if(pessoas.containsKey(cpf)){
            pessoas.remove(cpf);
            pessoas.put(cpf, pessoa);
            System.out.println(pessoa.getNome()+" Atualizado");
        }
        throw new RuntimeException("Pessoa invalida");
    }
}
