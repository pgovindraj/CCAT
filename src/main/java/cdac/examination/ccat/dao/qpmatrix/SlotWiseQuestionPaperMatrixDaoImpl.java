package cdac.examination.ccat.dao.qpmatrix;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.qpMatrix.SlotWiseQuestionPaperMatrix;

@Resource
public class SlotWiseQuestionPaperMatrixDaoImpl implements SlotWiseQuestionPaperMatrixDao{

	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;
	
	@Override
	public SlotWiseQuestionPaperMatrix findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SlotWiseQuestionPaperMatrix findByName(
			String slotWiseQuestionPaperMatrixName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<SlotWiseQuestionPaperMatrix> getAllSlotWiseQuestionPaperMatrixs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(
			SlotWiseQuestionPaperMatrix slotWiseQuestionPaperMatrix) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SlotWiseQuestionPaperMatrix persistOrMerge(
			SlotWiseQuestionPaperMatrix slotWiseQuestionPaperMatrix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfSlotWiseQuestionPaperMatrixs() {
		// TODO Auto-generated method stub
		return 0;
	}

}
