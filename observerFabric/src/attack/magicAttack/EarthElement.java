package attack.magicAttack;

public class EarthElement extends MagicAttack {
    public EarthElement(){
        typeAttack="земляная";
    }



    @Override
    public void attack() {
        System.out.println("Вы использовали магическую атаку\n Тип атаки:"+typeAttack);
    }
}
