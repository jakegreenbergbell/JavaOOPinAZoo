public class Tiger {
    String favoriteFood = "meat";
    String name;

    public Tiger(String name) {
        this.name = name;
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

}