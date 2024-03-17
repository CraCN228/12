import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    private JButton buttonOK;
    private JTextField input;

    private JPanel panel1;

    int num=(int)Math.floor(Math.random()*10);
    public App() {

        input.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                Game();
            }
        });
    }

    public static void main(String[] args)
    {

    }
    private void Game()
    {
        while(true)
        {
            String x = input.getText();
            int value= Integer.parseInt(x);

            if(value==num)
            {
                System.out.println("Ты победил");
                break;
            }
            else if(value<num)
            {
                System.out.println("Загаданное число меньше");
            }
            else if(value>num)
            {
                System.out.println("Загаданное число больше");
            }
        }
    }

}
