import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI15 {
    static int count=0;
    public static void main(String[] args) {
        JFrame jFrame=getFrame();
        JPanel jPanel =new JPanel();
        jFrame.add(jPanel,BorderLayout.SOUTH);
        JButton jButton = new JButton("Кликни на меня");
        jFrame.add(jButton);
        jFrame.setLocationRelativeTo(null);
        JLabel jLabel= new JLabel("Колличество нажатий: "+count);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                jLabel.setText("Колличество нажатий: "+count);
            }
        });
        jPanel.add(jLabel);
    }
    static JFrame getFrame(){
        JFrame jFrame= new JFrame(){};
        jFrame.setTitle("GUI14");
        jFrame.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setBounds(dim.width / 2 - 700 / 2, dim.height / 2 - 300 / 2, 700, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
