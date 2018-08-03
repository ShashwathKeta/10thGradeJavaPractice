import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
   	  window.setColor(Color.RED);
   	  window.drawString("Shashwath Keta APCS 2017",10,40);
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 10, 75);
      
      window.setColor(Color.BLACK);
      window.fillOval(200, 125, 400, 50);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 150, 400, 400 );
      
      window.setColor(Color.BLACK);
      window.fillOval( 275, 250, 75, 50);
      window.fillOval(475, 250, 75,50);
      
      window.setColor(Color.RED);
      window.fillOval(390, 350, 40, 40);
      
      window.setColor(Color.BLUE);
      window.drawArc(310,415,200,50,180, 180);
      
   }
}