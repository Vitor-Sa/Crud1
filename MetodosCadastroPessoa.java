import java.util.HashMap;
import java.util.Map;
public class MetodosCadastroPessoa {
    Pessoa pessoa = new Pessoa();
    Map <String, Pessoa> pessoas = new HashMap<>();

    public boolean adicionaPessoa(String cpf, Pessoa pessoa){
        try{
            pessoas.put(cpf,pessoa);
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
}
