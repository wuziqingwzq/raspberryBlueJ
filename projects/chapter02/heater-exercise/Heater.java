
/**
 * 在这里给出对类 Heater 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Heater
{
    // 实例变量 - 用你自己的变量替换下面的例子
    private int temperature;
    private int increment;
    private int min;
    private int max;

    /**
     * 类 Heater 的对象的构造函数
     */
    public Heater()
    {
        // 初始化实例变量
        temperature = 15;
        increment = 5;
        max = 50 ;
        min = 0 ;
    }
    

    /**
     * 一个方法的例子 - 使用你自己的说明替代它
     * 
     * @参数 y，方法的一个样本参数
     * @返回 x，y的和 
     */
    public void warmer()
    {
        // 在这里加入你的代码
        if(temperature + increment <= max){
            temperature += increment;
        }        
    }
    
    public void cooler(){
        if(temperature - increment >= min ){
            temperature -= increment;
        } 
    }
    
    public int getTemperature(){
        return temperature;
    }
    public void setIncrement(int value){
        if(value >= 0){
            increment = value;
        }        
    }
    
}
