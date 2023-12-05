import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "c:\\test\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            // o parâmetro true indica que nós queremos que o conteúdo seja adicionado a
            // um arquivo que já existe. Sem o true, o Java reescreve e regrava o arquivo.
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}