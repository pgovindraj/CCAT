package cdac.examination.ccat.dao.user;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.user.CentreSuperintendant;

public class CentreSuperintendantDaoImpl implements CentreSuperintendantDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public CentreSuperintendant findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<CentreSuperintendant> getAllCentreSuperintendants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(CentreSuperintendant centreSuperintendant) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CentreSuperintendant persistOrMerge(
			CentreSuperintendant centreSuperintendant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfCentreSuperintendants() {
		// TODO Auto-generated method stub
		return 0;
	}

}
