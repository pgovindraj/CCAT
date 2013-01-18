package cdac.examination.ccat.dao.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.Course;

/**
 * CourseDao acts as a facade for obtaining {@link Course} objects from the
 * repository
 * 
 */
public interface CourseDao {

	public Course findById(Long id);

	public Course findByName(String courseName);

	public Collection<Course> getAllCourses();

	public boolean deleteById(Long id);

	public boolean delete(Course course);

	public Course persistOrMerge(Course course);

	public long getNumberOfCourses();

}
