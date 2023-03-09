import java.util.Scanner;

class Game{
     int chances = 0;
     int myNumber;
     int randNumber;

    public Game(){
        randNumber = (int) (Math.random()*100);
    }
    public void setNumber(int n){
        myNumber = n;
    }
    public int isCorrect(){
        if(myNumber == randNumber){
            return 0;
        }
        else if(myNumber > randNumber){
            return -1;
        }
        else{
            return 1;
        }
    }
    public void setChances(){
        chances++;
    }
    public void getChances(){
        System.out.println("You have guessed it in  "+ chances+" " +"trails");
    }
}

public class GuessNumber{
    public static void main(String[] args) {
        Game obj = new Game();
        Scanner sc = new Scanner(System.in);
        

        while(true){
            System.out.println("Enter a number between 1 to 100 (1-100): ");
            int n = sc.nextInt();
            obj.setNumber(n);

            if(obj.isCorrect() == 0){
                obj.setChances();
                System.out.println("Congratulations!! You have guessed the correct number");
                obj.getChances();
                break;
            }
            else if(obj.isCorrect() == -1){
                obj.setChances();
                System.out.println("The number you have entered is too big.Enter smaller number!!");
            }
            else if(obj.isCorrect() == 1){
                obj.setChances();
                System.out.println("The number you have entered is too small.Enter larger number!!");
            }
        }
    }
}

