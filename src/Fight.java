import java.util.Random;

public class Fight {
    int i = 1;

    public void fightingWitWitch(Witch witch, Hero hero, Dragon dragon  ) {
        Random random = new Random();
        int turn = random.nextInt(2);
        if (turn == 0) {
            System.out.println("Битву начинает " + hero.getName());
             while (true) {
                System.out.println("**** Ход " + i + " - " + hero.getName() + " ****");
                witch.setHealth(witch.getHealth()- hero.getPower() * hero.getDexterity() * random.nextInt(4));
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
                hero.setHealth(hero.getHealth() - witch.getPower()* witch.getDexterity() * random.nextInt(4));
                System.out.println(witch.getName() + " наносит удар по " + hero.getName() + " и уменьшает его здоровье до "
                        + hero.getHealth());
                    if (hero.getHealth()<= 0) {
                        System.out.println(witch.getName() + " победила героя " + hero.getName() + "! \n" +
                                "Но вы смогли каким-то чудом выжить. И вот по прошествию нескольких дней вы снова на распутье");
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
                hero.setHealth(hero.getHealth() - witch.getPower()* witch.getDexterity() * random.nextInt(4));
                System.out.println(witch.getName() + " наносит удар по " + hero.getName() + " и уменьшает его здоровье до "
                        + hero.getHealth());
                if (hero.getHealth()<= 0) {
                    System.out.println(witch.getName() + " победила героя " + hero.getName() + "! \n" +
                            "Но вы смогли каким-то чудом выжить. И вот по прошествию нескольких дней вы снова на распутье");
                    break;
                }
                ++i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("**** Ход " + i + " - " + hero.getName() + " ****");
                witch.setHealth(witch.getHealth()- hero.getPower()* hero.getDexterity() * random.nextInt(4));
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

    public void fightingWitDragon(Witch witch, Hero hero, Dragon dragon  ) {
        Random random = new Random();
        int turn = random.nextInt(2);
        if (turn == 0) {
            System.out.println("Битву начинает " + hero.getName());
            while (true) {
                System.out.println("**** Ход " + i + " - " + hero.getName() + " ****");
                dragon.setHealth(dragon.getHealth()- hero.getPower() * hero.getDexterity() * random.nextInt(4));
                System.out.println(hero.getName() + " наносит удар по " + witch.getName() + " и уменьшает её здоровье до "
                        + witch.getHealth());
                if (dragon.getHealth()<= 0) {
                    System.out.println(hero.getName() + " победил " + dragon.getName() + "!");
                    break;
                }
                ++i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("**** Ход " + i + " - " + dragon.getName() + " ****");
                hero.setHealth(hero.getHealth() - dragon.getPower()* dragon.getDexterity() * random.nextInt(4));
                System.out.println(dragon.getName() + " наносит удар по " + hero.getName() + " и уменьшает его здоровье до "
                        + hero.getHealth());
                if (hero.getHealth()<= 0) {
                    System.out.println(dragon.getName() + " победил героя " + hero.getName() + "! \n" +
                            "Но вы смогли каким-то чудом выжить. И вот по прошествию нескольких дней вы снова на распутье");
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
            System.out.println("Битву начинает " + dragon.getName());
            while (true) {
                System.out.println("**** Ход " + i + " - " + dragon.getName() + " ****");
                hero.setHealth(hero.getHealth() - dragon.getPower()* dragon.getDexterity() * random.nextInt(4));
                System.out.println(dragon.getName() + " наносит удар по " + hero.getName() + " и уменьшает его здоровье до "
                        + hero.getHealth());
                if (hero.getHealth()<= 0) {
                    System.out.println(dragon.getName() + " победил героя " + hero.getName() + "! \n" +
                            "Но вы смогли каким-то чудом выжить. И вот по прошествию нескольких дней вы снова на распутье");
                    break;
                }
                ++i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("**** Ход " + i + " - " + hero.getName() + " ****");
                dragon.setHealth(dragon.getHealth()- hero.getPower()* hero.getDexterity() * random.nextInt(4));
                System.out.println(hero.getName() + " наносит удар по " + dragon.getName() + " и уменьшает её здоровье до "
                        + dragon.getHealth());
                if (dragon.getHealth()<= 0) {
                    System.out.println(hero.getName() + " победил " + dragon.getName() + "!");
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