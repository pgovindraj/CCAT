package cdac.examination.ccat.dao.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.Examinee;

/**
 * ExamineeDao acts as a facade for obtaining {@link Examinee} objects from the
 * repository
 * 
 */
public interface ExamineeDao {

	public Examinee findById(Long id);

	public Examinee findByName(String examineeName);

	public Collection<Examinee> getAllExaminees();

	public boolean deleteById(Long id);

	public boolean delete(Examinee examinee);

	public Examinee persistOrMerge(Examinee examinee);

	public long getNumberOfExaminees();

}