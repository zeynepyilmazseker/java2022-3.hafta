package oopWithNLayeredKodlamaio.dataAccess;

import oopWithNLayeredKodlamaio.entities.Educator;

public class JdbcEducatorDao implements EducatorDao {
	public void add(Educator educator) {
		System.out.println("Jdbc ile veri tabanına eklendi.");
		
	}

}
