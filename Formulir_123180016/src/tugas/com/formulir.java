package tugas.com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class formulir extends JFrame{

    JLabel hobby, nama, jenis_kelamin, alamat,perempuan,laki_laki;
    JTextField th, tn;
    JTextArea ta;

    public void cetak_Formulir(){
        setTitle("BIODATA DIRI");
        JButton btncetak = new JButton("Cetak");
        nama = new JLabel ("Nama");
        hobby = new JLabel ("Hobby");
        jenis_kelamin = new JLabel ("Kelamin");
        alamat = new JLabel("Alamat");
        tn= new JTextField();
        th =new JTextField();
        ta = new JTextArea();
        JRadioButton l = new JRadioButton(" Laki-Laki ");
        JRadioButton p = new JRadioButton("perempuan ");
        perempuan = new JLabel("perempuan");
        laki_laki = new JLabel("Laki");


        ButtonGroup group = new ButtonGroup();
        group.add(p);
        group.add(l);


        setLayout(null);
        add(btncetak);
        add(nama);
        add(hobby);
        add(jenis_kelamin);
        add(alamat);
        add(th);
        add(tn);
        add(ta);
        add(p);
        add(l);
        add(perempuan);
        add(laki_laki);

        nama.setBounds(10,20,100,20);
        hobby.setBounds(10,50,100,20);
        tn.setBounds(120,20,120,20);
        th.setBounds(120,50,120,20);
        jenis_kelamin.setBounds(10,80,100,20);
        alamat.setBounds(10,110,100,20);
        ta.setBounds(120,110,120,50);
        p.setBounds (120,80, 20,20);
        perempuan.setBounds(150,80,100,20);
        l.setBounds(260,80,20,20);
        laki_laki.setBounds(290,80,100,20);
        btncetak.setBounds(120,170,100,20);


        setSize(500, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        btncetak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Jk="";
                if (l.isSelected()){
                    Jk = l.getText();
                }else{
                    Jk = p.getText();
                }
                String nama = tn.getText();
                String nim = th.getText();
                String alamat = ta.getText();


                System.out.println("NIM = "+ nim);
                System.out.println("Nama = "+ nama);
                System.out.println("Kelamin = "+ Jk);
                System.out.println("Alamat = "+ alamat);

            }
        });

    }
}