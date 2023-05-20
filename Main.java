public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Accesing the new_class in this class
        new_class xs=new new_class("Gashie",22);//these argrs are the attributes declared in the class
        xs.speak();
        System.out.println(xs.getAge());
        xs.setAge(25);
        new_class.display();
        //accesing overload_methods statically
        overload_methods.add(5.0,4.2);
        overload_methods.add(4,6);
        
        //accessing an innerclass-create car object and call start method
        Car mycar=new Car("Toyota","Fortuner",45);
        mycar.start();

        //Using the dog class which uses the concept of interfaces
        Dog tippy= new Dog();
        tippy.makeSound();
        tippy.move();
        tippy.out();

        //Implementing the enum
        weekdays day=weekdays.MONDAY;//var day created of type weekdays
        //weekdays.MONDAY has been assigned to it
        if (day==weekdays.MONDAY || day==weekdays.THURS){ //condition
            System.out.println("Its a flat day today");
        }else {
            System.out.println("Keep going");
        }

        


    }
}