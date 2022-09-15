import java.util.Scanner;

public class TesteCadastro {
    public static void main(String[] args) {
        ServicoDePessoa service = new ServicoDePessoa();
        Scanner scan = new Scanner(System.in);
        mostrarMenu();

        int comando = scan.nextInt();
        while (comando != 5 && comando >= 1 && comando <= 5) {

            switch (comando) {
                case 1:
                    Pessoa pessoa1 = salvandoPessoa(scan);
                    service.adicionaPessoa(pessoa1.getCpf(), pessoa1);
                    break;
                case 2:
                    Pessoa pessoa2 = salvandoPessoa(scan);
                    service.atualizar(pessoa2.getCpf(), pessoa2);
                    break;
                case 3:
                    service.informacoes(dadosPessoais(scan)).mostrarInformacoes();
                    break;
                case 4:
                    service.removePessoa(dadosPessoais(scan));
                    break;
            }
            mostrarMenu();
            comando = scan.nextInt();
        }
    }

    public static void mostrarMenu() {

        System.out.println("-------------------------------------------------");
        System.out.println("Digite os numeros para as seguintes operacoes");
        System.out.println("1- Cadastrar pessoa");
        System.out.println("2- Atualizar informacoes");
        System.out.println("3- ver informacoes");
        System.out.println("4- Deletar pessoa");
        System.out.println("5- Encerrar programa");
        System.out.println("-------------------------------------------------");
    }

    public static Pessoa salvandoPessoa(Scanner scan) {

        System.out.println("Digite o nome");
        String nome = scan.next();
        System.out.println("Digite a idade");
        int idade = scan.nextInt();
        System.out.println("Digite Cpf");
        String cpf = scan.next();
        System.out.println("Digite E-mail");
        String email = scan.next();
        System.out.println("Digite telefone");
        String telefone = scan.next();

        Pessoa pessoa = new Pessoa(nome, idade, telefone, cpf, email);

        return pessoa;
    }

    public static String deletarPessoa(Scanner scanner) {
        System.out.println("Digite o cpf que deseja deletar.");
        String cpf = scanner.next();
        return cpf;
    }

    public static String dadosPessoais(Scanner scan) {
        System.out.println("Digite o cpf");
        String cpf = scan.next();

        return cpf;
    }


}
