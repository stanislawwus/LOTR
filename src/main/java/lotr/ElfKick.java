package lotr;

public class ElfKick extends KickStrategy{
    @Override
    public void kick(Character first, Character second) {
        if(first.getPower() > second.getPower()){
            second.setHp(0);
        }
        else{
            first.setPower(first.getPower()-1);
        }
    }
}
