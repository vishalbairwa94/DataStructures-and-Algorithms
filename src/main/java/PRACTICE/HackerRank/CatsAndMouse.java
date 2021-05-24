package PRACTICE.HackerRank;

public class CatsAndMouse {

    static String catAndMouse(int x, int y, int z) {

        int catA = Math.abs(z-x);
        int catB = Math.abs(z-y);

        if(catA<catB){
            return "Cat A";
        }
        else if(catB<catA){
            return "Cat B";
        }
        else{
            return "Mouse C";
        }

    }

    public static void main(String[] args){
        System.out.println(catAndMouse(1,3,2));
    }
}
