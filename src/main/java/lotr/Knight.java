package lotr;

import lombok.Getter;
import lombok.Setter;
import lotr.Character;

@Setter
@Getter
public class Knight extends Character{
    public Knight(){
        super((int)(2 + Math.random() * 11), (int)(2 + Math.random() * 11), new KingKick());
    }
    public void setHp(int value) {
        if (value < 0) {
            this.hp = 0;
        } else {
            this.hp = value;
        }
    }
}
