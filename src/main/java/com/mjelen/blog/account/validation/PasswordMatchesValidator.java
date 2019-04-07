package com.mjelen.blog.account.validation;

import com.mjelen.blog.account.user.UserDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
   public void initialize(PasswordMatches constraint) {
   }

   public boolean isValid(Object obj, ConstraintValidatorContext context) {
      UserDTO user = (UserDTO) obj;
      return user.getPassword().equals(user.getMatchingPassword());
   }
}
