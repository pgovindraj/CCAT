package cdac.examination.ccat.dao.user;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.user.Candidate;

public class CandidateDaoImpl implements CandidateDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public Candidate findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Candidate findByRegistrationNumber(String registrationNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Candidate findByHallTicketNumber(String hallTicketNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Candidate> getAllCandidates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Candidate candidate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Candidate persistOrMerge(Candidate candidate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfCandidates() {
		// TODO Auto-generated method stub
		return 0;
	}

}
