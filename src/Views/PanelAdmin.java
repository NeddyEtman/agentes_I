
package Views;

import Controllers.DatosControllers;
import Controllers.ConfigControllers;
import Controllers.UsuariosControllers;
import Models.Datos;
import Models.DatosDao;
import Models.UsuarioDao;
import Models.Usuarios;


public class PanelAdmin extends javax.swing.JFrame {
    Usuarios us = new Usuarios();
    UsuarioDao usDao = new UsuarioDao();
    Datos dt = new Datos(); //Viene de clientes
    DatosDao dtDao = new DatosDao();//Viene de clientes
    
    public PanelAdmin() {
        initComponents();
        ConfigControllers config = new ConfigControllers(this);
        UsuariosControllers users = new UsuariosControllers(us, usDao, this);
        DatosControllers dato = new DatosControllers(dt, dtDao, this);//Viene de clientes
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPopupUsuarios = new javax.swing.JPopupMenu();
        JMenuEliminarUsers = new javax.swing.JMenuItem();
        JMenuReingresarUser = new javax.swing.JMenuItem();
        jPopupAduana = new javax.swing.JPopupMenu();
        JMenuEliminarAduana = new javax.swing.JMenuItem();
        JMenuModificarAduana = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        JPanelInfoGene = new javax.swing.JPanel();
        JLabelInfoGeneral = new javax.swing.JLabel();
        JPanelAnalisisDescriptivo = new javax.swing.JPanel();
        JLabelAnalisisDescriptivo = new javax.swing.JLabel();
        JPanelAnalisisPredictivo = new javax.swing.JPanel();
        JLabelAnalisisPredictivo = new javax.swing.JLabel();
        JPanelIngresoDatos = new javax.swing.JPanel();
        JLabelIngresoBD = new javax.swing.JLabel();
        JPanelProveedores = new javax.swing.JPanel();
        JLabelProveedor = new javax.swing.JLabel();
        JPanelMedidas = new javax.swing.JPanel();
        JLabelMedidas = new javax.swing.JLabel();
        JPanelConfig = new javax.swing.JPanel();
        JLabelConfig = new javax.swing.JLabel();
        JPanelUsers = new javax.swing.JPanel();
        JLabelUsers = new javax.swing.JLabel();
        JPanelSalir = new javax.swing.JPanel();
        JLabelSalir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarProducto = new javax.swing.JTextField();
        btnUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane12 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableRUs = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtGestionRUs = new javax.swing.JTextField();
        txtNandinaRUs = new javax.swing.JTextField();
        btnNuevoRUs = new javax.swing.JButton();
        btnRegistrarRUs = new javax.swing.JButton();
        btnModificarRUs = new javax.swing.JButton();
        txtIdRUs = new javax.swing.JTextField();
        txtBuscarRUs = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAduanaRus = new javax.swing.JTextField();
        txtDeptoRUs = new javax.swing.JTextField();
        txtViaRUs = new javax.swing.JTextField();
        txtMedioRUs = new javax.swing.JTextField();
        txtPaisRUs = new javax.swing.JTextField();
        txtMesRUs = new javax.swing.JTextField();
        txtKilosRUs = new javax.swing.JTextField();
        txtFobRUs = new javax.swing.JTextField();
        txtAduRUs = new javax.swing.JTextField();
        txtCusiRus = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtIdentRUs = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        PaginadoUser = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableUser = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUsuarioUser = new javax.swing.JTextField();
        txtNombreUser = new javax.swing.JTextField();
        cbxCajaUser = new javax.swing.JComboBox<>();
        cbxRolUser = new javax.swing.JComboBox<>();
        btnNuevoUser = new javax.swing.JButton();
        btnRegistrarUser = new javax.swing.JButton();
        btnModificarUser = new javax.swing.JButton();
        txtClaveUser = new javax.swing.JPasswordField();
        txtIdUser = new javax.swing.JTextField();
        txtBuscarUsers = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();

        JMenuEliminarUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        JMenuEliminarUsers.setText("Eliminar");
        JPopupUsuarios.add(JMenuEliminarUsers);

        JMenuReingresarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        JMenuReingresarUser.setText("Reingresar");
        JPopupUsuarios.add(JMenuReingresarUser);

        JMenuEliminarAduana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        JMenuEliminarAduana.setText("Eliminar");
        jPopupAduana.add(JMenuEliminarAduana);

        JMenuModificarAduana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        JMenuModificarAduana.setText("Reingresar");
        jPopupAduana.add(JMenuModificarAduana);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(225, 173, 152));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelInfoGene.setBackground(new java.awt.Color(225, 173, 152));

