
public class rpgPlayer {
    String username; //Secondary Key
    String password; //Replace with hash??? primary key
    String[] inventory = new String[20];// PLAYER HAS INVENTORY
    String[] armor = new String[4]; // PLAYER HAS ARMOR_INVENTORY
    int hp = 500;   //Increases by 10 after each 10 levels gained
    int level = 0; //Increases after each enemy killed
    int dmg = 10;   //Increased by 2 each level
    public rpgPlayer(String user, String pass, String[] inv, String[] armor_inv) {
        this.username = user;
        this.password = pass;
        this.inventory = inv;
        this.armor = armor_inv;

    }

}
