package cdac.examination.ccat.dao.question;

import java.util.Collection;

import cdac.examination.ccat.domain.question.Section;

/**
 * SectionDao acts as a facade for obtaining {@link Section} objects from the
 * repository
 * 
 */
public interface SectionDao {

	public Section findById(Long id);

	public Section findByName(String sectionName);

	public Collection<Section> getAllSections();

	public boolean deleteById(Long id);

	public boolean delete(Section section);

	public Section persistOrMerge(Section section);

	public long getNumberOfSections();

}
