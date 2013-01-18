package cdac.examination.ccat.domain.qpMatrix;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cdac.examination.ccat.domain.exam.ExamSlot;

@Entity
@Table(name="SLOT_WISE_QPMATRIX")
@DiscriminatorValue("SLOT_WISE")
public class SlotWiseQuestionPaperMatrix extends QuestionPaperMatrix implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="QP_FIXED_FOR_ALL")
	Boolean isQPFixedForAll;
	
	@OneToOne
	ExamSlot examSlot;

	public SlotWiseQuestionPaperMatrix() {
	}

	public SlotWiseQuestionPaperMatrix(Boolean isQPFixedForAll,
			ExamSlot examSlot) {
		this.isQPFixedForAll = isQPFixedForAll;
		this.examSlot = examSlot;
	}

	public Boolean getIsQPFixedForAll() {
		return isQPFixedForAll;
	}

	public void setIsQPFixedForAll(Boolean isQPFixedForAll) {
		this.isQPFixedForAll = isQPFixedForAll;
	}

	public ExamSlot getExamSlot() {
		return examSlot;
	}

	public void setExamSlot(ExamSlot examSlot) {
		this.examSlot = examSlot;
	}

}
