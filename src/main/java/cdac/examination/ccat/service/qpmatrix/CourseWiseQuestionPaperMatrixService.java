package cdac.examination.ccat.service.qpmatrix;

import java.util.Collection;

import cdac.examination.ccat.domain.qpMatrix.CourseWiseQuestionPaperMatrix;

public interface CourseWiseQuestionPaperMatrixService {
	
	public CourseWiseQuestionPaperMatrix findCourseWiseQuestionPaperMatrixById(Long id);
	  
	  public CourseWiseQuestionPaperMatrix createCourseWiseQuestionPaperMatrix(CourseWiseQuestionPaperMatrix newCourseWiseQuestionPaperMatrix);

	  public CourseWiseQuestionPaperMatrix updateCourseWiseQuestionPaperMatrix(CourseWiseQuestionPaperMatrix courseWiseQuestionPaperMatrix);
	  
	  public boolean markCourseWiseQuestionPaperMatrixDeleted(CourseWiseQuestionPaperMatrix courseWiseQuestionPaperMatrix);

	  public Collection<CourseWiseQuestionPaperMatrix> getAllCourseWiseQuestionPaperMatrixs();

}