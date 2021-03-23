package com.sujata.persistence;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Share;

public class ShareDaoImpl implements ShareDao {

	@Override
	public ArrayList<Share> getAllShareRecords() throws ClassNotFoundException,SQLException {
		//JDBC Code
		//1 Connect
		//1.1 Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//1.2 Connect to DB : Connection: getConnection(url of mysql,username of mysql, password of my sql)
		//getConnection(url of oracle, username of oracle,password of oracle) :factory design pattern
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cititraining", "root", "sujata");
		//Connection connection=new OraclerConnection(); , we are not doing it
		//2. Query
		PreparedStatement preparedStatement=connection.prepareStatement("select * from share");
		//executeQuery() is used to execute DQL Query : select
		ResultSet resultSet=preparedStatement.executeQuery();
		
		ArrayList<Share> shareList=new ArrayList<Share>();
		
		//3. Processing the Result
		while(resultSet.next()) {
			Share share=new Share();
			share.setInstrumentId(resultSet.getInt("instrumentId"));
			share.setInstrumentName(resultSet.getString("instrumentName"));
			share.setMarketRate(resultSet.getInt("marketRate"));
			
			shareList.add(share);
			
			
		}
		//4. Close 
		connection.close();
		return shareList;
	}

	@Override
	public boolean insertShareRecord(Share share) throws ClassNotFoundException, SQLException {
				//JDBC Code
				//1 Connect
				//1.1 Register Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//1.2 Connect to DB
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cititraining", "root", "sujata");
				
				//2. Query
				PreparedStatement preparedStatement=connection.prepareStatement("insert into Share values(?,?,?)");
				preparedStatement.setInt(1, share.getInstrumentId());
				preparedStatement.setString(2, share.getInstrumentName());
				preparedStatement.setInt(3, share.getMarketRate());
				
				//executeUpdate() is used to execute DML Query : Data Manipulation Language (Insert, delete, update)
				int rows=preparedStatement.executeUpdate();
				
				connection.close();
				
				if(rows>0)
					return true;
				
				return false;
	}

	@Override
	public Share searchShareById(int shareId) throws ClassNotFoundException, SQLException {
		//JDBC Code
				//1 Connect
				//1.1 Register Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//1.2 Connect to DB
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cititraining", "root", "sujata");
				
				//2. Query
				PreparedStatement preparedStatement=connection.prepareStatement("select * from share where instrumentId=?");
				preparedStatement.setInt(1, shareId);
				
				//executeQuery() is used to execute DQL Query : select
				ResultSet resultSet=preparedStatement.executeQuery();
				
				Share share=null;
				
				if(resultSet.next()) {
					share=new Share();
					share.setInstrumentId(resultSet.getInt("instrumentId"));
					share.setInstrumentName(resultSet.getString("instrumentName"));
					share.setMarketRate(resultSet.getInt("marketRate"));
				}
					
		return share;
	}

}
