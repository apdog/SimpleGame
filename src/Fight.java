import java.util.Random;

public class Fight {
    int i = 1;

    public void fighting(Witch witch, Hero hero) {
        Random randomInt = new Random();
        int turn = randomInt.nextInt(2);
        if (turn == 0) {
            System.out.println("����� �������� " + hero.getName());
             while (true) {
                System.out.println("**** ��� " + i + " - " + hero.getName() + " ****");
                witch.setHealth(witch.getHealth()- hero.getPower() * hero.getDexterity() * randomInt.nextInt(4));
                System.out.println(hero.getName() + " ������� ���� �� " + witch.getName() + " � ��������� � �������� �� "
                        + witch.getHealth());
                    if (witch.getHealth()<= 0) {
                        System.out.println(hero.getName() + " ������� �������� " + witch.getName() + "!");
                        break;
                    }
                ++i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                 System.out.println("**** ��� " + i + " - " + witch.getName() + " ****");
                hero.setHealth(hero.getHealth() - witch.getPower()* witch.getDexterity() * randomInt.nextInt(4));
                System.out.println(witch.getName() + " ������� ���� �� " + hero.getName() + " � ��������� ��� �������� �� "
                        + hero.getHealth());
                    if (hero.getHealth()<= 0) {
                        System.out.println(witch.getName() + " �������� ����� " + hero.getName() + "!");
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
            System.out.println("����� �������� " + witch.getName());
            while (true) {
                System.out.println("**** ��� " + i + " - " + witch.getName() + " ****");
                hero.setHealth(hero.getHealth() - witch.getPower()* witch.getDexterity() * randomInt.nextInt(4));
                System.out.println(witch.getName() + " ������� ���� �� " + hero.getName() + " � ��������� ��� �������� �� "
                        + hero.getHealth());
                if (hero.getHealth()<= 0) {
                    System.out.println(witch.getName() + " �������� ����� " + hero.getName() + "!");
                    break;
                }
                ++i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("**** ��� " + i + " - " + hero.getName() + " ****");
                witch.setHealth(witch.getHealth()- hero.getPower()* hero.getDexterity() * randomInt.nextInt(4));
                System.out.println(hero.getName() + " ������� ���� �� " + witch.getName() + " � ��������� � �������� �� "
                        + witch.getHealth());
                if (witch.getHealth()<= 0) {
                    System.out.println(hero.getName() + " ������� �������� " + witch.getName() + "!");
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