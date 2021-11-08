class Animal{
     void eat(){
        System.out.println("I just eat and sleep and exercise");
    }
}

class Mammal extends Animal{
    void run(){
        System.out.println("I run");
    }
}

class Human extends Mammal{
    void talk(){
        System.out.println("I talk");
    }
}

class Inheritance{
    public static void main(String[] args){
        Human human = new Human();
        human.eat();
    }
}

