import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Random r = new Random();
        int valor = r.nextInt(2);
        System.out.println(valor);
    }
}
