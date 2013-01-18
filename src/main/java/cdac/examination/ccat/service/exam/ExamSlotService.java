package cdac.examination.ccat.service.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.ExamSlot;

public interface ExamSlotService {
	
	public ExamSlot findExamSlotById(Long id);
	  
	  public ExamSlot createExamSlot(ExamSlot newExamSlot);

	  public ExamSlot updateExamSlot(ExamSlot examSlot);
	  
	  public boolean markExamSlotDeleted(ExamSlot examSlot);

	  public Collection<ExamSlot> getAllExamSlots();

}
