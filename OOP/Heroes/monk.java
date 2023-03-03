package Heroes;

public class monk extends BaseHero {
    private int elixir;
    private int maxElixir;

    public monk() {
        super(String.format("Hero_Monk #%d", ++monk.number),
                monk.r.nextInt(100, 200));
        this.maxElixir = monk.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.elixir -= (int) (damage * 0.8);
        if (elixir < 0)
            return 0;
        else
            return damage;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
