import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicoCliente {
    private List<Cliente> clientes = new ArrayList<>();
    //Adicionar o cliente.
    public void AdicionarCliente(Cliente cliente){
        clientes.add(cliente);
        System.out.println("Cliente adicionado!");
    }
    //Listando os clientes.
    public void ListarClientes(){
        if (clientes.isEmpty()){
            System.out.println("Nenhum cliente foi cadastrado");
        } else {
            for (Cliente i : clientes ){
                System.out.println("nome: " + i.getNome());
                System.out.println("CPF " + i.getCPF());
                System.out.println("Telefone " + i.getTelefone());
                System.out.println("---------");
            }
        }
    }
    //Exclusão do cliente.
    public void ExcluirCliente(long CPF){
        Cliente ClienteRemover = null;
        for (Cliente i : clientes){
            if (i.getCPF() == CPF) {
                ClienteRemover = i;
                System.out.println("Cliente excluído com sucesso");
                break;
            }
        }
        if (ClienteRemover != null){
            clientes.remove(ClienteRemover);
        } else{
            System.out.println("CPF"+ CPF + "não encontrado para a exclusão");
        }
    }
    //Editar o cliente.
    public void EditarCliente (long CPF){
        Cliente ClienteEditar = null;
        for (Cliente e : clientes){
            if (e.getCPF() == CPF){
                ClienteEditar = e;
                break;
            }
        }
        if (ClienteEditar != null){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o novo nome: ");
            String novoNome = scanner.nextLine();
            ClienteEditar.setNome(novoNome);

            System.out.println("Digite a nova senha: ");
            String novaSenha = scanner.nextLine();
            ClienteEditar.setSenha(novaSenha);

            System.out.println("Digite o novo telefone: ");
            long novoTelefone = scanner.nextLong();
            ClienteEditar.setTelefone(novoTelefone);

            } else {
                System.out.println("CPF não encontrado.");
            }

        }
        //Método para obter a lista no case 5.
        public List<Cliente> getClientes() {
            return clientes;
        }
 }

