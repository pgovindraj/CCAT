package cdac.examination.ccat.service.qpmatrix;

import java.util.Collection;

import cdac.examination.ccat.domain.qpMatrix.SectionDetail;

public interface SectionDetailService {
	
	public SectionDetail findSectionDetailById(Long id);
	  
	  public SectionDetail createSectionDetail(SectionDetail newSectionDetail);

	  public SectionDetail updateSectionDetail(SectionDetail sectionDetail);
	  
	  public boolean markSectionDetailDeleted(SectionDetail sectionDetail);

	  public Collection<SectionDetail> getAllSectionDetails();

}
