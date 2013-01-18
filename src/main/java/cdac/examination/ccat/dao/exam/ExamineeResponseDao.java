package cdac.examination.ccat.dao.exam;

import java.util.Collection;

import cdac.examination.ccat.domain.exam.ExamineeResponse;

/**
 * ExamineeResponseDao acts as a facade for obtaining {@link ExamineeResponse} objects from the
 * repository
 * 
 */
public interface ExamineeResponseDao {

	public ExamineeResponse findById(Long id);

	public Collection<ExamineeResponse> getAllExamineeResponses();
	
	public Collection<ExamineeResponse> getAllExamineeResponses(Long examineeId);

	public boolean deleteById(Long id);

	public boolean delete(ExamineeResponse examineeResponse);

	public ExamineeResponse persistOrMerge(ExamineeResponse examineeResponse);

	public long getNumberOfExamineeResponses();
	
	public long getNumberOfExamineeResponses(Long examineeId);

}
