package hero;

import attack.ComboAttack.ComboAttack;

import java.util.ArrayList;

public class Hero {
    String nickName;

    public void setNickName(String nickName, ComboAttack comboAttack) {
        this.nickName = nickName;
        comboAttack.registerHeroes(this);
    }

    public void update(String comboAttack) {
        System.out.println( nickName+" изучил: " + comboAttack);
    }
}
