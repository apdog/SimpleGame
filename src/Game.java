import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // Создание игровых персонажей и битвы
        Hero hero = new Hero("", 100, 5, 500, 0, 10);
        Witch witch = new Witch("Карга Салия", 200, 2, 20);
        Dealer dealer = new Dealer("Берлиоз",3000);
        Dragon dragon = new Dragon("Дракон Каракас", 50,2, 8);
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
        while (true){
            int choice = inputActionPlayer.nextInt();
            switch (choice) {
                case 1 -> {
                    while (true) {
                        System.out.println("""
                                Вы идете в темнолесье и попадаете в логово злой колдуньи. Будете нападать на колдунью или вернетесь обратно?
                                1. Сразиться\s
                                2. Вернуться в поселение""");
                        int choiceAttack = inputActionPlayer.nextInt();
                        if (choiceAttack == 1) {
                            fight.fightingWitWitch(witch, hero, dragon);
                            System.out.println("""
                                    Куда пойдем дальше?
                                    1. В темнолесье\s
                                    2. На болото\s
                                    3. К торговцу""");
                            break;
                        } else if (choiceAttack == 2) {
                            System.out.println("""
                                    Куда пойдем дальше?
                                    1. В темнолесье\s
                                    2. На болото\s
                                    3. К торговцу""");
                            break;
                        } else {
                            System.out.println("Введите верную комманду");
                            System.out.println("""
                                    Вы идете в темнолесье и попадаете в логово злой колдуньи. Будете нападать на колдунью или вернетесь обратно?
                                    1. Сразиться\s
                                    2. Вернуться в поселение""");
                        }
                    }
                }
                case 2 ->{
                    System.out.println("""
                            Вы попадаете в черное и мрачное болото, в котором поселился страшный дракон \s
                            Он вас заметил и начинает идти к вам с явно недобрыми намерениями\s
                            Бой начинается!""");
                    fight.fightingWitDragon(witch, hero, dragon);
                    System.out.println("""
                                    Куда пойдем дальше?
                                    1. В темнолесье\s
                                    2. На болото\s
                                    3. К торговцу""");
                    break;

                }
                case 3 -> System.out.println("Вы идете в темнолесье и попадаете в логово злой кол3дуньи");
                default -> System.out.println("Выберите правильную комманду");
            }
        }


    }
}
