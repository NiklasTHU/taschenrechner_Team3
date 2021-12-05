import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaschenrechnerView {
    private JPanel mainPanel;
    private JTextField anzeige;
    private JButton nullButton;
    private JButton einsButton;
    private JButton zweiButton;
    private JButton dreiButton;
    private JButton vierButton;
    private JButton fünfButton;
    private JButton sechsButton;
    private JButton siebenButton;
    private JButton achtButton;
    private JButton neunButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton gleichButton;
    private JButton CButton;

    public TaschenrechnerView() {

        TaschenrechnerModel model = new TaschenrechnerModel();

        nullButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(nullButton);
            }
        });

        einsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(einsButton);
            }
        });
        zweiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(zweiButton);
            }
        });
        dreiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(dreiButton);
            }
        });
        vierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(vierButton);
            }
        });
        fünfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(fünfButton);
            }
        });
        sechsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(sechsButton);
            }
        });
        siebenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(siebenButton);
            }
        });
        achtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(achtButton);
            }
        });
        neunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText(neunButton);
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(Integer.parseInt(anzeige.getText()));
                model.setOperator("+");
                anzeige.setText(null);
            }
        });
        gleichButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setZweiterOperand(Integer.parseInt(anzeige.getText()));
                anzeige.setText(String.valueOf(model.getErgebnis()));
                model.zurücksetzen();
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(Integer.parseInt(anzeige.getText()));
                model.setOperator("-");
                anzeige.setText(null);
            }
        });


        CButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(null);
                model.zurücksetzen();

            }
        });
    }
    public void setText(JButton button){
        anzeige.setText(anzeige.getText() + button.getText());
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("TaschenrechnerView");
        frame.setContentPane(new TaschenrechnerView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
