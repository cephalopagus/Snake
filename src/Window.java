import javax.swing.*;

public class Window extends JFrame {

    public Window(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new Game());
        setVisible(true);
    }

    public static void main(String[] args) {
        Window mw = new Window();
    }
}