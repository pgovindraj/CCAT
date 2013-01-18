package cdac.examination.ccat.service.question;

import java.util.Collection;

import cdac.examination.ccat.domain.question.TextBasedQuestion;

public interface TextBasedQuestionService {
	
	public TextBasedQuestion findTextBasedQuestionById(Long id);
	  
	  public TextBasedQuestion createTextBasedQuestion(TextBasedQuestion newTextBasedQuestion);

	  public TextBasedQuestion updateTextBasedQuestion(TextBasedQuestion imageBasedQuestion);
	  
	  public boolean markTextBasedQuestionDeleted(TextBasedQuestion imageBasedQuestion);

	  public Collection<TextBasedQuestion> getAllTextBasedQuestions();

}