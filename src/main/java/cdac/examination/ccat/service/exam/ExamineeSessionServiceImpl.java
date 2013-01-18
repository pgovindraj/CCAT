package cdac.examination.ccat.service.exam;

import java.util.Collection;
import java.util.List;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;

import org.springframework.stereotype.Service;

import cdac.examination.ccat.domain.exam.ExamineeResponse;
import cdac.examination.ccat.domain.exam.ExamineeSession;
import cdac.examination.ccat.domain.question.Question;
import cdac.examination.ccat.service.exceptions.ExamException;

@Service
public class ExamineeSessionServiceImpl implements ExamineeSessionService {
	
	/**Cache for holding all ongoing sessions of examination
	 * 
	 */
	Ehcache examSessionCache;
	
	public ExamineeSessionServiceImpl(){
		this.examSessionCache = CacheManager.getInstance().getCache("examSessionCache");
	}
	

	@Override
	public ExamineeSession startExam(String hallTicketNumber, Long examId,
			Long subExamId) throws ExamException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamineeResponse endExam(String hallTicketNumber)
			throws ExamException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamineeSession getExamSession(String hallTicketNumber)
			throws ExamException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ExamineeSession> getOngoingExamSessions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getAllQuestions(String hallTicketNumber)
			throws ExamException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question getFirstQuestion(String hallTicketNumber)
			throws ExamException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question getNextQuestion(String hallTicketNumber, Long questionId)
			throws ExamException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question getPreviousQuestion(String hallTicketNumber, Long questionId)
			throws ExamException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getAnsweredQuestions(String hallTicketNumber)
			throws ExamException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getUnansweredQuestions(String hallTicketNumber)
			throws ExamException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExamInProgress(String hallTicketNumber) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean storeExamineeResponse(String hallTicketNumber, String questionId, String answerId) {
		// TODO Auto-generated method stub
		return false;
	}


}
