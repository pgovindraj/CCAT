package cdac.examination.ccat.dao.exam;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Repository;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.exam.Examinee;

@Repository
public class ExamineeDaoImpl implements ExamineeDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public Examinee findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Examinee findByName(String examineeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Examinee> getAllExaminees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Examinee examinee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Examinee persistOrMerge(Examinee examinee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfExaminees() {
		// TODO Auto-generated method stub
		return 0;
	}

}
