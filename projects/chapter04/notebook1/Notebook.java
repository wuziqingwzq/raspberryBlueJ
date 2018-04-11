import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Show a note.
     * @param noteNumber The number of the note to be shown.
     */
    public void showNote(int Number)
    {
        int noteNumber = Number-1;
        if(noteNumber < 0 |noteNumber >= notes.size() ) {
            System.out.println("找不到该索引");
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }
    
    public void removeNote(int indexNum)
    {
        int index = indexNum - 1 ;
        if(index >= 0 & index < notes.size()){
            notes.remove(index);
        }else{
            System.out.println("找不到该索引");
        }
    }
    
    public void listNotes()
    {
        for(int i = 0; i<notes.size();i++){
            System.out.println("索引号:"+ i +"|内容:"+ notes.get(i));
        }
    }
    public static void test()
    {
        int index=5;
        while(index <= 95){
            if(index%5 == 0)System.out.println(index);
            index += 1;
        }
    }
    public int sum(int a,int b)
    {
        int min=0;
        int max=0;
        int sum =0;
        if (a>=b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }        
        for(int i=min;i<=max;i++){
            sum += i;
        }
        return sum;
    }
    public boolean isPrime(int num)
    {
       
        for(int i=2 ;i<num;i++){
            if(num % i ==0){
                return false;
            }
        }
       
        return true;
    }
    public boolean search(String searchString)
    {
        int index = 0;
        boolean found = false;
        int size = notes.size();
        while(index < size){
            String note = notes.get(index);
            if(note.contains(searchString)){
                System.out.println(note);
                return true;
            }else {
                index++;
            }
        }
        System.out.println("没有找到");
        return false;
    }
    
    public boolean searchForI (String searchString)
    {
        
        return false;
    }
}
