package cdac.examination.ccat.dao.question;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.question.TextBasedQuestion;

public class TextBasedQuestionDaoImpl implements TextBasedQuestionDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public TextBasedQuestion findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TextBasedQuestion findByName(String textBasedQuestionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<TextBasedQuestion> getAllTextBasedQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(TextBasedQuestion textBasedQuestion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TextBasedQuestion persistOrMerge(TextBasedQuestion textBasedQuestion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfTextBasedQuestions() {
		// TODO Auto-generated method stub
		return 0;
	}

}
