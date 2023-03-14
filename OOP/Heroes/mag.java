package Heroes;

import java.util.ArrayList;

public abstract class mag extends human {
    protected int mana;
    protected int maxMana;

    @Override
    public boolean step(ArrayList<human> team1, ArrayList<human> team2) {
        for (human human: team1) {
            if (human.hp < human.maxHp & !human.state.equals("Die")) {
                human.getDamage(damageMax);
                return false;
            }
        }
        return true;
    }

    public mag(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
    }
}