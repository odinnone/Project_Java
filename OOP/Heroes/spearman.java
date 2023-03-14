package Heroes;

public class spearman extends warrior {
    public spearman(String name, Vector2D coords) {
        super(name, 70.f, 70, 10, 2, 4, 10, 6, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(spearman.super.name)
                .append("\t| ATK:\t").append(spearman.super.attack)
                .append("\t| HP:\t").append(spearman.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(spearman.super.coords.posX).append(".").append(spearman.super.coords.posY);
    }
}