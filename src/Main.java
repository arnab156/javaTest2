import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random; //for random variables

public class Main {

    public static void main(String[] args){
        //        ------------------------------------SCANNER AND METHODS------------------------------
        //        ------------------------------------SCANNER AND METHODS------------------------------



//        System.out.println("Enter a word here: ");
//        Scanner sc = new Scanner(System.in);
////        String userInput = "entertainment";
//
//        //String input
//        String userInput = sc.next();
//
//        System.out.println("Enter an integer (no decimal) here: ");
//        //Int input
//        int userNumber = sc.nextInt();
//
//        System.out.println("Enter a decimal here: ");
//        //Double Input
//        double userCost = sc.nextDouble();
//
//        String userUpperCase = userInput.toUpperCase();
//        System.out.println(userUpperCase);
//        System.out.println(userInput);
//        System.out.println(userNumber);
//        System.out.println(userCost);
//
//        char firstChar = userInput.charAt(0);
//        System.out.println(firstChar);
//
//        System.out.println("Contains: " + userInput.contains("tain"));
//        System.out.println("Contains: " + userInput.contains("Enter"));
//
//        System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));
//



//        ----------------------------------------END OF --------------------------------------
//        ------------------------------------SCANNER AND METHODS------------------------------



//        ----------------------------------------START OF --------------------------------------
//        -----------------------------------ARRAY DECLARATIONS----------------------------------

//
//
//
//    //33,55,22,34,2375
//        int [] numbers = new int[5]; //cannot change the container size
//        numbers[0] = 33;
//        numbers[1] = 55;
//        numbers[2] = 22;
//        numbers[3] = 34;
//        numbers[4] = 2375;
//
//        int [] numbers2 = {26,44,26,99,100};
//        Arrays.sort(numbers2); //import java.utils.Arrays;
//        System.out.println(Arrays.toString(numbers2));
//
//        String [] favoriteColors = {"Magenta", "Black", "Green"};
//        System.out.println("Index 1 is " + favoriteColors[1]);
//        favoriteColors[2] = "Sap Green";
//        System.out.println("Index 2 is " + favoriteColors[2]);
//
//        System.out.println("Length of the array is: " + favoriteColors.length);
//
//        //ARRAY METHOD CAN HELP REDUCE STEPS
//        System.out.println("using array method: "+Array.get(favoriteColors, 2)); //make sure to import array methods on the top






//        ----------------------------------------END OF ----------------------------------------
//        -----------------------------------ARRAY DECLARATIONS----------------------------------
//
//
//        ----------------------------------------START OF --------------------------------------
//        -----------------------------------RANDOM DECLARATIONS----------------------------------
//        Random rand1 = new Random();
//        int randomNumber = rand1.nextInt();
//        int randomNumberWithBound = rand1.nextInt(10);
//        System.out.println(randomNumber);
//        System.out.println(randomNumberWithBound);

        //        -----------------------------------END OF RANDOM DECLARATIONS----------------------------------




//        -------------------------------------START OF -----------------------------------------
//        -----------------------------------COIN FLIPS -----------------------------------------

        Coin c  = new Coin();
        System.out.println("Intitial Face: " + c.getFaceup());

        for (int i = 0; i <5; i++){
            c.flip();
            System.out.println("After flip#"+(i+1)+ " :"+c.getFaceup());
        }

    }

}
