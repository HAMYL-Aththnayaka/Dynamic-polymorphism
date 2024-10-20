import java.util.Scanner;
public class Main {
    public static void main(String arg[]){
        Animal animal;
             int i=1;
            System.out.println("WHAT kind of animal machan??");
            Scanner read =new Scanner(System.in);
            System.out.println("(1=CAT)-------(@=DOG)");
            int choice = read.nextInt();
        
        
            for (i=0;i<3;i++){
            if (choice == 2){
                animal = new Dog();
                   animal.go();  
                 break;
            }
            else if (choice == 1){
                animal = new Cat();
                animal.go();  
             
            }
            else{
                System.out.print("invalid input machan!!!");
                animal= new Animal();
                animal.go();  
            }
        
        
            }

    
    }
}
