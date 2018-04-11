import java.util.HashMap;
/**
 * 在这里给出对类 MapTest 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class MapTest
{
    // 实例变量 - 用你自己的变量替换下面的例子
    private HashMap<String,Integer> addressList;

    /**
     * 类 MapTest 的对象的构造函数
     */
    public MapTest()
    {
        addressList = new HashMap<String , Integer>();
    }

    public void enterNumber(String name, int number){
        addressList.put(name ,number);
    }
    
    public String lookupNumber(String name){
        return addressList.get(name).toString();
    }
    
    /**
     * 一个方法的例子 - 使用你自己的说明替代它
     * 
     * @参数 y，方法的一个样本参数
     * @返回 x，y的和 
     */
    public void sampleMethod()
    {

        System.out.println(addressList.size());
    }
}
