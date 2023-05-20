public class new_class {
    //adding class attributes
    private String name;
    private int age;

    //adding a constructor
    public new_class(String name,int age){
        this.age=age;
        this.name=name;
        //constructor should have the same name as the class name
        //this - just a ref to the attributes declared in the class
    }
    //methods
    public void speak(){ //we use the ref var in methods
        System.out.println("I am "+this.name+" and i am "+ this.age);
    }
    //accesing privately declared variables
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void display(){
        System.out.println("this is a static method ");
    }
}

