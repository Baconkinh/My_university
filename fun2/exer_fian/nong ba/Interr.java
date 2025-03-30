interface Animal{
    
    default void Sound(){
        System.out.println("baba");
    }  //abstract method โดยอัตโนมัติ
    static void Hello(){
        System.out.println("ba");
    }
   void sleep();
}

interface Car{
    void Engine();  //abstract method โดยอัตโนมัติ
    
}

class Dog implements Animal,Car{   //คลาสลูก Sub Class
    
    public void Engine(){
        System.out.println("Energyyy");
    }
    public void sleep(){
        System.out.println("Dog is sleeping" );
    
    }
    
}

// class Cat implements Animal{  //คลาสลูก Sub Class
//     public void Sound(){
//         System.out.println("Box Box");
//     }
// }

class Interr {
    public static void main(String[] args) {
    //    Dog obj1 = new Car();   เรียกใช้ interface ไม่ได้
    Dog obj2 = new Dog();
    obj2.Sound();
    obj2.Engine();
    Animal.Hello();
    }
}






