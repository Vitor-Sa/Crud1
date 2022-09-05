import java.util.HashMap;
import java.util.Map;


public class TesteCadastro {
    static MetodosCadastroPessoa mcp = new MetodosCadastroPessoa();
    public static void main(String[] args) {
        popularPessoa();
        verPessoa();
    }
    public static void popularPessoa(){
        Pessoa pessoa1 = new Pessoa("Carl",19,"999","0001");
        mcp.adicionaPessoa("0001",pessoa1);
        Pessoa pessoa2 = new Pessoa("Carlo",23,"899","0002");
        mcp.adicionaPessoa("0002",pessoa2);
        System.out.println("-------------------------\n");

    }

    public static void verPessoa(){
        Pessoa pessoa2 = new Pessoa("Karlos",40,"799","0002");
        mcp.informacoes("0002");
    }


}
