import java.util.Scanner;

public class Game {
    private static int choice;

    public static void main(String[] args) {
        // Создание игровых персонажей и битвы
        Hero hero = new Hero("", 1000, 5, 500, 0, 10);
        Witch witch = new Witch("Карга Салия", 2000, 2, 20);
        Dealer dealer = new Dealer("Берлиоз",3000);
        Fight fight = new Fight();

        // Ввод имени игрока
        System.out.println("Введите имя вашего персонажа: ");
        Scanner inputActionPlayer = new Scanner(System.in);
        hero.setName(inputActionPlayer.nextLine());
        System.out.println(hero.getName());
        hero.parametersOfCharacter();

        // Начало пути
        System.out.println("\nДобро пожаловать в медолесье, " + hero.getName() + "!" +
                "\nЭто небольшое поселенье, прославившееся своей гостепреимностью и великими войнами." +
                "\nНо в это счастливое местечко пришла беда откуда не ждали." +
                "\nЗлая колдунья по имени " + witch.getName() + " заточила всех войнов в свои чары," +
                "\nи они теперь бессильны перед ней." +
                "\nНо ты, " + hero.getName() + ", единственный кто уцелел от ее чар и теперь хочешь убить старую ведьму и освободить своих товарищей." +
                "\nПеред тобой стоит выбор пойти: \n1. в темнолесье \n2. на болото, \n3. к торговцу" +
                "\nВыбери, куда идти.");
        choice = inputActionPlayer.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Вы идете в темнолесье и попадаете в логово злой колдуньи. Будете нападать на колдунью или вернетесь обратно?");
                fight.fighting(witch, hero);
                break;
            case 2:
                System.out.println("Вы идете в темнолесье и попадаете в логово злой ко3лдуньи");
                break;
            case 3:
                System.out.println("Вы идете в темнолесье и попадаете в логово злой кол3дуньи");
                break;
            default:
                System.out.println("Выберите правильную комманду");

        }

    }
}
