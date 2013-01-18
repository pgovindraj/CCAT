package cdac.examination.ccat.service.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.QuestionPaper;

public interface QuestionPaperService {
	
	public QuestionPaper findQuestionPaperById(Long id);
	  
	  public QuestionPaper createQuestionPaper(QuestionPaper newQuestionPaper);

	  public QuestionPaper updateQuestionPaper(QuestionPaper questionPaper);
	  
	  public boolean markQuestionPaperDeleted(QuestionPaper questionPaper);

	  public Collection<QuestionPaper> getAllQuestionPapers();

}
