public class Characters {
    private String name;
    private int health;
    private int dexterity;
    private int gold;
    private int experience;
    private int power;
    public int potion = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Characters(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }

    public Characters(String name, int health, int dexterity, int power) {
        this.name = name;
        this.health = health;
        this.dexterity = dexterity;
        this.power = power;
    }

    public Characters(String name, int health, int dexterity, int gold, int experience, int power) {
        this.name = name;
        this.health = health;
        this.dexterity = dexterity;
        this.gold = gold;
        this.experience = experience;
        this.power = power;
    }

    public void attack(Characters target){
        target.health -= power;
        System.out.println(name + "нанес урон" + target.name + " " + power + ". " +
                "\nУ " + target.name + " осталось здоровья " + target.health);
    }

    public void cure(Characters target) {
        if (potion > 1) {
            target.health += 50;
            System.out.println("У " + name + "пополнилось здоровье до " + target.health);
        }
    }

    public void parametersOfCharacter(){
        System.out.println("<Здоровье:" + getHealth() + "> " +
                "<Ловкость:" + getDexterity() + "> " +
                "<Опыт:" + getExperience() + "> " +
                "<Сила:" + getPower() + "> " +
                "<Золото:" + getGold() + ">");
    }
}
