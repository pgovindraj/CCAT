package cdac.examination.ccat.dao.qpmatrix;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.qpMatrix.QuestionPaperMatrix;

public class QuestionPaperMatrixDaoImpl implements QuestionPaperMatrixDao{

	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	
	@Override
	public QuestionPaperMatrix findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionPaperMatrix findByName(String questionPaperMatrixName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<QuestionPaperMatrix> getAllQuestionPaperMatrixs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(QuestionPaperMatrix questionPaperMatrix) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public QuestionPaperMatrix persistOrMerge(
			QuestionPaperMatrix questionPaperMatrix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfQuestionPaperMatrixs() {
		// TODO Auto-generated method stub
		return 0;
	}

}
