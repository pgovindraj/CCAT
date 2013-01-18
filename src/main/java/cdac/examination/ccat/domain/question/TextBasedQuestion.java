package cdac.examination.ccat.domain.question;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TEXT_BASED_QUESTION")
@DiscriminatorValue("TEXT_BASED")
public class TextBasedQuestion extends Question implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="QUESTION_TEXT")
	private String questionText;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="question", orphanRemoval=true)
	private List<TextBasedAnswerOption> answerOptions;
	
	@OneToOne(mappedBy="textBasedQuestion")
	private TextBasedCommonDataQuestion textBasedCDQ;

	public TextBasedQuestion() {
	}

	public TextBasedQuestion(String questionText,
			List<TextBasedAnswerOption> answerOptions,
			TextBasedCommonDataQuestion textBasedCDQ) {
		this.questionText = questionText;
		this.answerOptions = answerOptions;
		this.textBasedCDQ = textBasedCDQ;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public List<TextBasedAnswerOption> getAnswerOptions() {
		return answerOptions;
	}

	public void setAnswerOptions(List<TextBasedAnswerOption> answerOptions) {
		this.answerOptions = answerOptions;
	}

	public TextBasedCommonDataQuestion getTextBasedCDQ() {
		return textBasedCDQ;
	}

	public void setTextBasedCDQ(TextBasedCommonDataQuestion textBasedCDQ) {
		this.textBasedCDQ = textBasedCDQ;
	}
	

}
