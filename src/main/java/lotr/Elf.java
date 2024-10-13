package lotr;

import lombok.Getter;
import lombok.Setter;
import lotr.Character;

@Setter
@Getter
public class Elf extends Character{
    public Elf() {
        super(10, 10, new ElfKick());
    }
    public void setHp(int value) {
        if (value < 0) {
            this.hp = 0;
        } else {
            this.hp = value;
        }
    }
}
