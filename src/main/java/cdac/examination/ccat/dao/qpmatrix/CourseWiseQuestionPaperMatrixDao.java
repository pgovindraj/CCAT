package cdac.examination.ccat.dao.qpmatrix;

import java.util.Collection;

import cdac.examination.ccat.domain.qpMatrix.CourseWiseQuestionPaperMatrix;

/**
 * CourseWiseQuestionPaperMatrixDao acts as a facade for obtaining {@link CourseWiseQuestionPaperMatrix} objects from the
 * repository
 * 
 */
public interface CourseWiseQuestionPaperMatrixDao {

	public CourseWiseQuestionPaperMatrix findById(Long id);

	public CourseWiseQuestionPaperMatrix findByName(String courseWiseCourseWiseQuestionPaperMatrixName);

	public Collection<CourseWiseQuestionPaperMatrix> getAllCourseWiseQuestionPaperMatrixs();

	public boolean deleteById(Long id);

	public boolean delete(CourseWiseQuestionPaperMatrix courseWiseCourseWiseQuestionPaperMatrix);

	public CourseWiseQuestionPaperMatrix persistOrMerge(CourseWiseQuestionPaperMatrix courseWiseCourseWiseQuestionPaperMatrix);

	public long getNumberOfCourseWiseQuestionPaperMatrixs();

}
