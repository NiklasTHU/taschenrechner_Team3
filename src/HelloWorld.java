import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    public HelloWorld() {
        halloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(halloButton, "Herzlich Willkommen!");
                String name = nameField.getText();
//                System.out.println(name);
//                JOptionPane.showMessageDialog(halloButton, "Hallo, " + name);
                boolean informell = informalCheckBox.isSelected();
                if (informell){
                    JOptionPane.showMessageDialog(halloButton, "Yo, " + name);
                }else{
                    JOptionPane.showMessageDialog(halloButton, "Herzlich willkommen, " + name);
                }
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
}
