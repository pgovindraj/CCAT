package cdac.examination.ccat.service.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.Exam;

public interface ExamService {
	
	public Exam findExamById(Long id);
	  
	  public Exam createExam(Exam newExam);

	  public Exam updateExam(Exam exam);
	  
	  public boolean markExamDeleted(Exam exam);

	  public Collection<Exam> getAllExams();

}
