// Mikel Butterfield CIT360 JSON

import java.util.Scanner;
import org.json.simple.JSONObject;

class JsonEncodeDemo {

   public static void main(String[] args){
     
	   Scanner user_input = new Scanner(System.in);
	  
	   String deck;
	   System.out.println("enter the deck that your flashcard will be in ");
	   deck = user_input.nextLine();
	   
	   String question;
	   System.out.println("Write the question here: ");
	   question = user_input.nextLine();
	   
	   String answer;
	   System.out.println("Write the answer here: ");
	   answer = user_input.nextLine();
	   
	 
	  JSONObject obj = new JSONObject();

      obj.put("deck", deck);
      obj.put("question", question);
      obj.put("answer", answer);

      System.out.print(obj);
      
      
   }
}