package cdac.examination.ccat.dao.user;

import java.util.Collection;

import cdac.examination.ccat.domain.user.Candidate;

/**
 * CandidateDao acts as a facade for obtaining {@link Candidate} objects from the
 * repository
 * 
 */
public interface CandidateDao {

	public Candidate findById(Long id);

	public Candidate findByRegistrationNumber(String registrationNumber);
	
	public Candidate findByHallTicketNumber(String hallTicketNumber);

	public Collection<Candidate> getAllCandidates();

	public boolean deleteById(Long id);

	public boolean delete(Candidate candidate);

	public Candidate persistOrMerge(Candidate candidate);

	public long getNumberOfCandidates();

}
