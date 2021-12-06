package internal_assessment;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidData extends RuntimeException {
    InvalidData(String str) {
        super(str);
    }
}

public class Assignment {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/internal_marks", "root", "");

        String q = "insert into info values(?,?);";

        PreparedStatement ps = con.prepareStatement(q);

        Scanner scan = new Scanner(System.in);
        String phoneno = scan.next();
        String name = scan.next();

        Pattern p = Pattern.compile("[0|91]?[789][0-9]{9}");
        Matcher m = p.matcher(phoneno);
        boolean b = m.matches();

        if(b) {
            ps.setString(1, phoneno);
            ps.setString(2, name);
            ps.executeUpdate();
            System.out.println("Data entered successfully");
        } else {
            throw new InvalidData("The phone number you entered is not valid");
        }

        con.close();
    }
}