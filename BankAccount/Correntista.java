public class Correntista {
    
    private String nome;
    private String endereco;
    private Conta cb;

    public Correntista(){}

    public Correntista(String nome, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public String getEndereco() 
    {
        return this.endereco;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
   
    public String getNome()
    {
        return this.nome;
    }
}
