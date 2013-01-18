package cdac.examination.ccat.dao.exam;


import cdac.examination.ccat.domain.exam.QuestionPaper;

/**
 * QuestionPaperDao acts as a facade for obtaining {@link QuestionPaper} objects from the
 * repository
 * 
 */
public interface QuestionPaperDao {

	public QuestionPaper findById(Long id);

	public boolean deleteById(Long id);

	public boolean delete(QuestionPaper questionPaper);

	public QuestionPaper persistOrMerge(QuestionPaper questionPaper);

	public long getNumberOfQuestionPapers();

}
