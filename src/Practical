import java.sql.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TestMain {

    public void insert(Connection con, int rollno, String name, int marks) throws SQLException {
        PreparedStatement ps1 = con.prepareStatement("insert into student values(?,?,?)");
        ps1.setInt(1, rollno);
        ps1.setString(2, name);
        ps1.setInt(3, marks);
        ps1.executeUpdate();
    }

    public void delete(Connection con, int rollno) throws SQLException{
        PreparedStatement ps2 = con.prepareStatement("delete from student where rollno = ?");
        ps2.setInt(1, rollno);
        ps2.executeUpdate();
    }

    public void select(Connection con) throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from student");
        while(rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
        }
    }
}

class Student {
    public int rollno;
    public String name;
    public int marks;

    Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollno + ' ' + name + ' ' + marks;
    }
}

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atest", "root", "");) {

        TestMain obj = new TestMain();

        ArrayList<Student> list1 = new ArrayList();
        list1.add(new Student(1, "Raj", 78));
        list1.add(new Student(2, "Ram", 80));
        list1.add(new Student(3, "Yashank", 88));
        list1.add(new Student(4, "Saroj", 50));
        list1.add(new Student(5, "Shreya", 87));
        list1.add(new Student(6, "Sahil", 84));
        list1.add(new Student(7, "Vishal", 86));
        list1.add(new Student(8, "Tushar", 55));
        list1.add(new Student(9, "Neeraj", 78));
        list1.add(new Student(10, "Kunal", 77));

        for(Student list: list1) {
            String name = list.name;
            Pattern p = Pattern.compile("[a-zA-Z]*[j|j]");
            Matcher m = p.matcher(name);
            if(m.matches()) {
                obj.insert(con, list.rollno, list.name, list.marks);
            }
        }
        obj.select(con);
    } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
