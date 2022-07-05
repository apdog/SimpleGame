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

    public void parametersOfCharacter(){
        System.out.println("____________________________________________________________");
        System.out.println(getName() + " <Здоровье:" + getHealth() + "> " +
                "<Ловкость:" + getDexterity() + "> " +
                "<Опыт:" + getExperience() + "> " +
                "<Сила:" + getPower() + "> " +
                "<Золото:" + getGold() + ">");
        System.out.println("____________________________________________________________");
    }
}
