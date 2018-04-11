
/**
 * 在这里给出对类 Ticket 的描述。
 * 车票类
 * @作者 吴子清
 * @版本 2018-02-05 V0.10
 */
public class Ticket
{
    // 实例变量 - 用你自己的变量替换下面的例子
    private int price;
    /**
     * 类 Ticket 的对象的构造函数
     * 设置票价
     */
    public Ticket(int _price)
    {
        // 初始化实例变量
        price = _price;
    }
    
    public int getPrice(){
        return price;
    }
    public void setPrice(int _price){
        price = _price;
    }
    public void printTicket(){
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
    }
    
}
