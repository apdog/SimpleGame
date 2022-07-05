import java.util.Scanner;

public class Dealer extends Characters{
    public Dealer(String name, int gold) {
        super(name, gold);
    }

    public void buyPotion(Hero hero){
        Scanner yesOrNo = new Scanner(System.in);
        System.out.println(hero.getName() + " Хочешь я тебя сделаю настолько сильным, чтобы ты смог победить Ведьму и всех остальных монстров?\n" +
                "1. Да\n2. Нет");
        while (true) {
            int choice = yesOrNo.nextInt();
            if (choice == 1) {
                if (hero.getGold() > 200) {
                    hero.setHealth(getHealth() + 1000);
                    hero.setGold(hero.getGold() - 200);
                    System.out.println("Твое здоровье <" + hero.getHealth() + "> Твое золото <" + hero.getGold() + ">");
                    System.out.println("Ты совершил выгодную покупку " + hero.getName() + "! Заходи ещё");
                } else {
                    System.out.println("У тебя не достаточно золота, мальчик. Заходи как накопишь нужную сумму");
                    System.out.println("Твое золото <" + hero.getGold() + ">");
                }
                break;
            } else if (choice == 2) {
                System.out.println("Нет так нет! Заходи в другой раз.");
                break;
            } else {
                System.out.println("Неверно набрана команда");
            }
        }

    }
}
