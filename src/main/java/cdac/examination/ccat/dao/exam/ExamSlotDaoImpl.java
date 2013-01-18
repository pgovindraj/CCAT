package cdac.examination.ccat.dao.exam;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Repository;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.exam.ExamSlot;

@Repository
public class ExamSlotDaoImpl implements ExamSlotDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public ExamSlot findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamSlot findByName(String examSlotName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ExamSlot> getAllExamSlots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ExamSlot examSlot) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ExamSlot persistOrMerge(ExamSlot examSlot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfExamSlots() {
		// TODO Auto-generated method stub
		return 0;
	}

}
