import java.util.Random;

public class Fight {
    int i = 1;

    public void fightingWitWitch(Witch witch, Hero hero, Dragon dragon  ) {
        Random random = new Random();
        int turn = random.nextInt(2);
        if (turn == 0) {
            System.out.println("����� �������� " + hero.getName());
             while (true) {
                System.out.println("**** ��� " + i + " - " + hero.getName() + " ****");
                witch.setHealth(witch.getHealth()- hero.getPower() * hero.getDexterity() * random.nextInt(4));
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
                hero.setHealth(hero.getHealth() - witch.getPower()* witch.getDexterity() * random.nextInt(4));
                System.out.println(witch.getName() + " ������� ���� �� " + hero.getName() + " � ��������� ��� �������� �� "
                        + hero.getHealth());
                    if (hero.getHealth()<= 0) {
                        System.out.println(witch.getName() + " �������� ����� " + hero.getName() + "! \n" +
                                "�� �� ������ �����-�� ����� ������. � ��� �� ���������� ���������� ���� �� ����� �� ��������");
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
                hero.setHealth(hero.getHealth() - witch.getPower()* witch.getDexterity() * random.nextInt(4));
                System.out.println(witch.getName() + " ������� ���� �� " + hero.getName() + " � ��������� ��� �������� �� "
                        + hero.getHealth());
                if (hero.getHealth()<= 0) {
                    System.out.println(witch.getName() + " �������� ����� " + hero.getName() + "! \n" +
                            "�� �� ������ �����-�� ����� ������. � ��� �� ���������� ���������� ���� �� ����� �� ��������");
                    break;
                }
                ++i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("**** ��� " + i + " - " + hero.getName() + " ****");
                witch.setHealth(witch.getHealth()- hero.getPower()* hero.getDexterity() * random.nextInt(4));
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

    public void fightingWitDragon(Witch witch, Hero hero, Dragon dragon  ) {
        Random random = new Random();
        int turn = random.nextInt(2);
        if (turn == 0) {
            System.out.println("����� �������� " + hero.getName());
            while (true) {
                System.out.println("**** ��� " + i + " - " + hero.getName() + " ****");
                dragon.setHealth(dragon.getHealth()- hero.getPower() * hero.getDexterity() * random.nextInt(4));
                System.out.println(hero.getName() + " ������� ���� �� " + witch.getName() + " � ��������� � �������� �� "
                        + witch.getHealth());
                if (dragon.getHealth()<= 0) {
                    System.out.println(hero.getName() + " ������� " + dragon.getName() + "!");
                    break;
                }
                ++i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("**** ��� " + i + " - " + dragon.getName() + " ****");
                hero.setHealth(hero.getHealth() - dragon.getPower()* dragon.getDexterity() * random.nextInt(4));
                System.out.println(dragon.getName() + " ������� ���� �� " + hero.getName() + " � ��������� ��� �������� �� "
                        + hero.getHealth());
                if (hero.getHealth()<= 0) {
                    System.out.println(dragon.getName() + " ������� ����� " + hero.getName() + "! \n" +
                            "�� �� ������ �����-�� ����� ������. � ��� �� ���������� ���������� ���� �� ����� �� ��������");
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
            System.out.println("����� �������� " + dragon.getName());
            while (true) {
                System.out.println("**** ��� " + i + " - " + dragon.getName() + " ****");
                hero.setHealth(hero.getHealth() - dragon.getPower()* dragon.getDexterity() * random.nextInt(4));
                System.out.println(dragon.getName() + " ������� ���� �� " + hero.getName() + " � ��������� ��� �������� �� "
                        + hero.getHealth());
                if (hero.getHealth()<= 0) {
                    System.out.println(dragon.getName() + " ������� ����� " + hero.getName() + "! \n" +
                            "�� �� ������ �����-�� ����� ������. � ��� �� ���������� ���������� ���� �� ����� �� ��������");
                    break;
                }
                ++i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("**** ��� " + i + " - " + hero.getName() + " ****");
                dragon.setHealth(dragon.getHealth()- hero.getPower()* hero.getDexterity() * random.nextInt(4));
                System.out.println(hero.getName() + " ������� ���� �� " + dragon.getName() + " � ��������� � �������� �� "
                        + dragon.getHealth());
                if (dragon.getHealth()<= 0) {
                    System.out.println(hero.getName() + " ������� " + dragon.getName() + "!");
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