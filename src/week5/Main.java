package week5;

public class Main {

    public static void main(String[] args) {

        Arena arena = new Arena(
                new Gladiator("Connor", 500, 50, 40) {
                },
                new Gladiator("Floyd", 500, 30, 60) {
                }
        );
        arena.fight();
    }
}