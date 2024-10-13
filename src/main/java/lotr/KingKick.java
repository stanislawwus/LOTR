package lotr;

public class KingKick extends KickStrategy{

    @Override
    public void kick(Character first, Character second){
        int rand_damage = (int) 0 + (int) (Math.random() * (int) first.getPower());
        second.setHp(second.getHp() - (int) rand_damage);
    }
}
