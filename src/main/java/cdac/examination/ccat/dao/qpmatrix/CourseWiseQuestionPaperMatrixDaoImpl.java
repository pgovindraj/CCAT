package cdac.examination.ccat.dao.qpmatrix;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.qpMatrix.CourseWiseQuestionPaperMatrix;

public class CourseWiseQuestionPaperMatrixDaoImpl implements CourseWiseQuestionPaperMatrixDao{

	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;
	
	@Override
	public CourseWiseQuestionPaperMatrix findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseWiseQuestionPaperMatrix findByName(
			String courseWiseCourseWiseQuestionPaperMatrixName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<CourseWiseQuestionPaperMatrix> getAllCourseWiseQuestionPaperMatrixs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(
			CourseWiseQuestionPaperMatrix courseWiseCourseWiseQuestionPaperMatrix) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CourseWiseQuestionPaperMatrix persistOrMerge(
			CourseWiseQuestionPaperMatrix courseWiseCourseWiseQuestionPaperMatrix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfCourseWiseQuestionPaperMatrixs() {
		// TODO Auto-generated method stub
		return 0;
	}

}
