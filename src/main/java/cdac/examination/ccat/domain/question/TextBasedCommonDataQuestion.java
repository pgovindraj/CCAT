package cdac.examination.ccat.domain.question;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TEXT_N_IMAGE_BASED_QUESTION")
@DiscriminatorValue("TEXT_N_IMAGE_BASED_BASED")
public class TextBasedCommonDataQuestion extends CommonDataQuestion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="COMMON_DATA_TEXT")
	private String commonDataText;
	
	@OneToOne
	private TextBasedQuestion textBasedQuestion;

	public TextBasedCommonDataQuestion() {
	}

	public TextBasedCommonDataQuestion(String commonDataText, TextBasedQuestion textBasedQuestion) {
		this.commonDataText = commonDataText;
		this.textBasedQuestion = textBasedQuestion;
	}

	public String getCommonDataText() {
		return commonDataText;
	}

	public void setCommonDataText(String commonDataText) {
		this.commonDataText = commonDataText;
	}

	public TextBasedQuestion getTextBasedQuestion() {
		return textBasedQuestion;
	}

	public void setTextBasedQuestion(TextBasedQuestion textBasedQuestion) {
		this.textBasedQuestion = textBasedQuestion;
	}

}
