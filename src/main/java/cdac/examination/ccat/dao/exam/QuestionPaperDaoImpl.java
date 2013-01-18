package cdac.examination.ccat.dao.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Repository;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.exam.QuestionPaper;

@Repository
public class QuestionPaperDaoImpl implements QuestionPaperDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public QuestionPaper findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(QuestionPaper questionPaper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public QuestionPaper persistOrMerge(QuestionPaper questionPaper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfQuestionPapers() {
		// TODO Auto-generated method stub
		return 0;
	}

}
