abstract class Animal {   //คลาสแม่ Super Class
    abstract void Sound();
    
    // abstract void Animal();  ห้ามเอาabstract methodมาเป็นconstructor  ห้ามชื่อเหมือนคลาสง่ายๆ
    void walking(){
        System.out.println("no walk");
    }
    abstract void sleep();

}

class Dog extends Animal{   //คลาสลูก Sub Class
    @Override
    void walking(){
        System.out.println("no walk");
    }
    void Sound(){
        System.out.println("Box Box");
    }
    void sleep(){
        System.out.println("Dog is sleeping");
    }
    void swim(){
        System.out.println("Dog is swimming");
    }
}
// class home extends Dog{
//     void sleep(){
//         System.out.println("Dog's House");
//     }
// }    สืบทอดต่อกันอีกรอบไม่ได้ ตอนสร้างobjจะแดง

class Cat extends Animal{  //คลาสลูก Sub Class
    @Override
    void Sound(){
        System.out.println("Box Box");
    }
    void sleep(){
        System.out.println("Cat is sleeping");
    }
}

class Abbtakkk {
    public static void main(String[] args) {
        // Animal obj1 = new Animal();   //Polymorphism
        // เรียกใช้คลาสแม่ไม่ได้
        // obj1.Sound();
        Animal obj2 = new Dog();
        obj2.Sound();
        obj2.walking();
        //  obj2.swim();  ใช้ไม่ได้เพราะ Animal Dog  ในAnimal ไม่มี swim
        Dog obj3 = new Dog();
        obj3.Sound();
        
        

        // Dog obj4 = new Animal();
        // obj4.Sound();

        //javac Inheritance.java      compile
        //java Inheritance 
    }
}