package attack.physicsAttack;

import attack.Attack;

public abstract class PhysicsAttack implements Attack {
    public String typeAttack;

    public String getTypeAttack() {
        return typeAttack;
    }

    @Override
    public void attack() {

    }
}
