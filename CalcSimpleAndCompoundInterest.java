import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class CalcSimpleAndCompoundInterest extends JFrame implements ActionListener{
    JPanel panel;
    JTextField p,r,t,cp,cr,ct;
    JLabel heading,pl,rl,tl,output,cpl,crl,ctl,coutput,spacer;
    JButton btn,cbtn;

    public CalcSimpleAndCompoundInterest(){
        setSize(450,800); // Sets the size of the output window
        setTitle("Simple and Compound Interest Calculator");

        panel=new JPanel();
        panel.setBounds(10,30,100,180);
        panel.setBackground(Color.BLUE);
        panel.setLayout(null);
        add(panel);

        heading=new JLabel("Simple Interest Calclulator");
        heading.setBounds(140,20,200,20);
        heading.setBackground(Color.yellow);
        panel.add(heading);

        pl=new JLabel("Enter the Principle Amount :");
        pl.setBounds(10,60,200,20);
        panel.add(pl);

        p=new JTextField();
        p.setBounds(200,60,200,20);
        panel.add(p);

        rl=new JLabel("Enter Rate :");
        rl.setBounds(10,90,200,20);
        panel.add(rl);

        r=new JTextField();
        r.setBounds(200,90,200,20);
        panel.add(r);

        tl=new JLabel("Enter Time :");
        tl.setBounds(10,120,200,20);
        panel.add(tl);

        t=new JTextField();
        t.setBounds(200,120,200,20);
        panel.add(t);

        btn=new JButton("Calculte");
        btn.setBounds(155,170,90,40);
        btn.addActionListener(this);
        panel.add(btn);

        output=new JLabel("_________________________");
        output.setBounds(110,210,200,40);
        panel.add(output);

        spacer=new JLabel("..............................................................................................................................................................................................................................................");
        spacer.setBounds(0,230,450,40);
        panel.add(spacer);

//        For Compound Interest
        heading=new JLabel("Compound Interest Calclulator");
        heading.setBounds(140,280,200,20);
        heading.setBackground(Color.yellow);
        panel.add(heading);

        cpl=new JLabel("Enter the Principle Amount :");
        cpl.setBounds(10,310,200,20);
        panel.add(cpl);

        cp=new JTextField();
        cp.setBounds(200,310,200,20);
        panel.add(cp);

        crl=new JLabel("Enter Rate :");
        crl.setBounds(10,340,200,20);
        panel.add(crl);

        cr=new JTextField();
        cr.setBounds(200,340,200,20);
        panel.add(cr);

        ctl=new JLabel("Enter Time :");
        ctl.setBounds(10,370,200,20);
        panel.add(ctl);

        ct=new JTextField();
        ct.setBounds(200,370,200,20);
        panel.add(ct);

        cbtn=new JButton("Calculte");
        cbtn.setBounds(155,400,90,40);
        cbtn.addActionListener(this);
        panel.add(cbtn);

        coutput=new JLabel("_______________________");
        coutput.setBounds(110,440,230,40);
        panel.add(coutput);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(btn.isEnabled()){
            String s1= p.getText();
            String s2= r.getText();
            String s3= t.getText();

            float pr=Float.parseFloat(s1);
            float ra=Float.parseFloat(s2);
            float ti=Float.parseFloat(s3);
            float si;
            si=(pr * ra * ti)/100;
            output.setText("Simple Interest is : "+si);
        }
        if(cbtn.isEnabled()){
            String s1= cp.getText();
            String s2= cr.getText();
            String s3= ct.getText();

            float cpr=Float.parseFloat(s1);
            float cra=Float.parseFloat(s2);
            float cti=Float.parseFloat(s3);
            double ci;
            ci=cpr *(Math.pow((1+cra/100),cti))-cpr;
            coutput.setText("Compound Interest is : "+ci);
        }
    }

    public static void main(String args[]){
        new CalcSimpleAndCompoundInterest ();
    }
}


