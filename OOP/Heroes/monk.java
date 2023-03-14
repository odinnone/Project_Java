package Heroes;

public class monk extends mag{
    public monk(String name, Vector2D coords) {
        super(name, 50.f, 50, 10, -7, -7, 3,
                7, 5 ,5, coords.posX, coords.posY);

    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(monk.super.name)
                .append("\t| ATK:\t").append(monk.super.attack)
                .append("\t| HP:\t").append(monk.super.hp)
                .append(" \t| MP:\t").append(monk.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(monk.super.coords.posX).append(".").append(monk.super.coords.posY);
    }
}