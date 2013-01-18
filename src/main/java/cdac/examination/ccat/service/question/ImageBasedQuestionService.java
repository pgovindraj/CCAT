package cdac.examination.ccat.service.question;

import java.util.Collection;

import cdac.examination.ccat.domain.question.ImageBasedQuestion;

public interface ImageBasedQuestionService {
	
	public ImageBasedQuestion findImageBasedQuestionById(Long id);
	  
	  public ImageBasedQuestion createImageBasedQuestion(ImageBasedQuestion newImageBasedQuestion);

	  public ImageBasedQuestion updateImageBasedQuestion(ImageBasedQuestion imageBasedQuestion);
	  
	  public boolean markImageBasedQuestionDeleted(ImageBasedQuestion imageBasedQuestion);

	  public Collection<ImageBasedQuestion> getAllImageBasedQuestions();

}