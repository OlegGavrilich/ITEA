package week5;

public class Arena {

    Gladiator connor;
    Gladiator floyd;
    private final WeaponInfo[] weapons = new WeaponInfo[]{
            new Axe(),
            new Blade(),
            new Knife()
    };

    public Arena(Gladiator connor, Gladiator floyd){
        this.connor = connor;
        this.floyd = floyd;
    }

    public void fight(){

        while(connor.isAlive() && floyd.isAlive()){

            int weaponArr = weapons.length;
            WeaponInfo firstFighterTakeWeapon = weapons[Randomizer.random(weaponArr)];
            WeaponInfo secondFighterTakeWeapon = weapons[Randomizer.random(weaponArr)];

            System.out.println("First Gladiator is - " + connor.getName());
            System.out.println("Second Gladiator is - " + floyd.getName());
            System.out.println("LETS GET READY TO RAMBLE!!!\n");

            connor.takeWeapon(firstFighterTakeWeapon);
            floyd.takeWeapon(secondFighterTakeWeapon);

            connor.damage();
            floyd.defence(connor.damage());
            floyd.damage();
            connor.defence(floyd.damage());

            System.out.printf("%s did %d damage with %s\n", connor.getName(), connor.damage(), firstFighterTakeWeapon.getName());
            System.out.printf("%s did %d damage with %s\n", floyd.getName(), floyd.damage(), secondFighterTakeWeapon.getName());
        }

        if(!connor.isAlive() && !floyd.isAlive()) {
            System.out.println("Draw");
        } else if(!connor.isAlive()) {
            System.out.println("Win - " + connor.getName());
        } else {
            System.out.println("Win - " + floyd.getName());
        }

    }
}
