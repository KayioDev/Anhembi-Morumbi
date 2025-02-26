import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
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
        pessoa.MostrarMensagem(pessoa, cachorro);

        System.out.println("Metodo usando as informações do input\n");

        String json = "{\n" +
        "  \"pessoa\": {\n" +
        "    \"nome\": \"" + pessoa.GetNome() + "\",\n" +
        "    \"curso\": \"" + pessoa.GetCurso() + "\"\n" +
        "  },\n" +
        "  \"cachorro\": {\n" +
        "    \"nome\": \"" + cachorro.GetNomeCachorro() + "\",\n" +
        "    \"raca\": \"" + cachorro.GetRacaCachorro() + "\",\n" +
        "    \"idade\": \"" + cachorro.GetIdadeCachorro() + "\"\n" +
        "  }\n" +
        "}";

        StringJson.salvarJson(json);

        System.out.println("Olá, " + nome + 
        "!, seja bem-vindo(a) ao curso de: "
        + curso
        +"!!!" + "\n é prazer também conhecer o " + nomeDog
        + ", eu amo " + racaDog + " ele é muito lindo!!"
        + "\n nem parece ter " + idadeDog + " anos!!!");

        scanner.close();
    }


}
