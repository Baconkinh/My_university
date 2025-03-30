class Animal {   //คลาสแม่ Super Class
    void Sound(){
        System.out.println("NONONONO");
    }
}

class Dog extends Animal{   //คลาสลูก Sub Class
    @Override
    void Sound(){
        System.out.println("Box Box");
    }
}

class Cat extends Animal{  //คลาสลูก Sub Class
    @Override
    void Sound(){
        System.out.println("Box Box");
    }
}

class Inheritance {
    public static void main(String[] args) {
        Animal obj1 = new Animal();   //Polymorphism
        obj1.Sound();
        Animal obj2 = new Dog();
        obj2.Sound();
        Dog obj3 = new Dog();
        obj3.Sound();
        // Dog obj4 = new Animal();
        // obj4.Sound();

        //javac Inheritance.java      compile
        //java Inheritance 
    }
}