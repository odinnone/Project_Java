package Heroes;

public class magician extends BaseHero {
    
    private int mana;
    private int maxMana;

    public magician() {
        super(String.format("Hero_Magician #%d", ++magician.number),
                magician.r.nextInt(100, 200));
        this.maxMana = magician.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}
