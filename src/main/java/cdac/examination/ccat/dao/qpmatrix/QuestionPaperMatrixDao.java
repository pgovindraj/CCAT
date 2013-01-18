package cdac.examination.ccat.dao.qpmatrix;

import java.util.Collection;

import cdac.examination.ccat.domain.qpMatrix.QuestionPaperMatrix;

/**
 * QuestionPaperMatrixDao acts as a facade for obtaining {@link QuestionPaperMatrix} objects from the
 * repository
 * 
 */
public interface QuestionPaperMatrixDao {

	public QuestionPaperMatrix findById(Long id);

	public QuestionPaperMatrix findByName(String questionPaperMatrixName);

	public Collection<QuestionPaperMatrix> getAllQuestionPaperMatrixs();

	public boolean deleteById(Long id);

	public boolean delete(QuestionPaperMatrix questionPaperMatrix);

	public QuestionPaperMatrix persistOrMerge(QuestionPaperMatrix questionPaperMatrix);

	public long getNumberOfQuestionPaperMatrixs();

}
