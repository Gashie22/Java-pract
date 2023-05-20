public class Car {//outerclass
    //we want to implement the concept of inner classes
        private String make;
        private String model;
        private Engine engine;
        //constructor
        public Car(String make,String model,int engine){
            this.make=make;
            this.model=model;
            this.engine=new Engine(55);//creates new instance of engine
        }
        public void start(){//prints msg and start method of the Engine instance
            System.out.println("Starting "+make+" "+model+"with engine size "+engine.getSize() +"...");
            engine.start();
        }
        public  class Engine{ //innerclass
            private int size;
            public Engine(int size){
                this.size=size;
            }
            public void start(){ // start method os the innerclass
                System.out.println("Engine of size "+size+" started");
            }

            public int getSize() {
                return size;
            }
        }
}
