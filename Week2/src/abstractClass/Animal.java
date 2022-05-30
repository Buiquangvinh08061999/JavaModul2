package abstractClass;

public abstract class Animal {
    protected void  eat(){
        System.out.println("Các động vật đều ăn cỏ ");
    }
    protected void shape(){
        System.out.println("Có 4 chân ");
    }

      abstract void animalSound();
}
