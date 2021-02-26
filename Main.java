import java.util.Random;

public class Main {
    String[] items = {"Steel Sword", "Gold Sword", "Iron Sword", //SIZE 42
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
    String[] helmet = { //SIZE: 11
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
    String[] chestplate = { //SIZE
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
    String[] pants = { //SIZE
            "Blue Jeans",
            "Joggers",
            "Steel Pants",
            "Gold Pants",
            "Iron Pants",
            "Fancy Khakis",
    };
    String[] boots = {
            "Leather Boots",
            "Super Mario Boots",
            "Boots with spikes on 'em",
            "Steeltoe Work Boots",
            "Steel Armor Boots",
            "Iron Armor Boots",
            "Black Vans",
    };
    public int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public String[] randInventory() {
        String[] array = new String[20];
        for(int i = 0; i < 20; i++) {
            array[i] = items[getRandom(0, 41)];
        }
        return array;
    }
    public String[] randArmor() {
        String[] array = new String[4];
        array[0] = helmet[getRandom(0,10)];
        array[1] = chestplate[getRandom(0, 9)];
        array[2] = pants[getRandom(0, 5)];
        array[3] = boots[getRandom(0, 6)];
        return array;
    }
public static void main(String[] args) {
    System.out.println("Hello World");
}

}
