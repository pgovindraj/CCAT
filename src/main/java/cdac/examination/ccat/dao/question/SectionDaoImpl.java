package cdac.examination.ccat.dao.question;

import java.util.Collection;

import javax.annotation.Resource;

import cdac.examination.ccat.domain.question.Section;

@Resource
public class SectionDaoImpl implements SectionDao {

	@Override
	public Section findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Section findByName(String sectionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Section> getAllSections() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Section section) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Section persistOrMerge(Section section) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfSections() {
		// TODO Auto-generated method stub
		return 0;
	}

}
