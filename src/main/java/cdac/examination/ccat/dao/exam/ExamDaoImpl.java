package cdac.examination.ccat.dao.exam;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Repository;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.exam.Exam;

@Repository
public class ExamDaoImpl implements ExamDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public Exam findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exam findByName(String examName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Exam> getAllExams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Exam exam) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Exam persistOrMerge(Exam exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfExams() {
		// TODO Auto-generated method stub
		return 0;
	}

}
