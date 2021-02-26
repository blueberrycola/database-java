public class Enemies {
    int enemyID; //Primary key
    String name;
    int hp;
    int dmg;
    String itemdrops[] = new String[5];
    public Enemies(int enemyID, String name, int hp, int dmg, String itemdrops[]) {
        this.enemyID = enemyID;
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }



}
