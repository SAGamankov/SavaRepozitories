import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ForAntonBySavelii extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new ForAntonBySavelii();
    }
    JButton jbyes;
    JButton jbno;
    ForAntonBySavelii(){
        setSize(300,200);
        setLayout(null);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setResizable(false);

        jbyes=new JButton("yes");
        jbno=new JButton("no");
        jbyes.setBounds(50,95,60,35);
        jbno.setBounds(150,95,60,35);
        add(jbyes);
        add(jbno);

        JLabel Jl=new JLabel("take me in the team!!!");
        Jl.setBounds(15,25,300,50);
        Jl.setFont(new Font("Тагир", Font.ITALIC,25));
        add(Jl);
        jbyes.addActionListener(this);
        jbno.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jbyes){
            javax.swing.JOptionPane.showMessageDialog(null,"Thnks bro)");
            System.exit(0);
        }
        if(e.getSource()==jbno){
            for(int r=0;r<1000;r++){
                double zy=Math.random()*900;
                double zx=Math.random()*1450;
                int x=(int)zx;
                int y=(int)zy;

                setLocation(x,y);}
        }

    }


}


