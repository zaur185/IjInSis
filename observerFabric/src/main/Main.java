package main;

import attack.AttackBuilder.Builder;
import attack.AttackBuilder.ComboAttackBuilder;
import attack.ComboAttack.ComboAttack;
import attack.magicAttack.FireElement;
import attack.physicsAttack.PricklyManner;
import hero.Hero;

public class Main {
    public static void main(String arg[]){
        ComboAttackBuilder builder = new ComboAttackBuilder();
        ComboAttack comboAttack=new ComboAttack();

        Hero hero =new Hero();
        hero.setNickName("Destroy555",comboAttack);

        comboAttack.constructComboAttack(builder,new FireElement(),new PricklyManner());



    }
}
