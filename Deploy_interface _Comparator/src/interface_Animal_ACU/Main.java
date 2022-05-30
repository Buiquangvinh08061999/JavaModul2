package interface_Animal_ACU;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[3];
        animals[0] = new Bolt();
        animals[1] = new AngryBird();
        animals[2] = new Nemo();

        for(Animal animal : animals){
            System.out.println(animal.makeNoise());

            if (animal instanceof Flyable){
                Flyable fly = (Flyable) animal;
                System.out.println(fly.howtoFly());
            }
            if(animal instanceof Runable){
                Runable run =(Runable) animal;
                System.out.println(run.howtoRun());
            }
            if(animal instanceof Swimable){
                Swimable swim = (Swimable) animal;
                System.out.println(swim.howtoSwim());
            }
        }

        Machine[] machines = new Machine[2];
        machines[0] = new MrQueen();
        machines[1] = new Siddeley();

        for (Machine  machine : machines){
            System.out.println(machine.enghineSound());

            if(machine instanceof Runable){
                Runable run = (Runable) machine;
                System.out.println(run.howtoRun());
            }
            if(machine instanceof Flyable){
                Flyable fly =(Flyable) machine;
                System.out.println(fly.howtoFly());
            }
        }
    }
}
