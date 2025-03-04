import java.awt.*;

public class items {
    public static void main(String[] args) {
        Frame f = new Frame("Items");
        List l = new List();
        l.add("c");
        l.add("C++");
        l.add("Java");
        l.add("PHP");
        l.add("Python");
        l.add(".NET");
        f.setLayout(null);
        l.setBounds(50, 50, 200, 150);
        f.add(l);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
