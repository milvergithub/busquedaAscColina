package swingM;

import java.awt.Dimension;

/**
 * @author milver
 */
public class Coordenadas {
   
   private double pendiente;
   
   private double posXini;
   private double posYini;
   private double posXfin;
   private double posYfin;
   private int direccionY;
   private int direccionX;
   
   public Coordenadas(){
      direccionY=1;
      direccionX=1;
   }
   
   private double getPendiente(int xi,int xf,int yi,int yf){
      double res=0;
      posXini=xi;posYini=yf;posXfin=xf;posYfin=yf;
      res=(yf-yi)/(xf-xi);
      return res;
   }
   public Dimension getPosicion(int xi,int xf,int yi,int yf){
      posXini=xi;posYini=yf;posXfin=xf;posYfin=yf;
      double x=((posYfin-posYini)/getPendiente(xi, xf, yi, yf))+posXini;
      Dimension d=new Dimension((int) (direccionX*x), direccionY*1);
      return d;
   }
   private void actualizarDireccion(){
      if (posYfin<posYini) {
         direccionY=-1;
      }
      else{
         direccionY=1;
      }
      if (posXfin<posXini) {
         direccionX=-1;
      }
      else{
         direccionX=1;
      }
   }
}
