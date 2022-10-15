package oopWithNLayeredKodlamaio.dataAccess;

import oopWithNLayeredKodlamaio.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	public void add (Category category) {
		System.out.println("Jdbc ile veri tabanına eklendi.");
		
		
	}

	
}
