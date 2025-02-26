import java.io.FileWriter;
import java.io.IOException;

    public class StringJson {
       private static final String FILE_NAME = "resposta.json";

       public static void salvarJson(String json) {
        try (FileWriter file = new FileWriter(FILE_NAME)) {
            file.write(json);
            System.out.println("Arquivo salvo com sucesso em " + FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
