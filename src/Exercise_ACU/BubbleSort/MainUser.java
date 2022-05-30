package Exercise_ACU.BubbleSort;

import java.time.Instant;
import java.util.Arrays;
import java.time.Instant;
import java.util.Scanner;
public class MainUser {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        User [] users = new User[]{
                new User(1,"Vinh",22),
                new User(2,"Vinah",20),
                new User(3,"Vianh",20),
                new User(4,"Vianh",19),
        };

        for (User user : users){
            System.out.println(user.toString());
        }

        System.out.println("Sau khi sắp xếp là ");
        bubbleSort(users);
        System.out.println(Arrays.toString(users));
    }

    public static void bubbleSort(User[] users){
        for(int i = 0;i<users.length;i++){
            for(int j = 1; j < users.length;j++){
                if(users[j].compareTo(users[j-1]) > 0){
                    User temp = users[j];
                    users[j] = users[j-1];
                    users[j-1] = temp;
                }
            }
        }
    }
}
