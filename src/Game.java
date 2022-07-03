import java.util.Scanner;

public class Game {
    private static int choiceOne = 1;
    private static int choiceTwo = 2;
    private static int choiceThree = 3;

    public static void main(String[] args) {
        // Создание игровых персонажей
        Hero hero = new Hero("", 100, 50, 500, 0, 10);
        Witch witch = new Witch("Карга Салия", 100, 70, 20);
        Dealer dealer = new Dealer("Берлиоз",3000);

        // Ввод имени игрока
        System.out.println("Введите имя вашего персонажа: ");
        Scanner inputActionPlayer = new Scanner(System.in);
        hero.setName(inputActionPlayer.nextLine());
        System.out.println(hero.getName());
        hero.parametersOfCharacter();

        // Начало пути
        System.out.println("\nДобро пожаловать в медолесье, " + hero.getName() +
                "\nЭто небольшое поселенье, прославившееся своей гостепреимностью и великими войнами." +
                "\nНо в это счастливое местечко пришла беда откуда не ждали." +
                "\nЗлая колдунья по имени " + witch.getName() + " заточила всех войнов в свои чары," +
                "\nи они теперь бессильны перед ней." +
                "\nНо ты, " + hero.getName() + ", единственный кто уцелел от ее чар и теперь хочешь убить старую ведьму и освободить своих товарищей." +
                "\nПеред тобой стоит выбор пойти в темнолесье (1), на болото (2) или к торговцу (3). Выбери, куда идти.");
        inputActionPlayer.nextLine();

    }
}
