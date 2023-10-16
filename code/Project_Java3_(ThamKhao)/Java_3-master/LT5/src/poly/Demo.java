
package poly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Demo {

    
    public static void main(String[] args) {
        try {
            String user="sa";
            String pass="songlong";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://DESKTOP-L0KTUMB:1433;databaseName=SOF203";
            Connection cn= DriverManager.getConnection(url, user, pass);
            if(cn!=null){
                System.out.println("Ket noi thanh cong");
                String sql="select * from STUDENTS";
                Statement stm=cn.createStatement();
                //khai bao Resultset nhận kết quả của câu truy vấn Select
                ResultSet rs = stm.executeQuery(sql);
                
                //Duyet Resultset
                while(rs.next()){
                    System.out.println(rs.getString("Masv")+ "\t"+ rs.getString(1)+"\t"+ rs.getString(2));
                }
                
                rs.close();
                stm.close();
            }else{
                System.out.println("loi ket noi");
            }
        } catch (Exception e) {
            System.out.println("Gặp lỗi:"+ e);
        }
    }
    
}
