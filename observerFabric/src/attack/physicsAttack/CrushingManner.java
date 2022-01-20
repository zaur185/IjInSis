package attack.physicsAttack;

public class CrushingManner extends PhysicsAttack{
    public CrushingManner(){
        typeAttack="дробящий удар";
    }

    @Override
    public void attack() {
        System.out.println("Вы использовали физическую атаку\n Стиль атаки:"+typeAttack);
    }
}
