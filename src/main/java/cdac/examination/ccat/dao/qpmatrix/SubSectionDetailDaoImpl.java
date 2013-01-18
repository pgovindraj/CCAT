package cdac.examination.ccat.dao.qpmatrix;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;

import cdac.examination.ccat.dao.DaoHelper;
import cdac.examination.ccat.domain.qpMatrix.SubSectionDetail;

@Resource
public class SubSectionDetailDaoImpl implements SubSectionDetailDao{
	
	@Autowired
	private DaoHelper daoHelper;
	
	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public SubSectionDetail findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubSectionDetail findByName(String subSectionDetailName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<SubSectionDetail> getAllSubSectionDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(SubSectionDetail subSectionDetail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SubSectionDetail persistOrMerge(SubSectionDetail subSectionDetail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getNumberOfSubSectionDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

}
