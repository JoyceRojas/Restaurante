package lab_willian_garcia_miguel_julio.views;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static lab_willian_garcia_miguel_julio.controls.Lab_Willian_Garcia_Miguel_Julio.LaPros;
import static lab_willian_garcia_miguel_julio.controls.Lab_Willian_Garcia_Miguel_Julio.updateWInter;
import static lab_willian_garcia_miguel_julio.controls.Restaurante.ordenes;
import lab_willian_garcia_miguel_julio.models.JefeCocina;
import lab_willian_garcia_miguel_julio.models.Mesa;
import lab_willian_garcia_miguel_julio.models.Orden;
import lab_willian_garcia_miguel_julio.models.Plato;
import static lab_willian_garcia_miguel_julio.views.W2Mesero.mesa;
import static lab_willian_garcia_miguel_julio.views.WMesero.cc;

public class WMenu extends javax.swing.JFrame {
    public static W2Mesero anterior;
    public static Plato plato=null,plato2=null;
    public static JefeCocina Jcocina;
    public WMenu(W2Mesero anterior) {
        initComponents();
        this.setSize(722,330);
        this.setResizable(false);
        Jcocina= new JefeCocina(Jcocina);
        this.anterior=anterior;
        setCombo();
        jLabel1.setText("Nombre:"+LaPros.busM(cc).getNombre());
        jLabel2.setText("Mesa:"+mesa);
        jLabel3.setText(jTable1.getModel().getValueAt(0, 0).toString());
        jLabel4.setText("$ " + jTable1.getModel().getValueAt(0, 1).toString());
        jButton1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(10, 11, 118, 20);

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(195, 14, 70, 14);

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(324, 14, 90, 14);

        jButton1.setText("Ordenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 30, 97, 63);

        jTable1.setBackground(new java.awt.Color(251, 248, 198));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nombre", "Precio", "Categoria"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 57, 452, 232);

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(482, 108, 230, 14);

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(482, 133, 180, 14);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(482, 214, 97, 59);
        jPanel1.add(jSpinner1);
        jSpinner1.setBounds(482, 174, 50, 20);

        jButton3.setText("Añadir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(539, 173, 130, 23);

        jLabel5.setText("<html>n° de elementos<br/>de la orden</html>");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(562, 24, 160, 40);

        jLabel6.setText("0");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(570, 70, 30, 14);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 0, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(-50, 0, 1560, 620);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-3, -3, 860, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        if (!jComboBox1.getSelectedItem().toString().equals("TODAS")) {
            llenar(jComboBox1.getSelectedItem().toString(), modelo);
        } else {
            setMenI();
        }
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setResizingAllowed(false);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(plato!=null){
            Mesa table=new Mesa();
            int numero=Integer.parseInt(jLabel2.getText().substring(5,jLabel2.getText().length()));
            table=LaPros.getMesas().busMxid(numero);
            table.setCc(cc);
                if(ordenes==null){
                    LaPros.busM(cc).setM(numero);//asigno mesa al mesero
                    ordenes=new Orden(numero,plato2,cc);//creo ordenes
                }else{
                    if(!ordenes.busO(numero)) LaPros.busM(cc).setM(numero);////asigno mesa al mesero si no en
                    ordenes.addOrden(numero,plato2,cc);
                }
                //plato=null;
                plato2=null;
                updateWInter();
                anterior.update();
                anterior.setVisible(true);
                this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        jLabel3.setText(jTable1.getModel().getValueAt(row, 0).toString());
        jLabel4.setText("$ " + jTable1.getModel().getValueAt(row, 1).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        if (Integer.parseInt(jSpinner1.getValue().toString()) > 0) {
            //Se consulta si se puede agregar con el jefe de cocina (Proximamente)
            String msg;
            if(jTable1.getSelectedRow()!=-1) {
                String dato=String.valueOf(modelo.getValueAt(jTable1.getSelectedRow(),0));
                String dato2=String.valueOf(modelo.getValueAt(jTable1.getSelectedRow(),2));
                String dato3=jSpinner1.getValue().toString();
                if (Jcocina.VerificarIngredientes(dato, dato2,dato3)) {
                /*obtenemos el plato con la cantidad y el precio y lo guardamos en las variables declaradas anteriormente*/
                Plato p1= new Plato(jLabel3.getText(), Integer.parseInt(jSpinner1.getValue().toString()), Float.parseFloat(jLabel4.getText().substring(2, jLabel4.getText().length())), 10,jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                Plato p = new Plato(jLabel3.getText(), Integer.parseInt(jSpinner1.getValue().toString()), Float.parseFloat(jLabel4.getText().substring(2, jLabel4.getText().length())), 10,jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                if (plato == null){
                    plato = p;
                    plato2=p1;
                }else {
                    p1.setLink(plato2);
                    plato2=p1;
                    p.setLink(plato);
                    plato = p;
                }
                jLabel6.setText((Integer.parseInt(jLabel6.getText()) + 1) + "");
                if (!jLabel6.getText().equals("0")) jButton1.setEnabled(true);
              }else  JOptionPane.showMessageDialog(this,"No existen cantidades nesesarias en bodega");
          }else JOptionPane.showMessageDialog(this,"No ha seleccionado un plato");
        }else JOptionPane.showMessageDialog(this,"Erro cantidad negativa o cero");
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        anterior.update();
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WMenu(anterior).setVisible(true);
            }
        });
    }

    public void setCombo() {
        try {
            //Se colocan las opciones en el combobox
            FileInputStream fstream = new FileInputStream("Archivos\\Menu\\Categorias.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            jComboBox1.addItem("TODAS");
            jComboBox1.setSelectedIndex(0);
            while ((strLine = br.readLine()) != null) {
                if (!strLine.equals("")) {
                    jComboBox1.addItem(strLine.substring(0, strLine.length() - 1));
                }
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void setMenI() {//Se colocan los productos en el jtable
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        try {
            //eliminar columna  //((DefaultTableModel)myJTable.getModel()).removeRow(rowToRemove);
            FileInputStream fstream = new FileInputStream("Archivos\\Menu\\Categorias.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                if (!strLine.equals("")) {
                    llenar(strLine.substring(0, strLine.length() - 1), modelo);
                }
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setResizingAllowed(false);
    }

    public void llenar(String strLine, DefaultTableModel modelo) {
        try {
            FileInputStream fss = new FileInputStream("Archivos\\Menu\\" + strLine + ".txt");
            DataInputStream in1 = new DataInputStream(fss);
            BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
            String str;
            while ((str = br1.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(str, ";");
                String nombre = "", precio = "";
                int i = 0;
                while (st.hasMoreTokens()) {
                    if (i == 0) {
                        nombre = st.nextToken();
                    } else {
                        precio = st.nextToken();
                    }
                    i++;
                }
                if (!nombre.equals("") && !precio.equals("")) {
                    modelo.addRow(new Object[]{nombre, precio, strLine});
                }
            }
            in1.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
}
