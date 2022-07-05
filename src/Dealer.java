import java.util.Scanner;

public class Dealer extends Characters{
    public Dealer(String name, int gold) {
        super(name, gold);
    }

    public void buyPotion(Hero hero){
        Scanner yesOrNo = new Scanner(System.in);
        System.out.println(hero.getName() + " ������ � ���� ������ ��������� �������, ����� �� ���� �������� ������ � ���� ��������� ��������?\n" +
                "1. ��\n2. ���");
        while (true) {
            int choice = yesOrNo.nextInt();
            if (choice == 1) {
                if (hero.getGold() > 200) {
                    hero.setHealth(getHealth() + 1000);
                    hero.setGold(hero.getGold() - 200);
                    System.out.println("���� �������� <" + hero.getHealth() + "> ���� ������ <" + hero.getGold() + ">");
                    System.out.println("�� �������� �������� ������� " + hero.getName() + "! ������ ���");
                } else {
                    System.out.println("� ���� �� ���������� ������, �������. ������ ��� �������� ������ �����");
                    System.out.println("���� ������ <" + hero.getGold() + ">");
                }
                break;
            } else if (choice == 2) {
                System.out.println("��� ��� ���! ������ � ������ ���.");
                break;
            } else {
                System.out.println("������� ������� �������");
            }
        }

    }
}
