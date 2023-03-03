package Heroes;

public class spearman extends BaseHero {
    
    private int durability;
    private int maxDurability;

    public spearman() {
        super(String.format("Hero_Spearman #%d", ++spearman.number),
                spearman.r.nextInt(100, 200));
        this.maxDurability = spearman.r.nextInt(50, 150);
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
