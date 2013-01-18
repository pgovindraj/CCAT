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
@Table(name="IMAGE_BASED_QUESTION")
@DiscriminatorValue("IMAGE_BASED")
public class ImageBasedQuestion extends Question implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="QUESTION_IMAGE_PATH")
	private String questionImagePath;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="question", orphanRemoval=true)
	private List<ImageBasedAnswerOption> answerOptions;
	
	@OneToOne(mappedBy="imageBasedQuestion")
	private ImageBasedCommonDataQuestion imageBasedCdq;

	public ImageBasedQuestion() {
	}

	public ImageBasedQuestion(String questionImagePath,
			List<ImageBasedAnswerOption> answerOptions,
			ImageBasedCommonDataQuestion imageBasedCdq) {
		this.questionImagePath = questionImagePath;
		this.answerOptions = answerOptions;
		this.imageBasedCdq = imageBasedCdq;
	}

	public String getQuestionImagePath() {
		return questionImagePath;
	}

	public void setQuestionImagePath(String questionImagePath) {
		this.questionImagePath = questionImagePath;
	}

	public List<ImageBasedAnswerOption> getAnswerOptions() {
		return answerOptions;
	}

	public void setAnswerOptions(List<ImageBasedAnswerOption> answerOptions) {
		this.answerOptions = answerOptions;
	}

	public ImageBasedCommonDataQuestion getImageBasedCdq() {
		return imageBasedCdq;
	}

	public void setImageBasedCdq(ImageBasedCommonDataQuestion imageBasedCdq) {
		this.imageBasedCdq = imageBasedCdq;
	}

}
