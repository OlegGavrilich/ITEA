package week5;

public class Knife implements  WeaponInfo{

    private static int knifeDefaultDamage = 10;

    @Override
    public int hit(int gladiatorPower) {
        return knifeDefaultDamage + gladiatorPower;
    }

    @Override
    public String getName() {
        return "Knife";
    }
}
