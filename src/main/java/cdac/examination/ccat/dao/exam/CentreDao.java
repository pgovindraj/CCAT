package cdac.examination.ccat.dao.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.Centre;

/**
 * CentreDao acts as a facade for obtaining {@link Centre} objects from the
 * repository
 * 
 */
public interface CentreDao {

	public Centre findById(Long id);

	public Centre findByName(String centreName);

	public Collection<Centre> getAllCentres();

	public boolean deleteById(Long id);

	public boolean delete(Centre centre);

	public Centre persistOrMerge(Centre centre);

	public long getNumberOfCentres();

}
