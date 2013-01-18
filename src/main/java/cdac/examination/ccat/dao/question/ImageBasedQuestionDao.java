package cdac.examination.ccat.dao.question;

import java.util.Collection;

import cdac.examination.ccat.domain.question.ImageBasedQuestion;

/**
 * ImageBasedQuestionDao acts as a facade for obtaining {@link ImageBasedQuestion} objects from the
 * repository
 * 
 */
public interface ImageBasedQuestionDao {

	public ImageBasedQuestion findById(Long id);

	public Collection<ImageBasedQuestion> getAllImageBasedQuestions();

	public boolean deleteById(Long id);

	public boolean delete(ImageBasedQuestion imageBasedQuestion);

	public ImageBasedQuestion persistOrMerge(ImageBasedQuestion imageBasedQuestion);

	public long getNumberOfImageBasedQuestions();

}
