// testing message1
class Animal {
    void eat() {
        System.out.println("the animal eating");
    }
}
    class Dog extends Animal {
        void bark() {
            System.out.println("dog says bow bow");
        }
    }

    class BabyDog extends Dog {
        void sleep() {
            System.out.println("baby dog weeping");
        }
    }
    class Check {
        public static void main(String[] args) {
            BabyDog myObj = new BabyDog();
            myObj.sleep();
            myObj.bark();
            myObj.eat();
        }
    }

