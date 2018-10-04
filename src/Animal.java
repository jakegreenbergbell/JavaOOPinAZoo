public class Animal {
    String favoriteFood;
    String name;
    static int population = 0;

    public Animal(String name, String favoriteFood){
        this.favoriteFood = favoriteFood;
        this.name = name;
        population++;
    }

    public void sleep(){
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("YUMM!! " + this.name + " wants more " + food);
        } else {
            sleep();
        }
    }

    public static int populationCount(){
        return population;
    }
}
