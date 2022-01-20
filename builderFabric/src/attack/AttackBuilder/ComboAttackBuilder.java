package attack.AttackBuilder;

import attack.magicAttack.EarthElement;
import attack.magicAttack.FireElement;
import attack.magicAttack.MagicAttack;
import attack.magicAttack.WaterElement;
import attack.physicsAttack.PhysicsAttack;

import java.util.HashMap;

public class ComboAttackBuilder implements Builder {
    HashMap<String,String> declensionAttack = new HashMap();
    private String comboAttack ="";

    @Override
    public void setMagickAttack(MagicAttack magicAttack) {
        this.comboAttack+=declensionAttack.get(magicAttack.getTypeAttack());
    }

    @Override
    public void setPhysicAttack(PhysicsAttack physicsAttack) {
        this.comboAttack+=(physicsAttack.getTypeAttack());
    }

    public ComboAttackBuilder(){
        declensionAttack.put(new EarthElement().getTypeAttack(),"земляной ");
        declensionAttack.put(new FireElement().getTypeAttack(),"огенный ");
        declensionAttack.put(new WaterElement().getTypeAttack(),"водяной ");
    }

    public String getComboAttack() {
        return this.comboAttack;
    }
}
