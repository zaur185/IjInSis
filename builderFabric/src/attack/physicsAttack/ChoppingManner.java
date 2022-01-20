package attack.physicsAttack;

public class ChoppingManner extends PhysicsAttack {
    public ChoppingManner(){
        typeAttack="рубящий";
    }


    @Override
    public void attack() {
        System.out.println("Вы использовали физическую атаку\n Стиль атаки:"+typeAttack);
    }
}
