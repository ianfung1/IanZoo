public class Zoo {

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Bee stinger = new Bee("Stinger");
        stinger.eat("pollen");
        stinger.eat("ice cream");

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("leaves");
        gemma.eat("meat");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");

        Animal[] animals = {stinger, gemma, rarity, pooh, tigger};

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "steak");

    }
}