        JLabelInfoGeneral.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelInfoGeneral.setForeground(new java.awt.Color(255, 255, 255));
        JLabelInfoGeneral.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelInfoGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/informacion.png"))); // NOI18N
        JLabelInfoGeneral.setText("Informacion General");
        JLabelInfoGeneral.setToolTipText("");
        JLabelInfoGeneral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelInfoGeneLayout = new javax.swing.GroupLayout(JPanelInfoGene);
        JPanelInfoGene.setLayout(JPanelInfoGeneLayout);
        JPanelInfoGeneLayout.setHorizontalGroup(
            JPanelInfoGeneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelInfoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelInfoGeneLayout.setVerticalGroup(
            JPanelInfoGeneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelInfoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelInfoGene, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 40));

        JPanelAnalisisDescriptivo.setBackground(new java.awt.Color(225, 173, 152));

        JLabelAnalisisDescriptivo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelAnalisisDescriptivo.setForeground(new java.awt.Color(255, 255, 255));
        JLabelAnalisisDescriptivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelAnalisisDescriptivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/estadistica.png"))); // NOI18N
        JLabelAnalisisDescriptivo.setText("Analisis Descriptivo");
        JLabelAnalisisDescriptivo.setToolTipText("");
        JLabelAnalisisDescriptivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelAnalisisDescriptivoLayout = new javax.swing.GroupLayout(JPanelAnalisisDescriptivo);
        JPanelAnalisisDescriptivo.setLayout(JPanelAnalisisDescriptivoLayout);
        JPanelAnalisisDescriptivoLayout.setHorizontalGroup(
            JPanelAnalisisDescriptivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelAnalisisDescriptivo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelAnalisisDescriptivoLayout.setVerticalGroup(
            JPanelAnalisisDescriptivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelAnalisisDescriptivo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelAnalisisDescriptivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 40));

        JPanelAnalisisPredictivo.setBackground(new java.awt.Color(225, 173, 152));

        JLabelAnalisisPredictivo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelAnalisisPredictivo.setForeground(new java.awt.Color(255, 255, 255));
        JLabelAnalisisPredictivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelAnalisisPredictivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/statistic.png"))); // NOI18N
        JLabelAnalisisPredictivo.setText("Analisis Predictivo");
        JLabelAnalisisPredictivo.setToolTipText("");
        JLabelAnalisisPredictivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelAnalisisPredictivoLayout = new javax.swing.GroupLayout(JPanelAnalisisPredictivo);
        JPanelAnalisisPredictivo.setLayout(JPanelAnalisisPredictivoLayout);
        JPanelAnalisisPredictivoLayout.setHorizontalGroup(
            JPanelAnalisisPredictivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelAnalisisPredictivo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelAnalisisPredictivoLayout.setVerticalGroup(
            JPanelAnalisisPredictivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelAnalisisPredictivo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelAnalisisPredictivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 40));

        JPanelIngresoDatos.setBackground(new java.awt.Color(225, 173, 152));

        JLabelIngresoBD.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelIngresoBD.setForeground(new java.awt.Color(255, 255, 255));
        JLabelIngresoBD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelIngresoBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/almacenamiento-de-base-de-datos.png"))); // NOI18N
        JLabelIngresoBD.setText("Ingreso de BDs.");
        JLabelIngresoBD.setToolTipText("");
        JLabelIngresoBD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelIngresoDatosLayout = new javax.swing.GroupLayout(JPanelIngresoDatos);
        JPanelIngresoDatos.setLayout(JPanelIngresoDatosLayout);
        JPanelIngresoDatosLayout.setHorizontalGroup(
            JPanelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelIngresoBD, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelIngresoDatosLayout.setVerticalGroup(
            JPanelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelIngresoBD, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelIngresoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 40));

