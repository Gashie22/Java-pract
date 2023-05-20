public class new_class2 extends new_class{
    private String food;

    //this order must be followed on constructor
    public new_class2(String name,int age,String food){
        super(name,age);//inherited
        this.food=food;//add any attribute you wish to add
    }

    public void sentence(){
        System.out.println("hie again its "+this.getName());
        System.out.println("I am now " +this.getAge());
        System.out.println("I like eating "+this.food);
    }
}
