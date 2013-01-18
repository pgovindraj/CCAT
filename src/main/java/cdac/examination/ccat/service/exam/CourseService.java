package cdac.examination.ccat.service.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.Course;

public interface CourseService {
	
	public Course findCourseById(Long id);
	  
	  public Course createCourse(Course newCourse);

	  public Course updateCourse(Course course);
	  
	  public boolean markCourseDeleted(Course course);

	  public Collection<Course> getAllCourses();

}


