package HocNangCaoJava.PhuongThucTrongOPPTEXT_static;

public class code {
    public void setA(int a) {
//        this.a = a;
    }

    public void setB(int b) {
//        this.b = b;
    }
    public code(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "code{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    private int a;
    private int b;

}
