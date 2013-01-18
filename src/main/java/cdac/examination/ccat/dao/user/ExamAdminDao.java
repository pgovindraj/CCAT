package cdac.examination.ccat.dao.user;

import java.util.Collection;

import cdac.examination.ccat.domain.user.ExamAdmin;

/**
 * ExamAdminDao acts as a facade for obtaining {@link ExamAdmin} objects from the
 * repository
 * 
 */
public interface ExamAdminDao {

	public ExamAdmin findById(Long id);

	public ExamAdmin findByName(String examAdminName);

	public Collection<ExamAdmin> getAllExamAdmins();

	public boolean deleteById(Long id);

	public boolean delete(ExamAdmin examAdmin);

	public ExamAdmin persistOrMerge(ExamAdmin examAdmin);

	public long getNumberOfExamAdmins();

}
