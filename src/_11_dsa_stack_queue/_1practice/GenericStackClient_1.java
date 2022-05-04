package _11_dsa_stack_queue._1practice;

public class GenericStackClient_1 {
 private static void stackOfStrings(){
     MyGenericStack_1<String> stack = new MyGenericStack_1<String>();
     stack.push("Quang");
     stack.push("Vinh");
     stack.push("Top");
     System.out.println("Kích thước size sau khi đẩy là: " + stack.size());
     System.out.println("Duyệt mảng: ");
     while (!stack.isEmpty()){
         System.out.println(stack.pop());
     }
     System.out.println("Kích thước sao khi pop là: " + stack.size());
 }

 private static void stackOfInteger(){
     MyGenericStack_1<Integer> stack = new MyGenericStack_1<Integer>();
     stack.push(1);
     stack.push(2);
     stack.push(3);
     stack.push(4);
     System.out.println("Kích thước size sau khi đẩy là: " + stack.size());
     System.out.println("Duyệt mảng: ");
     while (!stack.isEmpty()){
         System.out.println(stack.pop());
     }
     System.out.println("Kích thước sao khi pop là: " + stack.size());
 }

    public static void main(String[] args) {
        System.out.println("1: stackOfStrings()");
        stackOfStrings();

        System.out.println("2: stackOfInteger()");
        stackOfInteger();
    }
}
