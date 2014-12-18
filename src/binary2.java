/**
 * Created by Administrator on 18.12.14.
 */

import javax.swing.JOptionPane;
public class binary2 {
    int i;
    String n;

    public void Scan() {
        n = JOptionPane.showInputDialog("Введите любое целое положительное число");
        i = Integer.parseInt(n);
    }

    public void Scan(int a) {
        JOptionPane.showMessageDialog(null,"Ваше число в двоичной системе исчесления = "+Integer.toBinaryString(i));
    }
   }