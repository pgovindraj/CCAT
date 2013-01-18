package cdac.examination.ccat.service.user;

import java.util.Collection;

import cdac.examination.ccat.domain.user.CentreSuperintendant;

public interface CentreSuperintendantService {
	
	public CentreSuperintendant findCentreSuperintendantById(Long id);
	  
	  public CentreSuperintendant createCentreSuperintendant(CentreSuperintendant newCentreSuperintendant);

	  public CentreSuperintendant updateCentreSuperintendant(CentreSuperintendant centreSuperintendant);
	  
	  public boolean markCentreSuperintendantDeleted(CentreSuperintendant centreSuperintendant);

	  public Collection<CentreSuperintendant> getAllCentreSuperintendants();

}
