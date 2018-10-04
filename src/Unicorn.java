public class Unicorn extends Animal{

    public Unicorn(String name){
        super(name, "marshmallows");
    }

    public void sleep(){
        System.out.println(this.name + " sleep in a cloud");
    }
}
