package cdac.examination.ccat.dao.user;

import java.util.Collection;

import cdac.examination.ccat.domain.user.CentreSuperintendant;

/**
 * CentreSuperintendantDao acts as a facade for obtaining {@link CentreSuperintendant} objects from the
 * repository
 * 
 */
public interface CentreSuperintendantDao {

	public CentreSuperintendant findById(Long id);

	public Collection<CentreSuperintendant> getAllCentreSuperintendants();

	public boolean deleteById(Long id);

	public boolean delete(CentreSuperintendant centreSuperintendant);

	public CentreSuperintendant persistOrMerge(CentreSuperintendant centreSuperintendant);

	public long getNumberOfCentreSuperintendants();

}

