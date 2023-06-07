package com.agyl.PBO.pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame {
    private JTextField TextName;
    private JTextField TextNIM;
    private JComboBox CBProdi;
    private JTextField TextTelp;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JTextArea TextAlamat;
    private JButton submitButton;
    private JButton cancelButton;

    private JPanel mainPanel;
    private JLabel lblprodi;

    public Registration(){
        super("Formulir Registrasi");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800,600);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextName.setText("");
                TextNIM.setText("");
                TextTelp.setText("");
                TextAlamat.setText("");
                lblprodi.setText("");
                maleRadioButton.setText("");
                femaleRadioButton.setText("");
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = TextName.getText();
                String nim = TextNIM.getText();
                String prodi = (String) CBProdi.getSelectedItem();
                String telp = TextTelp.getText();
                String alamat = TextAlamat.getText();
                String jk = TextName.getText();

                if(maleRadioButton.isSelected()){
                    jk = "Laki-Laki";
                } else if (femaleRadioButton.isSelected()) {
                    jk = "Perempuan";
                } else {
                    jk = "tidak diketahui";
                }

                JOptionPane.showMessageDialog
                        (null, "Data berhasil disimpan!");

            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }


}
