package com.ReviewFormApplication.review_form;

import com.ReviewFormApplication.ReviewForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReviewFormController {

  @GetMapping("/review_form")
  public String review_form(Model model) {
    model.addAttribute("review_form", new ReviewForm());
    return "reviewForm";
  }

  @PostMapping("/review_form")
  public String review_formSubmit(@ModelAttribute ReviewForm review_form, Model model) {
    model.addAttribute("review_form", review_form);
    return "result";
  }

}