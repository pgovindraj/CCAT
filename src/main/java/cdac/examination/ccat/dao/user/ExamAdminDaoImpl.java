package cdac.examination.ccat.dao.user;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.user.ExamAdmin;

public class ExamAdminDaoImpl implements ExamAdminDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public ExamAdmin findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamAdmin findByName(String examAdminName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ExamAdmin> getAllExamAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ExamAdmin examAdmin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ExamAdmin persistOrMerge(ExamAdmin examAdmin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfExamAdmins() {
		// TODO Auto-generated method stub
		return 0;
	}

}
