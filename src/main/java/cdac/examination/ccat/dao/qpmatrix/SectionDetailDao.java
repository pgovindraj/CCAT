package cdac.examination.ccat.dao.qpmatrix;

import java.util.Collection;

import cdac.examination.ccat.domain.qpMatrix.SectionDetail;

/**
 * SectionDetailDao acts as a facade for obtaining {@link SectionDetail} objects from the
 * repository
 * 
 */
public interface SectionDetailDao {

	public SectionDetail findById(Long id);

	public SectionDetail findByName(String sectionDetailName);

	public Collection<SectionDetail> getAllSectionDetails();

	public boolean deleteById(Long id);

	public boolean delete(SectionDetail sectionDetail);

	public SectionDetail persistOrMerge(SectionDetail sectionDetail);

	public long getNumberOfSectionDetails();

}
