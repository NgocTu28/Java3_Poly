package Helper;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class XHelper {

    public static boolean checkRong(JTextField txt, String mss) {
        try {
            if (txt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, mss);
                txt.requestFocus();
                txt.setBackground(Color.YELLOW);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Lỗi check rỗng");
        }
        txt.setBackground(Color.white);
        return false;
    }

    public static boolean checkNuaKhoang(JTextField txt, String mss, int so) {
        try {
            double x;
            x = Double.parseDouble(txt.getText());
            if (x <= so) {
                JOptionPane.showMessageDialog(null, mss);
                txt.setBackground(Color.YELLOW);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi check nửa khoảng");
        }
        txt.setBackground(Color.white);
        return false;
    }

    public static boolean checkDinhDangEmail(JTextField txt, String pattern, String mss) {
        try {
            if (!txt.getText().matches(pattern)) {
                JOptionPane.showMessageDialog(null, mss);
                txt.requestFocus();
                txt.setBackground(Color.YELLOW);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi check định dạng");
        }
        txt.setBackground(Color.white);
        return false;
    }

    public static boolean checkKhongPhaiSo(JTextField txt, String mss) {
        double xx;
        try {
            xx = Double.parseDouble(txt.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, mss);
            txt.requestFocus();
            txt.setBackground(Color.YELLOW);
            return true;
        }
        txt.setBackground(Color.white);
        return false;
    }
    
    public static boolean checkMien(JTextField txt, int a, int b, String mss) {
        try {
            int x = Integer.parseInt(txt.getText());
            if (x < a || x > b) {
                JOptionPane.showMessageDialog(null, mss);
                txt.setBackground(Color.YELLOW);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi check Miền");
        }
        txt.setBackground(Color.white);
        return false;
    }

    public static boolean checkString(JTextField txt, String mss) {
        try {
            Integer.parseInt(txt.getText());
            JOptionPane.showMessageDialog(null, mss);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }

}
