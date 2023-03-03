import Heroes.*;

public class main {
    public static void Main(String[] args) {
        magician hero1 = new magician();
        System.out.println(hero1.getInfo());
        
        monk hero2 = new monk();
        System.out.println(hero2.getInfo());

        monk hero3 = new monk();
        System.out.println(hero3.getInfo());
    }
}
