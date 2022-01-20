package main;

import attack.AttackBuilder.Builder;
import attack.AttackBuilder.ComboAttackBuilder;
import attack.ComboAttack.ComboAttack;
import attack.magicAttack.FireElement;
import attack.physicsAttack.PricklyManner;

public class Main {
    public static void main(String arg[]){
        ComboAttackBuilder builder = new ComboAttackBuilder();
        ComboAttack comboAttack=new ComboAttack();
        comboAttack.constructComboAttack(builder,new FireElement(),new PricklyManner());
        builder.getComboAttack();



    }
}
