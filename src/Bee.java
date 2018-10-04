public class Bee extends Animal{

    public Bee(String name){
        super(name, "pollen");
    }

    public void eat(String food){
        if (food.equals(favoriteFood)) {
            super.eat(food);
        } else {
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }

    public void sleep(){
        System.out.print(this.name + " never sleeps");
    }


}
