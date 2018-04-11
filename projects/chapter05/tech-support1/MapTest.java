import java.util.HashMap;
/**
 * ������������� MapTest ��������
 * 
 * @���ߣ�������֣�
 * @�汾��һ���汾�Ż���һ�����ڣ�
 */
public class MapTest
{
    // ʵ������ - �����Լ��ı����滻���������
    private HashMap<String,Integer> addressList;

    /**
     * �� MapTest �Ķ���Ĺ��캯��
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
     * һ������������ - ʹ�����Լ���˵�������
     * 
     * @���� y��������һ����������
     * @���� x��y�ĺ� 
     */
    public void sampleMethod()
    {

        System.out.println(addressList.size());
    }
}
