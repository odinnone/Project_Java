package Heroes;

import java.util.ArrayList;

public class farmer extends human {
    protected int cartridges;

    public farmer(String name, Vector2D coords) {
        super(name, 50.f, 50, 1, 1, 1, 1,
                3, coords.posX, coords.posY);
        this.cartridges = 1;
    }

    @Override
    public boolean step(ArrayList<human> team1, ArrayList<human> team2) {
        if (!state.equals("Die")) {state = "Stand"; return false;}
        else return true;
    }
        

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(farmer.super.name)
                .append("\t| ATK:\t").append(farmer.super.attack)
                .append("\t| HP:\t").append(farmer.super.hp)
                .append(" \t| Arrows: ").append(farmer.this.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(farmer.super.coords.posX).append(".").append(farmer.super.coords.posY);
    }
}