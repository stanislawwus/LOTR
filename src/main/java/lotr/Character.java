package lotr;

import lombok.Getter;
import lombok.Setter;
import lotr.Character;


@Getter
@Setter
public class Character {
    public int power;
    public int hp;
    KickStrategy kick;
    
    public Character(int power, int hp, KickStrategy kick){
        this.power = Math.max(power, 0);
        this.hp = Math.max(hp, 0);
        this.kick = kick;
    }

    public void kick(Character c){
        kick.kick(this, c);
    }

    public boolean isAlive(){
        return hp > 0;
    }
    
    @Override
    public String toString() {
        if(this instanceof Elf) {
        return "Elf{hp="+this.hp + ", power="+ this.power + "}";}
        if(this instanceof Hobbit) {
            return "Hobbit{hp="+this.hp + ", power="+ this.power + "}";}
        if(this instanceof King) {
            return "King{hp="+this.hp + ", power="+ this.power + "}";}
        else {
            return "Knight{hp="+this.hp + ", power="+ this.power + "}";}
    }
}