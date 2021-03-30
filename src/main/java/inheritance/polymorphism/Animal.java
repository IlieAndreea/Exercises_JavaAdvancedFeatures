package inheritance.polymorphism;

class Animal {
    int age;
    int weight;

    static void eat() {
        System.out.println("Animal eats 2 times/day");
    }

    void sound() {
        int a = 5;
        System.out.println("Animal is making a sound");
    }

    void play(){
        System.out.println("\n" + "Animal plays.");
    }

    public double sumOf(int a, double b) {
        System.out.println(a + b);
        return a+b;
    }

    protected void sumOf(double b, int a) {
        System.out.println(Math.round(a * b * 100)/100.00);
    }

//    void test() {
//        System.out.println("Parent test");
//    }

}
