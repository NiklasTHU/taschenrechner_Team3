import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HelloWorld {
    public HelloWorld() {
        halloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grußAusgeben();
            }
        });
        nameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Color mintgruen = Color.decode("#ade3d1");
                nameField.setBackground(mintgruen);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                nameField.setBackground(null);
            }
        });
        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grußAusgeben();
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new HelloWorld().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton halloButton;
    private JPanel mainPanel;
    private JTextField nameField;
    private JLabel NameEingebenLabel;
    private JCheckBox informalCheckBox;

    public void grußAusgeben(){;
        String name = this.nameField.getText();

        boolean informell = informalCheckBox.isSelected();
        if (informell) {
            JOptionPane.showMessageDialog(halloButton, "Yo, " + name);
        } else {
            JOptionPane.showMessageDialog(halloButton, "Herzlich willkommen, " + name);
        }
    }
}
