public class Characters {
    private String name;
    private int health;
    private int dexterity;
    private int gold;
    private int experience;
    private int power;
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

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

    public Characters(String name, int health, int dexterity, int gold, int experience, int power, int level) {
        this.name = name;
        this.health = health;
        this.dexterity = dexterity;
        this.gold = gold;
        this.experience = experience;
        this.power = power;
        this.level = level;
    }

    public void parametersOfCharacter(){
        System.out.println("____________________________________________________________");
        System.out.println(getName() + ", уровень - " + getLevel() + " <Здоровье:" + getHealth() + "> " +
                "<Ловкость:" + getDexterity() + "> " +
                "<Опыт:" + getExperience() + "> " +
                "<Сила:" + getPower() + "> " +
                "<Золото:" + getGold() + ">");
        System.out.println("____________________________________________________________");
    }

    public void levelUp(){
        if (this.experience < 100)
            this.level = 1;
        else if (this.experience <= 500)
            this.level = 2;
        else if (this.experience <= 1200)
            this.level = 3;
        else if (this.level <= 2000)
            this.level = 4;
        else
            this.level = 5;
        System.out.println(getLevel());
    }
}
