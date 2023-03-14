package Heroes;

public class sniper extends shooter{
    public sniper(String name, Vector2D coords) {
        super(name, 60.f, 60, 10, 3, 5, 3,
                9, 20, 10, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(sniper.super.name)
                .append("\t| ATK:\t").append(sniper.super.attack)
                .append("\t| HP:\t").append(sniper.super.hp)
                .append(" \t| Arrows:").append(sniper.super.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(sniper.super.coords.posX).append(".").append(sniper.super.coords.posY);
    }
}