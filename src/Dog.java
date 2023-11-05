
    public class Dog {
        public String name;
        public int noLegs;
        public int age;

        public Dog(String name,int noLegs, int age) {
            this.name = name;
            this.age = age;
            this.noLegs = 4;
        }

        private void bark() {
            System.out.println("Woof-woof!");
        }
    }

