public class Zoo {

    String favoriteFood = "bacon";


    public void sleep(String name){

        System.out.println(name + " sleeps for 8 hours.");
    }


    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("rarity");
        rarity.eat("marshmallows");
        Giraffe gemma = new Giraffe("gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee("stringer");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Zookeeper zoe = new Zookeeper("zoe");
        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};
        zoe.feedAnimals(animals, "cabbage");



    }

    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!" + name + " wants more " + food);
        }else{
            sleep(name);
        }
    }
}
