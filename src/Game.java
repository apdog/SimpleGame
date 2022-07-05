import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // �������� ������� ���������� � �����
        Hero hero = new Hero("", 400, 3,500, 0, 20, 1);
        Witch witch = new Witch("����� �����", 600, 4, 32);
        Dealer dealer = new Dealer("�������",3000);
        Dragon dragon = new Dragon("������ �������", 110,2, 8);
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
            String choice = inputActionPlayer.nextLine();
            switch (choice) {
                case "1" -> {
                    while (true) {
                        hero.parametersOfCharacter();
                        System.out.println("""
                                �� ����� � ���������� � ��������� � ������ ���� ��������. ������ �������� �� �������� ��� ��������� �������?
                                1. ���������\s
                                2. ��������� � ���������""");
                        String choiceAttack = inputActionPlayer.nextLine();
                        if (choiceAttack.equals("1")) {
                            fight.fightingWitWitch(witch, hero, dragon);
                            System.out.println("""
                                    ���� ������ ������?
                                    1. � ����������\s
                                    2. �� ������\s
                                    3. � ��������\s
                                    4. ��������� ����""");
                            break;
                        } else if (choiceAttack.equals("2")) {
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
                case "2" ->{
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
                case "3" -> {
                    hero.parametersOfCharacter();
                    System.out.println("�� ����� � ���������� ������, ��� �������� ������� ����� ���������, ���� ��������� �� ��������. ��, ��� ������" +
                            "�� ������ ����, �� ����� ��������� � �������� ���� ����������.");
                    dealer.buyPotion(hero);
                    System.out.println("""
                                    ���� ������ ������?
                                    1. � ����������\s
                                    2. �� ������\s
                                    3. � ��������\s
                                    4. ��������� ����""");
                }
            } if (choice.equals("4")){
                System.out.println("�� ����� ������, " + hero.getName() + "!");
                break;
            } else  {
                System.out.println("������� ������� �������. ������� ����� �� ������������ ���������");
            }
        }


    }
}
