package cdac.examination.ccat.service.user;

import java.util.Collection;

import cdac.examination.ccat.domain.user.ExamAdmin;

public interface ExamAdminService {
	
	public ExamAdmin findExamAdminById(Long id);
	  
	  public ExamAdmin createExamAdmin(ExamAdmin newExamAdmin);

	  public ExamAdmin updateExamAdmin(ExamAdmin examAdmin);
	  
	  public boolean markExamAdminDeleted(ExamAdmin examAdmin);

	  public Collection<ExamAdmin> getAllExamAdmins();

}
