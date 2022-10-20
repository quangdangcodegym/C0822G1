package animals;

import edible.Edible;

public class Chicken extends Animals implements Edible {
    @Override
    public String makeSound() {
        return "cook-adoodle-doo";
    }

    @Override
    public String howToEat() {
        return "can be dry";
    }
}
