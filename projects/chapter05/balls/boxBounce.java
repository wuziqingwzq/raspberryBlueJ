import java.awt.*;

/**
 * 在这里给出对类 boxBounce 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class boxBounce
{
    // 实例变量 - 用你自己的变量替换下面的例子
    private Canvas myCanvas;

    /**
     * 类 boxBounce 的对象的构造函数
     */
    public boxBounce()
    {
        // 初始化实例变量
        myCanvas = new Canvas("吴子清的Demo", 600, 500);
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
