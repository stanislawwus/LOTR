package lotr;

import lombok.Getter;
import lombok.Setter;
import lotr.Character;

@Setter
@Getter
public class Hobbit extends Character{
    public Hobbit() {
        super(0, 3, new HobbitKick());
    }
    public void setHp(int value) {
        if (value < 0) {
            this.hp = 0;
        } else {
            this.hp = value;
        }
    }
}
