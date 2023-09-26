
import java.util.*;

class game {
  int computer;

  game() {
    Random rand = new Random();
    computer = rand.nextInt(100);
    System.out.println("enter the number from 1 to 100");
  }

  int computernumber() {
    return computer;
  }

};

public class javagame {

    static int takeinputfromuser(){
    int user;
    System.out.println("enter your number");
    Scanner sc = new Scanner(System.in);
    user = sc.nextInt();
    return user;
  }

 static void iscorrectguess(int i,int j){
    if(i==j){
      System.out.println("your guess is correct");
    }else if(i<j){
      System.out.println("your number is smaller than computer number");
    }else{
      System.out.println("your number is higher than computer number");
    }
    
  }
  

   static void result(){
 System.out.println("welcome to the guessing number game");
    int user = 0, computer = 0, attempts = 0;
    game g = new game();
   do { 
    user = takeinputfromuser();
    computer = g.computernumber();
    iscorrectguess(user,computer);
    attempts++;

    if(attempts>10){
      System.out.println("\033[0;1m" +"your attempts exceeds the choice limit of 10");
      System.out.println("\033[0;1m" +" Please restart your game:");
      do { 
    user = takeinputfromuser();
    computer = g.computernumber();
    iscorrectguess(user,computer);
    attempts++;
    }while(user!=computer);
    }



  }while(user!=computer);
    System.out.println( "\033[0;1m" + "you guessed the correct number in total "+attempts +" attempts");

  }

  public static void main(String[] args) {

  
result();
  }
}
