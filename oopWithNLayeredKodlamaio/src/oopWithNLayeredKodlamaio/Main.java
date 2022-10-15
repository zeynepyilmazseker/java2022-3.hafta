package oopWithNLayeredKodlamaio;

import java.util.List;

import oopWithNLayeredKodlamaio.business.CategoryManager;
import oopWithNLayeredKodlamaio.business.CourseManager;
import oopWithNLayeredKodlamaio.core.logging.DatabaseLogger;
import oopWithNLayeredKodlamaio.core.logging.FileLogger;
import oopWithNLayeredKodlamaio.core.logging.Logger;
import oopWithNLayeredKodlamaio.dataAccess.HibernateCourseDao;
import oopWithNLayeredKodlamaio.dataAccess.JdbcCategoryDao;
import oopWithNLayeredKodlamaio.dataAccess.JdbcCourseDao;
import oopWithNLayeredKodlamaio.entities.Category;
import oopWithNLayeredKodlamaio.entities.Course;

public class Main {
	Logger[] loggers={new DatabaseLogger(),new FileLogger()};

	public static void main(String[] args) throws Exception {
		Course course1=new Course("java",0);
	
		CourseManager courseManager=new CourseManager(new HibernateCourseDao());
		courseManager.add(course1);
		
		
		

	}

}
