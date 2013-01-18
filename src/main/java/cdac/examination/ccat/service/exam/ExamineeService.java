package cdac.examination.ccat.service.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.Examinee;

public interface ExamineeService {
	
	public Examinee findExamineeById(Long id);
	  
	  public Examinee createExaminee(Examinee newExaminee);

	  public Examinee updateExaminee(Examinee examinee);
	  
	  public boolean markExamineeDeleted(Examinee examinee);

	  public Collection<Examinee> getAllExaminees();

}

