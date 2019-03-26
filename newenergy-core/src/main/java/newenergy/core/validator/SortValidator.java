package newenergy.core.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class SortValidator implements ConstraintValidator<Sort, String> {
    private List<String> valueList = null;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return valueList.contains(value.toUpperCase());
    }

    @Override
    public void initialize(Sort sort) {
        valueList = new ArrayList<>();
        for(String value: sort.accepts()){
            valueList.add(value.toUpperCase());
        }
    }
}
