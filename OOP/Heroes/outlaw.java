package Heroes;

public class outlaw extends BaseHero {
    
    private int trick;
    private int maxTrick;

    public outlaw() {
        super(String.format("Hero_Outlaw #%d", ++outlaw.number),
                outlaw.r.nextInt(100, 200));
        this.maxTrick = outlaw.r.nextInt(50, 150);
        this.trick = maxTrick;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.trick -= (int)(damage * 0.8);
        if (trick < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s  Trick: %d", super.getInfo(), this.trick);
    }
}
