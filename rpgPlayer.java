
public class rpgPlayer {
    String username; //Secondary Key
    String password; //Replace with hash??? primary key
    String[] inventory = new String[20];// PLAYER HAS INVENTORY
    String[] armor = new String[4]; // PLAYER HAS ARMOR_INVENTORY
    int hp;
    int level;
    public rpgPlayer(String user, String pass, String[] inv, String[] armor_inv, int health_state, int level) {
        this.username = user;
        this.password = pass;
        this.inventory = inv;
        this.armor = armor_inv;
        this.hp = health_state;
        this.level = level;

    }

}
