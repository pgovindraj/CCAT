package cdac.examination.ccat.dao.exam;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Repository;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.exam.Centre;

@Repository
public class CentreDaoImpl implements CentreDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public Centre findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Centre findByName(String centreName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Centre> getAllCentres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Centre centre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Centre persistOrMerge(Centre centre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfCentres() {
		// TODO Auto-generated method stub
		return 0;
	}

}
