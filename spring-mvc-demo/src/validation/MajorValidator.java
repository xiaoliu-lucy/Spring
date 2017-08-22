package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MajorValidator implements ConstraintValidator<MajorValid,String>{
	private String majorPrefix;
	
	@Override
	public void initialize(MajorValid theMajor) {
		majorPrefix = theMajor.value();
	}
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext validatorContext) {
		boolean result;
		if (theCode != null) {
			result = theCode.startsWith(majorPrefix);	
		} else {
			result = true;
		}
		return result;
	}

}
