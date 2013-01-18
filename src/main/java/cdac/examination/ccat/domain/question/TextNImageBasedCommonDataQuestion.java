package cdac.examination.ccat.domain.question;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TEXT_BASED_QUESTION")
@DiscriminatorValue("TEXT_BASED")
public class TextNImageBasedCommonDataQuestion extends CommonDataQuestion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="COMMON_DATA_TEXT")
	private String commonDataText;
	
	@Column(name="COMMON_DATA_IMAGE_PATH")
	private String commonDataImagePath;
	
	@OneToOne
	private TextNImageBasedCommonDataQuestion textNImageBasedCDQ;
	

	public TextNImageBasedCommonDataQuestion() {
	}

	public TextNImageBasedCommonDataQuestion(String commonDataText,
			String commonDataImagePath,
			TextNImageBasedCommonDataQuestion textNImageBasedCDQ) {
		this.commonDataText = commonDataText;
		this.commonDataImagePath = commonDataImagePath;
		this.textNImageBasedCDQ = textNImageBasedCDQ;
	}

	public String getCommonDataText() {
		return commonDataText;
	}

	public void setCommonDataText(String commonDataText) {
		this.commonDataText = commonDataText;
	}

	public String getCommonDataImagePath() {
		return commonDataImagePath;
	}

	public void setCommonDataImagePath(String commonDataImagePath) {
		this.commonDataImagePath = commonDataImagePath;
	}

	public TextNImageBasedCommonDataQuestion getTextNImageBasedCDQ() {
		return textNImageBasedCDQ;
	}

	public void setTextNImageBasedCDQ(
			TextNImageBasedCommonDataQuestion textNImageBasedCDQ) {
		this.textNImageBasedCDQ = textNImageBasedCDQ;
	}
	
	

}
