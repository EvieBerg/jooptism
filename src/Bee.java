public class Bee extends Animal {

    public Bee(String name) {
        super(name, "leaves");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if(food.equals(this.favoriteFood)){
            System.out.println("YUM!!" + this.name + " wants more " + this.favoriteFood);
            sleep();
        }else{
            System.out.println("YUCK!!" + this.name + " will not eat " + food);
        }
    }


    public void sleep() {
        System.out.println(this.name + " does not sleep.");

    }
}
