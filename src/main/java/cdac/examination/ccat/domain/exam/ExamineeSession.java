package cdac.examination.ccat.domain.exam;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExamineeSession {
	
	  private Long hallTicketNumber;
	  private Date startTime;
	  private Long examId;
	  
	// this field is used to display the name of the exams
	  private transient String examName;
	  
	  private transient String courseName;
	 
	  // this field is used to display the name of the user taking the exam
	  private transient String userName;
	  
	  // this field is used to display the image of the user
	  private transient String imageName;
	  
	  private transient String sectionName;

	  // mapping of questionId -> choiceId, solutions submitted by user
	  private Map<Long, Long> userQuestionChoiceMapping = new HashMap<Long, Long>();
	
	  // ordered choices for questions mapping; keeps the ordering with choices id, this field will be serialized
	  // key is questionId, value is a List of choiceIds
	  private Map<Long, List<Long>> questionChoicesOrder = new HashMap<Long, List<Long>>();

	  // mapping of questionId and whether it has been answered
	  private Map<Long, Boolean> isQuestionAnsweredList = new HashMap<Long, Boolean>();
	  
	  // maintains ordering of sections alongwith completion status
	  private Map<Long, Boolean> sectionOrder;
	  
	  


}
