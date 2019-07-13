package polling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class connection {
	connection(){
		
		connect();
	}
	
	public Connection con;
	
	public void connect() {
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	   con=DriverManager.getConnection(
	    "jdbc:mysql://localhost:3306/polling","root","root");
	}catch (Exception e) {
		System.out.println(e);
	}
}
	public void addVoter(Voter v) {

		 try
		    {
		      
		      String query = " insert into voter(voterid, name,sex,age,area)"
		  	        + " values (?, ?, ?'?,?)";
	         PreparedStatement pStmt = con.prepareStatement(query);
		  	      pStmt.setInt (1, v.getVoterId());
		  	      pStmt.setString (2, v.getName());
		  	      pStmt.setString(3, v.getSex());
		  	    pStmt.setInt(4,v.getAge());
		  	      pStmt.setString(5, v.getArea());
		  	    
		  	    
		  	      pStmt.execute();
		    }
		    catch (Exception e)
		    {
		      System.err.println("addVoter");
		      
		    }
		}
		public void dispVoter(Voter v)
		{
			try
		    {
				
		      String query = "SELECT * FROM voter";
		      PreparedStatement pStmt = con.prepareStatement(query);
		      ResultSet rs = pStmt.executeQuery();
		      
		        System.out.format("%s, %s, %s,%s, %s\n",1,2,3,4,5);
		      
		     pStmt.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("addcon ");
		  
		    }
		  }

		public void addCan(Candidate c) {

			 try
			    {
			      
			      String query = " insert into candidate(party_name, count)"
			  	        + " values (?, ?)";
		         PreparedStatement pStmt = con.prepareStatement(query);
			  	      pStmt.setString (1, c.getParty_name());
			  	      pStmt.setInt (2, c.getCount());
			  	     
			  	    
			  	      pStmt.execute();
			    }
			    catch (Exception e)
			    {
			      System.err.println("addCan");
			      System.err.println(e.getMessage());
			    }
			}
			public void dispCan(Candidate c)
			{
				try
			    {
					
			      String query = "SELECT * FROM candidate";
			      PreparedStatement pStmt = con.prepareStatement(query);
			      ResultSet rs = pStmt.executeQuery();
			      
			        System.out.format("%s, %s\n",1,2);
			      
			     pStmt.close();
			    }
			    catch (Exception e)
			    {
			      System.err.println("discan ");
			      System.err.println(e.getMessage());
			    }
			  
}}
