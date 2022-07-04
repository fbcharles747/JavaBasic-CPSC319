package ISaveableChallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints,strength;
    private String weapon;


    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> tmp=new ArrayList<String>();
        tmp.add(name);
        tmp.add(Integer.toString(hitPoints));
        tmp.add(Integer.toString(strength));
        tmp.add(weapon);
        return tmp;
    }

    @Override
    public void read(List<String> list) {
        if(list!=null&&!list.isEmpty()){
            this.name=list.get(0);
            this.hitPoints=Integer.parseInt(list.get(1));
            this.strength=Integer.parseInt(list.get(2));
            this.weapon=list.get(3);
        }

    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
