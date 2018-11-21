
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSQLiteConnection {

    public static void main(String[] args) {

            try {

// setup

                Class.forName("org.sqlite.JDBC");
                String dbURL = "jdbc:sqlite:spendee.db";
                Connection conn = DriverManager.getConnection(dbURL);

                if (conn != null) {

                    System.out.println("Connected to the database....");

// display database information

                    DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                    System.out.println("Driver name: " + dm.getDriverName());
                    System.out.println("Product name: " + dm.getDatabaseProductName());

// execute SQL statements

                    System.out.println("----- Data in expense table -----");
                    String query = "Select * from expense";
                    Statement statement = conn.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);

                    while (resultSet.next()) {
                        String id = resultSet.getString(1);
                        String name = resultSet.getString(2);
                        String surname = resultSet.getString(3);
                        double totalIncome = resultSet.getDouble(4);
                        double totalExpense = resultSet.getDouble(5);
                        double total = resultSet.getDouble(6);
                        System.out.println("userID: "+id+" name: "+name+" "+surname+" totalIncome: "+totalIncome+" totalExpense: "+totalExpense+" total: "+total);

                    }

// close connection

                    conn.close();

                }

            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();

            } catch (SQLException ex) {
                ex.printStackTrace();

            }

        }

    }

