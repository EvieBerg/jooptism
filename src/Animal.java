class Animal {
    // Put your instance variables here
    String favoriteFood = "meat";
    String name;
    static int population;

    public Animal(String name, String favoriteFood) {
        // put your initializer content here
        this.favoriteFood = favoriteFood;
        this.name= name;
        population++;
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours.");

    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if(food.equals(this.favoriteFood)){
            System.out.println("YUM!!" + this.name + " wants more " + this.favoriteFood);
        }else{
            sleep();
        }
    }
}
