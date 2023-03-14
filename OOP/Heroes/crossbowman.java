package Heroes;

public class crossbowman extends shooter {
    public crossbowman(String name, Vector2D coords) {
        super(name, 60.f, 60, 7, 3, 7, 4, 9, 20, 10, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(crossbowman.super.name)
                .append("\t| ATK:\t").append(crossbowman.super.attack)
                .append("\t| HP:\t").append(crossbowman.super.hp)
                .append(" \t| Arrows:").append(crossbowman.super.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(crossbowman.super.coords.posX).append(".").append(crossbowman.super.coords.posY);
    }
}