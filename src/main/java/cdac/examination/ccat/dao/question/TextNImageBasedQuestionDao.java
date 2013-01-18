package cdac.examination.ccat.dao.question;

import java.util.Collection;

import cdac.examination.ccat.domain.question.TextNImageBasedQuestion;

/**
 * TextNImageBasedQuestionDao acts as a facade for obtaining {@link TextNImageBasedQuestion} objects from the
 * repository
 * 
 */
public interface TextNImageBasedQuestionDao {

	public TextNImageBasedQuestion findById(Long id);

	public Collection<TextNImageBasedQuestion> getAllTextNImageBasedQuestions();

	public boolean deleteById(Long id);

	public boolean delete(TextNImageBasedQuestion textNImageBasedQuestion);

	public TextNImageBasedQuestion persistOrMerge(TextNImageBasedQuestion textNImageBasedQuestion);

	public long getNumberOfTextNImageBasedQuestions();

}
