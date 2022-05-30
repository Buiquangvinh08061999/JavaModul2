package _20_thi_thuchanh.model;

public class ManagePhoneList {
    private String name;
    private int age;
    private String numberPhone;
    private String gender;
    private String address;
    private String email;

    public ManagePhoneList(){
    }

    public ManagePhoneList(String name, int age, String numberPhone,String gender, String address, String email) {
        this.name = name;
        this.age = age;
        this.numberPhone = numberPhone;
        this.gender =gender;
        this.address = address;
        this.email = email;
    }

    public ManagePhoneList(String record){
        String[] fields = record.split(",");
        name = fields[0];
        age = Integer.parseInt(fields[1]);
        numberPhone=fields[2];
        gender = fields[3];
        address= fields[4];
        email = fields[5];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + numberPhone + "," + gender + "," + address + "," + email;
    }
}
