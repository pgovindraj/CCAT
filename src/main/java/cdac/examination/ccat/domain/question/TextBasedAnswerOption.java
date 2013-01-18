package cdac.examination.ccat.domain.question;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TEXT_BASED_ANSWER_OPTION")
@DiscriminatorValue("TEXT_BASED")
public class TextBasedAnswerOption extends AnswerOption implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="ANSWER_TEXT")
	private String answerText;

	@ManyToOne
	private TextBasedQuestion question;
	
	public TextBasedAnswerOption() {
	}

	public TextBasedAnswerOption(String answerText, TextBasedQuestion question) {
		this.answerText = answerText;
		this.question = question;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public TextBasedQuestion getQuestion() {
		return question;
	}

	public void setQuestion(TextBasedQuestion question) {
		this.question = question;
	}
	
	

}
