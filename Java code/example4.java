public class example4 {
    
        String name;
        example4(String name){
            this(10,20);
            this.name=name;
            this.greeting();
        }
        example4(int a,int b){
            System.out.println("Addition: "+ (a+b));;
        }
        void greeting() {
            System.out.println("Welcome " +name);
        }
        public static void main(String[] args) {
        
            example4 obj=new example4("Keerthana");
    
        }
}
