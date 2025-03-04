import java.awt.*;

class desktop {
    public static void main(String[] args) {
        Frame f = new Frame("My first window");
        Button b1 = new Button("5");
        Button b2 = new Button("4");
        Button b3 = new Button("3");
        Button b4 = new Button("2");
        Button b5 = new Button("1");
         FlowLayout f1 = new FlowLayout(2);
        f.setLayout(f1);
         f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setSize(300, 200); 
        f.setVisible(true);

       
    }
}
