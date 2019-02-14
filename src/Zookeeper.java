public class Zookeeper {


    String name;
    public Zookeeper(String name){
        this.name = name;
    }

    public void feedAnimals(Animal[] animals, String food){
        System.out.println(this.name + "is feeding " + food + " to " + animals.length + " animals of " + Animal.population + " animals!!");
        for(int i = 0; i < animals.length; i ++){
            animals[i].eat(food);
        }
    }

}
