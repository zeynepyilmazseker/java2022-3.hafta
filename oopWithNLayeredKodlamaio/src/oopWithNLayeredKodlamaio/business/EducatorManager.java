package oopWithNLayeredKodlamaio.business;



import java.util.List;

import oopWithNLayeredKodlamaio.core.logging.Logger;
import oopWithNLayeredKodlamaio.dataAccess.EducatorDao;
import oopWithNLayeredKodlamaio.entities.Educator;

public class EducatorManager {
	private EducatorDao educatorDao;
	private List<Logger>loggers;
	

	public EducatorManager(EducatorDao educatorDao) {
		super();
		this.educatorDao = educatorDao;
	}
	
	public void add(Educator educator) {
		educatorDao.add(educator);
		
		for(Logger logger:loggers) {
			logger.log(educator.getName());
		}
		
	}
		
	}


