import Heroes.*;

public class main {
    public static void Main(String[] args) {
        BaseHero hero1 = new magician();
        System.out.println(hero1.getInfo());
        
        BaseHero hero2 = new peasant();
        System.out.println(hero2.getInfo());

        BaseHero hero3 = new spearman();
        System.out.println(hero3.getInfo());

        BaseHero hero4 = new outlaw();
        System.out.println(hero4.getInfo());

        BaseHero hero5 = new sniper();
        System.out.println(hero5.getInfo());

        BaseHero hero6 = new crossbowman();
        System.out.println(hero6.getInfo());

        BaseHero hero7 = new monk();
        System.out.println(hero7.getInfo());
    }
}
