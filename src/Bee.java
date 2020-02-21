public class Bee extends Animal{
    public Bee(String name) {
        super(name, "pollen");

    }

    public void eat(String food){
        System.out.println(name + " eats " + food);
        if(food == favoriteFood){
            System.out.println("Yum!!! " + name + " wants more pollen");
            System.out.println(name + " never sleeps");
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }
}
