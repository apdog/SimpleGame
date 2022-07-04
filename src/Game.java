import java.util.Scanner;

public class Game {
    private static int choice;

    public static void main(String[] args) {
        // �������� ������� ���������� � �����
        Hero hero = new Hero("", 1000, 5, 500, 0, 10);
        Witch witch = new Witch("����� �����", 2000, 2, 20);
        Dealer dealer = new Dealer("�������",3000);
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
        choice = inputActionPlayer.nextInt();
        switch (choice) {
            case 1:
                System.out.println("�� ����� � ���������� � ��������� � ������ ���� ��������. ������ �������� �� �������� ��� ��������� �������?");
                fight.fighting(witch, hero);
                break;
            case 2:
                System.out.println("�� ����� � ���������� � ��������� � ������ ���� ��3������");
                break;
            case 3:
                System.out.println("�� ����� � ���������� � ��������� � ������ ���� ���3�����");
                break;
            default:
                System.out.println("�������� ���������� ��������");

        }

    }
}
