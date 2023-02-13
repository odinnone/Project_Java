public class App {
    public static void main(String[] args) throws Exception{
        ReadInput readF = new ReadInput();
        task2 ts = new task2();
        ts.computing(readF.inputReader("a"),readF.inputReader("b"));
    }
}