package animals;

import edible.Edible;

public class Cat extends Animals implements Edible {
    @Override
    public String makeSound() {
        return "meow meow";
    }

    @Override
    public String howToEat() {
        return "Cat is not edible";
    }
}
