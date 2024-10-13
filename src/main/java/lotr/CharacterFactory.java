package lotr;


public class CharacterFactory {
    public Character createCharacter() {
        int a = (int)(Math.random()*4);

        if (a == 0) {
            Character c = new Hobbit();
            return c;
        }
        if (a == 1) {
            Character c = new Elf();
            return c;
        }
        if (a == 2) {
            Character c = new King();
            return c;
        }
        else{
            Character c = new Knight();
            return c;
        }
    }
}
