package cdac.examination.ccat.domain.question;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="IMAGE_BASED_ANSWER_OPTION")
@DiscriminatorValue("IMAGE_BASED")
public class ImageBasedAnswerOption extends AnswerOption implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="ANSWER_IMAGE_PATH")
	String answerImagePath;
	
	@ManyToOne
	ImageBasedQuestion question;

	public ImageBasedAnswerOption() {
		
	}

	public ImageBasedAnswerOption(String answerImagePath,
			ImageBasedQuestion question) {
		this.answerImagePath = answerImagePath;
		this.question = question;
	}

	public String getAnswerImagePath() {
		return answerImagePath;
	}

	public void setAnswerImagePath(String answerImagePath) {
		this.answerImagePath = answerImagePath;
	}

	public ImageBasedQuestion getQuestion() {
		return question;
	}

	public void setQuestion(ImageBasedQuestion question) {
		this.question = question;
	}
	
	
	
}
