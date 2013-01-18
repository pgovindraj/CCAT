package cdac.examination.ccat.dao.question;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.question.TextNImageBasedQuestion;

public class TextNImageBasedQuestionDaoImpl implements TextNImageBasedQuestionDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public TextNImageBasedQuestion findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<TextNImageBasedQuestion> getAllTextNImageBasedQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(TextNImageBasedQuestion textNImageBasedQuestion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TextNImageBasedQuestion persistOrMerge(
			TextNImageBasedQuestion textNImageBasedQuestion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfTextNImageBasedQuestions() {
		// TODO Auto-generated method stub
		return 0;
	}

}
