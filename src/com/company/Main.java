package com.company;

public class Main {

    public static void main(String[] args) {

        Garage<Porsche> car1 = new Garage<>();
        car1.setCar(new Porsche());
        car1.move();
        car1.move(car1.getCar());

        Garage<BMW> car2 = new Garage<>();
        car2.setCar(new BMW());
        car2.move();
        car2.move(car2.getCar());

        Garage<Mercedes> car3 = new Garage<>();
        car3.setCar(new Mercedes());
        car3.move();
        car3.move(car3.getCar());
    }
}
//1.  Создать классы Car и классы - наследники к нему
// (например, Crossover, Sedan и/или Toyota, Mercedes, Porsche и тд)
//2.  Создать обобщенный класс Garage, с обобщенным полем для хранения автомобилей.
// Ограничить параметры классом Car.
//3.  Создать обобщенный интерфейс и реализовать его в классе Garage
//4.  В главном классе создать несколько экземпляров обобщенного класса
// и вызвать через каждый из экземпляров метод из интерфейса