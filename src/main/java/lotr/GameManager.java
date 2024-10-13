package lotr;

public class GameManager {
    public void fight(Character first, Character second) {
        if(first instanceof Hobbit && second instanceof Hobbit){
            return;
        }
        while (first.isAlive() && second.isAlive()) {
            first.kick(second);
            second.kick(first);
        }
    }
}
