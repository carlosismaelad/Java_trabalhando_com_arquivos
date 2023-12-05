import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o caminho do arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Pegando o nome do arquivo:
        System.out.println("getName: " + path.getName());

        // Pegando o caminho do arquivo?
        System.out.println("getParent: " + path.getParent());

        // Pegando todo o caminho do arquivo:
        System.out.println("getPath: " + path.getPath());

        sc.close();

    }
}