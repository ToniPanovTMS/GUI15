import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI15 extends JFrame {
    static int count=0;

    public static void main(String[] args) {
        JFrame jFrame=getFrame();
        JPanel jPanel= new JPanel();
        jFrame.add(jPanel);

        SpinnerModel value =
                new SpinnerNumberModel(0,
                        0,
                        100,
                        1);
        JSpinner jSpinner = new JSpinner(value);
        jSpinner.setBounds(50,50,50,30);
        jPanel.add(jSpinner);
        jSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                count = (int) jSpinner.getValue();
            }
        });

        JButton jButton = new JButton("Ответить");

        jButton.setBounds(150,40,100,50);
        jPanel.add(jButton);

        JLabel jLabel = new JLabel("Ответ: "+count);
        jLabel.setLocation(260,40);
        jPanel.add(jLabel);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Ответ: "+count);
            }
        });



        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

/*    public static void main(String[] args) {
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

 */
   static JFrame getFrame(){
        JFrame jFrame= new JFrame(){};
        jFrame.setTitle("GUI14");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setBounds(dim.width / 2 - 400 / 2, dim.height / 2 - 150 / 2, 400, 150);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jFrame.setVisible(true);
        return jFrame;
    }
}
