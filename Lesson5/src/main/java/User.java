public class User {
    public String name;
    public String secName;
    public int age;
    public String  gender;

    public User(){
        age = 18;
        gender = "female";
    }

    public User(String name, String secName){
        this();
        this.name = name;
        this.secName = secName;
    }
    public User(String name, String secName, int age, String gender) {
        this.name = name;
        this.secName = secName;
        this.age = age;
        this.gender = gender;
    }
    @Deprecated
    public String getFullName(){
        return name + " " + secName;
    }

    public void increaseAge(){
        age++;
    }

    public void outInfo(){
        System.out.println("Name: " + name);
        System.out.println("Second name: " + secName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}
