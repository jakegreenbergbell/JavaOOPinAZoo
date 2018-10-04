public class Giraffe extends Animal{

    public Giraffe(String name){
        super(name, "leaves");
    }

    public void eat(String food){
        if (food.equals(favoriteFood)) {
            System.out.println(this.name + " eats " + food);
            System.out.println("YUMM!! " + this.name + " wants more " + food);
            super.sleep();
        } else {
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }
}
