package cdac.examination.ccat.dao.question;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.question.Question;

public class QuestionDaoImpl implements QuestionDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public Question findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Question question) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Question persistOrMerge(Question question) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfQuestions() {
		// TODO Auto-generated method stub
		return 0;
	}

}
