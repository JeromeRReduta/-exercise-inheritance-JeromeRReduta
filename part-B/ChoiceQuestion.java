import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
   private ArrayList<String> choices = new ArrayList<String>();

   /**
      Constructs a choice question with no choices.
   */
   public ChoiceQuestion()
   {

   }

   public ArrayList<String> getChoices() {
      return choices;
   }

   public void setChoices(ArrayList<String> choices) {
      this.choices = choices;
   }
   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         answer = Integer.toString(choices.size());

         // Convert choices.size() to string
      }
   }
   
   public void display()
   {
      super.display();

      for (int index = 0; index < choices.size(); index ++ ) {
         System.out.println("[" + (index + 1) + "] \t" + choices.get(index));
      }
   }
}

