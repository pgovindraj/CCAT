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
@Table(name="TEXT_N_IMAGE_BASED_QUESTION")
@DiscriminatorValue("TEXT_N_IMAGE_BASED")
public class TextNImageBasedQuestion extends Question implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="QUESTION_TEXT")
	private String questionText;
	
	@Column(name="QUESTION_IMAGE_PATH")
	private String questionImagePath;
	
	@OneToOne(mappedBy="textNImageBasedCDQ")
	private TextNImageBasedCommonDataQuestion textNimageBasedCDQ;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="question", orphanRemoval=true)
	private List<TextNImageBasedAnswerOption> answerOptions;

	public TextNImageBasedQuestion() {
	}

	public TextNImageBasedQuestion(String questionText,
			String questionImagePath,
			TextNImageBasedCommonDataQuestion textNimageBasedCDQ,
			List<TextNImageBasedAnswerOption> answerOptions) {
		this.questionText = questionText;
		this.questionImagePath = questionImagePath;
		this.textNimageBasedCDQ = textNimageBasedCDQ;
		this.answerOptions = answerOptions;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public void setTextNimageBasedCDQ(TextNImageBasedCommonDataQuestion textNimageBasedCDQ) {
		this.textNimageBasedCDQ = textNimageBasedCDQ;
	}

	public TextNImageBasedCommonDataQuestion getTextNimageBasedCDQ() {
		return textNimageBasedCDQ;
	}

	public String getQuestionImagePath() {
		return questionImagePath;
	}

	public void setQuestionImagePath(String questionImagePath) {
		this.questionImagePath = questionImagePath;
	}

	public List<TextNImageBasedAnswerOption> getAnswerOptions() {
		return answerOptions;
	}

	public void setAnswerOptions(List<TextNImageBasedAnswerOption> answerOptions) {
		this.answerOptions = answerOptions;
	}

}
