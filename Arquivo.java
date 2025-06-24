    import java.io.FileReader;
    import java.io.FileWriter;
    import java.io.FileReader;
    import java.io.IOException;
    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.util.List;

    public class Arquivo {
        //Faz a leitura do arquivo.
        public void LeituraArquivo(String caminhoDoArquivo){
            try{
                BufferedReader leitor = new BufferedReader(new FileReader(caminhoDoArquivo));
                String linha;
                while ((linha = leitor.readLine()) != null){
                    System.out.println(linha);
                }
                leitor.close();
            } catch (IOException e) {
                System.out.println("Erro ao ler arquivo.");
            }
        }
        //Escreve no arquivo sem deletar o que já havia sido escrito.
        public void EscreverArquivo(String caminhoDoArquivo, String texto){
            try{
            BufferedWriter escrita = new BufferedWriter(new FileWriter(caminhoDoArquivo, true));
                escrita.write(texto);
                escrita.newLine();
                escrita.close();
                System.out.println("Informações adicionadas!");
            } catch (IOException e){
                System.out.println("Falha ao adicionar informações.");
            }
        }
        //Salva o arquivo.
        public void SalvarArquivo(String caminhoDoArquivo, List<Cliente> clientes){
            try {
                BufferedWriter salvando = new BufferedWriter(new FileWriter(caminhoDoArquivo));
                for (Cliente c : clientes){
                    String linha = c.getNome() + "," + c.getSenha() + "," + c.getCPF() + "," + c.getTelefone();
                    salvando.write(linha);
                    salvando.newLine();
                }
                salvando.close();
                System.out.println("Sucesso! O arquivo foi salvo.");
            } catch (IOException e ){
                System.out.println("Falha em salvar o arquivo");
            }
        }
    // Permite a alteração do arquivo txt simultaneamente com a lista.
    public void LeituraUniversal(String caminhoDoArquivo, List<Cliente> clientes){
        try{
            BufferedReader leitura = new BufferedReader(new FileReader(caminhoDoArquivo));
            String linha;
            while ((linha = leitura.readLine()) != null){
                String[] separacao = linha.split(",");

                if (separacao.length == 4){
                    String nome = separacao [0];
                    String senha = separacao [1];
                    long CPF = Long.parseLong(separacao [2]);
                    Long telefone = Long.parseLong(separacao [3]);

                    Cliente cliente = new Cliente (nome, senha, CPF, telefone);
                    clientes.add(cliente);
                    }
                }
            leitura.close();
            } catch(IOException e){
            System.out.println("Erro na leitura do arquivo");
        }
    }
}
