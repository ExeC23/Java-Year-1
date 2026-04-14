import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo {
    public static void main(String args[]) {
        
        // ANA PENCERE
        JFrame window = new JFrame("Benim Uygulamam");
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout()); // elemanları yan yana dizer
        
        // LABEL - sadece yazı gösterir
        JLabel label = new JLabel("Adın:");
        
        // TEXTFIELD - kullanıcı yazı girer
        JTextField textField = new JTextField(20); // 20 karakter genişlik
        
        // BUTTON - tıklanır
        JButton button = new JButton("Gönder");
        
        // TEXTAREA - çok satırlı yazı
        JTextArea textArea = new JTextArea(5, 20);
        
        // CHECKBOX
        JCheckBox checkBox = new JCheckBox("Kabul ediyorum");
        
        // BUTONA TIKLANINCA NE OLSUN
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                textArea.setText("Merhaba " + input + "!");
            }
        });
        
        // PENCEREYE EKLE
        window.add(label);
        window.add(textField);
        window.add(button);
        window.add(textArea);
        window.add(checkBox);
        
        // PENCEREYİ GÖSTER
        window.setVisible(true);
    }
}
