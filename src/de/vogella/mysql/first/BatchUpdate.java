package de.vogella.mysql.first;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BatchUpdate {
	private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    public void readDataBase() throws Exception{
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
    		connection = DriverManager
                    .getConnection("jdbc:mysql://localhost/feedback?"
                            + "user=root&password=admin");
    		 statement = connection.createStatement();
    		 resultSet = statement.executeQuery("select * from feedback.comments");
    	}
    }
}
