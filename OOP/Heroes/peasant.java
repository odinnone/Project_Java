package Heroes;

public class peasant extends BaseHero {
    
    private int durability;
    private int maxDurability;

    public peasant() {
        super(String.format("Hero_Peasant #%d", ++peasant.number),
                peasant.r.nextInt(100, 200));
        this.maxDurability = peasant.r.nextInt(50, 150);
        this.durability = maxDurability;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.durability -= (int)(damage * 0.8);
        if (durability < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s  Durability: %d", super.getInfo(), this.durability);
    }
}
