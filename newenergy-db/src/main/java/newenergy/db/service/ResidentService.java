package newenergy.db.service;

import newenergy.db.domain.Resident;
import newenergy.db.repository.ResidentReposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResidentService {
    @Autowired
    private ResidentReposition residentReposition;

    public Page<Resident> querySelective(Integer id, String address, Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);

        Specification specification = getListSpecification(id, address);

        return residentReposition.findAll(specification, pageable);
    }

    private Specification<Resident> getListSpecification(Integer id, String address) {
        //动态添加搜索条件
        Specification<Resident> specification = new Specification<Resident>() {
            @Override
            public Predicate toPredicate(Root<Resident> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if(id!=null){
                    predicates.add(criteriaBuilder.equal(root.get("id"), id));
                }
                if(address!=null) {
                    predicates.add(criteriaBuilder.like(root.get("address"), "%"+address+"%"));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        return specification;
    }
}
