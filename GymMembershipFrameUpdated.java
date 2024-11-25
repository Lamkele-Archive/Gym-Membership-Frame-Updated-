
package za.ac.tut.ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.border.*;
import za.ac.tut.membership.Member;

public class GymMembershipFrameUpdated extends JFrame{
    
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel clientPnl;
    private JPanel contractTypePnl;
    private JPanel personalTrainerOptionPnl;
    private JPanel membershipPnl;
    private JPanel memberDetailsPnl;
    private JPanel btnsPnl;
    private JPanel headingClientCombinedPnl;
    private JPanel membershipMemberDetailsPnl;
    private JPanel mainPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNoLbl;
    private JLabel genderLbl;
    private JLabel contractTypeLbl;
    private JLabel personalTrainerOptionLbl;
    
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField idNoTxtFld;
    
    private JTextArea memberDetailsTxtArea;
    private JScrollPane scrollableTxtArea;
    
    private JComboBox genderComboBox;
    
    private JRadioButton monthToMonthRadBtn;
    private JRadioButton sixMonthsRadBtn;
    private JRadioButton annualRadBtn;
    
    private JCheckBox personalTrainerChkBx;
    
    private ButtonGroup btnGrp;
    
    private JButton registerBtn;
    private JButton searchBtn;
    private JButton updateBtn;
    private JButton removeBtn;
    private JButton displayAllBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    private ArrayList<Member> members;
    
    public GymMembershipFrameUpdated(){
        
        setTitle("Gym Membership");
        setSize(600,750);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        members = new ArrayList<>();
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientPnl = new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,2),"Client details"));
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershipPnl = new JPanel(new GridLayout(2,1,1,1));
        membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,2),"Contract options"));
        contractTypePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptionPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        memberDetailsPnl = new JPanel(new GridLayout(2,1,1,1));
        memberDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,2),"Member(s) details"));
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinedPnl = new JPanel(new BorderLayout());
        membershipMemberDetailsPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Membership Form");
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD, 20));
        headingLbl.setForeground(Color.PINK);
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        nameLbl = new JLabel("Name:");
        surnameLbl = new JLabel("Surname:");
        idNoLbl = new JLabel("ID No:");
        genderLbl = new JLabel("gender:");
        contractTypeLbl = new JLabel("Type of contract:");
        personalTrainerOptionLbl = new JLabel("Select the checkbox if you need a personal trainer");
        
        nameTxtFld = new JTextField(10);
        surnameTxtFld = new JTextField(10);
        idNoTxtFld = new JTextField(10);
        
        genderComboBox = new JComboBox();
        genderComboBox.addItem("Female");
        genderComboBox.addItem("Male");
        
        monthToMonthRadBtn = new  JRadioButton("Month-to-Month");
        sixMonthsRadBtn = new JRadioButton("Six Months");
        annualRadBtn = new JRadioButton("Annual");
        
        btnGrp = new ButtonGroup();
        btnGrp.add(monthToMonthRadBtn);
        btnGrp.add(sixMonthsRadBtn);
        btnGrp.add(annualRadBtn);
        
        personalTrainerChkBx = new JCheckBox();
        
        memberDetailsTxtArea = new JTextArea(15,50);
        memberDetailsTxtArea.setEditable(false);
        memberDetailsTxtArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Member(s) Details"));
        scrollableTxtArea = new JScrollPane(memberDetailsTxtArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        registerBtn = new JButton("REGISTER");
        registerBtn.addActionListener(new RegisterBtnListener());
        
        searchBtn = new JButton("SEARCH");
        removeBtn = new JButton("REMOVE");
        updateBtn = new JButton("UPDATE");
        displayAllBtn = new JButton("DISPLAY ALL");
        clearBtn = new JButton("CLEAR");
        exitBtn = new JButton("EXIT");
        exitBtn.addActionListener(new ExitBtnListener());
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        idNoPnl.add(idNoLbl);
        idNoPnl.add(idNoTxtFld);
        
        genderPnl.add(genderLbl);
        genderPnl.add(genderComboBox);
        
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idNoPnl);
        clientPnl.add(genderPnl);
        
        headingClientCombinedPnl.add(headingPnl,BorderLayout.NORTH);
        headingClientCombinedPnl.add(clientPnl, BorderLayout.CENTER);
        
        contractTypePnl.add(contractTypeLbl);
        contractTypePnl.add(monthToMonthRadBtn);
        contractTypePnl.add(sixMonthsRadBtn);
        contractTypePnl.add(annualRadBtn);
        
        personalTrainerOptionPnl.add(personalTrainerOptionLbl);
        personalTrainerOptionPnl.add(personalTrainerChkBx);
        
        membershipPnl.add(contractTypePnl);
        membershipPnl.add(personalTrainerOptionPnl);
        
        memberDetailsPnl.add(scrollableTxtArea);
        
        membershipMemberDetailsPnl.add(membershipPnl, BorderLayout.NORTH);
        membershipMemberDetailsPnl.add(memberDetailsPnl, BorderLayout.CENTER);
        
        btnsPnl.add(registerBtn);
        btnsPnl.add(searchBtn);
        btnsPnl.add(updateBtn);
        btnsPnl.add(removeBtn);
        btnsPnl.add(displayAllBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(headingClientCombinedPnl, BorderLayout.NORTH);
        mainPnl.add(membershipMemberDetailsPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        pack();
        setVisible(true);
    }

        private class RegisterBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameTxtFld.getText();
            String surname = surnameTxtFld.getText();
            String idNo = idNoTxtFld.getText();
            String gender = (String)genderComboBox.getSelectedItem();
            Boolean isPersonalTrainerNeeded = personalTrainerChkBx.isSelected();
            String contractType = "Month-To-Month";
            
            if(sixMonthsRadBtn.isSelected()){
                contractType = "Six Months";
            }else if(annualRadBtn.isSelected()){
                contractType="Annual";
            }
             Member member = new Member(name, surname, idNo, gender, contractType, isPersonalTrainerNeeded);
             members.add(member);
        
            memberDetailsTxtArea.setText("This member has been successfully added");
        }
              
    }
    
    private class ClearBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            nameTxtFld.setText("");
            surnameTxtFld.setText("");
            idNoTxtFld.setText("");
            personalTrainerChkBx.setSelected(false);
            btnGrp.clearSelection();
            memberDetailsTxtArea.setText("");
            
            nameTxtFld.setFocusable(true);
        }
        
    }
    
    private class ExitBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(1);
        }
        
    }
}


