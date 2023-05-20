//implementing this interface in a class
public class Dog implements first_one{
    @Override
    public void makeSound() {
        System.out.println("woof");
    }

    @Override
    public void move() {
        System.out.println("Running on four legs");
    }

    @Override
    public void out() {
        first_one.super.out();
    }
}
