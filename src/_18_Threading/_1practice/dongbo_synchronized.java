package _18_Threading._1practice;
class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class MyThread1 extends Thread{
    Table pass;

    public MyThread1(Table pass) {
        this.pass = pass;
    }
    public void run(){
        pass.printTable(5);
    }
}
class MyThread2 extends Thread{
    Table pass;

    public MyThread2(Table pass) {
        this.pass = pass;
    }
    public void run(){
        pass.printTable(100);
    }
}



public class dongbo_synchronized {
    public static void main(String[] args) {
        Table table = new Table();

        MyThread1 pass1 = new MyThread1(table);
        MyThread2 pass2 = new MyThread2(table);

        pass1.start();
        pass2.start();
    }

}
