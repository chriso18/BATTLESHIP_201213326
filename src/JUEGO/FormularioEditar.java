package JUEGO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;




public class FormularioEditar extends javax.swing.JFrame {
	 int count=1;
	    int count2=1;
	    public FormularioEditar() {
	        initComponents();
	        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	        Dimension ventana = getSize();
	        setLocation((pantalla.width - ventana.width) / 2,(pantalla.height - ventana.height) / 2);
	        
	        
	        
	    }

	    /** This method is called from within the constructor to
	     * initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is
	     * always regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        jButton1 = new javax.swing.JButton();
	        fechatxt = new javax.swing.JFormattedTextField();
	        passwordtxt = new javax.swing.JTextField();
	        jRadioButton2 = new javax.swing.JRadioButton();
	        jRadioButton1 = new javax.swing.JRadioButton();
	        usertxt = new javax.swing.JTextField();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

	        jButton1.setText("Crear");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        fechatxt.setForeground(new java.awt.Color(204, 204, 204));
	        fechatxt.setText("Nueva fecha");
	        fechatxt.setToolTipText("Ej. 1 de enero de 1992");
	        fechatxt.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                fechatxtMouseClicked(evt);
	            }
	        });

	        passwordtxt.setEditable(false);

	        jRadioButton2.setText("Femenino");
	        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jRadioButton2ActionPerformed(evt);
	            }
	        });

	        jRadioButton1.setText("Masculino");
	        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jRadioButton1ActionPerformed(evt);
	            }
	        });

	        usertxt.setForeground(new java.awt.Color(204, 204, 204));
	        usertxt.setText("Nuevo Usuario");
	        usertxt.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                usertxtMouseClicked(evt);
	            }
	        });
	        usertxt.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                usertxtActionPerformed(evt);
	            }
	        });

	        jLabel3.setText("Fecha de Nacimiento:");

	        jLabel1.setText("User:");

	        jLabel2.setText("Password:");

	        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
	        jLabel4.setText("Editar Datos");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(60, 60, 60)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jLabel2)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(jRadioButton1)
	                                .addGap(42, 42, 42))
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(jLabel3)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jRadioButton2)
	                            .addComponent(fechatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jLabel1)
	                        .addGap(27, 27, 27)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel4)
	                            .addComponent(usertxt, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))))
	                .addGap(63, 63, 63))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap(24, Short.MAX_VALUE)
	                .addComponent(jLabel4)
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel1)
	                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel2)
	                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3)
	                    .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(24, 24, 24)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jRadioButton1)
	                    .addComponent(jRadioButton2))
	                .addGap(18, 18, 18)
	                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(27, 27, 27))
	        );

	        pack();
	    }// </editor-fold>//GEN-END:initComponents

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	        String newName=this.usertxt.getText();
	        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("d' de 'MMMM' de 'yyyy");
	        String strFecha = this.fechatxt.getText();
	        Date fecha=null;
	        char sexo=this.jRadioButton1.isSelected()?'M':'F';
	        
	        try{
	            fecha = formatoDeFecha.parse(strFecha);
	        }catch(Exception e){
	            System.out.println("Error: "+e.getMessage());
	        }
	        
	        try{
	            JugadoresBinario jugadores= new JugadoresBinario();
	            String n2=jugadores.returnNombreViejo();
	            jugadores.actualizarDatos(n2,newName, fecha,sexo );
	            
	        }catch(IOException e){
	            System.out.println("Error:"+e.getMessage());
	        }
	    }//GEN-LAST:event_jButton1ActionPerformed

	    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
	        this.jRadioButton1.setSelected(false);
	        this.jRadioButton2.setSelected(true);
	}//GEN-LAST:event_jRadioButton2ActionPerformed

	    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
	        this.jRadioButton1.setSelected(true);
	        this.jRadioButton2.setSelected(false);
	}//GEN-LAST:event_jRadioButton1ActionPerformed

	    private void usertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertxtActionPerformed
	      
	        
	        
	    }//GEN-LAST:event_usertxtActionPerformed

	    private void usertxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertxtMouseClicked
	        
	        if(count==1){
	        this.usertxt.setForeground(Color.black);
	        this.usertxt.setText(null);
	        count++;
	        }
	    }//GEN-LAST:event_usertxtMouseClicked

	    private void fechatxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechatxtMouseClicked
	        if(count2==1){
	        this.fechatxt.setForeground(Color.black);
	        this.fechatxt.setText(null);
	        count2++;
	        }
	        
	    }//GEN-LAST:event_fechatxtMouseClicked

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String args[]) {
	        java.awt.EventQueue.invokeLater(new Runnable() {

	            public void run() {
	                new FormularioEditar().setVisible(true);
	            }
	        });
	    }
	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JFormattedTextField fechatxt;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JRadioButton jRadioButton1;
	    private javax.swing.JRadioButton jRadioButton2;
	    private javax.swing.JTextField passwordtxt;
	    private javax.swing.JTextField usertxt;
	    // End of variables declaration//GEN-END:variables
}
