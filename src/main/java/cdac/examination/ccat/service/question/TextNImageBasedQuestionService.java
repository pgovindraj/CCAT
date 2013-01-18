package cdac.examination.ccat.service.question;

import java.util.Collection;

import cdac.examination.ccat.domain.question.TextNImageBasedQuestion;

public interface TextNImageBasedQuestionService {
	
	public TextNImageBasedQuestion findTextNImageBasedQuestionById(Long id);
	  
	  public TextNImageBasedQuestion createTextNImageBasedQuestion(TextNImageBasedQuestion newTextNImageBasedQuestion);

	  public TextNImageBasedQuestion updateTextNImageBasedQuestion(TextNImageBasedQuestion imageBasedQuestion);
	  
	  public boolean markTextNImageBasedQuestionDeleted(TextNImageBasedQuestion imageBasedQuestion);

	  public Collection<TextNImageBasedQuestion> getAllTextNImageBasedQuestions();

}
