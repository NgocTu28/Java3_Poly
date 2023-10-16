
package util;

import javax.swing.JOptionPane;


public class Xhelper {
    public static boolean checkRong(String text,String mss){
        try {
            if(text.isEmpty()){
                JOptionPane.showMessageDialog(null, mss);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
