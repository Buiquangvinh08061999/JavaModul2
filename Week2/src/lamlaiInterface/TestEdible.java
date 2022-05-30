package lamlaiInterface;

public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Chicken(),
        new Tiger(),
        new Apple(),
        new Orange()};

        for(int i =0; i< objects.length; i++){
            if(objects[i] instanceof Edible){
                System.out.println(((Edible) objects[i]).howToEat());
            }
            if (objects[i] instanceof Animal){
                System.out.println(((Animal) objects[i]).sound());
            }
        }
    }
}
