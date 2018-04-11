/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @wzq (Insert your name here.)
 * @v1.0 2018-02-08 (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int page;
    private String refNumber;
    private int borrowed;
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
        page = 100;
        refNumber="";
        borrowed = 0;
    }

    public String getAuthor(){
        return this.author;
    }
    
    public String getTitle(){
        return this.title;
    }
    public int getPage(){
        return this.page;
    }
    public String getRefNumber(){
        return this.refNumber;
    }
    public void setRefNumber(String ref){
        if(ref.length()>=3){
            refNumber = ref;
        }else{
            System.out.println("refNumber is too short");
        }
    }
    public int getBorrowed(){
        return this.borrowed;
    }
    
    public void borrow(){
        borrowed += 1;
    }
    
    public void printAuthor(){
        System.out.println("author:"+author);
    }
    
    public void printTitle(){
        System.out.println("title:"+title);
    }
    
    public void printRefNumber(){
        if(refNumber==""){
            System.out.println("ZZZ");
        }else{
            System.out.println("refNumber:"+refNumber);
        }
        
    }
    public void printborrowed(){
        System.out.println("borrowed:"+borrowed);
    }
    
    public void printDetails(){
        System.out.println("*******Books Details*******");
        printAuthor();
        printTitle();
        printRefNumber();
        printborrowed();
        System.out.println("***************************");
        System.out.println("");
    }
    
}
