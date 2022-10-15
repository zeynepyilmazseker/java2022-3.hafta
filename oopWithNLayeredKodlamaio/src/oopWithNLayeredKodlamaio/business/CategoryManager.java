package oopWithNLayeredKodlamaio.business;

import java.util.List;

import oopWithNLayeredKodlamaio.core.logging.Logger;
import oopWithNLayeredKodlamaio.dataAccess.CategoryDao;
import oopWithNLayeredKodlamaio.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	private List<Category> categories;

	public void add(Category category) throws Exception {
		for (Category category1 : categories) {
			if (category1.getName() == category.getName()) {
				throw new Exception("Kategori ismi tekrar edemez.");
			}
			categoryDao.add(category);
			
		}
		
		for(Logger logger: loggers) {
			logger.log(category.getName());
			
			
		}

	}

}
