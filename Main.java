import java.util.ArrayList;
import java.util.Random;

public class Main {
    //Player Items
    static String[] items = {"Steel Sword", "Gold Sword", "Iron Sword", //SIZE 42
            "Hyrulian Sword",
            "Colt M1911",
            "A bag of chips",
            "Airpods",
            "A bag of uncooked ramen",
            "Pitchfork",
            "Everything Bagel Seasoning",
            "Raygun",
            "A carton of eggs",
            "Blowtorch",
            "Boomstick", //ashe vs evil dead
            "Super Mario Star",
            "NES Controller",
            "Wunderwaffe DG 2",
            "Jar of peanut butter",
            "Staff of Fire",
            "Staff of Ice",
            "Minigun",
            "Sniper Rifle",
            "Butterfly Knife",
            "Unusual Hat",
            "Bitcoin Wallet",
            "RTX 2080",
            "AMD Ryzen 5",
            "Carton of eggs",
            "Jack's Frozen Pizza", //Jacks pizza pls sponsor me
            "DUCKY Mechanical Keyboard",
            "Leafblower",
            "Hammer",
            "Monkey Wrench",
            "A lighter",
            "Gravity Hammer",
            "Light Saber",
            "Pokeball",
            "Lantern of Souls",
            "Teemo Mushroom",
            "Minecraft Dirt Block",
            "Flamethrower",
            "Bottle of Ranch Dressing",
            "Item: 42"
    };
    static String[] helmet = { //SIZE: 11
            "Bonk Helm",
            "Planeswalker Goggles",
            "Fur Hat",
            "Wizard Hat",
            "Steel Helmet",
            "Pylon Cone",
            "N95 Mask",
            "Plague Doctor Mask",
            "Gasmask",
            "Steampunk Goggles",
            "Plastic Horse Head",


    };
    static String[] chestplate = { //SIZE
            "Nirvana T-Shirt",
            "Steel Chestplate",
            "Wooden Chestplate",
            "Plastic Toy Chestplate",
            "Manasteel Chestplate",
            "Leather Jacket",
            "Nanobot Ironman Suit",
            "Ironman Suit MK II",
            "Ironman Suit MK I",
            "Links Tunic",
    };
    static String[] pants = { //SIZE
            "Blue Jeans",
            "Joggers",
            "Steel Pants",
            "Gold Pants",
            "Iron Pants",
            "Fancy Khakis",
    };
    static String[] boots = {
            "Leather Boots",
            "Super Mario Boots",
            "Boots with spikes on 'em",
            "Steeltoe Work Boots",
            "Steel Armor Boots",
            "Iron Armor Boots",
            "Black Vans",
    };
    //Enemy Names
    static String[] enemy_names = {
            "Spotted Bulborb", //0 @ 93
            "Titan Dweevil",
            "Smoky Progg",
            "Burrowing Snagret",
            "Mamuta",
            "Goomba",
            "Green Koopa",
            "Red Parakoopa",
            "Mimic",
            "Charizard",
            "Smaug",
            "Dragon",
            "The Incredible Hulk",
            "Emperor Bulblax",
            "Waterwraith",
            "Arctic Cannon Larva",
            "Armored Cannon Beetle",
            "Bumbling Snitchbug",
            "Burrowing Snagret",
            "Crawmads",
            "Cloaking Burrow-nit",
            "Creeping Chrysanthemum",
            "Horde of Mushroom Pikmin",
            "Zombie Horde",
            "God",
            "Group of Cavemen",
            "Assassin",
            "Territorial Oak",
            "Starman Jr.",
            "Frank",
            "Spiteful Crow",
            "Pogo Punk",
            "Ramblin' Evil Mushroom",
            "Mobile Sprout",
            "Insane Cultist",
            "Mad Duck",
            "Master Belch",
            "Mechanical Octobot",
            "Nuclear Reactor Robot",
            "Bionic Kraken",
            "Evil Eye",
            "Heavily Armed Pokey",
            "Squatter Demon",
            "Giygas"
    };
    public static int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public static String[] randInventory() {
        String[] array = new String[20];
        for(int i = 0; i < 20; i++) {
            array[i] = items[getRandom(0, 41)];
        }
        return array;
    }
    public static  String[] randArmor() {
        String[] array = new String[4];
        array[0] = helmet[getRandom(0,10)];
        array[1] = chestplate[getRandom(0, 9)];
        array[2] = pants[getRandom(0, 5)];
        array[3] = boots[getRandom(0, 6)];
        return array;
    }

    public static String randEnemyname() {
        int len = enemy_names.length;
        return enemy_names[getRandom(0, len-1)];
    }
    public static void displayPlayer(rpgPlayer player){
        System.out.println("")
    }
public static void main(String[] args) {
    System.out.println("Hello World");
    //TODO:
    //  Generate 10 unique players with inventories [15-20 items start]
    //  Generate 50 random enemies with itemdrop(s)
    //  Place in SQL DB
    //  Retrieve Query(s) for levels
    //  0-5, Forest, 6-10 Desert, 11-15, Adventurous Mountains, 16-20 Castle of Doom,
    //  Create level object
    //      Every level has one player and a array of enemies to fight
    //      Once player defeats enemy items are dropped
    //      If inv is full drop is discarded

    //Generate 10 unique players
    String[] user = {
            "nightgownbecome",
            "chiefnecessary",
            "friessecretive",
            "viperunhelpful",
            "gorgeousreef",
            "dairypatroon",
            "cheappenalty",
            "plumbereither",
            "surprisingbroadcast",
            "iratecustoms",
    };
    String[] pass = {
            "futureold",
            "jubilantgaloshes",
            "assnew",
            "raisinsresolve",
            "nearlyflutter",
            "transformzone",
            "beepicerink",
            "thirtyobeisance",
            "broadsample",
            "turkeysoup",
    };
    ArrayList<rpgPlayer> rpg_players = new ArrayList<>();
    for(int i = 0; i < 10; i++) {
        String inv[] = randInventory();
        String armor[] = randArmor();
        rpgPlayer player = new rpgPlayer(user[i], pass[i], inv, armor);
        rpg_players.add(player);
    }

}

}
