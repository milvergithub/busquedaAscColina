package swingM;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;

/**
 * @author milver
 */
public class ButtonM extends JButton{
   public ButtonM(){
      
   }
   protected void paintComponent(Graphics g){
      Graphics2D g2d=(Graphics2D)g;
      g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
      Shape s=new RoundRectangle2D.Double(0,0, getWidth(), getHeight(), getHeight(), getHeight());
      Paint p=new GradientPaint(0, 0, Color.BLUE, getHeight(), getWidth(), Color.WHITE);
      g2d.setPaint(p);
      g2d.fill(s);
      g2d.setFont(new Font("Ubuntu", Font.BOLD, 18));
      g2d.setColor(Color.WHITE);
      g2d.setStroke(new BasicStroke(3));
      g2d.drawString("Iniciar ", 25, 20);
   }
}
