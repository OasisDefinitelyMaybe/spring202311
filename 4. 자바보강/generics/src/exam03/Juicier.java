package exam03;

import exam02.Fruit;

public class Juicier {

    public static void make(FruitBox<? super Apple> fruitBox) { // Apple, Fruit, Object
        System.out.println(fruitBox.getItems());
    }

    public  static <T extends Fruit> void make2(FruitBox<T>  fruitBox) {
        System.out.println(fruitBox.getItems());
    }
}
