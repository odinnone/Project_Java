import java.io.FileWriter;
import java.io.IOException;

public class task2 {
    public void computing(int a, int b) {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            if (a == 0 && b == 0) {
                fw.write("не определено");
                fw.close();
            } else {
                fw.write(String.format("а = %d, b = %d, ответ: %f", a, b, Math.pow(a, b)));
                fw.close();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}