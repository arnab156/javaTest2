import java.awt.*;
import java.util.Random;

public class Coin {
   public final static int HEADS = 0;
   public final static int TAILS = 1;

    private int faceUp;

    public Coin (){
//        faceUp = start;
        flip();
    }

    public void flip(){
        Random rand1 = new Random();
        faceUp = rand1.nextInt(2);
    }

    public String getFaceup(){
        if (faceUp == HEADS){
            return "HEADS";
        } else if (faceUp == TAILS){
            return "TAILS";
        } else {
            return "Invalid";
        }
    }

}

