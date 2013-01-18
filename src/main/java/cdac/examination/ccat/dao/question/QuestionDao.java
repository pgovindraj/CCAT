package cdac.examination.ccat.dao.question;

import java.util.Collection;

import cdac.examination.ccat.domain.question.Question;

/**
 * QuestionDao acts as a facade for obtaining {@link Question} objects from the
 * repository
 * 
 */
public interface QuestionDao {

	public Question findById(Long id);

	public Collection<Question> getAllQuestions();

	public boolean deleteById(Long id);

	public boolean delete(Question question);

	public Question persistOrMerge(Question question);

	public long getNumberOfQuestions();

}
