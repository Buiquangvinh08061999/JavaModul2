package _16_io_test_file._2exercise.file_csv;

public class Country {
  private int id;
  private String code;
  private String name;

  public Country(String str){
      String[] strArray = str.split(",");
      this.id = Integer.parseInt(strArray[0]);
      this.code = strArray[1];
      this.name = strArray[2];
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country[" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ']';
    }
}
