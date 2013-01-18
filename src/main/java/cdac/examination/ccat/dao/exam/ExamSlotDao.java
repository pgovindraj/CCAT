package cdac.examination.ccat.dao.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.ExamSlot;

/**
 * ExamSlotDao acts as a facade for obtaining {@link ExamSlot} objects from the
 * repository
 * 
 */
public interface ExamSlotDao {

	public ExamSlot findById(Long id);

	public ExamSlot findByName(String examSlotName);

	public Collection<ExamSlot> getAllExamSlots();

	public boolean deleteById(Long id);

	public boolean delete(ExamSlot examSlot);

	public ExamSlot persistOrMerge(ExamSlot examSlot);

	public long getNumberOfExamSlots();

}
