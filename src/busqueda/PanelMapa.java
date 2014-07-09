package busqueda;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 * @author milver
 */
public class PanelMapa extends JPanel{
   
   private Punto punata;
   private Punto mizque;
   private Punto arani;
   private Punto ayopaya;
   private Punto tapacari;
   private Punto arque;
   private Punto bolivar;
   private Punto capinota;
   private Punto quillacollo;
   private Punto cercado;
   private Punto jordan;
   private Punto arce;
   private Punto tiraque;
   private Punto chapare;
   private Punto carrasco;
   private Punto campero;
   
   private boolean dibujar;
   private ImageIcon imagen;
   private ArrayList<Punto> labels;
   private ArrayList<String> recorrido;
   private Map<String,Dimension> puntosXY;
   public PanelMapa(){
      dibujar=false;
      labels=new ArrayList<Punto>();
      recorrido=new ArrayList<String>();
      puntosXY=new HashMap<String,Dimension>();
      this.setLayout(null);
      fijarProvincias();
   }
   public ArrayList<String> getRecorrido(){
      return recorrido;
   }
   private void fijarProvincias(){
      //"punata","mizque","arani","arque","ayopaya","bolivar","carrasco","capinota","campero","chapare",
      //"EArce","jordan","quillacollo","tapacari","tiraque","cercado"
      //punata
      punata=new Punto("punata");
      punata.setBounds(262,300, 15, 15);
      puntosXY.put("punata", new Dimension(269, 307));
      labels.add(punata);
      this.add(punata);
      //mizque;
      mizque=new Punto("mizque");
      mizque.setBounds(345,370, 15, 15);
      puntosXY.put("mizque", new Dimension(352,377));
      labels.add(mizque);
      this.add(mizque);
      //arani
      arani=new Punto("arani");
      arani.setBounds(290,300, 15, 15);
      puntosXY.put("arani", new Dimension(297,307));
      labels.add(arani);
      this.add(arani);
      //ayopaya
      ayopaya = new Punto("ayopaya");
      ayopaya.setBounds(100,225, 15, 15);
      puntosXY.put("ayopaya", new Dimension(107,232));
      labels.add(ayopaya);
      this.add(ayopaya);

      // tapacari
      tapacari = new Punto("tapacari");
      tapacari.setBounds(130,287, 15, 15);
      puntosXY.put("tapacari", new Dimension(137,294));
      labels.add(tapacari);
      this.add(tapacari);

      //arque
      arque = new Punto("arque");
      arque.setBounds(160,340, 15, 15);
      puntosXY.put("arque", new Dimension(167,347));
      labels.add(arque);
      this.add(arque);

      //capinota
      capinota = new Punto("capinota");
      capinota.setBounds(190,320, 15, 15);
      puntosXY.put("capinota", new Dimension(197,327));
      labels.add(capinota);
      this.add(capinota);
      // para bolivar
      bolivar = new Punto("bolivar");
      bolivar.setBounds(125,370, 15, 15);
      puntosXY.put("bolivar", new Dimension(132,377));
      labels.add(bolivar);
      this.add(bolivar);
      //para arce
      arce = new Punto("arce");
      arce.setBounds(240,325, 15, 15);
      puntosXY.put("arce", new Dimension(247,332));
      labels.add(arce);
      this.add(arce);

      // para carrasco
      carrasco = new Punto("carrasco");
      carrasco.setBounds(375,325, 15, 15);
      puntosXY.put("carrasco", new Dimension(385,332));
      labels.add(carrasco);
      this.add(carrasco);

      // para campero
      campero = new Punto("campero");
      campero.setBounds(380,400, 15, 15);
      puntosXY.put("campero", new Dimension(387,407));
      labels.add(campero);
      this.add(campero);

      //chapare
      chapare = new Punto("chapare");
      chapare.setBounds(245,260, 15, 15);
      puntosXY.put("chapare", new Dimension(252,267));
      labels.add(chapare);
      this.add(chapare);

      //tiraque
      tiraque = new Punto("tiraque");
      tiraque.setBounds(315,270, 15, 15);
      puntosXY.put("tiraque", new Dimension(322,277));
      labels.add(tiraque);
      this.add(tiraque);

      //quillacollo
      quillacollo = new Punto("quillacollo");
      quillacollo.setBounds(180,255, 15, 15);
      puntosXY.put("quillacollo", new Dimension(187,262));
      labels.add(quillacollo);
      this.add(quillacollo);

      //cercado
      cercado = new Punto("cercado");
      cercado.setBounds(207,270, 15, 15);
      puntosXY.put("cercado", new Dimension(214,277));
      labels.add(cercado);
      this.add(cercado);

      // jordan
      jordan = new Punto("jordan");
      jordan.setBounds(240,290, 15, 15);
      puntosXY.put("jordan", new Dimension(247,297));
      labels.add(jordan);
      this.add(jordan);
   }
   public void ejecutarAlgoritmo(JComboBox cbo,JComboBox cbd){
      Mapa m=new Mapa(String.valueOf(cbo.getSelectedItem()), String.valueOf(cbd.getSelectedItem()));
      m.busquedaAscensoColina();
      recorrido=m.getCaminoRecorrido();
      pintarRecorrido();
      
   }
   public void paintComponent(Graphics g){
        Dimension d=getSize();
        Graphics2D g2d=(Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        imagen=new ImageIcon(getClass().getResource("/img/cochabambav1.png"));
        g2d.drawImage(imagen.getImage(), 0, 0,getWidth(),getHeight(),null);
   }
   private void pintarRecorrido(){
      Graphics g=this.getGraphics();
      Graphics2D g2d=(Graphics2D)g;
      g2d.setColor(Color.GREEN);
      g2d.setStroke(new BasicStroke(3));
      for (int i = 0; i < recorrido.size()-1; i++) {
         Dimension dm1=puntosXY.get(recorrido.get(i));
         Dimension dm2=puntosXY.get(recorrido.get(i+1));
         g2d.drawLine(dm1.width, dm1.height, dm2.width, dm2.height);
      }
   }
   public int generarNumeroRango(int min, int max){
      int re = -1;
      while (re < min || re > max) {
          Random rn = new Random();
          re =(int) (rn.nextDouble() * 100)+50;
      }
      return re;
   }
   private boolean getDibujar(){
      return dibujar;
   }
   private void setDibujar(boolean d){
      dibujar=d;
   }
   /*public static void main(String args[]){
      PanelMapa p=new PanelMapa();
      System.out.println("color ="+p.generarNumeroRango(0, 255));
   }*/
}
