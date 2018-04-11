import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
 * 在这里给出对类 randomTest 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class randomTest
{
    // 实例变量 - 用你自己的变量替换下面的例子
    private int x;
    private Random randomGenerator;
    private String[] strtest;
    private int[] a = {9,2,1,3,4};
    
    /**
     * 类 randomTest 的对象的构造函数
     */
    public randomTest()
    {
        // 初始化实例变量
        randomGenerator = new Random();
    }

    /**
     * 一个方法的例子 - 使用你自己的说明替代它
     * 
     * @参数 y，方法的一个样本参数
     * @返回 x，y的和 
     */
    public void sampleMethod()
    {
        // 在这里加入你的代码
        for(int i=0;i<10;i++){
            System.out.println(randomGenerator.nextInt(6)+1);
        }
    }
    
    public void printintList(int[] a){
              
        List intList = Arrays.asList(Int2integer(a));
        ArrayList<Integer> arr = new ArrayList<Integer>(intList);
        for(int i = 1;i<arr.size();i++){
            for(int j = 0;j<i;j++){
                if(arr.get(i).compareTo(arr.get(j)) < 0){
                    arr.add(j,arr.get(i));
                    arr.remove(i+1);
                    break;
                }
            }
            
        }
        
        for(int i =0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    
    private Integer[] Int2integer(int[] a){
        Integer[] integer = new Integer[a.length];
        for(int i=0;i<a.length;i++){
            integer[i] = new Integer(a[i]);
        }
        return integer;
    }
    
}
