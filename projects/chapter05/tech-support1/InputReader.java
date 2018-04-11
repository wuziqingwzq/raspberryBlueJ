import java.util.HashSet;
import java.util.Scanner;
import java.util.HashSet;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is then chopped into words, and a set of words 
 * is provided.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    0.1
 */
public class InputReader
{
    private Scanner reader;
    
    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
        
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public HashSet getInput()
    {
        HashSet<String> wordset= new HashSet<String>();
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();
        inputLine = inputLine.trim().toLowerCase();
        String[] inputWord = inputLine.split("\\s+");
        for(String word:inputWord){
            wordset.add(word);
        }
        
        return wordset;
    }
}
