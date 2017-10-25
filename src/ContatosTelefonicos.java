import java.awt.Color;
import java.awt.MouseInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;


public class ContatosTelefonicos extends javax.swing.JFrame {
    

    Contato cont[] = new Contato[100];
    ContatoDAO dao = new ContatoDAO();
    ConnectionFactory conexao = new ConnectionFactory();
    Connection conn = conexao.getConnection();
    DefaultListModel<String> modelContatos = new DefaultListModel<>();
    DefaultListModel<String> modelPesquisa = new DefaultListModel<>();
    DefaultListModel<String> modelGrupos = new DefaultListModel<>();
    DefaultComboBoxModel modelCBGrupos = new DefaultComboBoxModel<>();
    
            
    boolean editOn = false;
    boolean apagarOn = false;
    int contatoSelecionado = 0;
    int i = -1;
   
    public ContatosTelefonicos() {
        
        initComponents();
        jPanel2.setVisible(false);
        this.selecionaDados(conn);
        ArrayList listaDeContatos = new ArrayList();
        listaDeContatos = dao.selecionaDados(conn);
        //jList1.setModel(modelContatos);
        i = listaDeContatos.size();
        /*
        for(int j = 0; j < listaDeContatos.size(); j++)  {
            modelContatos.addElement(listaDeContatos.get(j).toString());
            cont[j].setId(j);
            //cont[j].setNome(dao.selecionaNome(conn, j).toString()); 
            //cont[j].setNumero(dao.selecionaNumero(conn, j);
            //cont[j].setEmail(dao.selecionaEmail(conn, j)); 
            //cont[j].setGrupo(dao.selecionaGrupo(conn, j));
        }*/
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenuMais = new javax.swing.JPopupMenu();
        menuItemApagar = new javax.swing.JMenuItem();
        menuItemSobre = new javax.swing.JMenuItem();
        panelContato = new javax.swing.JPanel();
        panelSuperior1 = new javax.swing.JPanel();
        labelContatoContato = new javax.swing.JLabel();
        buttonVoltarPrincipal = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        panelDesign1 = new javax.swing.JPanel();
        labelNumero = new javax.swing.JLabel();
        labelNumeroContato = new javax.swing.JLabel();
        panelEmailContato = new javax.swing.JPanel();
        labelNumero1 = new javax.swing.JLabel();
        labelEmailContato = new javax.swing.JLabel();
        labelNumero2 = new javax.swing.JLabel();
        labelGrupoContato = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelPrincipal = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        buttonMais = new javax.swing.JButton();
        buttonGrupos = new javax.swing.JButton();
        labelContatos = new javax.swing.JLabel();
        checkBoxApagar = new javax.swing.JCheckBox();
        textFieldPesquisar = new javax.swing.JTextField();
        buttonNovoContato = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPrincipal = new javax.swing.JList<>(modelContatos);
        jScrollPane3 = new javax.swing.JScrollPane();
        listPesquisa = new javax.swing.JList<>(modelPesquisa);
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panelAddContato = new javax.swing.JPanel();
        panelAddContatoSuperior = new javax.swing.JPanel();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        textFieldNome = new javax.swing.JTextField();
        textFieldNumero = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        textFieldEmail = new javax.swing.JTextField();
        comboBoxGrupos = new javax.swing.JComboBox<>();
        panelGrupos = new javax.swing.JPanel();
        panelSuperior2 = new javax.swing.JPanel();
        labelContatos1 = new javax.swing.JLabel();
        buttonVoltarPrincipal1 = new javax.swing.JButton();
        panelDesign2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonAddGrupo = new javax.swing.JButton();
        buttonApagarGrupo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listGrupos = new javax.swing.JList<>();
        panelAddGrupo = new javax.swing.JPanel();
        panelAddContato1 = new javax.swing.JPanel();
        panelAddContatoSuperior1 = new javax.swing.JPanel();
        buttonCancelarGrupo = new javax.swing.JButton();
        buttonSalvarGrupo = new javax.swing.JButton();
        textFieldNomeGrupo = new javax.swing.JTextField();
        panelSobre = new javax.swing.JPanel();
        panelSuperior3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();

        popupMenuMais.setBackground(Color.WHITE);
        popupMenuMais.setForeground(new java.awt.Color(255, 255, 255));
        popupMenuMais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        popupMenuMais.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        popupMenuMais.setInvoker(buttonMais);
        popupMenuMais.setRequestFocusEnabled(false);

        menuItemApagar.setText("Apagar");
        menuItemApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItemApagarMouseEntered(evt);
            }
        });
        menuItemApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemApagarActionPerformed(evt);
            }
        });
        popupMenuMais.add(menuItemApagar);

        menuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machine-translation-info-icon.png"))); // NOI18N
        menuItemSobre.setText("Sobre");
        menuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSobreActionPerformed(evt);
            }
        });
        popupMenuMais.add(menuItemSobre);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contatos");
        setName("framePrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(260, 385));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelContato.setBackground(new java.awt.Color(255, 255, 255));
        panelContato.setPreferredSize(new java.awt.Dimension(255, 385));
        panelContato.setVisible(false);

        panelSuperior1.setBackground(new java.awt.Color(0, 102, 102));

        labelContatoContato.setBackground(new java.awt.Color(255, 255, 255));
        labelContatoContato.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        labelContatoContato.setForeground(new java.awt.Color(238, 242, 241));
        labelContatoContato.setText("Contato Teste");

        buttonVoltarPrincipal.setBackground(new java.awt.Color(0, 102, 102));
        buttonVoltarPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LeftArrow.png"))); // NOI18N
        buttonVoltarPrincipal.setToolTipText("");
        buttonVoltarPrincipal.setBorder(null);
        buttonVoltarPrincipal.setContentAreaFilled(false);
        buttonVoltarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarPrincipalActionPerformed(evt);
            }
        });

        buttonEditar.setBackground(new java.awt.Color(0, 102, 102));
        buttonEditar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonEditar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEditar.setText("Editar");
        buttonEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonEditar.setBorderPainted(false
        );
        buttonEditar.setContentAreaFilled(false);
        buttonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonEditarMouseExited(evt);
            }
        });
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Nome:");

        jLabel9.setText("Telefone:");

        jLabel10.setText("Email:");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelSuperior1Layout = new javax.swing.GroupLayout(panelSuperior1);
        panelSuperior1.setLayout(panelSuperior1Layout);
        panelSuperior1Layout.setHorizontalGroup(
            panelSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperior1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperior1Layout.createSequentialGroup()
                        .addComponent(labelContatoContato)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSuperior1Layout.createSequentialGroup()
                        .addComponent(buttonVoltarPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        panelSuperior1Layout.setVerticalGroup(
            panelSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperior1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperior1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 203, Short.MAX_VALUE))
                    .addGroup(panelSuperior1Layout.createSequentialGroup()
                        .addGroup(panelSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonVoltarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelContatoContato)))
                .addContainerGap())
        );

        panelDesign1.setBackground(new java.awt.Color(234, 234, 234));

        labelNumero.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 10)); // NOI18N
        labelNumero.setForeground(new java.awt.Color(34, 34, 34));
        labelNumero.setText("Nº de telefone");

        labelNumeroContato.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        labelNumeroContato.setText("Numero Contato Teste");

        javax.swing.GroupLayout panelDesign1Layout = new javax.swing.GroupLayout(panelDesign1);
        panelDesign1.setLayout(panelDesign1Layout);
        panelDesign1Layout.setHorizontalGroup(
            panelDesign1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesign1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDesign1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDesign1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelNumeroContato, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelNumero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDesign1Layout.setVerticalGroup(
            panelDesign1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesign1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNumeroContato)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelEmailContato.setBackground(new java.awt.Color(234, 234, 234));

        labelNumero1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 10)); // NOI18N
        labelNumero1.setForeground(new java.awt.Color(34, 34, 34));
        labelNumero1.setText("E-mail");

        labelEmailContato.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        labelEmailContato.setText("Email teste");

        labelNumero2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 10)); // NOI18N
        labelNumero2.setForeground(new java.awt.Color(34, 34, 34));
        labelNumero2.setText("Grupo");

        labelGrupoContato.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        labelGrupoContato.setText("Grupo Teste");

        javax.swing.GroupLayout panelEmailContatoLayout = new javax.swing.GroupLayout(panelEmailContato);
        panelEmailContato.setLayout(panelEmailContatoLayout);
        panelEmailContatoLayout.setHorizontalGroup(
            panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmailContatoLayout.createSequentialGroup()
                        .addGroup(panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNumero1)
                            .addComponent(labelNumero2))
                        .addGroup(panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEmailContatoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(panelEmailContatoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelGrupoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmailContatoLayout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
        );
        panelEmailContatoLayout.setVerticalGroup(
            panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmailContatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailContato)
                    .addComponent(labelNumero1))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero2)
                    .addComponent(labelGrupoContato))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout panelContatoLayout = new javax.swing.GroupLayout(panelContato);
        panelContato.setLayout(panelContatoLayout);
        panelContatoLayout.setHorizontalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDesign1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEmailContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelContatoLayout.setVerticalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addComponent(panelSuperior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDesign1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(300, 385));

        panelSuperior.setBackground(new java.awt.Color(0, 204, 153));

        buttonMais.setBackground(new java.awt.Color(0, 154, 115));
        buttonMais.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonMais.setForeground(new java.awt.Color(0, 102, 102));
        buttonMais.setText("Mais");
        buttonMais.setAlignmentX(MouseInfo.getPointerInfo().getLocation().x);
        buttonMais.setAlignmentY(MouseInfo.getPointerInfo().getLocation().y);
        buttonMais.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        buttonMais.setBorderPainted(false);
        buttonMais.setComponentPopupMenu(popupMenuMais);
        buttonMais.setContentAreaFilled(false);
        buttonMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMaisMouseExited(evt);
            }
        });
        buttonMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMaisActionPerformed(evt);
            }
        });

        buttonGrupos.setBackground(new java.awt.Color(0, 154, 115));
        buttonGrupos.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonGrupos.setForeground(new java.awt.Color(0, 102, 102));
        buttonGrupos.setText("Grupos");
        buttonGrupos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonGrupos.setBorderPainted(false
        );
        buttonGrupos.setContentAreaFilled(false);
        buttonGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonGruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonGruposMouseExited(evt);
            }
        });
        buttonGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGruposActionPerformed(evt);
            }
        });

        labelContatos.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        labelContatos.setForeground(new java.awt.Color(255, 255, 255));
        labelContatos.setText("Contatos");

        checkBoxApagar.setBackground(new java.awt.Color(0, 204, 153));
        checkBoxApagar.setFont(new java.awt.Font("Nirmala UI", 1, 9)); // NOI18N
        checkBoxApagar.setText("Todos");
        checkBoxApagar.setVisible(false);

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelContatos)
                .addGap(24, 24, 24)
                .addComponent(buttonGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBoxApagar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(buttonGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMais)
                    .addComponent(labelContatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textFieldPesquisar.setForeground(new java.awt.Color(153, 153, 153));
        textFieldPesquisar.setText("Pesquisar");
        textFieldPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldPesquisar.setSelectionColor(Color.WHITE);
        textFieldPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldPesquisarMouseClicked(evt);
            }
        });
        textFieldPesquisar.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                textFieldPesquisarInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        textFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPesquisarActionPerformed(evt);
            }
        });
        textFieldPesquisar.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                textFieldPesquisarVetoableChange(evt);
            }
        });

        buttonNovoContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.jpg"))); // NOI18N
        buttonNovoContato.setContentAreaFilled(false);
        buttonNovoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoContatoActionPerformed(evt);
            }
        });

        listPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        listPrincipal.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        listPrincipal.setSelectionBackground(new java.awt.Color(255, 255, 255));
        listPrincipal.setSelectionForeground(new java.awt.Color(0, 0, 0));
        listPrincipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listPrincipalFocusGained(evt);
            }
        });
        listPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPrincipalMouseClicked(evt);
            }
        });
        listPrincipal.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPrincipalValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listPrincipal);

        listPesquisa.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16));
        listPesquisa.setSelectionBackground(Color.WHITE);
        listPesquisa.setSelectionForeground(new java.awt.Color(0, 0, 0));
        listPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPesquisaMouseClicked(evt);
            }
        });
        listPesquisa.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPesquisaValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listPesquisa);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldPesquisar)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonNovoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(textFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonNovoContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelAddContato.setBackground(new java.awt.Color(255, 255, 255));
        panelAddContato.setPreferredSize(new java.awt.Dimension(255, 385));
        panelAddContato.setVisible(false);

        panelAddContatoSuperior.setBackground(new java.awt.Color(0, 204, 153));

        buttonCancelar.setBackground(new java.awt.Color(0, 204, 153));
        buttonCancelar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(0, 102, 102));
        buttonCancelar.setText("CANCELAR");
        buttonCancelar.setContentAreaFilled(false);
        buttonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCancelarMouseExited(evt);
            }
        });
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonSalvar.setBackground(new java.awt.Color(0, 204, 153));
        buttonSalvar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        buttonSalvar.setForeground(new java.awt.Color(0, 102, 102));
        buttonSalvar.setText("SALVAR");
        buttonSalvar.setContentAreaFilled(false);
        buttonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSalvarMouseExited(evt);
            }
        });
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddContatoSuperiorLayout = new javax.swing.GroupLayout(panelAddContatoSuperior);
        panelAddContatoSuperior.setLayout(panelAddContatoSuperiorLayout);
        panelAddContatoSuperiorLayout.setHorizontalGroup(
            panelAddContatoSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContatoSuperiorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(buttonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSalvar)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelAddContatoSuperiorLayout.setVerticalGroup(
            panelAddContatoSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContatoSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddContatoSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonSalvar))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        textFieldNome.setForeground(new java.awt.Color(153, 153, 153));
        textFieldNome.setText("Nome");
        textFieldNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNomeMouseClicked(evt);
            }
        });
        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        textFieldNumero.setForeground(new java.awt.Color(153, 153, 153));
        textFieldNumero.setText("Número");
        textFieldNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNumeroMouseClicked(evt);
            }
        });
        textFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        textFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        textFieldEmail.setText("E-mail");
        textFieldEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldEmailMouseClicked(evt);
            }
        });
        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        comboBoxGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxGruposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddContatoLayout = new javax.swing.GroupLayout(panelAddContato);
        panelAddContato.setLayout(panelAddContatoLayout);
        panelAddContatoLayout.setHorizontalGroup(
            panelAddContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddContatoSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelAddContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddContatoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldNome))
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldNumero)
                    .addComponent(comboBoxGrupos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAddContatoLayout.setVerticalGroup(
            panelAddContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContatoLayout.createSequentialGroup()
                .addComponent(panelAddContatoSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        panelGrupos.setBackground(new java.awt.Color(255, 255, 255));
        panelGrupos.setPreferredSize(new java.awt.Dimension(255, 385));
        panelGrupos.setVisible(false);

        panelSuperior2.setBackground(new java.awt.Color(0, 204, 153));

        labelContatos1.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        labelContatos1.setForeground(new java.awt.Color(255, 255, 255));
        labelContatos1.setText("Grupos");

        buttonVoltarPrincipal1.setBackground(new java.awt.Color(0, 102, 102));
        buttonVoltarPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LeftArrow.png"))); // NOI18N
        buttonVoltarPrincipal1.setToolTipText("");
        buttonVoltarPrincipal1.setBorder(null);
        buttonVoltarPrincipal1.setContentAreaFilled(false);
        buttonVoltarPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarPrincipal1ActionPerformed(evt);
            }
        });

        panelDesign2.setBackground(new java.awt.Color(234, 234, 234));
        panelDesign2.setPreferredSize(new java.awt.Dimension(255, 40));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 10)); // NOI18N
        jLabel1.setText("Grupos integrados");

        javax.swing.GroupLayout panelDesign2Layout = new javax.swing.GroupLayout(panelDesign2);
        panelDesign2.setLayout(panelDesign2Layout);
        panelDesign2Layout.setHorizontalGroup(
            panelDesign2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesign2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        panelDesign2Layout.setVerticalGroup(
            panelDesign2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesign2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonAddGrupo.setBackground(new java.awt.Color(0, 154, 115));
        buttonAddGrupo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonAddGrupo.setForeground(new java.awt.Color(0, 102, 102));
        buttonAddGrupo.setText("Adicionar");
        buttonAddGrupo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonAddGrupo.setBorderPainted(false
        );
        buttonAddGrupo.setContentAreaFilled(false);
        buttonAddGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddGrupoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddGrupoMouseExited(evt);
            }
        });
        buttonAddGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddGrupoActionPerformed(evt);
            }
        });

        buttonApagarGrupo.setBackground(new java.awt.Color(0, 154, 115));
        buttonApagarGrupo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonApagarGrupo.setForeground(new java.awt.Color(0, 102, 102));
        buttonApagarGrupo.setText("Apagar");
        buttonApagarGrupo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonApagarGrupo.setBorderPainted(false
        );
        buttonApagarGrupo.setContentAreaFilled(false);
        buttonApagarGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonApagarGrupoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonApagarGrupoMouseExited(evt);
            }
        });
        buttonApagarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApagarGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSuperior2Layout = new javax.swing.GroupLayout(panelSuperior2);
        panelSuperior2.setLayout(panelSuperior2Layout);
        panelSuperior2Layout.setHorizontalGroup(
            panelSuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperior2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonVoltarPrincipal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelContatos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(buttonAddGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonApagarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(panelDesign2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelSuperior2Layout.setVerticalGroup(
            panelSuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperior2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelSuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonVoltarPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelContatos1)
                        .addComponent(buttonAddGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonApagarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDesign2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        listGrupos.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        listGrupos.setModel(modelGrupos);
        modelGrupos.addElement("Meus Contatos");
        modelGrupos.addElement("Contatos de emergência");
        modelGrupos.addElement("Colegas de trabalho");
        modelGrupos.addElement("Família");
        modelGrupos.addElement("Amigos");
        listGrupos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listGruposValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listGrupos);

        javax.swing.GroupLayout panelGruposLayout = new javax.swing.GroupLayout(panelGrupos);
        panelGrupos.setLayout(panelGruposLayout);
        panelGruposLayout.setHorizontalGroup(
            panelGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelGruposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGruposLayout.setVerticalGroup(
            panelGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGruposLayout.createSequentialGroup()
                .addComponent(panelSuperior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        panelAddGrupo.setPreferredSize(new java.awt.Dimension(255, 390));
        panelAddGrupo.setVisible(false);

        panelAddContato1.setBackground(new java.awt.Color(255, 255, 255));
        panelAddContato1.setPreferredSize(new java.awt.Dimension(255, 385));
        panelAddContato.setVisible(false);

        panelAddContatoSuperior1.setBackground(new java.awt.Color(0, 204, 153));

        buttonCancelarGrupo.setBackground(new java.awt.Color(0, 204, 153));
        buttonCancelarGrupo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        buttonCancelarGrupo.setForeground(new java.awt.Color(0, 102, 102));
        buttonCancelarGrupo.setText("CANCELAR");
        buttonCancelarGrupo.setContentAreaFilled(false);
        buttonCancelarGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCancelarGrupoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCancelarGrupoMouseExited(evt);
            }
        });
        buttonCancelarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarGrupoActionPerformed(evt);
            }
        });

        buttonSalvarGrupo.setBackground(new java.awt.Color(0, 204, 153));
        buttonSalvarGrupo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        buttonSalvarGrupo.setForeground(new java.awt.Color(0, 102, 102));
        buttonSalvarGrupo.setText("SALVAR");
        buttonSalvarGrupo.setContentAreaFilled(false);
        buttonSalvarGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSalvarGrupoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSalvarGrupoMouseExited(evt);
            }
        });
        buttonSalvarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddContatoSuperior1Layout = new javax.swing.GroupLayout(panelAddContatoSuperior1);
        panelAddContatoSuperior1.setLayout(panelAddContatoSuperior1Layout);
        panelAddContatoSuperior1Layout.setHorizontalGroup(
            panelAddContatoSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContatoSuperior1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(buttonCancelarGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSalvarGrupo)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelAddContatoSuperior1Layout.setVerticalGroup(
            panelAddContatoSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContatoSuperior1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddContatoSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelarGrupo)
                    .addComponent(buttonSalvarGrupo))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        textFieldNomeGrupo.setForeground(new java.awt.Color(153, 153, 153));
        textFieldNomeGrupo.setText("Nome do grupo");
        textFieldNomeGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNomeGrupoMouseClicked(evt);
            }
        });
        textFieldNomeGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddContato1Layout = new javax.swing.GroupLayout(panelAddContato1);
        panelAddContato1.setLayout(panelAddContato1Layout);
        panelAddContato1Layout.setHorizontalGroup(
            panelAddContato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddContatoSuperior1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddContato1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldNomeGrupo)
                .addContainerGap())
        );
        panelAddContato1Layout.setVerticalGroup(
            panelAddContato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContato1Layout.createSequentialGroup()
                .addComponent(panelAddContatoSuperior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNomeGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAddGrupoLayout = new javax.swing.GroupLayout(panelAddGrupo);
        panelAddGrupo.setLayout(panelAddGrupoLayout);
        panelAddGrupoLayout.setHorizontalGroup(
            panelAddGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddGrupoLayout.createSequentialGroup()
                .addComponent(panelAddContato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAddGrupoLayout.setVerticalGroup(
            panelAddGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddGrupoLayout.createSequentialGroup()
                .addComponent(panelAddContato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        panelSobre.setBackground(new java.awt.Color(255, 255, 255));
        panelSobre.setPreferredSize(new java.awt.Dimension(255, 390));
        panelSobre.setVisible(false);

        panelSuperior3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Contatos Telefônicos™");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Programa desenvolvido por:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("- Caio Vinícius Santos Lopes");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("- Leonardo Henriques da Luz Costa");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("- Luis Filipe Oliveira Sousa");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("2017");

        javax.swing.GroupLayout panelSuperior3Layout = new javax.swing.GroupLayout(panelSuperior3);
        panelSuperior3.setLayout(panelSuperior3Layout);
        panelSuperior3Layout.setHorizontalGroup(
            panelSuperior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperior3Layout.createSequentialGroup()
                .addGroup(panelSuperior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperior3Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel7))
                    .addGroup(panelSuperior3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(panelSuperior3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelSuperior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(panelSuperior3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelSuperior3Layout.setVerticalGroup(
            panelSuperior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperior3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        buttonVoltar.setBackground(new java.awt.Color(255, 255, 255));
        buttonVoltar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonVoltar.setForeground(new java.awt.Color(0, 102, 102));
        buttonVoltar.setText("Voltar");
        buttonVoltar.setAlignmentX(MouseInfo.getPointerInfo().getLocation().x);
        buttonVoltar.setAlignmentY(MouseInfo.getPointerInfo().getLocation().y);
        buttonVoltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        buttonVoltar.setBorderPainted(false);
        buttonVoltar.setComponentPopupMenu(popupMenuMais);
        buttonVoltar.setContentAreaFilled(false);
        buttonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonVoltarMouseExited(evt);
            }
        });
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSobreLayout = new javax.swing.GroupLayout(panelSobre);
        panelSobre.setLayout(panelSobreLayout);
        panelSobreLayout.setHorizontalGroup(
            panelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelSobreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSobreLayout.setVerticalGroup(
            panelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSobreLayout.createSequentialGroup()
                .addComponent(panelSuperior3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(buttonVoltar)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(panelAddContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 15, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(panelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 15, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(panelGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 15, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(panelAddGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 15, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(panelSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 15, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(panelAddContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(panelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(panelGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelAddGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void panelAddContatoDefault() {
        textFieldNome.setText("Nome");
        textFieldNumero.setText("Numero");
        textFieldEmail.setText("Email");
        comboBoxGrupos.removeAllItems();
        textFieldNome.setForeground(new Color(153,153,153));
        textFieldNumero.setForeground(new Color(153,153,153));
        textFieldEmail.setForeground(new Color(153,153,153));
    }
    
    private void panelPrincipalDefault() {
        textFieldPesquisar.setText("Pesquisar");
        textFieldPesquisar.setForeground(new Color(153,153,153));
        modelPesquisa.removeAllElements();
    }
    
    private void gerarGrupos() {
        
        comboBoxGrupos.setModel(modelCBGrupos);
        for(int j = 0; j < modelGrupos.getSize(); j++) {
            modelCBGrupos.addElement(modelGrupos.getElementAt(j));
        }
    }
    
    private void menuItemApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemApagarActionPerformed
        // TODO add your handling code here:
        labelContatos.setText("Selecionar");
        labelContatos.setFont(new java.awt.Font("Utsaah", 1, 21));
        buttonGrupos.setText("Cancelar");
        buttonMais.setText("Apagar");
        apagarOn = true;
        checkBoxApagar.setVisible(true);
        buttonNovoContato.setVisible(false);
    }//GEN-LAST:event_menuItemApagarActionPerformed

    private void menuItemApagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemApagarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemApagarMouseEntered

    private void textFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPesquisarActionPerformed
        // TODO add your handling code here:
        modelPesquisa.removeAllElements();
        
        for(int j = 0; j <= i; j++) {
            if(textFieldPesquisar.getText().equalsIgnoreCase(cont[j].getNome())) {
                modelPesquisa.addElement(cont[j].getNome());
                contatoSelecionado = j;
            }       
        }
        
        if(modelPesquisa.getSize() == 0)
                modelPesquisa.addElement("Nenhum resultado");
    }//GEN-LAST:event_textFieldPesquisarActionPerformed

    private void textFieldPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldPesquisarMouseClicked
        // TODO add your handling code here:
        textFieldPesquisar.setText("");
        textFieldPesquisar.setForeground(Color.BLACK);
    }//GEN-LAST:event_textFieldPesquisarMouseClicked

    private void buttonGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGruposActionPerformed
        // TODO add your handling code here:
        if(apagarOn) {
            buttonGrupos.setText("Grupos");
            buttonMais.setText("Mais");
            labelContatos.setText("Contatos");
            labelContatos.setFont(new java.awt.Font("Utsaah", 1, 24));
            checkBoxApagar.setVisible(false);
            apagarOn = false;
            buttonNovoContato.setVisible(true);
        }
        else {
            panelPrincipal.setVisible(false);
            panelPrincipalDefault();
            panelGrupos.setVisible(true);
        }
        
    }//GEN-LAST:event_buttonGruposActionPerformed

    private void buttonGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGruposMouseExited
        // TODO add your handling code here:
        buttonGrupos.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonGruposMouseExited

    private void buttonGruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGruposMouseEntered
        // TODO add your handling code here:
        buttonGrupos.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonGruposMouseEntered

    private void buttonMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMaisActionPerformed
        // TODO add your handling code here:
        if(apagarOn) {
            if(checkBoxApagar.isSelected()) {
                for(int j = 0; j <= i; j++)
                    dao.deletaDados(conn, cont[j]);
                
                modelContatos.removeAllElements();
                i = -1;
            } 
            else {
                contatoSelecionado = jList1.getSelectedIndex();
               
                modelContatos.removeElementAt(contatoSelecionado);
                i--;
            }
        }
        else {
            int mouseY = MouseInfo.getPointerInfo().getLocation().y;
            int mouseX = MouseInfo.getPointerInfo().getLocation().x;

            popupMenuMais.setVisible(true);
            popupMenuMais.setLocation(mouseX, mouseY);
        }
    }//GEN-LAST:event_buttonMaisActionPerformed

    private void buttonMaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMaisMouseExited
        // TODO add your handling code here:
        buttonMais.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonMaisMouseExited

    private void buttonMaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMaisMouseEntered
        // TODO add your handling code here:
        buttonMais.setForeground(Color.WHITE);

    }//GEN-LAST:event_buttonMaisMouseEntered

    private void buttonNovoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoContatoActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(false);
        panelPrincipalDefault();
        panelAddContato.setVisible(true);
        
        gerarGrupos();
        
//        bd.setId(bd.getId() + 1);
        //System.out.println("I = " + i);
    }//GEN-LAST:event_buttonNovoContatoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
        if(!editOn) {
            //Usando uma classe separada para armazenar os contatos
            i++;
            
            cont[i] = new Contato();
            cont[i].setId(i);
            cont[i].setNome(textFieldNome.getText()); 
            cont[i].setNumero(textFieldNumero.getText());
            cont[i].setEmail(textFieldEmail.getText()); 
            cont[i].setGrupo(comboBoxGrupos.getSelectedItem().toString());
            dao.criaTabela(conn);
            dao.insereDados(conn, cont[i]);
            
            modelContatos.addElement(cont[i].getNome());
            labelContatoContato.setText(cont[i].getNome());
            labelNumeroContato.setText(cont[i].getNumero());
            labelEmailContato.setText(cont[i].getEmail());
            labelGrupoContato.setText(cont[i].getGrupo());
            
        }
        else {
            cont[contatoSelecionado].setNome(textFieldNome.getText()); 
            cont[contatoSelecionado].setNumero(textFieldNumero.getText());
            cont[contatoSelecionado].setEmail(textFieldEmail.getText()); 
            cont[contatoSelecionado].setGrupo(comboBoxGrupos.getSelectedItem().toString());
            
            dao.alteraDados(conn,cont[contatoSelecionado]);
            
            modelContatos.setElementAt(textFieldNome.getText(), contatoSelecionado);
            labelContatoContato.setText(cont[contatoSelecionado].getNome());
            labelNumeroContato.setText(cont[contatoSelecionado].getNumero());
            labelEmailContato.setText(cont[contatoSelecionado].getEmail());
            labelGrupoContato.setText(cont[contatoSelecionado].getGrupo());
        }

        panelAddContatoDefault();
        editOn = false;
        
        panelAddContato.setVisible(false);
        panelContato.setVisible(true);
        //System.out.println("I = " + bd.getId());
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarMouseEntered
        // TODO add your handling code here:
        buttonCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonCancelarMouseEntered

    private void buttonSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarMouseEntered
        // TODO add your handling code here:
        buttonSalvar.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonSalvarMouseEntered

    private void buttonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarMouseExited
        // TODO add your handling code here:
        buttonCancelar.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonCancelarMouseExited

    private void buttonSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarMouseExited
        // TODO add your handling code here:
        buttonSalvar.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonSalvarMouseExited

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
        if(!editOn)
            i--;
        
        panelPrincipal.setVisible(true);
        panelAddContato.setVisible(false);
        
        panelAddContatoDefault();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void textFieldNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNomeMouseClicked
        // TODO add your handling code here:
        textFieldNome.setText("");
        textFieldNome.setForeground(Color.BLACK);
    }//GEN-LAST:event_textFieldNomeMouseClicked


    private void textFieldNumeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNumeroMouseClicked
        // TODO add your handling code here:
        textFieldNumero.setText("");
        textFieldNumero.setForeground(Color.BLACK);
    }//GEN-LAST:event_textFieldNumeroMouseClicked

    private void buttonVoltarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarPrincipalActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(true);
        panelContato.setVisible(false);
        modelPesquisa.removeAllElements();
        textFieldPesquisar.setText("Pesquisar");
        textFieldPesquisar.setForeground(new Color(153,153,153));
        listPrincipal.updateUI();
        panelPrincipal.updateUI();
        

    }//GEN-LAST:event_buttonVoltarPrincipalActionPerformed

    private void buttonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarMouseEntered

    private void buttonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarMouseExited

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(true);

        
        
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void textFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroActionPerformed

    private void buttonVoltarPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarPrincipal1ActionPerformed
        // TODO add your handling code here:
        panelGrupos.setVisible(false);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_buttonVoltarPrincipal1ActionPerformed

    private void textFieldEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldEmailMouseClicked
        // TODO add your handling code here:
        textFieldEmail.setText("");
        textFieldEmail.setForeground(Color.BLACK);
    }//GEN-LAST:event_textFieldEmailMouseClicked

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void comboBoxGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxGruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxGruposActionPerformed

    private void buttonAddGrupoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddGrupoMouseEntered
        // TODO add your handling code here:
        buttonAddGrupo.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonAddGrupoMouseEntered

    private void buttonAddGrupoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddGrupoMouseExited
        // TODO add your handling code here:
        buttonAddGrupo.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonAddGrupoMouseExited

    private void buttonAddGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddGrupoActionPerformed
        // TODO add your handling code here:
        panelGrupos.setVisible(false);
        panelAddGrupo.setVisible(true);
        
    }//GEN-LAST:event_buttonAddGrupoActionPerformed

    private void buttonApagarGrupoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonApagarGrupoMouseEntered
        // TODO add your handling code here:
        buttonApagarGrupo.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonApagarGrupoMouseEntered

    private void buttonApagarGrupoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonApagarGrupoMouseExited
        // TODO add your handling code here:
        buttonApagarGrupo.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonApagarGrupoMouseExited

    private void buttonApagarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApagarGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonApagarGrupoActionPerformed

    private void buttonCancelarGrupoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarGrupoMouseEntered
        // TODO add your handling code here:
        buttonCancelarGrupo.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonCancelarGrupoMouseEntered

    private void buttonCancelarGrupoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarGrupoMouseExited
        // TODO add your handling code here:
        buttonCancelarGrupo.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonCancelarGrupoMouseExited

    private void buttonCancelarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarGrupoActionPerformed
        // TODO add your handling code here:
        panelAddGrupo.setVisible(false);
        panelGrupos.setVisible(true);        
        textFieldNomeGrupo.setText("Nome do grupo");
        textFieldNomeGrupo.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_buttonCancelarGrupoActionPerformed

    private void buttonSalvarGrupoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarGrupoMouseEntered
        // TODO add your handling code here:
        buttonSalvarGrupo.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonSalvarGrupoMouseEntered

    private void buttonSalvarGrupoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarGrupoMouseExited
        // TODO add your handling code here:
        buttonSalvarGrupo.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonSalvarGrupoMouseExited

    private void buttonSalvarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarGrupoActionPerformed
        // TODO add your handling code here:
        modelGrupos.addElement(textFieldNomeGrupo.getText());
        
        panelAddGrupo.setVisible(false);
        panelGrupos.setVisible(true);
        
        textFieldNomeGrupo.setText("Nome do grupo");
        textFieldNomeGrupo.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_buttonSalvarGrupoActionPerformed

    private void textFieldNomeGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNomeGrupoMouseClicked
        // TODO add your handling code here:
        textFieldNomeGrupo.setText("");
        textFieldNomeGrupo.setForeground(Color.BLACK);
    }//GEN-LAST:event_textFieldNomeGrupoMouseClicked

    private void textFieldNomeGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeGrupoActionPerformed

    private void textFieldPesquisarInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textFieldPesquisarInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPesquisarInputMethodTextChanged

    private void textFieldPesquisarVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_textFieldPesquisarVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPesquisarVetoableChange

    private void listPesquisaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPesquisaValueChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_listPesquisaValueChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void menuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSobreActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(false);
        panelPrincipalDefault();
        panelSobre.setVisible(true);
    }//GEN-LAST:event_menuItemSobreActionPerformed

    private void buttonVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarMouseEntered
        // TODO add your handling code here:
        buttonVoltar.setForeground(Color.BLACK);
    }//GEN-LAST:event_buttonVoltarMouseEntered

    private void buttonVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarMouseExited
        // TODO add your handling code here:
        buttonVoltar.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonVoltarMouseExited

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(true);
        panelSobre.setVisible(false);
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void listGruposValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listGruposValueChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_listGruposValueChanged

    private void listPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPesquisaMouseClicked
        // TODO add your handling code here:
        String nomeInserido = modelPesquisa.firstElement();
        
        if(!(nomeInserido.equalsIgnoreCase("Nenhum resultado"))) {
            int j;
            
            for(j = 0; j <= i; j++)
                if(nomeInserido.equalsIgnoreCase(cont[j].getNome()))
                    contatoSelecionado = j;
            
            labelContatoContato.setText(cont[contatoSelecionado].getNome());
            labelNumeroContato.setText(cont[contatoSelecionado].getNumero());
            labelEmailContato.setText(cont[contatoSelecionado].getEmail());
            labelGrupoContato.setText(cont[contatoSelecionado].getGrupo());
            
            panelPrincipal.setVisible(false);
            panelPrincipalDefault();
            panelContato.setVisible(true);
        }  
    }//GEN-LAST:event_listPesquisaMouseClicked

    private void listPrincipalValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPrincipalValueChanged
        // TODO add your handling code here:
        String selecionadocerto = listPrincipal.getSelectedValue().toString();
        System.out.println(selecionadocerto);
        
            panelPrincipal.setVisible(false);
            panelPrincipalDefault();
            panelContato.setVisible(true);
                     
        String sql = "SELECT *"
                     + "FROM contato Where nome = '"+selecionadocerto+"' ;";
        
        
        
        try{
            
            Statement comandoSql = conn.createStatement();
            ResultSet rs  =comandoSql.executeQuery(sql);
                                 
                       
            while(rs.next()){
                String id = rs.getString("id");
                String nome = rs.getString("nome");
                String numero = rs.getString("numero");
                String email = rs.getString("email"); 
                String grupo = rs.getString("grupo");
                
                labelContatoContato.setText(nome);
                labelNumeroContato.setText(numero);
                labelEmailContato.setText(email);
                labelGrupoContato.setText(grupo);
                }
            
            
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
    
        
            
            
    }//GEN-LAST:event_listPrincipalValueChanged

    private void listPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPrincipalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listPrincipalMouseClicked

    private void listPrincipalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listPrincipalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_listPrincipalFocusGained

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(ContatosTelefonicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContatosTelefonicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContatosTelefonicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContatosTelefonicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContatosTelefonicos().setVisible(true);
               
                
            }
        });
    }
    public void selecionaDados(Connection conn){

    String sql = "SELECT nome "
                     + "FROM contato;";
    
    try {
            
            Statement comandoSql = conn.createStatement();
            
            ResultSet rs  = comandoSql.executeQuery(sql);
            DefaultListModel modelo = new DefaultListModel();
                listPrincipal.setModel(modelo);
                jList1.setModel(modelo);
            while(rs.next()){
                
                Contato contato = new Contato();
                
                //contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                //contato.setNumero(rs.getString("numero"));
                //contato.setEmail(rs.getString("email"));
                //contato.setGrupo(rs.getString("grupo"));
                //contato.add(rs.getString("nome"));
              
                
                modelo.addElement(rs.getString("nome"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //return contatos;

    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddGrupo;
    private javax.swing.JButton buttonApagarGrupo;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonCancelarGrupo;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonGrupos;
    private javax.swing.JButton buttonMais;
    private javax.swing.JButton buttonNovoContato;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonSalvarGrupo;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JButton buttonVoltarPrincipal;
    private javax.swing.JButton buttonVoltarPrincipal1;
    private javax.swing.JCheckBox checkBoxApagar;
    private javax.swing.JComboBox<String> comboBoxGrupos;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JLabel labelContatoContato;
    private javax.swing.JLabel labelContatos;
    private javax.swing.JLabel labelContatos1;
    private javax.swing.JLabel labelEmailContato;
    private javax.swing.JLabel labelGrupoContato;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelNumero1;
    private javax.swing.JLabel labelNumero2;
    private javax.swing.JLabel labelNumeroContato;
    private javax.swing.JList<String> listGrupos;
    private javax.swing.JList<String> listPesquisa;
    private javax.swing.JList<String> listPrincipal;
    private javax.swing.JMenuItem menuItemApagar;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JPanel panelAddContato;
    private javax.swing.JPanel panelAddContato1;
    private javax.swing.JPanel panelAddContatoSuperior;
    private javax.swing.JPanel panelAddContatoSuperior1;
    private javax.swing.JPanel panelAddGrupo;
    private javax.swing.JPanel panelContato;
    private javax.swing.JPanel panelDesign1;
    private javax.swing.JPanel panelDesign2;
    private javax.swing.JPanel panelEmailContato;
    private javax.swing.JPanel panelGrupos;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSobre;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelSuperior1;
    private javax.swing.JPanel panelSuperior2;
    private javax.swing.JPanel panelSuperior3;
    private javax.swing.JPopupMenu popupMenuMais;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldNomeGrupo;
    private javax.swing.JTextField textFieldNumero;
    private javax.swing.JTextField textFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
