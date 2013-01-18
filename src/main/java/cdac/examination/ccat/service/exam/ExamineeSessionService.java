package cdac.examination.ccat.service.exam;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import net.sf.ehcache.Ehcache;


import cdac.examination.ccat.domain.exam.ExamineeResponse;
import cdac.examination.ccat.domain.exam.ExamineeSession;
import cdac.examination.ccat.domain.question.Question;
import cdac.examination.ccat.service.exceptions.ExamException;


/**The class is responsible for  maintaining examinee sessions 
 * 
 *
 */
public interface ExamineeSessionService {
	
	/**Starts the exam for a candidate by creating a new session and putting into cache.
	 * If a candidate session already exists fetch it from cache and use the same 
	 * 
	 * @param hallTicketNumber hall ticket number of the candidate
	 * @param examId id of the examination 
	 * @param subExamId id of the sub-examination
	 * @return an object of type {@link ExamineeSession}
	 * @throws {@link ExamException}
	 */
	public ExamineeSession startExam(String hallTicketNumber, Long examId, Long subExamId) throws ExamException;
	
	
	/**Ends the exam for a candidate 
	 * 
	 * @param hallTicketNumber hall ticket number of the candidate
	 * @return an object of type {@link ExamineeResponse}
	 * @throws {@link ExamException}
	 */
	public ExamineeResponse endExam(String hallTicketNumber) throws ExamException;
	
	
	/**Provides the exam session corresponding to a hall ticket number of a given candidate
	 * 
	 * @param hallTicketNumber hall ticket number of the candidate
	 * @return an object of type {@link ExamineeSession}
	 * @throws {@link ExamException}
	 */
	public ExamineeSession getExamSession(String hallTicketNumber) throws ExamException;
	
	
	/**provides all exam sessions for all the candidates who have started the exam but are yet to complete
	 * 
	 * @return collection of {@link ExamineeSession} objects corresponding to all ongoing examinations
	 */
	public Collection<ExamineeSession> getOngoingExamSessions();
	
	
	/**Provides a list of questions for a candidate
	 * 
	 * @param hallTicketNumber hall ticket number of the candidate
	 * @return a list of the {@link Question} objects provided to the candidate 
	 * @throws {@link ExamException}
	 */
	public List<Question> getAllQuestions(final String hallTicketNumber) throws ExamException;

	
	/**Provides the first question to the candidate
	 * 
	 * @param hallTicketNumber hall ticket number of the candidate
	 * @return a {@link Question} object corresponding to the first question
	 * @throws {@link ExamException}
	 */
	public Question getFirstQuestion(final String hallTicketNumber) throws ExamException ;

	
	/**Renders the next question to the examinee
	 * 
	 * @param hallTicketNumber hall ticket number of the candidate
	 * @param questionId id of the current question rendered to the candidate
	 * @return a {@link Question} object
	 * @throws {@link ExamException}
	 */
	public Question getNextQuestion(final String hallTicketNumber, final Long questionId) throws ExamException;

	
	/**Renders the previous question to the examinee
	 * 
	 * @param hallTicketNumber hall ticket number of the candidate
	 * @param questionId id of the current question rendered to the candidate
	 * @return a {@link Question} object
	 * @throws {@link ExamException}
	 */
	public Question getPreviousQuestion(final String hallTicketNumber, final Long questionId) throws ExamException;
	
	
	/**Retrieves all answered questions of the candidate
	 * 
	 * @param hallTicketNumber hall ticket number of the candidate
	 * @return a list of {@link Question} objects
	 * @throws {@link ExamException}
	 */
	public List<Question> getAnsweredQuestions(final String hallTicketNumber) throws ExamException ;

	
	/**Retrieves all unanswered questions of the candidate
	 * 
	 * @param hallTicketNumber hall ticket number of the candidate
	 * @return a list of {@link Question} objects
	 * @throws {@link ExamException}
	 */
	public List<Question> getUnansweredQuestions(final String hallTicketNumber) throws ExamException ;


	/**Checks whether a candidate is giving an exam or not
	 * 
	 * @param hallTicketNumber hall ticket number of the candidate
	 * @return True if the candidate is giving an exam and False if otherwise
	 */
	public boolean isExamInProgress(String hallTicketNumber);


	/**Stores examinee response to cache
	 * 
	 * @param hallTicketNumber hallTicketNumber hall ticket number of the candidate
	 * @param questionId id of the question
	 * @param answerId id of the response
	 * @return True if written to cache otherwise false
	 */
	boolean storeExamineeResponse(String hallTicketNumber, String questionId,
			String answerId);

}
