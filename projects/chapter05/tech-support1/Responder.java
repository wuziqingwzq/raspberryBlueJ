import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    0.1
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> responseString;
    private HashMap<String,String> niceResponse;
    /**
     * Construct a Responder - 在初始化时填充了各种回复列表
     */
       
    public Responder()
    {
        randomGenerator = new Random();
        responseString = new ArrayList<String>();
        niceResponse = new HashMap<String,String>();
        fillResponseString();
        fillNiceResponse();
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return "That sounds interesting. Tell me more...";
    }
    
    public void fillResponseString(){
        responseString.add("yes");
        responseString.add("no");
        responseString.add("maybe");
        responseString.add("That sounds interesting. Tell me more...");
    }
    
    /**
       * 填充回复的内容
       * 这一步在构造函数中已经完成
       */
    public void fillNiceResponse(){
        niceResponse.put("ok","it's ok");
        niceResponse.put("how are you","fine");
        niceResponse.put("yes","it's ok");
        niceResponse.put("bye","Nice talking to you. Bye...");
    }
    
    public void addResponse(String message){
        responseString.add(message);
    }
    
    public String getResponse(){
        int responseInt = getRandomInt(0,responseString.size()-1);
        return responseString.get(responseInt);
    }
    
    /**
     * @param input 传入的字符集
     * @return 返回回答的字符串
     */
    public String getNiceResponse(HashSet<String> input){
        for(String word:input){
            if (niceResponse.containsKey(word))
                return niceResponse.get(word);
        }
        return getResponse();
    }
    
    
    public int throwDice(){
        return randomGenerator.nextInt(6)+1;
    }
    
    public int getRandomInt(int min, int max){
        if(min <= max){
            return randomGenerator.nextInt(max - min+1)+min;                
        }
        return 0;
    }
    
    public void test(){
        for(int i=0;i<4;i++){
            System.out.println(getResponse());
        }
    }
    
}