        JPanelProveedores.setBackground(new java.awt.Color(225, 173, 152));

        JLabelProveedor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelProveedor.setForeground(new java.awt.Color(255, 255, 255));
        JLabelProveedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/question.png"))); // NOI18N
        JLabelProveedor.setText("Por Asignar");
        JLabelProveedor.setToolTipText("");
        JLabelProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelProveedoresLayout = new javax.swing.GroupLayout(JPanelProveedores);
        JPanelProveedores.setLayout(JPanelProveedoresLayout);
        JPanelProveedoresLayout.setHorizontalGroup(
            JPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelProveedoresLayout.setVerticalGroup(
            JPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 40));

        JPanelMedidas.setBackground(new java.awt.Color(225, 173, 152));

        JLabelMedidas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelMedidas.setForeground(new java.awt.Color(255, 255, 255));
        JLabelMedidas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelMedidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/question.png"))); // NOI18N
        JLabelMedidas.setText("Por Asignar");
        JLabelMedidas.setToolTipText("");
        JLabelMedidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelMedidasLayout = new javax.swing.GroupLayout(JPanelMedidas);
        JPanelMedidas.setLayout(JPanelMedidasLayout);
        JPanelMedidasLayout.setHorizontalGroup(
            JPanelMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelMedidas, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelMedidasLayout.setVerticalGroup(
            JPanelMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelMedidas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelMedidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        JPanelConfig.setBackground(new java.awt.Color(225, 173, 152));

        JLabelConfig.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelConfig.setForeground(new java.awt.Color(255, 255, 255));
        JLabelConfig.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gear 2.png"))); // NOI18N
        JLabelConfig.setText("Configuracion");
        JLabelConfig.setToolTipText("");
        JLabelConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelConfigLayout = new javax.swing.GroupLayout(JPanelConfig);
        JPanelConfig.setLayout(JPanelConfigLayout);
        JPanelConfigLayout.setHorizontalGroup(
            JPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelConfigLayout.setVerticalGroup(
            JPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 40));

        JPanelUsers.setBackground(new java.awt.Color(225, 173, 152));

        JLabelUsers.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelUsers.setForeground(new java.awt.Color(255, 255, 255));
        JLabelUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/users.png"))); // NOI18N
        JLabelUsers.setText("Usuarios");
        JLabelUsers.setToolTipText("");
        JLabelUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelUsersLayout = new javax.swing.GroupLayout(JPanelUsers);
        JPanelUsers.setLayout(JPanelUsersLayout);
        JPanelUsersLayout.setHorizontalGroup(
            JPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelUsersLayout.setVerticalGroup(
            JPanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 40));

        JPanelSalir.setBackground(new java.awt.Color(225, 173, 152));

        JLabelSalir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JLabelSalir.setForeground(new java.awt.Color(255, 255, 255));
        JLabelSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLabelSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit.png"))); // NOI18N
        JLabelSalir.setText("Salir");
        JLabelSalir.setToolTipText("");
        JLabelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPanelSalirLayout = new javax.swing.GroupLayout(JPanelSalir);
        JPanelSalir.setLayout(JPanelSalirLayout);
        JPanelSalirLayout.setHorizontalGroup(
            JPanelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        JPanelSalirLayout.setVerticalGroup(
            JPanelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPanelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 540));

        jPanel2.setBackground(new java.awt.Color(209, 225, 163));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Agentes");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 200, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jPanel3.setBackground(new java.awt.Color(179, 163, 240));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 250, 35));

        btnUser.setText("Users");
        jPanel3.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/consultas.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Universidad Salesiana de Bolivia");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 410, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1100, 110));

        jPanel7.setBackground(new java.awt.Color(154, 192, 185));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 900, 60));

