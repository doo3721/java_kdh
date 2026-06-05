package ch12.animal;

public class Test {
    void main() {
//        Dog haru = new Dog();
        Animal haru = new Dog();    // 부모 클래스로 업캐스팅
        haru.eat();                 // Dog 클래스에서 오버라이딩된 메소드가 호출된다.
//        haru.bark();                // 업캐스팅되면 Dog 클래스만의 메소드는 호출할 수 없다

        animalCare(haru);

        Cat c= new Cat();
        animalCare(c);
    }

    void animalCare(Animal a) {
        a.eat();
        a.sleep();
        a.move();
    }
}
