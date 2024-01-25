import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LanguageSwitcherApp extends JFrame {
    private JLabel label;
    private JButton thaiButton;
    private JButton englishButton;

    public LanguageSwitcherApp() {
        setTitle("Language Switcher");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Hello");
        thaiButton = new JButton("ภาษาไทย");
        englishButton = new JButton("English");

        thaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // เปลี่ยนข้อความเป็นภาษาไทย
                label.setText("สวัสดี");
            }
        });

        englishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // เปลี่ยนข้อความเป็นภาษาอังกฤษ
                label.setText("Hello");
            }
        });

        add(label);
        add(thaiButton);
        add(englishButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LanguageSwitcherApp().setVisible(true);
            }
        });
    }
}