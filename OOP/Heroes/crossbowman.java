package Heroes;

public class crossbowman extends BaseHero {
    
    private int accuracy;
    private int maxAccuracy;

    public crossbowman() {
        super(String.format("Hero_Crossbowman #%d", ++crossbowman.number),
                crossbowman.r.nextInt(100, 200));
        this.maxAccuracy = crossbowman.r.nextInt(50, 150);
        this.accuracy = maxAccuracy;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.accuracy -= (int)(damage * 0.8);
        if (accuracy < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s  Accuracy: %d", super.getInfo(), this.accuracy);
    }
}
