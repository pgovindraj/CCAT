package cdac.examination.ccat.service.qpmatrix;

import java.util.Collection;

import cdac.examination.ccat.domain.qpMatrix.QuestionPaperMatrix;

public interface QuestionPaperMatrixService {
	
	public QuestionPaperMatrix findQuestionPaperMatrixById(Long id);
	  
	  public QuestionPaperMatrix createQuestionPaperMatrix(QuestionPaperMatrix newQuestionPaperMatrix);

	  public QuestionPaperMatrix updateQuestionPaperMatrix(QuestionPaperMatrix questionPaperMatrix);
	  
	  public boolean markQuestionPaperMatrixDeleted(QuestionPaperMatrix questionPaperMatrix);

	  public Collection<QuestionPaperMatrix> getAllQuestionPaperMatrixs();

}