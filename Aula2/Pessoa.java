public class Pessoa {
    private String nome;
    private String curso;

    public Pessoa (String nome, String curso)
    {
        this.nome = nome;
        this.curso = curso;
    }
    public Pessoa () 
    {}

    public String GetNome ()
    {
        return nome;
    }

    public String GetCurso () 
    {
        return curso;
    }
    public void SetDados(String Nome, String Curso) 
    {
        this.nome = Nome;
        this.curso = Curso;
    }


    public void MostrarMensagem (Pessoa pessoa, Cachorro cachorro) 
    {
        System.out.println("Olá, " + pessoa.GetNome() + 
        "!, seja bem-vindo(a) ao curso de: "
        + pessoa.GetCurso()
        +"!!!" + "\n é prazer também conhecer o " + cachorro.GetNomeCachorro()
        + ", eu amo " + cachorro.GetRacaCachorro() + ", ele é muito lindo!!"
        + "\n nem parece ter " + cachorro.GetIdadeCachorro() + " anos!!!\n");
    }

}
