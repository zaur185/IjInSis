package attack.AttackBuilder;

import attack.magicAttack.MagicAttack;
import attack.physicsAttack.PhysicsAttack;

public interface Builder {
    public void setMagickAttack(MagicAttack magicAttack);
    public void setPhysicAttack(PhysicsAttack physicsAttack);
}
