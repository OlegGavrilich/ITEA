package week5;

public enum  Weapons {

    AXE,
    BLADE,
    KNIFE;

    public static Weapons chooseWeapon(int number){
        Weapons[] weapons = Weapons.values();
        for (int i = 0; i < weapons.length; i++) {
            if(weapons[i].ordinal() == number - 1){
                return weapons[i];
            }
        }
        return null;
    }

}
