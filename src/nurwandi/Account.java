package nurwandi;

public class Account {
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age= age;
    }

    public String getName(String name){
        return this.name;
    }

    public int getAge(int age){
        return this.age;
    }

    public void printAll (){
        System.out.println("The name is " + name + " and age is " + age);
    }

}
