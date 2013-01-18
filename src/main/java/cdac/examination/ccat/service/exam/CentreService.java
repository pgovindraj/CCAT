package cdac.examination.ccat.service.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.Centre;

public interface CentreService {
	
	public Centre findCentreById(Long id);
	  
	  public Centre createCentre(Centre newCentre);

	  public Centre updateCentre(Centre centre);
	  
	  public boolean markCentreDeleted(Centre centre);

	  public Collection<Centre> getAllCentres();

}
