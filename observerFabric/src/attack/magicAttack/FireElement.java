package attack.magicAttack;

public class FireElement extends MagicAttack{
    public FireElement(){
        typeAttack="огненная";
    }



    @Override
    public void attack() {
        System.out.println("Вы использовали магическую атаку\n Тип атаки:"+typeAttack);
    }
}
