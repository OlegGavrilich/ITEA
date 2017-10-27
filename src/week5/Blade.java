package week5;

public class Blade implements WeaponInfo{

    private static int bladeDefaultDamage = 30;

    @Override
    public int hit(int gladiatorPower) {
        return bladeDefaultDamage + gladiatorPower;
    }

    @Override
    public String getName() {
        return "Blade";
    }
}
