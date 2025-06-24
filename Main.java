import java.util.Scanner;
public class Main {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ServicoCliente servico = new ServicoCliente();
    Arquivo arquivo = new Arquivo();
    String caminhoArquivo = "clientes.txt";
    arquivo.LeituraUniversal(caminhoArquivo, servico.getClientes());
    int opcao;
    //Nunca esqueça de após qualquer alteração usar a opção 5 para salvar.
        do {
            System.out.println("-----Menu-de-Cadastro-----");
            System.out.println("Opção 1: Adicionar Cliente(s).");
            System.out.println("Opção 2: Listar Cliente(s).");
            System.out.println("Opção 3: Editar Cliente(s).");
            System.out.println("Opção 4: Excluir Cliente(s).");
            System.out.println("Opção 5: Salvar Alterações no Arquivo.");
            System.out.println("Opção 6: Ler Arquivo.");
            System.out.println("Opção 0: Sair do Programa.");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Nome:");
                    String nome = scanner.nextLine();

                    System.out.println("Senha:");
                    String senha = scanner.nextLine();
                   
                     System.out.println("CPF:");
                    long CPF = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Telefone:");
                    long telefone = scanner.nextLong();
                    scanner.nextLine();

                    Cliente cliente = new Cliente(nome,senha,CPF,telefone);
                    servico.AdicionarCliente(cliente);
                    break;

                case 2:
                    servico.ListarClientes();
                    break;

                case 3:
                    System.out.println("Digite o CPF do cliente que deseja modificar");
                    long editarCPF = scanner.nextLong();
                    servico.EditarCliente(editarCPF);
                    break;

                case 4:
                    System.out.println("Digite o CPF do cliente que deseja excluir");
                    long excluirCPF = scanner.nextLong();
                    servico.ExcluirCliente(excluirCPF);
                    break;

                case 5:
                    arquivo.SalvarArquivo(caminhoArquivo, servico.getClientes());
                    break;

                case 6:
                    arquivo.LeituraArquivo(caminhoArquivo);
                    break;

                case 0:
                    System.out.println("O Sistema foi encerrado.");
                break;

                default:
                    System.out.println("Número Inválido, digite novamente.");
                    break;
            } 
            System.out.println("");
        } while (opcao != 0);
        scanner.close();
    }
}
