package Practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Milan_VS_Madrid extends JFrame
{
    int Milan = 0;
    int Madrid = 0;
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");

    JLabel label1 = new JLabel("Result: 0 X 0");
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: DRAW");


    public Milan_VS_Madrid()
    {
        setLayout(new GridLayout(2,3));
        setSize(500,500);

        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                Milan++;
                label1.setText("Result " + Milan + " X " + Madrid);
                label2.setText("Last Scorer: Milan");
                if(Milan > Madrid)
                {
                    label3.setText("Winner: Milan");
                }
                else if(Milan < Madrid)
                {
                    label3.setText("Winner: Madrid");
                }
                else
                {
                    label3.setText("Winner: Draw");
                }
            }
        });
        but2.addActionListener(new ActionListener()      // AnonActionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent ae)
            {
                Madrid++;
                label1.setText("Result " + Milan + " X " + Madrid);
                label2.setText("Last Scorer: Madrid");
                if(Milan > Madrid)
                {
                    label3.setText("Winner: Milan");
                }
                else if(Milan < Madrid)
                {
                    label3.setText("Winner: Madrid");
                }
                else
                {
                    label3.setText("Winner: Draw");
                }
            }
        });


        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize (275,125);
        add(but1);
        add(but2);
        add(label1);
        add(label2);
        add(label3);

        setVisible(true);
    }
}
