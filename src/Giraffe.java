public class Giraffe extends Animal{
    public Giraffe(String name) {
        super(name, "leaves");
    }

    public void eat(String food){
        System.out.println(name + " eats " + food);
        if(food == favoriteFood){
            System.out.println("Yum!!! " + name + " wants more leaves");
            this.sleep(name);
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }


}
