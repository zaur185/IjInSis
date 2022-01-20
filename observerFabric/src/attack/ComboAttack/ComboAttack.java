package attack.ComboAttack;

import attack.AttackBuilder.Builder;
import attack.magicAttack.MagicAttack;
import attack.physicsAttack.PhysicsAttack;
import hero.Hero;

import java.util.ArrayList;
import java.util.List;

public class ComboAttack {
    private List<Hero> heroes=new ArrayList<>();

    public ComboAttack(){

    }
    public void constructComboAttack (Builder builder,MagicAttack magicAttack, PhysicsAttack physicsAttack){
        builder.setMagickAttack(magicAttack);
        builder.setPhysicAttack(physicsAttack);

        notifyHero(builder.getComboAttack());
    }
    public void registerHeroes(Hero hero) {
        heroes.add(hero);
    }
    private void notifyHero(String comboAttack) {
        for (Hero hero : heroes)
            hero.update(comboAttack);

    }

}
