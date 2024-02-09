package com.devkobe.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiaryIdentifierController {
    @GetMapping("diaryId")
    public String diaryId(Model model) {
        model.addAttribute("diaryIdData", "1");
        return "diaryId";
    }
}
