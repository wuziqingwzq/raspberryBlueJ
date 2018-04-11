
/**
 * ������������� Ticket ��������
 * ��Ʊ��
 * @���� ������
 * @�汾 2018-02-05 V0.10
 */
public class Ticket
{
    // ʵ������ - �����Լ��ı����滻���������
    private int price;
    /**
     * �� Ticket �Ķ���Ĺ��캯��
     * ����Ʊ��
     */
    public Ticket(int _price)
    {
        // ��ʼ��ʵ������
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
