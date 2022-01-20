package attack.ComboAttack;

import attack.AttackBuilder.Builder;
import attack.magicAttack.MagicAttack;
import attack.physicsAttack.PhysicsAttack;

public class ComboAttack {

    public ComboAttack(){

    }
    public void constructComboAttack (Builder builder,MagicAttack magicAttack, PhysicsAttack physicsAttack){
        builder.setMagickAttack(magicAttack);
        builder.setPhysicAttack(physicsAttack);
        builder.setMagickAttack(magicAttack);

    }

}
