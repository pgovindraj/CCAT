package cdac.examination.ccat.dao.qpmatrix;

import java.util.Collection;

import cdac.examination.ccat.domain.qpMatrix.SubSectionDetail;

/**
 * SubSectionDetailDao acts as a facade for obtaining {@link SubSectionDetail} objects from the
 * repository
 * 
 */
public interface SubSectionDetailDao {

	public SubSectionDetail findById(Long id);

	public SubSectionDetail findByName(String subSectionDetailName);

	public Collection<SubSectionDetail> getAllSubSectionDetails();

	public boolean deleteById(Long id);

	public boolean delete(SubSectionDetail subSectionDetail);

	public SubSectionDetail persistOrMerge(SubSectionDetail subSectionDetail);

	public long getNumberOfSubSectionDetails();

}

