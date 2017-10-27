package week5;


public class Axe implements WeaponInfo{

    private static int axeDefaultDamage = 50;

    @Override
    public int hit(int gladiatorPower) {
        return axeDefaultDamage + gladiatorPower;
    }

    @Override
    public String getName() {
        return "Axe";
    }
}
