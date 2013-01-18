package cdac.examination.ccat.service.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.ExamineeResponse;

public interface ExamineeResponseService {
	
	public ExamineeResponse findExamineeResponseById(Long id);
	  
	  public ExamineeResponse createExamineeResponse(ExamineeResponse newExamineeResponse);

	  public ExamineeResponse updateExamineeResponse(ExamineeResponse examineeResponse);
	  
	  public boolean markExamineeResponseDeleted(ExamineeResponse examineeResponse);

	  public Collection<ExamineeResponse> getAllExamineeResponses();

}
