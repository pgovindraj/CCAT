package cdac.examination.ccat.domain.question;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TEXT_N_IMAGE_BASED_ANSWER_OPTION")
@DiscriminatorValue("TEXT_N_IMAGE_BASED")
public class TextNImageBasedAnswerOption extends AnswerOption implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="ANSWER_IMAGE_PATH")
	String answerImagePath;
	
	@Column(name="ANSWER_TEXT")
	String answerText;
	
	@ManyToOne
	TextNImageBasedQuestion question;

	public TextNImageBasedAnswerOption() {
	}

	public TextNImageBasedAnswerOption(String answerImagePath,
			String answerText, TextNImageBasedQuestion question) {
		this.answerImagePath = answerImagePath;
		this.answerText = answerText;
		this.question = question;
	}

	public String getAnswerImagePath() {
		return answerImagePath;
	}

	public void setAnswerImagePath(String answerImagePath) {
		this.answerImagePath = answerImagePath;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public TextNImageBasedQuestion getQuestion() {
		return question;
	}

	public void setQuestion(TextNImageBasedQuestion question) {
		this.question = question;
	}
	
	

}
