import java.util.Scanner;

public class PetQuestions {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String breed;
        int age;


        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.next();
        keyboard.nextLine();                                            //1st line added

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.nextLine();                                   //2nd line added

        System.out.print( "How old is " + name + "? ");
        age = keyboard.nextInt();                                       //3rd line added

        System.out.println( name + " is your " + breed + " and it is " + age );
    }
}
