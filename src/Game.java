import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // �������� ������� ���������� � �����
        Hero hero = new Hero("", 100, 5, 500, 0, 10);
        Witch witch = new Witch("����� �����", 200, 2, 20);
        Dealer dealer = new Dealer("�������",3000);
        Dragon dragon = new Dragon("������ �������", 50,2, 8);
        Fight fight = new Fight();

        // ���� ����� ������
        System.out.println("������� ��� ������ ���������: ");
        Scanner inputActionPlayer = new Scanner(System.in);
        hero.setName(inputActionPlayer.nextLine());
        System.out.println(hero.getName());
        hero.parametersOfCharacter();

        // ������ ����
        System.out.println("\n����� ���������� � ���������, " + hero.getName() + "!" +
                "\n��� ��������� ���������, �������������� ����� ���������������� � �������� �������." +
                "\n�� � ��� ���������� �������� ������ ���� ������ �� �����." +
                "\n���� �������� �� ����� " + witch.getName() + " �������� ���� ������ � ���� ����," +
                "\n� ��� ������ ��������� ����� ���." +
                "\n�� ��, " + hero.getName() + ", ������������ ��� ������ �� �� ��� � ������ ������ ����� ������ ������ � ���������� ����� ���������." +
                "\n����� ����� ����� ����� �����: \n1. � ���������� \n2. �� ������, \n3. � ��������" +
                "\n������, ���� ����.");
        while (true){
            int choice = inputActionPlayer.nextInt();
            switch (choice) {
                case 1 -> {
                    while (true) {
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
                                    3. � ��������""");
                            break;
                        } else if (choiceAttack == 2) {
                            System.out.println("""
                                    ���� ������ ������?
                                    1. � ����������\s
                                    2. �� ������\s
                                    3. � ��������""");
                            break;
                        } else {
                            System.out.println("������� ������ ��������");
                            System.out.println("""
                                    �� ����� � ���������� � ��������� � ������ ���� ��������. ������ �������� �� �������� ��� ��������� �������?
                                    1. ���������\s
                                    2. ��������� � ���������""");
                        }
                    }
                }
                case 2 ->{
                    System.out.println("""
                            �� ��������� � ������ � ������� ������, � ������� ��������� �������� ������ \s
                            �� ��� ������� � �������� ���� � ��� � ���� ��������� �����������\s
                            ��� ����������!""");
                    fight.fightingWitDragon(witch, hero, dragon);
                    System.out.println("""
                                    ���� ������ ������?
                                    1. � ����������\s
                                    2. �� ������\s
                                    3. � ��������""");
                    break;

                }
                case 3 -> System.out.println("�� ����� � ���������� � ��������� � ������ ���� ���3�����");
                default -> System.out.println("�������� ���������� ��������");
            }
        }


    }
}
