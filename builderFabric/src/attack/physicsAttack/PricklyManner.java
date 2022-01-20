package attack.physicsAttack;

public class PricklyManner extends PhysicsAttack{
    public PricklyManner(){
        typeAttack="колящий";
    }

    @Override
    public String getTypeAttack() {
        return super.getTypeAttack();
    }

    @Override
    public void attack() {
        System.out.println("Вы использовали физическую атаку\n Стиль атаки:"+typeAttack);
    }
}
