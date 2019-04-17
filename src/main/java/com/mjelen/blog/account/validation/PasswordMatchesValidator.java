package com.mjelen.blog.account.validation;

import com.mjelen.blog.account.user.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
   public void initialize(PasswordMatches constraint) {
   }

   public boolean isValid(Object obj, ConstraintValidatorContext context) {
      User user = (User) obj;
      return user.getPassword().equals(user.getMatchingPassword());
   }
}
