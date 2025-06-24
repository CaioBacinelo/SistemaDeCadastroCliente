public class Cliente {
   private String nome;
   private String senha;
   private long CPF;
   private long telefone;

    public Cliente(String nome, String senha, long CPF, long telefone){
        this.nome = nome;
        this.senha = senha;
        this.CPF = CPF;
        this.telefone = telefone;
    }
    
    public String getNome (){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public long getCPF(){
        return CPF;
    }

    public void setCPF(long CPF){
        this.CPF = CPF;
    }

    public long getTelefone(){
        return telefone;
    }

    public void setTelefone(long telefone){
        this.telefone = telefone;
    }

}
