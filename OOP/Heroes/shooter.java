package Heroes;

import java.util.ArrayList;

public abstract class shooter extends human {
    protected int range;
    protected int cartridges;

    protected shooter(String name, float hp, int maxHp, int attack, int damageMin,
            int damageMax, int defense, int speed, int cartridges,
            int range, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.range = range;
        this.cartridges = cartridges;
    }

    @Override
    public boolean step(ArrayList<human> team1, ArrayList<human> team2) {
        if (state.equals("Die") || cartridges == 0)
            ;
        human victim = team2.get(findNearest(team2));
        float damage = (victim.defense - attack) > 0 ? damageMin
                : (victim.defense - attack) < 0 ? damageMax : (damageMin + damageMax) / 2;
        victim.getDamage(damage);
        for (human human : team1) {
            if (human.getInfo().toString().split(":")[0].equals("Фермер") && human.state.equals("Stand")) {
                human.state = "Busy";

            }
            return true;
        }
        cartridges--;
        return false;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin + damageMax) / 2)) +
                " Shots:" + cartridges + " " +
                state;
    }

}