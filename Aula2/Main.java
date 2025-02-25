import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("","");
        Cachorro cachorro = new Cachorro(null, null, null);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu curso: ");
        String curso = scanner.nextLine();
        pessoa.SetDados(nome, curso);

        System.out.print("Qual nome do seu cachorro?: ");
        String nomeDog = scanner.nextLine();
        System.out.print("Qual a raça do seu cachorro?: ");
        String racaDog = scanner.nextLine();
        System.out.print("Qual a idade dele?: ");
        String idadeDog = scanner.nextLine();
        cachorro.SetDadosCachorro(nomeDog, racaDog, idadeDog);

        System.out.println("Metodo usando as informações do objeto pessoa\n");
        System.out.println("Olá, " + pessoa.GetNome() + 
        "!, seja bem-vindo(a) ao curso de: "
        + pessoa.GetCurso()
        +"!!!" + "\n é prazer também conhecer o " + cachorro.GetNomeCachorro()
        + ", eu amo " + cachorro.GetRacaCachorro() + " ele é muito lindo!!"
        + "\n nem parece ter " + cachorro.GetIdadeCachorro() + " anos!!!");

        System.out.println("Metodo usando as informações do input\n");
        System.out.println("Olá, " + nome + 
        "!, seja bem-vindo(a) ao curso de: "
        + curso
        +"!!!" + "\n é prazer também conhecer o " + nomeDog
        + ", eu amo " + racaDog + " ele é muito lindo!!"
        + "\n nem parece ter " + idadeDog + " anos!!!");

        scanner.close();
    }
}
