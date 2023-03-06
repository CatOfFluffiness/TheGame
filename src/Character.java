public abstract class Character {
//Имя
    private String name;
//Статы
    private int healthPoints;
    private int strength;
    private int dexterity;
//Богаство и опыт
    private int xp;
    private int gold;

    public Character(String name, int healthPoints, int strength, int dexterity, int xp, int gold) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.xp = xp;
        this.gold = gold;
    }
    //Реализация атаки - костыль, буду переделывать
    public int attack() {
        if (dexterity * 3 > getRandomValue()) return strength;
        else return  0;
    }

    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getHealthPoints() {return healthPoints;}

    public void setHealthPoints(int healthPoints) {this.healthPoints = healthPoints;}

    public int getStrength() {return strength;}

    public void setStrength(int strength) {this.strength = strength;}

    public int getDexterity() {return dexterity;}

    public void setDexterity(int dexterity) {this.dexterity = dexterity;}

    public int getXp() {return xp;}

    public void setXp(int xp) {this.xp = xp;}

    public int getGold() {return gold;}

    public void setGold(int gold) {this.gold = gold;}
}
