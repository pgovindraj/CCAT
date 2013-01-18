package cdac.examination.ccat.service.question;

import java.util.Collection;

import cdac.examination.ccat.domain.question.Section;

public interface SectionService {
	
	public Section findSectionById(Long id);
	  
	  public Section createSection(Section newSection);

	  public Section updateSection(Section section);
	  
	  public boolean markSectionDeleted(Section section);

	  public Collection<Section> getAllSections();

}
