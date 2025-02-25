public class Cachorro {
    private String nome;
    private String raca;
    private String idade;

    public Cachorro (String Nome, String Raca, String Idade)
    {
        this.nome = Nome;
        this.raca = Raca;
        this.idade = Idade;
    }

    public String GetNomeCachorro () 
    {
        return nome;
    }

    public String GetRacaCachorro () 
    {
        return raca;
    }

    public String GetIdadeCachorro () 
    {
        return idade;
    }

    public void SetDadosCachorro (String Nome, String Raca, String Idade) 
    {
        this.nome = Nome;
        this.raca = Raca;
        this.idade = Idade;
    }
}
