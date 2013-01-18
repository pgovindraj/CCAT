package cdac.examination.ccat.service.qpmatrix;

import java.util.Collection;

import cdac.examination.ccat.domain.qpMatrix.SubSectionDetail;

public interface SubSectionDetailService {
	
	public SubSectionDetail findSubSectionDetailById(Long id);
	  
	  public SubSectionDetail createSubSectionDetail(SubSectionDetail newSubSectionDetail);

	  public SubSectionDetail updateSubSectionDetail(SubSectionDetail subSectionDetail);
	  
	  public boolean markSubSectionDetailDeleted(SubSectionDetail subSectionDetail);

	  public Collection<SubSectionDetail> getAllSubSectionDetails();

}