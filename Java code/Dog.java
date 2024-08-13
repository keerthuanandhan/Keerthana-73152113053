public class Dog {
    private String name;
    private String breed;
    public Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public void display(){
        System.out.println("Name: " +name+ ", Breed: " +breed);
    }
    public class sample2{
        public static void main(String[]args){
            Dog d1=new Dog("Puppy ", "Affenpinscher");
            Dog d2=new Dog("Max ", "Akita");
            System.out.println("initial details: ");
            d1.display();
            d2.display();
            d1.setName("Charlie");
            d1.setBreed("Labrador");

            d2.setName("Rocky");
            d2.setBreed("Bulldog");

            System.out.println("\nUpdated details:");
            d1.display();
            d2.display();
        }
    }
}
