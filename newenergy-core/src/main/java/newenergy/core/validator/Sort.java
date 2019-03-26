package newenergy.core.validator;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
@Target({METHOD, FIELD, PARAMETER})
@Constraint(validatedBy = SortValidator.class)
@Retention(RUNTIME)
@Documented
public @interface Sort {

    String message() default "排序字段不支持";

    String[] accepts() default {"add_time", "id"};

    Class<?>[] groups() default {};

}
