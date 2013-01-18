package cdac.examination.ccat.dao.question;

import java.util.Collection;

import cdac.examination.ccat.domain.question.TextBasedQuestion;

/**
 * TextBasedQuestionDao acts as a facade for obtaining {@link TextBasedQuestion} objects from the
 * repository
 * 
 */
public interface TextBasedQuestionDao {

	public TextBasedQuestion findById(Long id);

	public TextBasedQuestion findByName(String textBasedQuestionName);

	public Collection<TextBasedQuestion> getAllTextBasedQuestions();

	public boolean deleteById(Long id);

	public boolean delete(TextBasedQuestion textBasedQuestion);

	public TextBasedQuestion persistOrMerge(TextBasedQuestion textBasedQuestion);

	public long getNumberOfTextBasedQuestions();

}