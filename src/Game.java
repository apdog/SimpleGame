import java.util.Scanner;

public class Game {
    private static int choiceOne = 1;
    private static int choiceTwo = 2;
    private static int choiceThree = 3;

    public static void main(String[] args) {
        // �������� ������� ����������
        Hero hero = new Hero("", 100, 50, 500, 0, 10);
        Witch witch = new Witch("����� �����", 100, 70, 20);
        Dealer dealer = new Dealer("�������",3000);

        // ���� ����� ������
        System.out.println("������� ��� ������ ���������: ");
        Scanner inputActionPlayer = new Scanner(System.in);
        hero.setName(inputActionPlayer.nextLine());
        System.out.println(hero.getName());
        hero.parametersOfCharacter();

        // ������ ����
        System.out.println("\n����� ���������� � ���������, " + hero.getName() +
                "\n��� ��������� ���������, �������������� ����� ���������������� � �������� �������." +
                "\n�� � ��� ���������� �������� ������ ���� ������ �� �����." +
                "\n���� �������� �� ����� " + witch.getName() + " �������� ���� ������ � ���� ����," +
                "\n� ��� ������ ��������� ����� ���." +
                "\n�� ��, " + hero.getName() + ", ������������ ��� ������ �� �� ��� � ������ ������ ����� ������ ������ � ���������� ����� ���������." +
                "\n����� ����� ����� ����� ����� � ���������� (1), �� ������ (2) ��� � �������� (3). ������, ���� ����.");
        inputActionPlayer.nextLine();

    }
}
