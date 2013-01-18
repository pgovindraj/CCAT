package cdac.examination.ccat.dao.qpmatrix;

import java.util.Collection;

import cdac.examination.ccat.domain.qpMatrix.SlotWiseQuestionPaperMatrix;

/**
 * SlotWiseQuestionPaperMatrixDao acts as a facade for obtaining {@link SlotWiseQuestionPaperMatrix} objects from the
 * repository
 * 
 */
public interface SlotWiseQuestionPaperMatrixDao {

	public SlotWiseQuestionPaperMatrix findById(Long id);

	public SlotWiseQuestionPaperMatrix findByName(String slotWiseQuestionPaperMatrixName);

	public Collection<SlotWiseQuestionPaperMatrix> getAllSlotWiseQuestionPaperMatrixs();

	public boolean deleteById(Long id);

	public boolean delete(SlotWiseQuestionPaperMatrix slotWiseQuestionPaperMatrix);

	public SlotWiseQuestionPaperMatrix persistOrMerge(SlotWiseQuestionPaperMatrix slotWiseQuestionPaperMatrix);

	public long getNumberOfSlotWiseQuestionPaperMatrixs();

}
