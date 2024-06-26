//<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Student Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        h2, h3 {
            color: #333;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Welcome, <%= session.getAttribute("username") %></h2>
    <h3>Attendance Records</h3>
    <table>
        <tr>
            <th>Date</th>
            <th>Status</th>
        </tr>
    
        <%
       
            
            try {
            	 PreparedStatement  ps=null;
                 Connection  con =null;
            	String  username = (String) session.getAttribute("username");
                 
                // Load the Oracle JDBC Driver
                Class.forName("oracle.jdbc.driver.OracleDriver");

                // Establish the database connection
                    con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","tiger");

                // Prepare the SQL query
                
                 ps = con.prepareStatement("SELECT ATTENDANCE_DATE, STATUS FROM attendance WHERE STUDENT_ID = (SELECT id FROM students WHERE username = ?)");
                ps.setString(1, username);

                // Execute the query and process the result set
                ResultSet  rs= ps.executeQuery();
           
                while (rs.next()) {
        %>
        
        <tr>
            <td><%= rs.getString(1) %></td>
            <td><%= rs.getString(2) %></td>
        </tr>
        <%
                }
            } catch (ClassNotFoundException e) {
                out.println("<p>Error: Unable to load database driver. Please check if the JDBC driver is added to the classpath.</p>");
               e.printStackTrace(); 
            } catch (SQLException e) {
                out.println("<p>Error: Unable to connect to the database or execute query. Please check the connection details and SQL syntax.</p>");
                e.printStackTrace(); 
            } 
        %>
    </table>
</body>
</html>>