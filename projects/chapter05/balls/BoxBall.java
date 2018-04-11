
import java.awt.*;
import java.awt.geom.*;

/**
 * 在这里给出对类 BoxBall 的描述。
 * 一个盒子里的小球，碰到盒子壁后反弹
 * @作者 吴子清
 * @版本 2018-04-02
 */
public class BoxBall
{
    private static final int GRAVITY = 3;  // effect of gravity
    private int ballDegradation = 2;
    private Ellipse2D.Double circle;
    private Color color;
    private int diameter;
    private int xPosition;
    private int yPosition;
    private Canvas canvas;
    private int ySpeed = 1;
    private int xSpeed = 1;
    private int collisionNum = 0;
    
    //定义了矩形方块的四个角
    private int[] rectanglePoint;
    
    private int boundx1;
    private int boundx2;
    private int boundy1;
    private int boundy2;
    
    /**
     * 类 BoxBall 的对象的构造函数
     */
    public BoxBall(int xPos,int yPos,Color ballColor,int ballDiameter,Canvas drawingCanvas,int[] rectangle)
    {
        xPosition = xPos;
        yPosition = yPos;
        color = ballColor;
        diameter = ballDiameter;
        canvas = drawingCanvas;
        rectanglePoint = rectangle;
        
        boundx1 = rectanglePoint[0] + 1;
        boundx2 = rectanglePoint[0] + rectanglePoint[2] ;
        boundy1 = rectanglePoint[1] ;
        boundy2 = rectanglePoint[1] + rectanglePoint[3] ;
    }
    
    public void move(){
        erase();
        yPosition += ySpeed;
        xPosition += xSpeed;
        if(yPosition >= boundy2-diameter || yPosition <= boundy1) {
            ySpeed = -ySpeed; 
            collisionNum += 1;
        }
        if(xPosition >= boundx2-diameter || xPosition <= boundx1){
            xSpeed = -xSpeed;
            collisionNum += 1;
        }
        // draw again at new position
        draw();
    }
    
    public void draw(){
        canvas.setForegroundColor(color);
        canvas.fillCircle(xPosition, yPosition, diameter);
    }
    
    public void erase(){
        canvas.eraseCircle(xPosition, yPosition, diameter);
    }
    
    public int getXPosition()
    {
        return xPosition;
    }

    public int getYPosition()
    {
        return yPosition;
    }
    
    public int getCollisionNum(){
        return collisionNum;
    }
}
