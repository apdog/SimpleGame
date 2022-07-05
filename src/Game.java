import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // �������� ������� ���������� � �����
        Hero hero = new Hero("", 100, 6, 500, 0, 20);
        Witch witch = new Witch("����� �����", 600, 4, 50);
        Dealer dealer = new Dealer("�������",3000);
        Dragon dragon = new Dragon("������ �������", 80,2, 8);
        Fight fight = new Fight();

        // ���� ����� ������
        System.out.println("������� ��� ������ ���������: ");
        Scanner inputActionPlayer = new Scanner(System.in);
        hero.setName(inputActionPlayer.nextLine());
        hero.parametersOfCharacter();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // ������ ����
        System.out.println("\n����� ���������� � ���������, " + hero.getName() + "!" +
                "\n��� ��������� ���������, �������������� ����� ���������������� � �������� �������." +
                "\n�� � ��� ���������� �������� ������ ���� ������ �� �����." +
                "\n���� �������� �� ����� " + witch.getName() + " �������� ���� ������ � ���� ����," +
                "\n� ��� ������ ��������� ����� ���." +
                "\n�� ��, " + hero.getName() + ", ������������ ��� ������ �� �� ��� � ������ ������ ����� ������ ������ � ���������� ����� ���������." +
                "\n����� ����� ����� ����� �����: \n1. � ���������� \n2. �� ������, \n3. � �������� \n4. ��������� ����" +
                "\n������, ���� ����.");
        while (true){
            int choice = inputActionPlayer.nextInt();
            switch (choice) {
                case 1 -> {
                    while (true) {
                        hero.parametersOfCharacter();
                        System.out.println("""
                                �� ����� � ���������� � ��������� � ������ ���� ��������. ������ �������� �� �������� ��� ��������� �������?
                                1. ���������\s
                                2. ��������� � ���������""");
                        int choiceAttack = inputActionPlayer.nextInt();
                        if (choiceAttack == 1) {
                            fight.fightingWitWitch(witch, hero, dragon);
                            System.out.println("""
                                    ���� ������ ������?
                                    1. � ����������\s
                                    2. �� ������\s
                                    3. � ��������\s
                                    4. ��������� ����""");
                            break;
                        } else if (choiceAttack == 2) {
                            System.out.println("""
                                    ���� ������ ������?
                                    1. � ����������\s
                                    2. �� ������\s
                                    3. � ��������\s
                                    4. ��������� ����""");
                            break;
                        } else {
                            System.out.println("������� ������ ��������");
                            hero.parametersOfCharacter();
                            System.out.println("""
                                    �� ����� � ���������� � ��������� � ������ ���� ��������. ������ �������� �� �������� ��� ��������� �������?
                                    1. ���������\s
                                    2. ��������� � ���������""");
                        }
                    }
                }
                case 2 ->{
                    hero.parametersOfCharacter();
                    System.out.println("""
                            �� ��������� � ������ � ������� ������, � ������� ��������� �������� ������ \s
                            �� ��� ������� � �������� ���� � ��� � ���� ��������� �����������\s
                            ��� ����������!""");
                    fight.fightingWitDragon(witch, hero, dragon);
                    System.out.println("""
                                    ���� ������ ������?
                                    1. � ����������\s
                                    2. �� ������\s
                                    3. � ��������\s
                                    4. ��������� ����""");

                }
                case 3 -> {
                    hero.parametersOfCharacter();
                    System.out.println("�� ����� � ���������� ������, ��� �������� ������� ����� ���������, � ��� ��������� �� ��������. ��, ��� ������" +
                            "�� ������ ����, �� ����� ��������� � �������� ���� ����������.");
                    dealer.buyPotion(hero);
                    System.out.println("""
                                    ���� ������ ������?
                                    1. � ����������\s
                                    2. �� ������\s
                                    3. � ��������\s
                                    4. ��������� ����""");
                }
                default -> System.out.println("�������� ���������� ��������");
            } if (choice == 4){
                System.out.println("�� ����� ������ " + hero.getName() + "!");
                break;
            }
        }


    }
}
