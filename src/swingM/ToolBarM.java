package swingM;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JToolBar;

/**
 * @author milver
 */
public class ToolBarM extends JToolBar{
   
   public ToolBarM(){
     
   }
   protected void paintComponent(Graphics g){
      Graphics2D g2d=(Graphics2D)g;
      g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
      Shape s=new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), getHeight()/5, getHeight()/5);
      Paint p=new GradientPaint(0, 0, Color.GRAY, getWidth(), getHeight(), Color.BLACK);
      g2d.setPaint(p);
      g2d.fill(s);
   }
}
