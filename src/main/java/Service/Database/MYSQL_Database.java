package Service.Database;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class MYSQL_Database {
	
	
	@Autowired
	JdbcTemplate template;
	
	public MYSQL_Database()
	{

		System.out.println("MYSQL_Database.MYSQL_Database()");
	}
	
	public void displayData()
	{
		List<Map<String ,Object>> userData = template.queryForList("SELECT * FROM apex.user");
		System.out.println(userData);
		
		ListIterator<Map<String ,Object>> itr = userData.listIterator();
		
		while(itr.hasNext())
		{
			Map<String ,Object> mapobj =(Map<String ,Object>) itr.next();
			System.out.println(mapobj);
		}
		
		
	}
	public void createData()
	 {
		 int numberOfRows= template.update("insert into apex.user(userid ,username ,passward )values (\"newUserId123_Nov2\" ,\"UserName123_Nov2\",\"password123_Nov2\")");
		 System.out.println("Number of rows inserted ...."+numberOfRows);
		 	
	 }
	 public void deleteData(int id)
	 {
		 int numberOfRows= template.update("delete from user where id = ?",id);
		 System.out.println("Number of rows inserted ...."+numberOfRows);
		 
	 }  
	
	
	
	
	
}
