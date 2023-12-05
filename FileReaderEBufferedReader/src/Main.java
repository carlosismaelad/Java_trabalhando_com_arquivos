
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        String path = "c:\\test\\in.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            // instanciamos o BufferedReader passando o FileReader como argumento;
            // O br é uma abstração maior e é instanciado a partir do fr;
            // pegamos a stream básica e a partir dela instanciamos a stream que tem um
            // esquema de buffer para tornar a leitura mais rápida;
            // torna o sistema de leitura de arquivos mais flexível.
            // poderíamos fazer "br = new BufferedReader(new FileReader(path))";
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try{
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }



        }

    }
}