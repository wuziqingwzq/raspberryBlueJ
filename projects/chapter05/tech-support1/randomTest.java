import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
 * ������������� randomTest ��������
 * 
 * @���ߣ�������֣�
 * @�汾��һ���汾�Ż���һ�����ڣ�
 */
public class randomTest
{
    // ʵ������ - �����Լ��ı����滻���������
    private int x;
    private Random randomGenerator;
    private String[] strtest;
    private int[] a = {9,2,1,3,4};
    
    /**
     * �� randomTest �Ķ���Ĺ��캯��
     */
    public randomTest()
    {
        // ��ʼ��ʵ������
        randomGenerator = new Random();
    }

    /**
     * һ������������ - ʹ�����Լ���˵�������
     * 
     * @���� y��������һ����������
     * @���� x��y�ĺ� 
     */
    public void sampleMethod()
    {
        // �����������Ĵ���
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
