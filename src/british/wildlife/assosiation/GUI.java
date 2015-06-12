/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package british.wildlife.assosiation;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Anthony Edwards
 */
public class GUI extends javax.swing.JFrame {
    
    Controller controller;
    BritishWildlifeAssosiation bwa;
    
    // GUI tables
    DefaultTableModel animalTable;
    DefaultTableModel observationTable;
    DefaultTableModel observerCall;
    DefaultTableModel callsTable;
    DefaultTableModel callDetails;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        getContentPane().setBackground(Color.white);
        // initialise things
        try{
            bwa = new BritishWildlifeAssosiation();
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.toString() );
        }
        controller = new Controller(bwa, this);
        
        animalTable = (DefaultTableModel)tblAnimals.getModel();
        observationTable = (DefaultTableModel)tblObservations.getModel();
        observerCall = (DefaultTableModel)tblcallToObservationObservers.getModel();
        callsTable = (DefaultTableModel)tblPastCalls.getModel();
        callDetails = (DefaultTableModel)tblCallObservation.getModel();
        
        updateGUI();
        
        // deactivate the new observer text boxes, forcing a choice of type
        txtProConStartDate.setEnabled(false);
        txtProConEndDate.setEnabled(false);
        txtProSalary.setEnabled(false);
        txtVolenteerDate.setEnabled(false);
        btnAddNewObserver.setEnabled(false);
    }
    
    private void updateGUI(){
        // reset some things
        spnChangeThreatLevel.setValue(1);
        txtNewAnimalName.setText("");
        spnNewThreatLevel.setValue(1);
        
        // populate tables, comboboxes etc
        populateAnimalList(animalTable);
        populateObservationAnimalCombo();
        populateObserverComboBoxes();
        populateCallsTable(bwa.callsForObservations);
        
        resetTextBoxes();
    }

    /**
     * WARNING: Do NOT modify this code. 
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpVolenteerOrProfessional = new javax.swing.ButtonGroup();
        tabCallForObservation = new javax.swing.JTabbedPane();
        tabAnimals = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimals = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNewAnimalName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spnNewThreatLevel = new javax.swing.JSpinner();
        btnSaveNewAnimal = new javax.swing.JButton();
        btnModifyThreatLevel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        spnChangeThreatLevel = new javax.swing.JSpinner();
        tabAddObservation = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cboObserverToObservation = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        cboAnimalToObservation = new javax.swing.JComboBox();
        btnAddObservation = new javax.swing.JButton();
        txtNewNumberObserved = new javax.swing.JTextField();
        txtNewDateObserved = new javax.swing.JTextField();
        txtNewLocationPostcode = new javax.swing.JTextField();
        chkNewConfidence = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtNewActivityDescription = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tabObservations = new javax.swing.JPanel();
        cboAnimalNameObservations = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblObservations = new javax.swing.JTable();
        txtObservationID = new javax.swing.JTextField();
        txtDateObserved = new javax.swing.JTextField();
        txtObserver = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtNumObserved = new javax.swing.JTextField();
        txtConfidence = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDescription = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtProOrNot = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        tabAddObserver = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtAddObserverName = new javax.swing.JTextField();
        txtNewObserverPhoneNumber = new javax.swing.JTextField();
        txtAddNewObserverEmail = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnAddNewObserver = new javax.swing.JButton();
        btnVolenteerObserver = new javax.swing.JRadioButton();
        btnProfessionalObserver = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        txtVolenteerDate = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtProConStartDate = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtProConEndDate = new javax.swing.JTextField();
        txtProSalary = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        txtPostcode = new javax.swing.JTextField();
        txtTown = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        tabManageObservers = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        cboProfessionalObserver = new javax.swing.JComboBox();
        cboVolenteerObserver = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        txtVolToProContractStart = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtVolToProContractEndDate = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtVolToProSalary = new javax.swing.JTextField();
        btnChangeVolToPro = new javax.swing.JButton();
        txtProToVolDate = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        btnChangeProToVol = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        tabIssueCall = new javax.swing.JPanel();
        cboAnimalNamesCall = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        txtCallStart = new javax.swing.JTextField();
        txtCallEnd = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtCallArea = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        btnIssueCallForObservation = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtCallDescription = new javax.swing.JTextArea();
        jLabel55 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblcallToObservationObservers = new javax.swing.JTable();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        tabViewPastCalls = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPastCalls = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCallForObsDetails = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblCallObservation = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("British Wildlife Assocsiation");
        setBackground(new java.awt.Color(255, 255, 255));

        tabCallForObservation.setBackground(new java.awt.Color(204, 204, 204));
        tabCallForObservation.setPreferredSize(new java.awt.Dimension(600, 598));

        tblAnimals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Animal Name", "Threat Level", "Num Observations"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAnimals.setColumnSelectionAllowed(true);
        tblAnimals.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAnimals);
        tblAnimals.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblAnimals.getColumnModel().getColumnCount() > 0) {
            tblAnimals.getColumnModel().getColumn(0).setResizable(false);
            tblAnimals.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblAnimals.getColumnModel().getColumn(1).setResizable(false);
            tblAnimals.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("View animals");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Extinction Threat Level");

        jLabel4.setText("Common Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Add new animal");

        spnNewThreatLevel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        btnSaveNewAnimal.setText("Save Animal");
        btnSaveNewAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNewAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNewAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnNewThreatLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveNewAnimal))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewAnimalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNewThreatLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveNewAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        btnModifyThreatLevel.setText("Save Changes");
        btnModifyThreatLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyThreatLevelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Change Threat level");

        jLabel9.setText("Change the treat level in thetable and press the save changes button.");

        spnChangeThreatLevel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        javax.swing.GroupLayout tabAnimalsLayout = new javax.swing.GroupLayout(tabAnimals);
        tabAnimals.setLayout(tabAnimalsLayout);
        tabAnimalsLayout.setHorizontalGroup(
            tabAnimalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAnimalsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(tabAnimalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabAnimalsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(961, Short.MAX_VALUE))
                    .addGroup(tabAnimalsLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabAnimalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(tabAnimalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabAnimalsLayout.createSequentialGroup()
                                    .addComponent(spnChangeThreatLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModifyThreatLevel))
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(39, 39, 39))))
        );
        tabAnimalsLayout.setVerticalGroup(
            tabAnimalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAnimalsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabAnimalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabAnimalsLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabAnimalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnChangeThreatLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModifyThreatLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabCallForObservation.addTab("Animals", tabAnimals);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Add new observation");

        jLabel22.setText("Observer");

        cboObserverToObservation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setText("Animal");

        cboAnimalToObservation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAddObservation.setText("Add Observation");
        btnAddObservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddObservationActionPerformed(evt);
            }
        });

        txtNewDateObserved.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewDateObservedFocusLost(evt);
            }
        });

        txtNewActivityDescription.setColumns(20);
        txtNewActivityDescription.setRows(5);
        jScrollPane5.setViewportView(txtNewActivityDescription);

        jLabel24.setText("No. Observed");

        jLabel26.setText("DateObserved");

        jLabel27.setText("Location");

        jLabel28.setText("Description");

        jLabel29.setText("Confident");

        jLabel20.setText("e.g - PL9 9BD");

        jLabel30.setText("DD/MM/YYYY");

        javax.swing.GroupLayout tabAddObservationLayout = new javax.swing.GroupLayout(tabAddObservation);
        tabAddObservation.setLayout(tabAddObservationLayout);
        tabAddObservationLayout.setHorizontalGroup(
            tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAddObservationLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabAddObservationLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tabAddObservationLayout.createSequentialGroup()
                        .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                        .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabAddObservationLayout.createSequentialGroup()
                                .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboObserverToObservation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chkNewConfidence)
                                        .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNewLocationPostcode)
                                            .addComponent(txtNewDateObserved)
                                            .addComponent(cboAnimalToObservation, 0, 175, Short.MAX_VALUE)
                                            .addComponent(txtNewNumberObserved, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel20)))
                            .addGroup(tabAddObservationLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(btnAddObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(513, Short.MAX_VALUE))))
        );
        tabAddObservationLayout.setVerticalGroup(
            tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAddObservationLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabAddObservationLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(38, 38, 38)
                        .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboObserverToObservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(27, 27, 27)
                        .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboAnimalToObservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNewNumberObserved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNewDateObserved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNewLocationPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkNewConfidence)
                            .addComponent(jLabel29))
                        .addGroup(tabAddObservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabAddObservationLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel28)
                                .addGap(155, 155, 155))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabAddObservationLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 58, Short.MAX_VALUE))
        );

        tabCallForObservation.addTab("Add New Observation", tabAddObservation);

        cboAnimalNameObservations.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboAnimalNameObservations.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboAnimalNameObservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAnimalNameObservationsActionPerformed(evt);
            }
        });

        tblObservations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Location", "Num Observed", "Confidence"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblObservations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObservationsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblObservations);
        if (tblObservations.getColumnModel().getColumnCount() > 0) {
            tblObservations.getColumnModel().getColumn(0).setResizable(false);
            tblObservations.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblObservations.getColumnModel().getColumn(1).setResizable(false);
            tblObservations.getColumnModel().getColumn(2).setResizable(false);
            tblObservations.getColumnModel().getColumn(3).setResizable(false);
            tblObservations.getColumnModel().getColumn(4).setResizable(false);
        }

        txtObservationID.setEditable(false);

        txtDateObserved.setEditable(false);

        txtObserver.setEditable(false);

        txtLocation.setEditable(false);

        txtNumObserved.setEditable(false);

        txtConfidence.setEditable(false);

        txtAreaDescription.setEditable(false);
        txtAreaDescription.setColumns(20);
        txtAreaDescription.setRows(5);
        jScrollPane3.setViewportView(txtAreaDescription);

        jLabel10.setText("Observation ID");

        jLabel11.setText("Date Observed");

        jLabel12.setText("Location Observed");

        jLabel13.setText("Observer");

        jLabel14.setText("Number Observed");

        jLabel15.setText("Confidence");

        jLabel17.setText("Activity Description");

        jLabel18.setText("Observation Type");

        txtProOrNot.setEditable(false);

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setText("View Observations");

        jLabel72.setText("Select an animal from the dropdown.");

        jLabel73.setText("Double click an observation in the table to view more information.");

        javax.swing.GroupLayout tabObservationsLayout = new javax.swing.GroupLayout(tabObservations);
        tabObservations.setLayout(tabObservationsLayout);
        tabObservationsLayout.setHorizontalGroup(
            tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabObservationsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabObservationsLayout.createSequentialGroup()
                        .addComponent(cboAnimalNameObservations, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(699, Short.MAX_VALUE))
                    .addGroup(tabObservationsLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabObservationsLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtObserver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConfidence, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumObserved, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtProOrNot, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDateObserved, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabObservationsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtObservationID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168)))
                        .addGap(64, 64, 64))
                    .addGroup(tabObservationsLayout.createSequentialGroup()
                        .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addComponent(jLabel72)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        tabObservationsLayout.setVerticalGroup(
            tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabObservationsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(cboAnimalNameObservations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtObservationID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabObservationsLayout.createSequentialGroup()
                        .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(txtProOrNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDateObserved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtObserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumObserved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(tabObservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tabCallForObservation.addTab("View Observations", tabObservations);

        jLabel25.setText("Name");

        jLabel31.setText("Phone Number");

        jLabel32.setText("Email");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Add new observer");

        btnAddNewObserver.setText("Add Observer");
        btnAddNewObserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewObserverActionPerformed(evt);
            }
        });

        btnGrpVolenteerOrProfessional.add(btnVolenteerObserver);
        btnVolenteerObserver.setText("Volenteer Observer");
        btnVolenteerObserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolenteerObserverActionPerformed(evt);
            }
        });

        btnGrpVolenteerOrProfessional.add(btnProfessionalObserver);
        btnProfessionalObserver.setText("Professional Observer");
        btnProfessionalObserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessionalObserverActionPerformed(evt);
            }
        });

        jLabel34.setText("Registration Date");

        txtVolenteerDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolenteerDateFocusLost(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Volunteer Observer Details");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Professional Observer Details");

        txtProConStartDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProConStartDateFocusLost(evt);
            }
        });

        jLabel37.setText("Contract Start Date");

        jLabel38.setText("Contract End Date");

        jLabel39.setText("Salary");

        txtProConEndDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProConEndDateFocusLost(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Select Observer Type");

        jLabel57.setText("House name/number");

        jLabel58.setText("Town / city");

        jLabel59.setText("Postcode");

        jLabel56.setText("DD/MM/YYYY");

        jLabel61.setText("DD/MM/YYYY");

        jLabel62.setText("DD/MM/YYYY");

        jLabel63.setText("Whole number, no spaces or comma");

        javax.swing.GroupLayout tabAddObserverLayout = new javax.swing.GroupLayout(tabAddObserver);
        tabAddObserver.setLayout(tabAddObserverLayout);
        tabAddObserverLayout.setHorizontalGroup(
            tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAddObserverLayout.createSequentialGroup()
                .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabAddObserverLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel33))
                    .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddNewObserver, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(tabAddObserverLayout.createSequentialGroup()
                            .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(tabAddObserverLayout.createSequentialGroup()
                                    .addGap(87, 87, 87)
                                    .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel32)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabAddObserverLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGap(32, 32, 32)
                            .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(tabAddObserverLayout.createSequentialGroup()
                                    .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAddObserverName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(113, 113, 113)
                                    .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(tabAddObserverLayout.createSequentialGroup()
                                            .addGap(99, 99, 99)
                                            .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel34)
                                                .addGroup(tabAddObserverLayout.createSequentialGroup()
                                                    .addComponent(btnVolenteerObserver)
                                                    .addGap(27, 27, 27)
                                                    .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtVolenteerDate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnProfessionalObserver)))))
                                        .addGroup(tabAddObserverLayout.createSequentialGroup()
                                            .addGap(88, 88, 88)
                                            .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel40)
                                                .addComponent(jLabel35)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabAddObserverLayout.createSequentialGroup()
                                    .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(tabAddObserverLayout.createSequentialGroup()
                                            .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtAddNewObserverEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                .addComponent(txtNewObserverPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                                            .addComponent(jLabel39))
                                        .addComponent(jLabel38)
                                        .addComponent(jLabel37))
                                    .addGap(60, 60, 60)
                                    .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtProConStartDate)
                                        .addComponent(txtProConEndDate)
                                        .addComponent(txtProSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                                .addGroup(tabAddObserverLayout.createSequentialGroup()
                                    .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(201, 201, 201)
                                    .addComponent(jLabel36)))
                            .addGap(18, 18, 18)
                            .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel62)
                                .addComponent(jLabel61)
                                .addComponent(jLabel56)
                                .addComponent(jLabel63)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        tabAddObserverLayout.setVerticalGroup(
            tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAddObserverLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel33)
                .addGap(23, 23, 23)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtAddObserverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolenteerObserver)
                    .addComponent(btnProfessionalObserver))
                .addGap(29, 29, 29)
                .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel57)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVolenteerDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel62))
                .addGap(2, 2, 2)
                .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGap(18, 18, 18)
                .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProConStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel61))
                .addGap(1, 1, 1)
                .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewObserverPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(7, 7, 7)
                .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtProConEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabAddObserverLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddNewObserverEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)))
                    .addGroup(tabAddObserverLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(tabAddObserverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(txtProSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnAddNewObserver, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        tabCallForObservation.addTab("Add new Observer", tabAddObserver);

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Professional Observers");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("Amatuer Observers");

        cboProfessionalObserver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboVolenteerObserver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel44.setText("Contract Start Date");

        txtVolToProContractStart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolToProContractStartFocusLost(evt);
            }
        });

        jLabel45.setText("Contract End Date");

        txtVolToProContractEndDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolToProContractEndDateFocusLost(evt);
            }
        });

        jLabel46.setText("Salary");

        btnChangeVolToPro.setText("Save Changes");
        btnChangeVolToPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeVolToProActionPerformed(evt);
            }
        });

        txtProToVolDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProToVolDateFocusLost(evt);
            }
        });

        jLabel47.setText("Volenteer Date");

        btnChangeProToVol.setText("Save Changes");
        btnChangeProToVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeProToVolActionPerformed(evt);
            }
        });

        jLabel48.setText("To change a professional observer to volunteer,");

        jLabel49.setText("select a professional observer, enter a volunteer date and save changes.");

        jLabel50.setText("To change volunteer observer to professional,");

        jLabel51.setText("select a volunteer observer, enter contract details and save changes.");

        jLabel64.setText("DD/MM/YYYY");

        jLabel65.setText("DD/MM/YYYY");

        jLabel66.setText("DD/MM/YYYY");

        jLabel70.setText("Whole number, no spaces or comma");

        javax.swing.GroupLayout tabManageObserversLayout = new javax.swing.GroupLayout(tabManageObservers);
        tabManageObservers.setLayout(tabManageObserversLayout);
        tabManageObserversLayout.setHorizontalGroup(
            tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManageObserversLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabManageObserversLayout.createSequentialGroup()
                        .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49)
                            .addGroup(tabManageObserversLayout.createSequentialGroup()
                                .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboProfessionalObserver, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(tabManageObserversLayout.createSequentialGroup()
                                            .addGap(156, 156, 156)
                                            .addComponent(btnChangeProToVol, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabManageObserversLayout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addComponent(jLabel47)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtProToVolDate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel64)))
                        .addGap(37, 37, 37)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabManageObserversLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboVolenteerObserver, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tabManageObserversLayout.createSequentialGroup()
                                        .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel45)
                                            .addComponent(jLabel46))
                                        .addGap(35, 35, 35)
                                        .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtVolToProContractStart)
                                            .addComponent(txtVolToProContractEndDate)
                                            .addComponent(txtVolToProSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnChangeVolToPro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel70)))
                            .addGroup(tabManageObserversLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel51)))))
                    .addGroup(tabManageObserversLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(308, 308, 308)
                        .addComponent(jLabel42)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        tabManageObserversLayout.setVerticalGroup(
            tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManageObserversLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabManageObserversLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tabManageObserversLayout.createSequentialGroup()
                        .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42))
                        .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabManageObserversLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49)
                                .addGap(35, 35, 35)
                                .addComponent(cboProfessionalObserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProToVolDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel64))
                                .addGap(106, 106, 106)
                                .addComponent(btnChangeProToVol, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))
                            .addGroup(tabManageObserversLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel51)
                                .addGap(34, 34, 34)
                                .addComponent(cboVolenteerObserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel44)
                                    .addComponent(txtVolToProContractStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel65))
                                .addGap(39, 39, 39)
                                .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel45)
                                    .addComponent(txtVolToProContractEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66))
                                .addGap(32, 32, 32)
                                .addGroup(tabManageObserversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel46)
                                    .addComponent(txtVolToProSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel70))
                                .addGap(57, 57, 57)
                                .addComponent(btnChangeVolToPro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(127, Short.MAX_VALUE))))))
        );

        tabCallForObservation.addTab("Manage Observers", tabManageObservers);

        cboAnimalNamesCall.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboAnimalNamesCall.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel43.setText("Start Date");

        txtCallStart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCallStartFocusLost(evt);
            }
        });

        txtCallEnd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCallEndFocusLost(evt);
            }
        });

        jLabel52.setText("End Date");

        txtCallArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCallAreaFocusLost(evt);
            }
        });

        jLabel53.setText("Area Postcode");

        btnIssueCallForObservation.setText("Issue Call");
        btnIssueCallForObservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueCallForObservationActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setText("Issue Call for observation");

        txtCallDescription.setColumns(20);
        txtCallDescription.setRows(5);
        jScrollPane7.setViewportView(txtCallDescription);

        jLabel55.setText("Description");

        jLabel60.setText("Observers Call will be sent too");

        tblcallToObservationObservers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Observer Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tblcallToObservationObservers);

        jLabel67.setText("DD/MM/YYYY");

        jLabel68.setText("DD/MM/YYYY");

        jLabel69.setText("e.g. - PL9 9BS");

        javax.swing.GroupLayout tabIssueCallLayout = new javax.swing.GroupLayout(tabIssueCall);
        tabIssueCall.setLayout(tabIssueCallLayout);
        tabIssueCallLayout.setHorizontalGroup(
            tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabIssueCallLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabIssueCallLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnIssueCallForObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabIssueCallLayout.createSequentialGroup()
                                .addGroup(tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel53))
                                .addGap(56, 56, 56)
                                .addGroup(tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabIssueCallLayout.createSequentialGroup()
                                        .addComponent(txtCallArea, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel69))
                                    .addGroup(tabIssueCallLayout.createSequentialGroup()
                                        .addComponent(txtCallEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel67))
                                    .addGroup(tabIssueCallLayout.createSequentialGroup()
                                        .addComponent(txtCallStart, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel68))
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel54)
                    .addComponent(cboAnimalNamesCall, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        tabIssueCallLayout.setVerticalGroup(
            tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabIssueCallLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel54)
                .addGap(33, 33, 33)
                .addGroup(tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboAnimalNamesCall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addGroup(tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabIssueCallLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(txtCallStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68))
                        .addGap(28, 28, 28)
                        .addGroup(tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCallEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52)
                            .addComponent(jLabel67))
                        .addGap(18, 18, 18)
                        .addGroup(tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabIssueCallLayout.createSequentialGroup()
                                .addGroup(tabIssueCallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCallArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabIssueCallLayout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel55)))
                        .addGap(47, 47, 47)
                        .addComponent(btnIssueCallForObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabIssueCallLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        tabCallForObservation.addTab("Issue Call for Observation", tabIssueCall);

        tblPastCalls.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Animal", "Postcode", "Start Date", "End Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPastCalls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPastCallsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblPastCalls);

        txtCallForObsDetails.setEditable(false);
        txtCallForObsDetails.setColumns(20);
        txtCallForObsDetails.setRows(5);
        jScrollPane6.setViewportView(txtCallForObsDetails);

        jLabel6.setText("Reason");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Past calls for observations");

        jLabel19.setText("Double click an observation from the table below to view more information.");

        tblCallObservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Observer", "Number Observed", "Date Observer", "Confidence"
            }
        ));
        jScrollPane8.setViewportView(tblCallObservation);

        javax.swing.GroupLayout tabViewPastCallsLayout = new javax.swing.GroupLayout(tabViewPastCalls);
        tabViewPastCalls.setLayout(tabViewPastCallsLayout);
        tabViewPastCallsLayout.setHorizontalGroup(
            tabViewPastCallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabViewPastCallsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabViewPastCallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabViewPastCallsLayout.createSequentialGroup()
                        .addGroup(tabViewPastCallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tabViewPastCallsLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(tabViewPastCallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tabViewPastCallsLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabViewPastCallsLayout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        tabViewPastCallsLayout.setVerticalGroup(
            tabViewPastCallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabViewPastCallsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tabViewPastCallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabViewPastCallsLayout.createSequentialGroup()
                        .addGroup(tabViewPastCallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
        );

        tabCallForObservation.addTab("View Past Calls", tabViewPastCalls);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("British Wildlife Assosiation");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/british/wildlife/assosiation/assets/bwaBird.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabCallForObservation, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabCallForObservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIssueCallForObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueCallForObservationActionPerformed
        if (controller.btnIssueCallActionPerformed(evt)){
            JOptionPane.showMessageDialog(rootPane, "Call for observation made");
        } else {
            JOptionPane.showMessageDialog(rootPane, "ERROR.\n Please"
                    + "all fields have been completed");
        }
    }//GEN-LAST:event_btnIssueCallForObservationActionPerformed

    private void txtCallAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCallAreaFocusLost
        populateOberversCalled();
    }//GEN-LAST:event_txtCallAreaFocusLost
    
    private void btnChangeProToVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeProToVolActionPerformed
        if (controller.btnChangeProToVolActionPerformed(evt)){
            JOptionPane.showMessageDialog(rootPane, "Observer status changed");
        } else {
            JOptionPane.showMessageDialog(rootPane, "ERROR.\n"
                    + "Please check the date is in the format DD/MM/YYYY");
        }
        updateGUI();
    }//GEN-LAST:event_btnChangeProToVolActionPerformed
    
    private void btnChangeVolToProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeVolToProActionPerformed
        if (controller.btnChangeVolToProActionPerformed(evt)){
            JOptionPane.showMessageDialog(rootPane, "Observer status changed");
        } else {
            JOptionPane.showMessageDialog(rootPane, "ERROR.\n"
                    + "Please check the date is in the format DD/MM/YYYY and \n"
                    + "the salary is a valid number");
        }
        updateGUI();
    }//GEN-LAST:event_btnChangeVolToProActionPerformed
  
    private void btnProfessionalObserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessionalObserverActionPerformed
        txtProConStartDate.setEnabled(true);
        txtProConEndDate.setEnabled(true);
        txtProSalary.setEnabled(true);
        txtVolenteerDate.setEnabled(false);
        btnAddNewObserver.setEnabled(true);
    }//GEN-LAST:event_btnProfessionalObserverActionPerformed

    private void btnVolenteerObserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolenteerObserverActionPerformed
        txtProConStartDate.setEnabled(false);
        txtProConEndDate.setEnabled(false);
        txtProSalary.setEnabled(false);
        txtVolenteerDate.setEnabled(true);
        btnAddNewObserver.setEnabled(true);
    }//GEN-LAST:event_btnVolenteerObserverActionPerformed
    
    private void btnAddNewObserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewObserverActionPerformed
        if (controller.btnAddNewObserverActionPerformed(evt)){
            JOptionPane.showMessageDialog(rootPane, "New Observer added");
        } else {
            JOptionPane.showMessageDialog(rootPane, "ERROR.\n"
                    + "Please check the date is in the format DD/MM/YYYY and \n"
                    + "complete all fields");
        }
        updateGUI();
    }//GEN-LAST:event_btnAddNewObserverActionPerformed

    private void tblObservationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObservationsMouseClicked
        controller.tblObservationsMouseClicked(evt);
    }//GEN-LAST:event_tblObservationsMouseClicked

    private void cboAnimalNameObservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAnimalNameObservationsActionPerformed
        controller.cboAnimalNameObservationsActionPerformed(evt);
    }//GEN-LAST:event_cboAnimalNameObservationsActionPerformed

    private void btnAddObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddObservationActionPerformed
        if (controller.btnAddObservationActionPerformed(evt)){
            JOptionPane.showMessageDialog(rootPane, 
                    "New observation added");
        } else {
            JOptionPane.showMessageDialog(rootPane, "ERROR.\n "
                    + "Please all fields have been completed and \n "
                    + "dates are in the format DD/MM/YYYY");
        }
        updateGUI();
    }//GEN-LAST:event_btnAddObservationActionPerformed
    
    private void btnModifyThreatLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyThreatLevelActionPerformed
        controller.btnModifyThreatLevelActionPerformed(evt);
        //updateGUI();
    }//GEN-LAST:event_btnModifyThreatLevelActionPerformed
    
    private void btnSaveNewAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNewAnimalActionPerformed
        if (controller.btnSaveNewAnimalActionPerformed(evt)){
            JOptionPane.showMessageDialog(rootPane, 
                    "New animal added");
        } else {
            JOptionPane.showMessageDialog(rootPane, "New animal not added.\n"
                    + "Please enter an animal name");
        }
        updateGUI();
    }//GEN-LAST:event_btnSaveNewAnimalActionPerformed

    private void txtNewDateObservedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewDateObservedFocusLost
        controller.txtNewDateObservedFocusLost(evt);
    }//GEN-LAST:event_txtNewDateObservedFocusLost

    private void txtProToVolDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProToVolDateFocusLost
        controller.txtProToVolDateFocusLost(evt);
    }//GEN-LAST:event_txtProToVolDateFocusLost

    private void txtVolToProContractStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolToProContractStartFocusLost
        controller.txtVolToProContractStartFocusLost(evt);
    }//GEN-LAST:event_txtVolToProContractStartFocusLost

    private void txtVolToProContractEndDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolToProContractEndDateFocusLost
        controller.txtVolToProContractEndDateFocusLost(evt);
    }//GEN-LAST:event_txtVolToProContractEndDateFocusLost

    private void txtVolenteerDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolenteerDateFocusLost
        controller.txtVolenteerDateFocusLost(evt);
    }//GEN-LAST:event_txtVolenteerDateFocusLost

    private void txtProConStartDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProConStartDateFocusLost
        controller.txtProConStartDateFocusLost(evt);
    }//GEN-LAST:event_txtProConStartDateFocusLost

    private void txtProConEndDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProConEndDateFocusLost
        controller.txtProConEndDateFocusLost(evt);
    }//GEN-LAST:event_txtProConEndDateFocusLost

    private void txtCallStartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCallStartFocusLost
        controller.txtCallStartFocusLost(evt);
    }//GEN-LAST:event_txtCallStartFocusLost

    private void txtCallEndFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCallEndFocusLost
        controller.txtCallEndFocusLost(evt);
    }//GEN-LAST:event_txtCallEndFocusLost

    private void tblPastCallsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPastCallsMouseClicked
        controller.tblPastCallsMouseClicked(evt);
    }//GEN-LAST:event_tblPastCallsMouseClicked
    
    // user prompt for incorrect date format
    protected void dateError(){
        JOptionPane.showMessageDialog(rootPane, "ERROR: Please enter date in "
                + "the format DD/MM/YYYY");
    }
    
    // Getters for user input
    
    // Call for observation
    protected String getCallAnimal(){
        return (String)cboAnimalNamesCall.getSelectedItem();
    }
    
    protected String getCallStartDate(){
        return txtCallStart.getText();
    }
    
    protected String getCallEndDate(){
        return txtCallEnd.getText();
    }
        
    protected String getCallPostcode(){
        return txtCallArea.getText();
    }
    
    protected String getCallDescription(){
        return txtCallDescription.getText();
    }
    
    // add new animal
    protected String getNewObservationAnimal(){
        return (String)cboAnimalToObservation.getSelectedItem();
    }
    
    protected String getNewObservationObserver(){
        return (String)cboObserverToObservation.getSelectedItem();
    }
    
    protected String getNewDateObserverd(){
        return txtNewDateObserved.getText();
    }
   
    protected String getNewLocationObserverd(){
        return txtNewLocationPostcode.getText();
    }
   
    protected String getNewNumberObserved(){
        return txtNewNumberObserved.getText();
    }
    
    protected Boolean getNewConfidence(){
        return chkNewConfidence.isSelected();
    }
    
    protected String getNewActivityDescription(){
        return txtNewActivityDescription.getText();
    }
    
    //new observer
    protected String newObserverName(){
        return txtAddObserverName.getText();
    }
    
    protected String newObserverHouse(){
        return txtHouse.getText();
    }
    
    protected String newObserverTown(){
        return txtTown.getText();
    }
    
    protected String newObserverPostcode(){
        return txtPostcode.getText();
    }
    
    protected String newObserverPhoneNumber(){
        return txtNewObserverPhoneNumber.getText();
    }
    
    protected String newObserverEmail(){
        return txtAddNewObserverEmail.getText();
    }
    
    protected String newObserverSalary(){
        return txtProSalary.getText();
    }
    
    protected String newObserverEndDate(){
        return txtProConEndDate.getText();
    }
    
    protected String newObserverStartDate(){
        return txtProConStartDate.getText();
    }
    
    protected String newObserverVolDate(){
        return txtVolenteerDate.getText();
    }
    
    // modify observer
    protected String getChangeObserverToVol(){
        return (String)cboProfessionalObserver.getSelectedItem();
    }
    
    protected String getChangeProToVolObserverDate(){
        return txtProToVolDate.getText();
    }
    
    protected String getChangeObserverToPro(){
        return (String)cboVolenteerObserver.getSelectedItem();
    }
    
    protected String getChangeContractStart(){
        return txtVolToProContractStart.getText();
    }
    
    protected String getChangeContractEnd(){
        return txtVolToProContractEndDate.getText();
    }
    
    protected String getChangeSalary(){
        return txtVolToProSalary.getText();
        
    }
    
    //misc
    protected String getNewAnimalName(){
        return txtNewAnimalName.getText();
    }
    
    protected Integer getNewAnimalThreatLevel(){
        return (Integer) spnNewThreatLevel.getValue();
    }
    
    protected Integer selectedAnimalForObservations(){
        return (Integer) tblObservations.getValueAt(
                tblObservations.getSelectedRow(), 0);
    }
    
    protected String selectedCallAnimal(){
        return (String) tblPastCalls.getValueAt(
                tblPastCalls.getSelectedRow(), 0);
    }
    
    protected String selectedCallArea(){
        return (String) tblPastCalls.getValueAt(
                tblPastCalls.getSelectedRow(), 1);
    }
    
    protected String selectedCallStartDate(){
        return (String) tblPastCalls.getValueAt(
                tblPastCalls.getSelectedRow(), 2);
    }
    
    protected String getSelectedAnimalCBO(){
        String selectedAnimal = (String)cboAnimalNameObservations.getSelectedItem();
        if (selectedAnimal.equals("")){
            selectedAnimal = "fox";
        }
        return selectedAnimal;
    }
    
    //populate GUI areas
    private void populateAnimalList(DefaultTableModel animalTable) {
        // clear the table
        animalTable.setRowCount(0);
        
        // loop the animals
        for(Animal anml: bwa.animals){
            animalTable.addRow(new Object[]{
                // add a new row for each animal
                anml.getName(),
                anml.getExtinctionThreatLevel(),
                anml.getObservations().size()
            });
        }
    }
    
    protected void populateAnimalsObservations(Observation obs, Integer id) {
        // populate the information boxes
        txtObservationID.setText(id.toString());
        txtDateObserved.setText(obs.getDateObserved());
        txtLocation.setText(obs.getLocationObserved());
        Observers observer = obs.getObserver();
        txtObserver.setText(observer.getName());
        txtConfidence.setText(obs.getConfidence());
        txtNumObserved.setText(obs.getNumberObserved().toString());
        txtAreaDescription.setText(obs.getAnimalActivityDescription());
                
        // pro observer
        if (observer instanceof ProfessionalObserver){
            txtProOrNot.setText("Professional");
        } else {
            txtProOrNot.setText("Non Professional");
        }
    }
    
    private void populateObserverComboBoxes(){
        // remove all items from the cbo
        cboProfessionalObserver.removeAllItems();
        cboVolenteerObserver.removeAllItems();
        cboObserverToObservation.removeAllItems();
        
        for(Observers obs: bwa.observers){
            cboObserverToObservation.addItem(obs.getName());
            if (obs instanceof ProfessionalObserver){
                cboProfessionalObserver.addItem(obs.getName());
            } else {
                cboVolenteerObserver.addItem(obs.getName());
            }
        }
    }
    
    private void populateObservationAnimalCombo(){
        // clear all the text boxes
        cboAnimalNameObservations.removeAllItems();
        cboAnimalToObservation.removeAllItems();
        cboAnimalNamesCall.removeAllItems();
        
        // loop the animals
        for(Animal anml: bwa.animals){
            // add animal name to combobox
            cboAnimalNameObservations.addItem(anml.getName());
            cboAnimalToObservation.addItem(anml.getName());
            cboAnimalNamesCall.addItem(anml.getName());
        }
    } 
    
    protected void populateObservationTable(ArrayList<Observation> observations){
        observationTable.setRowCount(0);
        
        try{
            for (Observation obs: observations){
                observationTable.addRow(new Object[]{
                // add a new row for each animal
                    obs.getObservationId(),
                    obs.getDateObserved(),
                    obs.getLocationObserved(),
                    obs.getNumberObserved(),
                    obs.getConfidence()
                });
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.toString());
        }
    }
    protected void populateCallsTable(ArrayList<CallForObservation> calls){
        callsTable.setRowCount(0);
        
        try{
            for (CallForObservation call: calls){
                callsTable.addRow(new Object[]{
                // add a new row for each animal
                    call.getCallAnimal().getName(),
                    call.getArea(),
                    call.getStartDate(),
                    call.getEndDate()
                });
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.toString());
        }
    }
    
    private void populateOberversCalled(){
        String area = txtCallArea.getText();

        // refatcor to observer class
        for (Observers obs: bwa.observers){
            if (obs.getArea(area)){
                observerCall.addRow(new Object[]{
                    // add a new row for each observer
                    obs.getName()
                });
            }
        }
    }
    
    protected void populateCallDetails(Observation obs, CallForObservation call){
        
        callDetails.addRow(new Object[]{
            obs.getObserver().getName(),
            obs.getNumberObserved(),
            obs.getDateObserved(),
            obs.getConfidence()
        });
        
        txtCallForObsDetails.setText(call.getReason());
    }
    
    protected void resetTextBoxes(){
        // set all text boxes to empty string
        txtNewNumberObserved.setText("");
        txtNewDateObserved.setText("");
        txtNewLocationPostcode.setText("");
        txtNewActivityDescription.setText("");
        txtAddObserverName.setText("");
        txtHouse.setText(""); 
        txtTown.setText("");
        txtPostcode.setText("");
        txtNewObserverPhoneNumber.setText("");
        txtVolenteerDate.setText("");        
        txtProConStartDate.setText("");        
        txtProConEndDate.setText("");        
        txtProSalary.setText("");        
        txtProToVolDate.setText("");        
        txtVolToProContractStart.setText("");        
        txtVolToProContractEndDate.setText("");
        txtVolToProSalary.setText("");        
        txtCallStart.setText("");        
        txtCallEnd.setText("");        
        txtCallArea.setText("");
        txtCallDescription.setText("");
        txtAddNewObserverEmail.setText("");
        
        //deselect radio buttons and check boxes
        btnGrpVolenteerOrProfessional.clearSelection();
        chkNewConfidence.setSelected(false);
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewObserver;
    private javax.swing.JButton btnAddObservation;
    private javax.swing.JButton btnChangeProToVol;
    private javax.swing.JButton btnChangeVolToPro;
    private javax.swing.ButtonGroup btnGrpVolenteerOrProfessional;
    private javax.swing.JButton btnIssueCallForObservation;
    private javax.swing.JButton btnModifyThreatLevel;
    protected javax.swing.JRadioButton btnProfessionalObserver;
    private javax.swing.JButton btnSaveNewAnimal;
    protected javax.swing.JRadioButton btnVolenteerObserver;
    private javax.swing.JComboBox cboAnimalNameObservations;
    private javax.swing.JComboBox cboAnimalNamesCall;
    private javax.swing.JComboBox cboAnimalToObservation;
    private javax.swing.JComboBox cboObserverToObservation;
    private javax.swing.JComboBox cboProfessionalObserver;
    private javax.swing.JComboBox cboVolenteerObserver;
    private javax.swing.JCheckBox chkNewConfidence;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    protected javax.swing.JSpinner spnChangeThreatLevel;
    private javax.swing.JSpinner spnNewThreatLevel;
    private javax.swing.JPanel tabAddObservation;
    private javax.swing.JPanel tabAddObserver;
    private javax.swing.JPanel tabAnimals;
    private javax.swing.JTabbedPane tabCallForObservation;
    private javax.swing.JPanel tabIssueCall;
    private javax.swing.JPanel tabManageObservers;
    private javax.swing.JPanel tabObservations;
    private javax.swing.JPanel tabViewPastCalls;
    protected javax.swing.JTable tblAnimals;
    private javax.swing.JTable tblCallObservation;
    private javax.swing.JTable tblObservations;
    protected javax.swing.JTable tblPastCalls;
    private javax.swing.JTable tblcallToObservationObservers;
    private javax.swing.JTextField txtAddNewObserverEmail;
    private javax.swing.JTextField txtAddObserverName;
    private javax.swing.JTextArea txtAreaDescription;
    private javax.swing.JTextField txtCallArea;
    private javax.swing.JTextArea txtCallDescription;
    private javax.swing.JTextField txtCallEnd;
    private javax.swing.JTextArea txtCallForObsDetails;
    private javax.swing.JTextField txtCallStart;
    private javax.swing.JTextField txtConfidence;
    private javax.swing.JTextField txtDateObserved;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextArea txtNewActivityDescription;
    private javax.swing.JTextField txtNewAnimalName;
    private javax.swing.JTextField txtNewDateObserved;
    private javax.swing.JTextField txtNewLocationPostcode;
    private javax.swing.JTextField txtNewNumberObserved;
    private javax.swing.JTextField txtNewObserverPhoneNumber;
    private javax.swing.JTextField txtNumObserved;
    private javax.swing.JTextField txtObservationID;
    private javax.swing.JTextField txtObserver;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JTextField txtProConEndDate;
    private javax.swing.JTextField txtProConStartDate;
    private javax.swing.JTextField txtProOrNot;
    private javax.swing.JTextField txtProSalary;
    private javax.swing.JTextField txtProToVolDate;
    private javax.swing.JTextField txtTown;
    private javax.swing.JTextField txtVolToProContractEndDate;
    private javax.swing.JTextField txtVolToProContractStart;
    private javax.swing.JTextField txtVolToProSalary;
    private javax.swing.JTextField txtVolenteerDate;
    // End of variables declaration//GEN-END:variables
}
