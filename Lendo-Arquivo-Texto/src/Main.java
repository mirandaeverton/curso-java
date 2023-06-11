import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\mirev\\Documents\\Programação\\curso-java\\Lendo-Arquivo-Texto\\assets\\in.txt");

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}