import java.util.Random;

public class Fight {
    int i = 1;

    public void fighting(Witch witch, Hero hero) {
        Random randomInt = new Random();
        int turn = randomInt.nextInt(2);
        if (turn == 0) {
            System.out.println("Битву начинает " + hero.getName());
             while (true) {
                System.out.println("**** Ход " + i + " - " + hero.getName() + " ****");
                witch.setHealth(witch.getHealth()- hero.getPower() * hero.getDexterity() * randomInt.nextInt(4));
                System.out.println(hero.getName() + " наносит удар по " + witch.getName() + " и уменьшает её здоровье до "
                        + witch.getHealth());
                    if (witch.getHealth()<= 0) {
                        System.out.println(hero.getName() + " победил злодейку " + witch.getName() + "!");
                        break;
                    }
                ++i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                 System.out.println("**** Ход " + i + " - " + witch.getName() + " ****");
                hero.setHealth(hero.getHealth() - witch.getPower()* witch.getDexterity() * randomInt.nextInt(4));
                System.out.println(witch.getName() + " наносит удар по " + hero.getName() + " и уменьшает его здоровье до "
                        + hero.getHealth());
                    if (hero.getHealth()<= 0) {
                        System.out.println(witch.getName() + " победила героя " + hero.getName() + "!");
                        break;
                }
                ++i;
                try {
                     Thread.sleep(1000);
                } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                }
            }
        } else {
            System.out.println("Битву начинает " + witch.getName());
            while (true) {
                System.out.println("**** Ход " + i + " - " + witch.getName() + " ****");
                hero.setHealth(hero.getHealth() - witch.getPower()* witch.getDexterity() * randomInt.nextInt(4));
                System.out.println(witch.getName() + " наносит удар по " + hero.getName() + " и уменьшает его здоровье до "
                        + hero.getHealth());
                if (hero.getHealth()<= 0) {
                    System.out.println(witch.getName() + " победила героя " + hero.getName() + "!");
                    break;
                }
                ++i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("**** Ход " + i + " - " + hero.getName() + " ****");
                witch.setHealth(witch.getHealth()- hero.getPower()* hero.getDexterity() * randomInt.nextInt(4));
                System.out.println(hero.getName() + " наносит удар по " + witch.getName() + " и уменьшает её здоровье до "
                        + witch.getHealth());
                if (witch.getHealth()<= 0) {
                    System.out.println(hero.getName() + " победил злодейку " + witch.getName() + "!");
                    break;
                }
                ++i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}