import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        // Создание игровых персонажей и битвы
        Hero hero = new Hero("", 400, 3,500, 0, 20, 1);
        Witch witch = new Witch("Карга Салия", 600, 4, 32);
        Dealer dealer = new Dealer("Берлиоз",3000);
        Dragon dragon = new Dragon("Дракон Каракас", 110,2, 8);
        Fight fight = new Fight();

        // Ввод имени игрока
        System.out.println("Введите имя вашего персонажа: ");
        Scanner inputActionPlayer = new Scanner(System.in);
        hero.setName(inputActionPlayer.nextLine());
        hero.parametersOfCharacter();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Начало пути
        System.out.println("\nДобро пожаловать в медолесье, " + hero.getName() + "!" +
                "\nЭто небольшое поселенье, прославившееся своей гостепреимностью и великими войнами." +
                "\nНо в это счастливое местечко пришла беда откуда не ждали." +
                "\nЗлая колдунья по имени " + witch.getName() + " заточила всех войнов в свои чары," +
                "\nи они теперь бессильны перед ней." +
                "\nНо ты, " + hero.getName() + ", единственный кто уцелел от ее чар и теперь хочешь убить старую ведьму и освободить своих товарищей." +
                "\nПеред тобой стоит выбор пойти: \n1. В темнолесье \n2. На болото, \n3. К торговцу \n4. Завершить игру" +
                "\nВыбери, куда идти.");
        while (true){
            String choice = inputActionPlayer.nextLine();
            switch (choice) {
                case "1" -> {
                    while (true) {
                        hero.parametersOfCharacter();
                        System.out.println("""
                                Вы идете в темнолесье и попадаете в логово злой колдуньи. Будете нападать на колдунью или вернетесь обратно?
                                1. Сразиться\s
                                2. Вернуться в поселение""");
                        String choiceAttack = inputActionPlayer.nextLine();
                        if (choiceAttack.equals("1")) {
                            fight.fightingWitWitch(witch, hero, dragon);
                            System.out.println("""
                                    Куда пойдем дальше?
                                    1. В темнолесье\s
                                    2. На болото\s
                                    3. К торговцу\s
                                    4. Закончить игру""");
                            break;
                        } else if (choiceAttack.equals("2")) {
                            System.out.println("""
                                    Куда пойдем дальше?
                                    1. В темнолесье\s
                                    2. На болото\s
                                    3. К торговцу\s
                                    4. Закончить игру""");
                            break;
                        } else {
                            System.out.println("Введите верную комманду");
                            hero.parametersOfCharacter();
                            System.out.println("""
                                    Вы идете в темнолесье и попадаете в логово злой колдуньи. Будете нападать на колдунью или вернетесь обратно?
                                    1. Сразиться\s
                                    2. Вернуться в поселение""");
                        }
                    }
                }
                case "2" ->{
                    hero.parametersOfCharacter();
                    System.out.println("""
                            Вы попадаете в черное и мрачное болото, в котором поселился страшный дракон \s
                            Он вас заметил и начинает идти к вам с явно недобрыми намерениями\s
                            Бой начинается!""");
                    fight.fightingWitDragon(witch, hero, dragon);
                    System.out.println("""
                                    Куда пойдем дальше?
                                    1. В темнолесье\s
                                    2. На болото\s
                                    3. К торговцу\s
                                    4. Закончить игру""");

                }
                case "3" -> {
                    hero.parametersOfCharacter();
                    System.out.println("Ты зашел в деревянную лачугу, где торговец крыхтел перед прилавком, явно скучающий от безделья. Но, как только" +
                            "он увидел тебя, то сразу повеселел и принялся тебя обхаживать.");
                    dealer.buyPotion(hero);
                    System.out.println("""
                                    Куда пойдем дальше?
                                    1. В темнолесье\s
                                    2. На болото\s
                                    3. К торговцу\s
                                    4. Закончить игру""");
                }
            } if (choice.equals("4")){
                System.out.println("До новых встреч, " + hero.getName() + "!");
                break;
            } else  {
                System.out.println("Неверна введена команда. Введите цифру из предложенных вариантов");
            }
        }


    }
}
