package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.AdditionalRequirements;
import springmvc.model.Programs;
import springmvc.model.dao.AdditionalRequirementsDao;
@Repository
public class AdditionalRequirementsDaoImpl implements AdditionalRequirementsDao {
	@PersistenceContext
    private EntityManager entityManager;

@Override
public List<AdditionalRequirements> getAdditionalRequirements() {
	
	return entityManager.createQuery(" from AdditionalRequirements order by id",AdditionalRequirements.class).getResultList();
}

@Override
public List<AdditionalRequirements> getAdditionalRequirementsByDepartmentId(int dpmtId) {
	return entityManager.createQuery(" from AdditionalRequirements p where p.dept.dpmtId = "+dpmtId,AdditionalRequirements.class).getResultList();
}

@Override
@Transactional
public AdditionalRequirements addreq(AdditionalRequirements addreq) {
	return entityManager.merge(addreq);
}
}
