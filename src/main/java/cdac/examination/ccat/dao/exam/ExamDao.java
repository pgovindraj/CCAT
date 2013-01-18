package cdac.examination.ccat.dao.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.Exam;

/**
 * ExamDao acts as a facade for obtaining {@link Exam} objects from the
 * repository
 * 
 */
public interface ExamDao {

	public Exam findById(Long id);

	public Exam findByName(String examName);

	public Collection<Exam> getAllExams();

	public boolean deleteById(Long id);

	public boolean delete(Exam exam);

	public Exam persistOrMerge(Exam exam);

	public long getNumberOfExams();

}
