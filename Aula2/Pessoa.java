public class Pessoa {
    private String nome;
    private String curso;

    public Pessoa (String nome, String curso)
    {
        this.nome = nome;
        this.curso = curso;
    }

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

}
