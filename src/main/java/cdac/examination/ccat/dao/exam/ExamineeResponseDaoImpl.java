package cdac.examination.ccat.dao.exam;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Repository;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.exam.ExamineeResponse;

@Repository
public class ExamineeResponseDaoImpl implements ExamineeResponseDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public ExamineeResponse findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ExamineeResponse> getAllExamineeResponses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ExamineeResponse> getAllExamineeResponses(Long examineeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ExamineeResponse examineeResponse) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ExamineeResponse persistOrMerge(ExamineeResponse examineeResponse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfExamineeResponses() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getNumberOfExamineeResponses(Long examineeId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
