package attack.magicAttack;

public class WaterElement extends MagicAttack{
    public WaterElement(){
        typeAttack="водяная";
    }


    @Override
    public void attack() {
        System.out.println("Вы использовали магическую атаку\n Тип атаки:"+typeAttack);
    }
}
