public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken sound: cục cục cục ccc";
    }

    @Override
    public String howToEat() {
        return "Burn it up!";
    }
}
