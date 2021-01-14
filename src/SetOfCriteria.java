import java.util.List;

public class SetOfCriteria {
    public List<Criteria>criteriaList;

    public int addCriteria(Criteria criteria){
        criteriaList.add(criteria);
        return 4;
    }
    public int deleteCriteria(Criteria criteria){
        criteriaList.remove(criteria);
        return 4;
    }
    public int changeCriteriaValue(int value,Criteria criteria){
        criteria.setValue(value);
        return 4;
    }

    public List<Criteria> getCriteriaList() {
        return criteriaList;
    }

    public void setCriteriaList(List<Criteria> criteriaList) {
        this.criteriaList = criteriaList;
    }
}
