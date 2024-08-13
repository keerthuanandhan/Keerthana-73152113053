public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(){
        this.name=name;
    }
    public void setAge(){
        this.age=age;
    }
    public class sample1{
        public static void main(String[]args){
            Person obj1=new Person("Anitha",21);
            Person obj2=new Person("Hari",30);
            System.out.println(obj1.getName()+" = " +obj1.getAge()+" age");
            System.out.println(obj2.getName()+" = " +obj2.getAge()+" age");
        }
    }
}