        TableRUs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Gestion", "Mes", "Aduana", "Depto", "Via", "Medio", "Pais", "Nandina", "Kilos", "Fob", "Adu", "CUSI", "Ident"
            }
        ));
        TableRUs.setComponentPopupMenu(jPopupAduana);
        jScrollPane1.setViewportView(TableRUs);
        if (TableRUs.getColumnModel().getColumnCount() > 0) {
            TableRUs.getColumnModel().getColumn(0).setPreferredWidth(8);
            TableRUs.getColumnModel().getColumn(1).setPreferredWidth(20);
            TableRUs.getColumnModel().getColumn(2).setPreferredWidth(12);
            TableRUs.getColumnModel().getColumn(3).setPreferredWidth(30);
            TableRUs.getColumnModel().getColumn(4).setPreferredWidth(25);
            TableRUs.getColumnModel().getColumn(5).setPreferredWidth(14);
            TableRUs.getColumnModel().getColumn(6).setPreferredWidth(25);
            TableRUs.getColumnModel().getColumn(7).setPreferredWidth(25);
            TableRUs.getColumnModel().getColumn(8).setPreferredWidth(120);
            TableRUs.getColumnModel().getColumn(9).setPreferredWidth(50);
            TableRUs.getColumnModel().getColumn(10).setPreferredWidth(50);
            TableRUs.getColumnModel().getColumn(11).setPreferredWidth(50);
            TableRUs.getColumnModel().getColumn(12).setPreferredWidth(50);
            TableRUs.getColumnModel().getColumn(13).setPreferredWidth(50);
        }

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 900, 420));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Bases de Datos Aduana Nacional"));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel17.setText("Gestion");
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel18.setText("Nandina");
        jPanel11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, -1, 30));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel19.setText("Mes");
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, 30));
        jPanel11.add(txtGestionRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 80, 20));
        jPanel11.add(txtNandinaRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, 20));

        btnNuevoRUs.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnNuevoRUs.setText("Nuevo");
        jPanel11.add(btnNuevoRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 70, 60));

        btnRegistrarRUs.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnRegistrarRUs.setText("Registrar");
        jPanel11.add(btnRegistrarRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 80, 30));

        btnModificarRUs.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnModificarRUs.setText("Modificar");
        jPanel11.add(btnModificarRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 80, 30));
        jPanel11.add(txtIdRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 20));
        jPanel11.add(txtBuscarRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 80, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Id");
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Buscar");
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("Aduana");
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setText("Depto");
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("Via");
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setText("Medio");
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setText("Pais");
        jPanel11.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel11.add(txtAduanaRus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, 20));
        jPanel11.add(txtDeptoRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 20));
        jPanel11.add(txtViaRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, 20));
        jPanel11.add(txtMedioRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 80, 20));
        jPanel11.add(txtPaisRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 80, 20));
        jPanel11.add(txtMesRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, -1));
        jPanel11.add(txtKilosRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 80, 20));
        jPanel11.add(txtFobRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, 20));
        jPanel11.add(txtAduRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, 20));
        jPanel11.add(txtCusiRus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 80, 20));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel20.setText("Kilos");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, -1, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel21.setText("Fob");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, -1, -1));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel22.setText("Adu");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel23.setText("Cusi");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel24.setText("Ident");
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        jPanel11.add(txtIdentRUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 80, 20));

        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 490));

        jTabbedPane12.addTab("tab1", jPanel7);

        jPanel8.setBackground(new java.awt.Color(209, 225, 163));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PaginadoUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(PaginadoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 760, 90));

        TableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Nombre", "Rol", "Caja", "Estado"
            }
        ));
        TableUser.setComponentPopupMenu(JPopupUsuarios);
        TableUser.setRowHeight(20);
        jScrollPane2.setViewportView(TableUser);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 760, 390));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Usuario");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("Nombre");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("Contrasena");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setText("Caja");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setText("Rol");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 30));
        jPanel10.add(txtUsuarioUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 180, 30));
        jPanel10.add(txtNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 180, 30));

        cbxCajaUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General" }));
        jPanel10.add(cbxCajaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 180, 30));

        cbxRolUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador" }));
        jPanel10.add(cbxRolUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 180, 30));

        btnNuevoUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNuevoUser.setText("Nuevo");
        jPanel10.add(btnNuevoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 420, 100, 30));

        btnRegistrarUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistrarUser.setText("Registrar");
        jPanel10.add(btnRegistrarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 420, 100, 30));

        btnModificarUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnModificarUser.setText("Modificar");
        jPanel10.add(btnModificarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 420, 100, 30));
        jPanel10.add(txtClaveUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 180, 30));
        jPanel10.add(txtIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 180, -1));
        jPanel10.add(txtBuscarUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 40, 40));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 490));

        jTabbedPane12.addTab("tab2", jPanel8);

        jPanel9.setBackground(new java.awt.Color(152, 204, 225));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane12.addTab("tab3", jPanel9);

        getContentPane().add(jTabbedPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 1100, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel JLabelAnalisisDescriptivo;
    public javax.swing.JLabel JLabelAnalisisPredictivo;
    public javax.swing.JLabel JLabelConfig;
    public javax.swing.JLabel JLabelInfoGeneral;
    public javax.swing.JLabel JLabelIngresoBD;
    public javax.swing.JLabel JLabelMedidas;
    public javax.swing.JLabel JLabelProveedor;
    public javax.swing.JLabel JLabelSalir;
    public javax.swing.JLabel JLabelUsers;
    public javax.swing.JMenuItem JMenuEliminarAduana;
    public javax.swing.JMenuItem JMenuEliminarUsers;
    public javax.swing.JMenuItem JMenuModificarAduana;
    public javax.swing.JMenuItem JMenuReingresarUser;
    public javax.swing.JPanel JPanelAnalisisDescriptivo;
    public javax.swing.JPanel JPanelAnalisisPredictivo;
    public javax.swing.JPanel JPanelConfig;
    public javax.swing.JPanel JPanelInfoGene;
    public javax.swing.JPanel JPanelIngresoDatos;
    public javax.swing.JPanel JPanelMedidas;
    public javax.swing.JPanel JPanelProveedores;
    public javax.swing.JPanel JPanelSalir;
    public javax.swing.JPanel JPanelUsers;
    private javax.swing.JPopupMenu JPopupUsuarios;
    private javax.swing.JPanel PaginadoUser;
    public javax.swing.JTable TableRUs;
    public javax.swing.JTable TableUser;
    public javax.swing.JButton btnModificarRUs;
    public javax.swing.JButton btnModificarUser;
    public javax.swing.JButton btnNuevoRUs;
    public javax.swing.JButton btnNuevoUser;
    public javax.swing.JButton btnRegistrarRUs;
    public javax.swing.JButton btnRegistrarUser;
    private javax.swing.JButton btnUser;
    public javax.swing.JComboBox<String> cbxCajaUser;
    public javax.swing.JComboBox<String> cbxRolUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPopupMenu jPopupAduana;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTabbedPane jTabbedPane12;
    public javax.swing.JTextField txtAduRUs;
    public javax.swing.JTextField txtAduanaRus;
    private javax.swing.JTextField txtBuscarProducto;
    public javax.swing.JTextField txtBuscarRUs;
    public javax.swing.JTextField txtBuscarUsers;
    public javax.swing.JPasswordField txtClaveUser;
    public javax.swing.JTextField txtCusiRus;
    public javax.swing.JTextField txtDeptoRUs;
    public javax.swing.JTextField txtFobRUs;
    public javax.swing.JTextField txtGestionRUs;
    public javax.swing.JTextField txtIdRUs;
    public javax.swing.JTextField txtIdUser;
    public javax.swing.JTextField txtIdentRUs;
    public javax.swing.JTextField txtKilosRUs;
    public javax.swing.JTextField txtMedioRUs;
    public javax.swing.JTextField txtMesRUs;
    public javax.swing.JTextField txtNandinaRUs;
    public javax.swing.JTextField txtNombreUser;
    public javax.swing.JTextField txtPaisRUs;
    public javax.swing.JTextField txtUsuarioUser;
    public javax.swing.JTextField txtViaRUs;
    // End of variables declaration//GEN-END:variables
}
