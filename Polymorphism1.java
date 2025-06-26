 class Animal1{

        public void animalSound() {
            System.out.println("the animal makes sound");
    }
 }
    class Cat extends Animal1{
        public void animalSound(){
            System.out.println("the cats meow meow");
    }
    }
    class Pig extends Animal1{
        public void  animalSound(){
            System.out.println("the pig says wee wee");
        }
    }
    class Test{
        public static void main(String[] args){
            Animal1 myAnimal = new Animal1();
            Animal1 myCat = new Cat();
            Animal1 myPig = new Pig();
            myAnimal.animalSound();
            myCat. animalSound();
            myPig. animalSound();



        }
    }
