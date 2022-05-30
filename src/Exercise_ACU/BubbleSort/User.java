package Exercise_ACU.BubbleSort;

public class User implements Comparable<User>{
    private int id;
    private String username;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.username = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", age=" + age +
                ']';
    }

    @Override
    public int compareTo(User o) {
        int result = o.age - age;
        if (result == 0){
            result = o.username.compareTo(username);
        }
        return result;
    }
}
