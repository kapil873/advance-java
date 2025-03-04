import java.awt.*;
class userform
{
    public static void main(String a[])
    {
        Frame f = new Frame("Registration Form");
        Label l1 = new Label("Student id");
        Label l2 = new Label("Student Password");
        Label l3 = new Label("Retype Password");
        Label l4 = new Label("Student Name");
        Label l5 = new Label("Student mobile n.o");
        Label l6 = new Label("Student email id");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();
        TextField t5 = new TextField();
        TextField t6 = new TextField();
        Button b =new Button("Submit");
        t2.setEchoChar('*');
        t3.setEchoChar('*');

        f.setLayout(null);
        l1.setBounds(100,100,200,50);
        l2.setBounds(100,200,200,50);
        l3.setBounds(100,300,200,50);
        l4.setBounds(100,400,200,50);
        l5.setBounds(100,500,200,50);
        l6.setBounds(100,600,200,50);
        t1.setBounds(400,100,250,50);
        t2.setBounds(400,200,250,50);
        t3.setBounds(400,300,250,50);
        t4.setBounds(400,400,250,50);
        t5.setBounds(400,500,250,50);
        t6.setBounds(400,600,250,50);

        b.setBounds(250,700,300,50);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(b);

        f.setSize(900,900);
        f.setVisible(true);
    }    
}