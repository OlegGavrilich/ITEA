package week5;

abstract class Gladiator {

    protected int dogfight;
    private String name;
    private int health;
    protected WeaponInfo weapon;

    Gladiator(String name, int health, int strength, int agility) {
        this.name = name;
        this.health = health;
        dogfight = (strength*2) + (agility/2);
    }

    void takeWeapon(WeaponInfo weapon){
        this.weapon = weapon;
    }

    int damage() {
        if(weapon != null) return weapon.hit(dogfight);
        return dogfight;
    }

    void defence(int damage){
        if(weapon != null) health -= weapon.hit(dogfight);
        health -= dogfight;
    }

    boolean isAlive(){
        return health > 0;
    }

    String getName() {
        return name;
    }

    int getHealth() {
        return health;
    }

}

