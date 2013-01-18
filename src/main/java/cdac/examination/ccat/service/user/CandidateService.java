package cdac.examination.ccat.service.user;

import java.util.Collection;

import cdac.examination.ccat.domain.user.Candidate;

public interface CandidateService {
	
	public Candidate findCandidateById(Long id);
	  
	  public Candidate createCandidate(Candidate newCandidate);

	  public Candidate updateCandidate(Candidate candidate);
	  
	  public boolean markCandidateDeleted(Candidate candidate);

	  public Collection<Candidate> getAllCandidates();

}

