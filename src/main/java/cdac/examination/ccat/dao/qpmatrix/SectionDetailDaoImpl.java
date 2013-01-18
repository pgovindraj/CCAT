package cdac.examination.ccat.dao.qpmatrix;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.qpMatrix.SectionDetail;

@Resource
public class SectionDetailDaoImpl implements SectionDetailDao {
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public SectionDetail findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SectionDetail findByName(String sectionDetailName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<SectionDetail> getAllSectionDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(SectionDetail sectionDetail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SectionDetail persistOrMerge(SectionDetail sectionDetail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfSectionDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

}
