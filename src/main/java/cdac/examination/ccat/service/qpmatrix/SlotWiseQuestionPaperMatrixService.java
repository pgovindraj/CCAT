package cdac.examination.ccat.service.qpmatrix;

import java.util.Collection;

import cdac.examination.ccat.domain.qpMatrix.SlotWiseQuestionPaperMatrix;

public interface SlotWiseQuestionPaperMatrixService {
	
	public SlotWiseQuestionPaperMatrix findSlotWiseQuestionPaperMatrixById(Long id);
	  
	  public SlotWiseQuestionPaperMatrix createSlotWiseQuestionPaperMatrix(SlotWiseQuestionPaperMatrix newSlotWiseQuestionPaperMatrix);

	  public SlotWiseQuestionPaperMatrix updateSlotWiseQuestionPaperMatrix(SlotWiseQuestionPaperMatrix slotWiseQuestionPaperMatrix);
	  
	  public boolean markSlotWiseQuestionPaperMatrixDeleted(SlotWiseQuestionPaperMatrix slotWiseQuestionPaperMatrix);

	  public Collection<SlotWiseQuestionPaperMatrix> getAllSlotWiseQuestionPaperMatrixs();

}
