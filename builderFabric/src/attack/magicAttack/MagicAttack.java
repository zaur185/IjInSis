package attack.magicAttack;

import attack.Attack;

public abstract class MagicAttack implements Attack {
    public String typeAttack="";

    public String getTypeAttack() {
        return typeAttack;
    }

    @Override
    public void attack() {

    }
}
