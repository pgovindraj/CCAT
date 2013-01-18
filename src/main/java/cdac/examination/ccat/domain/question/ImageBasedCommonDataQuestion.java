package cdac.examination.ccat.domain.question;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="IMAGE_BASED_CDQ")
@DiscriminatorValue("IMAGE_BASED")
public class ImageBasedCommonDataQuestion extends CommonDataQuestion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="COMMMON_DATA_IMAGE_PATH")
	private String commonDataImagePath;
	
	@OneToOne
	private ImageBasedQuestion imageBasedQuestion;

	public ImageBasedCommonDataQuestion() {
		
	}

	public ImageBasedCommonDataQuestion(String commonDataImagePath, ImageBasedQuestion imageBasedQuestion) {
		this.commonDataImagePath = commonDataImagePath;
		this.imageBasedQuestion = imageBasedQuestion;
	}

	public String getCommonDataImagePath() {
		return commonDataImagePath;
	}

	public ImageBasedQuestion getImageBasedQuestion() {
		return imageBasedQuestion;
	}

	public void setImageBasedQuestion(ImageBasedQuestion imageBasedQuestion) {
		this.imageBasedQuestion = imageBasedQuestion;
	}

	public void setCommonDataImagePath(String commonDataImagePath) {
		this.commonDataImagePath = commonDataImagePath;
	}
	
	

}
