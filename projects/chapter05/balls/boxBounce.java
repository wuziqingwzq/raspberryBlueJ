import java.awt.*;

/**
 * ������������� boxBounce ��������
 * 
 * @���ߣ�������֣�
 * @�汾��һ���汾�Ż���һ�����ڣ�
 */
public class boxBounce
{
    // ʵ������ - �����Լ��ı����滻���������
    private Canvas myCanvas;

    /**
     * �� boxBounce �Ķ���Ĺ��캯��
     */
    public boxBounce()
    {
        // ��ʼ��ʵ������
        myCanvas = new Canvas("�������Demo", 600, 500);
        myCanvas.setVisible(true);
    }
    
    public void boxBounce(){
        myCanvas.draw(new Rectangle(10,50,300,200));
        int[] rect = {10,50,300,200};
        BoxBall ball = new BoxBall(11,55,Color.RED,30,myCanvas,rect);
        ball.draw();
        while(ball.getCollisionNum() <= 30 ){
            myCanvas.wait(5);
            ball.move();
        }
        
    }

}
