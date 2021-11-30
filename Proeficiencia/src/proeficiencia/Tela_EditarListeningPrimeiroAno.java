/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proeficiencia;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Tela_EditarListeningPrimeiroAno extends javax.swing.JFrame {
    int cont_fechamento=0;
    String[] questoes= new String[25]; 
    String respostas_do_professor[]= new String [5];
 
    

    public Tela_EditarListeningPrimeiroAno() {
        initComponents();
        interrogacao.setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questaoCorreta1 = new javax.swing.ButtonGroup();
        questaoCorreta2 = new javax.swing.ButtonGroup();
        questaoCorreta3 = new javax.swing.ButtonGroup();
        questaoCorreta4 = new javax.swing.ButtonGroup();
        questaoCorreta5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Q1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Enunciado1 = new javax.swing.JTextField();
        Alt_1_1 = new javax.swing.JRadioButton();
        Alt_1_2 = new javax.swing.JRadioButton();
        Alt_1_3 = new javax.swing.JRadioButton();
        Alt_1_4 = new javax.swing.JRadioButton();
        A_1_1 = new javax.swing.JTextField();
        A_1_2 = new javax.swing.JTextField();
        A_1_3 = new javax.swing.JTextField();
        A_1_4 = new javax.swing.JTextField();
        A_2_4 = new javax.swing.JTextField();
        Q2 = new javax.swing.JLabel();
        Enunciado2 = new javax.swing.JTextField();
        Alt_2_1 = new javax.swing.JRadioButton();
        Alt_2_2 = new javax.swing.JRadioButton();
        Alt_2_3 = new javax.swing.JRadioButton();
        Alt_2_4 = new javax.swing.JRadioButton();
        A_2_1 = new javax.swing.JTextField();
        A_2_2 = new javax.swing.JTextField();
        A_2_3 = new javax.swing.JTextField();
        A_3_4 = new javax.swing.JTextField();
        A_4_3 = new javax.swing.JTextField();
        Q3 = new javax.swing.JLabel();
        A_4_4 = new javax.swing.JTextField();
        Enunciado3 = new javax.swing.JTextField();
        Q4 = new javax.swing.JLabel();
        Alt_3_1 = new javax.swing.JRadioButton();
        Enunciado4 = new javax.swing.JTextField();
        Alt_3_2 = new javax.swing.JRadioButton();
        Alt_4_1 = new javax.swing.JRadioButton();
        Alt_3_3 = new javax.swing.JRadioButton();
        Alt_4_2 = new javax.swing.JRadioButton();
        Alt_3_4 = new javax.swing.JRadioButton();
        Alt_4_3 = new javax.swing.JRadioButton();
        A_3_1 = new javax.swing.JTextField();
        Alt_4_4 = new javax.swing.JRadioButton();
        A_3_2 = new javax.swing.JTextField();
        A_4_1 = new javax.swing.JTextField();
        A_3_3 = new javax.swing.JTextField();
        A_4_2 = new javax.swing.JTextField();
        Alt_5_4 = new javax.swing.JRadioButton();
        A_5_1 = new javax.swing.JTextField();
        A_5_2 = new javax.swing.JTextField();
        A_5_3 = new javax.swing.JTextField();
        A_5_4 = new javax.swing.JTextField();
        Q5 = new javax.swing.JLabel();
        Enunciado5 = new javax.swing.JTextField();
        Alt_5_1 = new javax.swing.JRadioButton();
        Alt_5_2 = new javax.swing.JRadioButton();
        Alt_5_3 = new javax.swing.JRadioButton();
        salvar_finalizar = new javax.swing.JButton();
        naoSavar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        interrogacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Altere as questoes e as respostas nesta aba. Lembre-se de escolher a alternativa correta e de salvar.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, -1, -1));

        Q1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Q1.setText("Questão 1:");
        getContentPane().add(Q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 348, -1, -1));

        Enunciado1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Enunciado1.setText("Carregando");
        getContentPane().add(Enunciado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 82, 700, -1));

        questaoCorreta1.add(Alt_1_1);
        Alt_1_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 118, -1, -1));

        questaoCorreta1.add(Alt_1_2);
        Alt_1_2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 154, -1, -1));

        questaoCorreta1.add(Alt_1_3);
        Alt_1_3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 190, -1, -1));

        questaoCorreta1.add(Alt_1_4);
        Alt_1_4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 224, -1, -1));

        A_1_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_1_1.setText("Carregando");
        getContentPane().add(A_1_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 116, 700, -1));

        A_1_2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_1_2.setText("Carregando");
        getContentPane().add(A_1_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 152, 700, -1));

        A_1_3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_1_3.setText("Carregando");
        getContentPane().add(A_1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 188, 700, -1));

        A_1_4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_1_4.setText("Carregando");
        getContentPane().add(A_1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 224, 700, -1));

        A_2_4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_2_4.setText("Carregando");
        getContentPane().add(A_2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 442, 700, -1));

        Q2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Q2.setText("Questão 2:");
        getContentPane().add(Q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 272, -1, -1));

        Enunciado2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Enunciado2.setText("Carregando");
        getContentPane().add(Enunciado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 700, -1));

        questaoCorreta2.add(Alt_2_1);
        Alt_2_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 336, -1, -1));

        questaoCorreta2.add(Alt_2_2);
        Alt_2_2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 372, -1, -1));

        questaoCorreta2.add(Alt_2_3);
        Alt_2_3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 408, -1, -1));

        questaoCorreta2.add(Alt_2_4);
        Alt_2_4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 442, -1, -1));

        A_2_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_2_1.setText("Carregando");
        getContentPane().add(A_2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 334, 700, -1));

        A_2_2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_2_2.setText("Carregando");
        getContentPane().add(A_2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 700, -1));

        A_2_3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_2_3.setText("Carregando");
        getContentPane().add(A_2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 406, 700, -1));

        A_3_4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_3_4.setText("Carregando");
        getContentPane().add(A_3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 700, -1));

        A_4_3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_4_3.setText("Carregando");
        getContentPane().add(A_4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 188, 700, -1));

        Q3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Q3.setText("Questão 3:");
        getContentPane().add(Q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 490, -1, -1));

        A_4_4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_4_4.setText("Carregando");
        getContentPane().add(A_4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 224, 700, -1));

        Enunciado3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Enunciado3.setText("Carregando");
        getContentPane().add(Enunciado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 518, 700, -1));

        Q4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Q4.setText("Questão 4:");
        getContentPane().add(Q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 54, -1, -1));

        questaoCorreta3.add(Alt_3_1);
        Alt_3_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 554, -1, -1));

        Enunciado4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Enunciado4.setText("Carregando");
        getContentPane().add(Enunciado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 82, 700, -1));

        questaoCorreta3.add(Alt_3_2);
        Alt_3_2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 590, -1, -1));

        questaoCorreta4.add(Alt_4_1);
        Alt_4_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 118, -1, -1));

        questaoCorreta3.add(Alt_3_3);
        Alt_3_3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 626, -1, -1));

        questaoCorreta4.add(Alt_4_2);
        Alt_4_2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 154, -1, -1));

        questaoCorreta3.add(Alt_3_4);
        Alt_3_4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 660, -1, -1));

        questaoCorreta4.add(Alt_4_3);
        Alt_4_3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 190, -1, -1));

        A_3_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_3_1.setText("Carregando");
        getContentPane().add(A_3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 552, 700, -1));

        questaoCorreta4.add(Alt_4_4);
        Alt_4_4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 224, -1, -1));

        A_3_2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_3_2.setText("Carregando");
        getContentPane().add(A_3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 588, 700, -1));

        A_4_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_4_1.setText("Carregando");
        getContentPane().add(A_4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 116, 700, -1));

        A_3_3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_3_3.setText("Carregando");
        getContentPane().add(A_3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 624, 700, -1));

        A_4_2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_4_2.setText("Carregando");
        getContentPane().add(A_4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 152, 700, -1));

        questaoCorreta5.add(Alt_5_4);
        Alt_5_4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 442, -1, -1));

        A_5_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_5_1.setText("Carregando");
        getContentPane().add(A_5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 334, 700, -1));

        A_5_2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_5_2.setText("Carregando");
        getContentPane().add(A_5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 370, 700, -1));

        A_5_3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_5_3.setText("Carregando");
        getContentPane().add(A_5_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 406, 700, -1));

        A_5_4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A_5_4.setText("Carregando");
        getContentPane().add(A_5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 442, 700, -1));

        Q5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Q5.setText("Questão 5:");
        getContentPane().add(Q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 272, -1, -1));

        Enunciado5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Enunciado5.setText("Carregando");
        getContentPane().add(Enunciado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 300, 700, -1));

        questaoCorreta5.add(Alt_5_1);
        Alt_5_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 336, -1, -1));

        questaoCorreta5.add(Alt_5_2);
        Alt_5_2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 372, -1, -1));

        questaoCorreta5.add(Alt_5_3);
        Alt_5_3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Alt_5_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 408, -1, -1));

        salvar_finalizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        salvar_finalizar.setText("Salvar");
        salvar_finalizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                salvar_finalizarFocusLost(evt);
            }
        });
        salvar_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_finalizarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar_finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1375, 650, 111, -1));

        naoSavar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        naoSavar.setText("Sair sem salvar");
        naoSavar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoSavarActionPerformed(evt);
            }
        });
        getContentPane().add(naoSavar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 650, -1, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Visualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1248, 650, -1, -1));

        interrogacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proeficiencia/Imagens/interrogacao2.png"))); // NOI18N
        interrogacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interrogacaoActionPerformed(evt);
            }
        });
        getContentPane().add(interrogacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 10, 50, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void salvar_dados() throws SQLException {
        questoes[0]= Enunciado1.getText();
        questoes[1]= Enunciado2.getText();
        questoes[2]= Enunciado3.getText();
        questoes[3]= Enunciado4.getText();
        questoes[4]= Enunciado5.getText(); 
        questoes[5]= A_1_1.getText();   questoes[6]= A_1_2.getText();   questoes[7]= A_1_3.getText();   questoes[8]= A_1_4.getText();
        questoes[9]= A_2_1.getText();   questoes[10]= A_2_2.getText();   questoes[11]= A_2_3.getText();   questoes[12]= A_2_4.getText();
        questoes[13]= A_3_1.getText();   questoes[14]= A_3_2.getText();   questoes[15]= A_3_3.getText();   questoes[16]= A_3_4.getText();
        questoes[17]= A_4_1.getText();   questoes[18]= A_4_2.getText();   questoes[19]= A_4_3.getText();   questoes[20]= A_4_4.getText();
        questoes[21]= A_5_1.getText();   questoes[22]= A_5_2.getText();   questoes[23]= A_5_3.getText();   questoes[24]= A_5_4.getText();

        
        if(Alt_1_1.isSelected()){
            respostas_do_professor[0]="1";
        }
        else if(Alt_1_2.isSelected()){
            respostas_do_professor[0]="2";
        }
        else if(Alt_1_3.isSelected()){
            respostas_do_professor[0]="3";
        }
        else{
            respostas_do_professor[0]="4";
        }
        
        if(Alt_2_1.isSelected()){
            respostas_do_professor[1]="1";
        }
        else if(Alt_2_2.isSelected()){
            respostas_do_professor[1]="2";
        }
        else if(Alt_2_3.isSelected()){
            respostas_do_professor[1]="3";
        }
        else{
            respostas_do_professor[1]="4";
        }
        
        if(Alt_3_1.isSelected()){
            respostas_do_professor[2]="1";
        }
        else if(Alt_3_2.isSelected()){
            respostas_do_professor[2]="2";
        }
        else if(Alt_3_3.isSelected()){
            respostas_do_professor[2]="3";
        }
        else{
            respostas_do_professor[2]="4";
        }
        
        if(Alt_4_1.isSelected()){
            respostas_do_professor[3]="1";
        }
        else if(Alt_4_2.isSelected()){
            respostas_do_professor[3]="2";
        }
        else if(Alt_4_3.isSelected()){
            respostas_do_professor[3]="3";
        }
        else{
            respostas_do_professor[3]="4";
        }
        
        if(Alt_5_1.isSelected()){
            respostas_do_professor[4]="1";
        }
        else if(Alt_5_2.isSelected()){
            respostas_do_professor[4]="2";
        }
        else if(Alt_5_3.isSelected()){
            respostas_do_professor[4]="3";
        }
        else {
            respostas_do_professor[4]="4";
        }  
        apagar();
        
    }
    private void apagar() throws SQLException{
        Connection bd = Tela_Inicial.getConnection();
        for(int cont=1;cont<=30;cont++){
            String query = ("DELETE FROM tb_listening_primeiro_ano WHERE id="+cont);    
            PreparedStatement preparedStmt = bd.prepareStatement(query);
            preparedStmt.execute();
        }
        Tela_Inicial.closeConnection(bd);       
        reiniciar_ai();
        
    }
    private void reiniciar_ai() throws SQLException{
        Connection bd = Tela_Inicial.getConnection();
        String query = ("alter table tb_listening_primeiro_ano AUTO_INCREMENT = 1");    
        PreparedStatement preparedStmt = bd.prepareStatement(query);
        preparedStmt.execute();
        Tela_Inicial.closeConnection(bd);        
        salvar_bd();
    }
    private void salvar_bd()throws SQLException{
        Connection bd = Tela_Inicial.getConnection();
        String query = "insert into tb_listening_primeiro_ano (questoe_enunciados_respostas) values (?)";
        PreparedStatement preparedStmt = bd.prepareStatement(query);
        for(int cont=0;cont<25;cont++){
            preparedStmt.setString (1, questoes[cont]);
            preparedStmt.execute();
        }
        for(int cont=0;cont<5;cont++){
            preparedStmt.setString (1, respostas_do_professor[cont]);
            preparedStmt.execute();
        }
        Tela_Inicial.closeConnection(bd); 
        JOptionPane.showMessageDialog(this,"Salvo com sucesso.","Salvamento",JOptionPane.INFORMATION_MESSAGE);
        salvar_finalizar.setText("Finalizar");
        cont_fechamento++;
    }
    
    
    private void salvar_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_finalizarActionPerformed
        
        if(cont_fechamento==0){
            
            try {
                salvar_dados();
            } catch (SQLException ex) {
                Logger.getLogger(Tela_EditarListeningPrimeiroAno.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{
            naoSavarActionPerformed(evt);
        }
    }//GEN-LAST:event_salvar_finalizarActionPerformed

    private void naoSavarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoSavarActionPerformed
        Tela_Editar_PrimeiroAno abrir = new Tela_Editar_PrimeiroAno();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_naoSavarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            pegar_bd();
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Editar_Grammar_PrimeiroAno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void salvar_finalizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_salvar_finalizarFocusLost
        cont_fechamento=0;
        salvar_finalizar.setText("Salvar");
    }//GEN-LAST:event_salvar_finalizarFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tela_Visualizar_ListeningPrimeiroAno1 abrir = new Tela_Visualizar_ListeningPrimeiroAno1();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void interrogacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interrogacaoActionPerformed
        JOptionPane.showMessageDialog(rootPane,"Lembre-se de salvar tudo antes de mudar a tela.");
    }//GEN-LAST:event_interrogacaoActionPerformed
    private void pegar_bd() throws SQLException{
        Connection bd = Tela_Inicial.getConnection();
        int cont=0,cont2=0;
        String query;
        query = "SELECT * FROM tb_listening_primeiro_ano";
        PreparedStatement preparedStmt = bd.prepareStatement(query);
        preparedStmt = bd.prepareStatement(query);
        ResultSet rs = preparedStmt.executeQuery();
        while(rs.next()){ 
            if(cont<25){
                questoes[cont]=rs.getString("questoe_enunciados_respostas");
                cont++;
            }
            else{
                respostas_do_professor[cont2]=rs.getString("questoe_enunciados_respostas");
                cont2++;
            }
        }
        rs.close();
	preparedStmt.close();
        Tela_Inicial.closeConnection(bd);
        organizar_questoes();
    }
    private void organizar_questoes(){
        Enunciado1.setText(questoes[0]);
        Enunciado2.setText(questoes[1]);
        Enunciado3.setText(questoes[2]);
        Enunciado4.setText(questoes[3]);
        Enunciado5.setText(questoes[4]);
        A_1_1.setText(questoes[5]);   A_1_2.setText(questoes[6]);   A_1_3.setText(questoes[7]);   A_1_4.setText(questoes[8]);   
        A_2_1.setText(questoes[9]);   A_2_2.setText(questoes[10]);   A_2_3.setText(questoes[11]);   A_2_4.setText(questoes[12]);
        A_3_1.setText(questoes[13]);   A_3_2.setText(questoes[14]);   A_3_3.setText(questoes[15]);   A_3_4.setText(questoes[16]);
        A_4_1.setText(questoes[17]);   A_4_2.setText(questoes[18]);   A_4_3.setText(questoes[19]);   A_4_4.setText(questoes[20]);
        A_5_1.setText(questoes[21]);   A_5_2.setText(questoes[22]);   A_5_3.setText(questoes[23]);   A_5_4.setText(questoes[24]);
        organizar_respostas();
    }
    private void organizar_respostas(){
        if(respostas_do_professor[0].equals("1")){
            Alt_1_1.setSelected(true);
        }
        else if(respostas_do_professor[0].equals("2")){
            Alt_1_2.setSelected(true);
        }
        else if(respostas_do_professor[0].equals("3")){
            Alt_1_3.setSelected(true);
        }
        else{
            Alt_1_4.setSelected(true);
        }
        
        if(respostas_do_professor[1].equals("1")){
            Alt_2_1.setSelected(true);
        }
        else if(respostas_do_professor[1].equals("2")){
            Alt_2_2.setSelected(true);
        }
        else if(respostas_do_professor[1].equals("3")){
            Alt_2_3.setSelected(true);
        }
        else{
            Alt_2_4.setSelected(true);
        }
        
        if(respostas_do_professor[2].equals("1")){
            Alt_3_1.setSelected(true);
        }
        else if(respostas_do_professor[2].equals("2")){
            Alt_3_2.setSelected(true);
        }
        else if(respostas_do_professor[2].equals("3")){
            Alt_3_3.setSelected(true);
        }
        else{
            Alt_3_4.setSelected(true);
        }
        
        if(respostas_do_professor[3].equals("1")){
            Alt_4_1.setSelected(true);
        }
        else if(respostas_do_professor[3].equals("2")){
            Alt_4_2.setSelected(true);
        }
        else if(respostas_do_professor[3].equals("3")){
            Alt_4_3.setSelected(true);
        }
        else{
            Alt_4_4.setSelected(true);
        }
        
        if(respostas_do_professor[4].equals("1")){
            Alt_5_1.setSelected(true);
        }
        else if(respostas_do_professor[4].equals("2")){
            Alt_5_2.setSelected(true);
        }
        else if(respostas_do_professor[4].equals("3")){
            Alt_5_3.setSelected(true);
        }
        else{
            Alt_5_4.setSelected(true);
        }

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_EditarListeningPrimeiroAno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_EditarListeningPrimeiroAno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_EditarListeningPrimeiroAno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_EditarListeningPrimeiroAno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_EditarListeningPrimeiroAno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A_1_1;
    private javax.swing.JTextField A_1_2;
    private javax.swing.JTextField A_1_3;
    private javax.swing.JTextField A_1_4;
    private javax.swing.JTextField A_2_1;
    private javax.swing.JTextField A_2_2;
    private javax.swing.JTextField A_2_3;
    private javax.swing.JTextField A_2_4;
    private javax.swing.JTextField A_3_1;
    private javax.swing.JTextField A_3_2;
    private javax.swing.JTextField A_3_3;
    private javax.swing.JTextField A_3_4;
    private javax.swing.JTextField A_4_1;
    private javax.swing.JTextField A_4_2;
    private javax.swing.JTextField A_4_3;
    private javax.swing.JTextField A_4_4;
    private javax.swing.JTextField A_5_1;
    private javax.swing.JTextField A_5_2;
    private javax.swing.JTextField A_5_3;
    private javax.swing.JTextField A_5_4;
    private javax.swing.JRadioButton Alt_1_1;
    private javax.swing.JRadioButton Alt_1_2;
    private javax.swing.JRadioButton Alt_1_3;
    private javax.swing.JRadioButton Alt_1_4;
    private javax.swing.JRadioButton Alt_2_1;
    private javax.swing.JRadioButton Alt_2_2;
    private javax.swing.JRadioButton Alt_2_3;
    private javax.swing.JRadioButton Alt_2_4;
    private javax.swing.JRadioButton Alt_3_1;
    private javax.swing.JRadioButton Alt_3_2;
    private javax.swing.JRadioButton Alt_3_3;
    private javax.swing.JRadioButton Alt_3_4;
    private javax.swing.JRadioButton Alt_4_1;
    private javax.swing.JRadioButton Alt_4_2;
    private javax.swing.JRadioButton Alt_4_3;
    private javax.swing.JRadioButton Alt_4_4;
    private javax.swing.JRadioButton Alt_5_1;
    private javax.swing.JRadioButton Alt_5_2;
    private javax.swing.JRadioButton Alt_5_3;
    private javax.swing.JRadioButton Alt_5_4;
    private javax.swing.JTextField Enunciado1;
    private javax.swing.JTextField Enunciado2;
    private javax.swing.JTextField Enunciado3;
    private javax.swing.JTextField Enunciado4;
    private javax.swing.JTextField Enunciado5;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Q5;
    private javax.swing.JButton interrogacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton naoSavar;
    private javax.swing.ButtonGroup questaoCorreta1;
    private javax.swing.ButtonGroup questaoCorreta2;
    private javax.swing.ButtonGroup questaoCorreta3;
    private javax.swing.ButtonGroup questaoCorreta4;
    private javax.swing.ButtonGroup questaoCorreta5;
    private javax.swing.JButton salvar_finalizar;
    // End of variables declaration//GEN-END:variables


}
