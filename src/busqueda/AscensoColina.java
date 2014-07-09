package busqueda;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import swingM.ButtonM;
import swingM.BuutonR;
import swingM.PanelM;
import swingM.ToolBarM;

/**
 * @author milver
 */
public class AscensoColina extends javax.swing.JFrame {
  
   private String provincias[]={"punata","mizque","arani","arque","ayopaya","bolivar","carrasco","capinota","campero","chapare","EArce","jordan","quillacollo","tapacari","tiraque","cercado"};
   public AscensoColina() {
      initComponents();
      btnIniciar.setForeground(Color.WHITE);
      this.setLocationRelativeTo(null);
      this.setSize(900, 700);
      cargarComponentes();
      this.setResizable(false);
   }

   private void cargarComponentes()
   {
      for (int i = 0; i < provincias.length; i++) {
         cbOrigen.addItem(provincias[i]);
         cbDestino.addItem(provincias[i]);
      }
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      panelDown = new PanelM();
      tbHerramienta = new ToolBarM();
      jPanel4 = new PanelM();
      jPanel5 = new PanelM();
      cbOrigen = new javax.swing.JComboBox();
      lblorigen = new javax.swing.JLabel();
      jPanel6 = new PanelM();
      cbDestino = new javax.swing.JComboBox();
      lblDestino = new javax.swing.JLabel();
      jPanel7 = new PanelM();
      btnIniciar = new ButtonM();
      jPanel1 = new PanelM();
      jButton1 = new BuutonR();
      jTabbedPane1 = new javax.swing.JTabbedPane();
      panelDetalle = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      TADetalle = new javax.swing.JTextArea();
      jPanel2 = new javax.swing.JPanel();
      jLabel3 = new javax.swing.JLabel();
      panelEscenario = new PanelMapa();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      tbHerramienta.setRollover(true);

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 106, Short.MAX_VALUE)
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 83, Short.MAX_VALUE)
      );

      tbHerramienta.add(jPanel4);

      lblorigen.setForeground(new java.awt.Color(254, 254, 254));
      lblorigen.setText("ciudad origen");

      javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
      jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(cbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(lblorigen))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblorigen)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
            .addComponent(cbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      tbHerramienta.add(jPanel5);

      lblDestino.setForeground(new java.awt.Color(255, 250, 250));
      lblDestino.setText("ciudad destino");

      javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
      jPanel6.setLayout(jPanel6Layout);
      jPanel6Layout.setHorizontalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(lblDestino))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel6Layout.setVerticalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblDestino)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
            .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      tbHerramienta.add(jPanel6);

      btnIniciar.setText("Iniciar");
      btnIniciar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnIniciarActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
      jPanel7.setLayout(jPanel7Layout);
      jPanel7Layout.setHorizontalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel7Layout.setVerticalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel7Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(btnIniciar)
            .addContainerGap(34, Short.MAX_VALUE))
      );

      tbHerramienta.add(jPanel7);

      jButton1.setText("jButton1");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jButton1)
            .addContainerGap(33, Short.MAX_VALUE))
      );

      tbHerramienta.add(jPanel1);

      TADetalle.setColumns(20);
      TADetalle.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
      TADetalle.setRows(5);
      jScrollPane1.setViewportView(TADetalle);

      javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
      panelDetalle.setLayout(panelDetalleLayout);
      panelDetalleLayout.setHorizontalGroup(
         panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelDetalleLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      panelDetalleLayout.setVerticalGroup(
         panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelDetalleLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
            .addContainerGap())
      );

      jTabbedPane1.addTab("Detalles", panelDetalle);

      jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
      jLabel3.setText("<html>\nProyecto del primer parcial<br/>\n de inteligencia artificial<br/>\n aplicando el algoritmo <br/>\nde ascenso en colina (Hill Climbing).<br/><br/>\nDesarrollado por:<br/><br/>\nFlores Acevedo Milver <br/><br/>\nGuzman Abasto Juan Carlos<br/><br/>\nAstete Choque Wilfredo</html>");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
            .addContainerGap())
      );

      jTabbedPane1.addTab("About", jPanel2);

      panelEscenario.setBackground(new java.awt.Color(110, 90, 71));

      javax.swing.GroupLayout panelEscenarioLayout = new javax.swing.GroupLayout(panelEscenario);
      panelEscenario.setLayout(panelEscenarioLayout);
      panelEscenarioLayout.setHorizontalGroup(
         panelEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 635, Short.MAX_VALUE)
      );
      panelEscenarioLayout.setVerticalGroup(
         panelEscenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout panelDownLayout = new javax.swing.GroupLayout(panelDown);
      panelDown.setLayout(panelDownLayout);
      panelDownLayout.setHorizontalGroup(
         panelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(tbHerramienta, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
         .addGroup(panelDownLayout.createSequentialGroup()
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(panelEscenario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      panelDownLayout.setVerticalGroup(
         panelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panelDownLayout.createSequentialGroup()
            .addComponent(tbHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jTabbedPane1)
               .addComponent(panelEscenario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(panelDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(panelDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
      PanelMapa panelStage=(PanelMapa)panelEscenario;
      panelStage.ejecutarAlgoritmo(cbOrigen, cbDestino);
      TADetalle.setText(formatearTexto(panelStage.getRecorrido()));
   }//GEN-LAST:event_btnIniciarActionPerformed
   private String formatearTexto(ArrayList<String> contenido){
      String rutasRecorridas="NODOS RECORRIDOS \n\nNodo==> ";
      for (int i = 0; i < contenido.size(); i++) {
         rutasRecorridas=rutasRecorridas+contenido.get(i)+"\nNodo==> ";
      }
      return rutasRecorridas;
   }
   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
      AscensoColina acs=new AscensoColina();
      acs.setVisible(true);
      
   }//GEN-LAST:event_jButton1ActionPerformed
   public static void main(String args[]) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (ClassNotFoundException ex) {
         Logger.getLogger(AscensoColina.class.getName()).log(Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         Logger.getLogger(AscensoColina.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         Logger.getLogger(AscensoColina.class.getName()).log(Level.SEVERE, null, ex);
      } catch (UnsupportedLookAndFeelException ex) {
         Logger.getLogger(AscensoColina.class.getName()).log(Level.SEVERE, null, ex);
      }
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new AscensoColina().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextArea TADetalle;
   private javax.swing.JButton btnIniciar;
   private javax.swing.JComboBox cbDestino;
   private javax.swing.JComboBox cbOrigen;
   private javax.swing.JButton jButton1;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JPanel jPanel5;
   private javax.swing.JPanel jPanel6;
   private javax.swing.JPanel jPanel7;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTabbedPane jTabbedPane1;
   private javax.swing.JLabel lblDestino;
   private javax.swing.JLabel lblorigen;
   private javax.swing.JPanel panelDetalle;
   private javax.swing.JPanel panelDown;
   private javax.swing.JPanel panelEscenario;
   private javax.swing.JToolBar tbHerramienta;
   // End of variables declaration//GEN-END:variables

}
