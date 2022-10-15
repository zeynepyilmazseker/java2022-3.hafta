package oopWithNLayeredKodlamaio.business;


import java.util.List;

import oopWithNLayeredKodlamaio.core.logging.Logger;
import oopWithNLayeredKodlamaio.dataAccess.CourseDao;
import oopWithNLayeredKodlamaio.dataAccess.JdbcCourseDao;
import oopWithNLayeredKodlamaio.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Course> courses;
	private List<Logger>loggers;

	public CourseManager(CourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	public void add(Course course) throws Exception {

		for (Course course1 : courses) {
			if (course1.getName() == course.getName() && course.getPrice() < 0) {
				throw new Exception("kurs ismi tekrar edemez ve kurs fiyatı sıfırdan küçük olamaz.");
			}

			courseDao.add(course);
			for(Logger logger: loggers) {
				logger.log(course.getName());
			}
		}

	}

}
