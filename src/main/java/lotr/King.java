package lotr;

import lombok.Getter;
import lombok.Setter;
import lotr.Character;

@Setter
@Getter
public class King extends Character{
    public King(){
        super((int)(5 + Math.random() * 11), (int)(5 + Math.random() * 11), new KingKick());
    }
    public void setHp(int value) {
        if (value < 0) {
            this.hp = 0;
        } else {
            this.hp = value;
        }
    }
}
