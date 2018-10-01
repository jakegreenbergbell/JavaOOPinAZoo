public class zoo {

    static String favoriteFood = "bacon";

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }

    public static void sleep(String name){
        System.out.println(name + " sleeps for 8 hours");
    }

    public static void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUMM!! " + name + " wants more " + food);
        }else{
            sleep(name);
        }
    }
}



