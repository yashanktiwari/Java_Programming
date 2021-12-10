package challengeQuestion;

/*
Develop a jdbc program containing main method, which should instantiate a class called DAOClass,
which should contain methods called insert, delete, modify and display.
Description of what each of these methods are expected to do is given below.
Necessary details required for executing these methods, are passed from command line argument.
For e.g. If the name of the class containing the main method is JDBCCalls,
then if you want to insert a record, you will execute this class as
java JDBCCalls 1 101 “Ajit” “IV” “20-Nov-2001” 4000
Where 1 is the option for inserting the record and all other details are the values for
the columns in each row of the student table.
The structure of student table is given below.
Similarly, for deleting a record, you have to execute the code as java JDBCCalls 2 101
where 2 is the option for deleting a record and 101 is the rollno of the student,
whose record has to be deleted.
For modifying a record, you will use
java JDBCCalls 3 101 4500, where 3 is the option for modifying a record and the 4500 is the
new fee which needs to replace the old fee value.
For Displaying records, if the main class is executed as follows
java JDBCCalls 4 101
it should display only one record, that of the student with roll no. 101.
4 option is for displaying the record.
If the main class is executed as
java JDBCCalls 4 (without specifying the rollno.), it means that details of all the students
should be displayed.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCCalls {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int n = Integer.parseInt(args[0]);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
        DAOClass obj = new DAOClass();

        switch (n) {
            case 1:
                //inserting a record
                obj.insert(con, Integer.parseInt(args[1]), args[2], args[3], args[4], Integer.parseInt(args[5]));
                break;
            case 2:
                //deleting a record
                obj.delete(con, Integer.parseInt(args[1]));
                break;
            case 3:
                //modifying a record
                obj.modify(con, Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;
            case 4:
                //displaying a record
                if(args[1].equals("null")) {
                    obj.displayAll(con);
                } else {
                    obj.display(con, Integer.parseInt(args[1]));
                }
                break;
            default:
                System.out.println("Please enter a valid number");
                break;
        }
        con.close();
    }
}

class DAOClass {
    public void insert(Connection con, int empid, String name, String experince, String dob, int stipend) throws SQLException{
        String a = "insert into employee values(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(a);
        ps.setInt(1, empid);
        ps.setString(2, name);
        ps.setString(3, experince);
        ps.setString(4, dob);
        ps.setInt(5, stipend);
        ps.executeUpdate();
        System.out.println("Data inserted successfully");
    }

    public void delete(Connection con, int empid) throws SQLException {
        String b = "Delete from employee WHERE empid='" + empid +"';";
        PreparedStatement ps = con.prepareStatement(b);
        ps.executeQuery();
        System.out.println("Data deleted successfully");
    }

    public void modify(Connection con, int empid, int stipend) throws SQLException {
        String c = "UPDATE employee SET stipend ='"+ stipend + "' WHERE empid='" + empid + "'";
        PreparedStatement ps = con.prepareStatement(c);
        ps.executeUpdate();
        System.out.println("Data successfully modified");
    }

    public void display(Connection con, int empid) throws SQLException {
        String d = "select * from employee where empid='" + empid + "'";
        PreparedStatement ps = con.prepareStatement(d);
        ps.executeQuery();
    }

    public void displayAll(Connection con) throws SQLException {
        String e = "select * from employee";
        PreparedStatement ps = con.prepareStatement(e);
        ps.executeQuery();
    }
}