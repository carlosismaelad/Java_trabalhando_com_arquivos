import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho da pasta: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //Listando diretórios
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders:");
        for(File folder : folders){
            System.out.println(folder);
        }

        //Listando arquivos
        File[] files = path.listFiles(File::isFile);

        System.out.println("Files:");
        for(File file :  files){
            System.out.println(file);
        }

        //Criando uma subpasta a partir da pasta test
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretório criado com sucesso: " + success);

        sc.close();

    }
}