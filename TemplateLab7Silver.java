import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 * Template
 * Lab 7 Silver Exercise
 * COMP 1020 Summer 2016
 * (C) Computer Science, University of Manitoba
 */
@SuppressWarnings("unchecked")
public class TemplateLab7Silver {
  
  public static final int DECK_SIZE = 20; //Keep it small for testing
  
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    //Create a brand new deck, still in sequence.
    ArrayList deck = makeDeck(DECK_SIZE);
    System.out.println("The new deck is "+deck);

    //Shuffle it and print it again
    shuffle(deck);
    System.out.println("The shuffled deck is "+deck);

    //Ask how many hands to deal, and of what size
    System.out.print("How many hands should be dealt? ");
    int numHands = keyboard.nextInt();
    System.out.print("How many cards in each hand? ");
    int numCards = keyboard.nextInt();
    
    //Deal the hands and print them.
    ArrayList[] theHands = deal(deck,numHands,numCards);
    System.out.println("The hands are:");
    for(int i=0; i<numHands; i++)
      System.out.println("Hand "+i+": "+theHands[i]);
    System.out.println("The remaining deck: "+deck);
    
  }//main
  
  public static ArrayList makeDeck(int numCards){
    ArrayList<Integer>myDeck = new ArrayList<Integer>();
    for( int i =0; i<numCards;i++){
      myDeck.add(i);
    }
    return myDeck;  // dummy statement; replace
  }
  
  public static void shuffle(ArrayList deck){
    Random rand = new Random();
    int n;
    int numdeck = deck.size();
    int card ;
    for (int i =0; i < numdeck-1 ;i++){
      n = rand.nextInt(numdeck-1-i)+i;
      card = (Integer)deck.get(n);
      deck.remove(n);
      deck.add(i,card);
    }
  }
  
  public static ArrayList[ ] deal(ArrayList deck, int numHands, int numCards){
    ArrayList[] result  = new ArrayList[numHands];
    int counter =0;
    result[2].add(counter);
//    for
    for ( int i  = 0; i < numCards;i++){
      for (int j = 0; j< numHands;j++){
        
        counter++;
      }
    }

    return result;  // dummy statement; replace
  }
  
}//TemplateLab7Silver
