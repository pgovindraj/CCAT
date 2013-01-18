package cdac.examination.ccat.dao.question;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.question.ImageBasedQuestion;

public class ImageBasedQuestionDaoImpl implements ImageBasedQuestionDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public ImageBasedQuestion findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ImageBasedQuestion> getAllImageBasedQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ImageBasedQuestion imageBasedQuestion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ImageBasedQuestion persistOrMerge(
			ImageBasedQuestion imageBasedQuestion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfImageBasedQuestions() {
		// TODO Auto-generated method stub
		return 0;
	}

}
