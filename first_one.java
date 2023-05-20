public interface first_one {
    //collection of abstract methods without a body
    //GPT for more
    //the methods
    public void makeSound();
    public void  move();
    //any class implementing this interface must have these methods

    default void out(){
        System.out.println("This should be present in all classes implementing!");
    }

}

