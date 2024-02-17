package com.devkobe.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DiaryIdentifierController {
    @GetMapping("diaryId")
    public String diaryId(Model model) {
        model.addAttribute("diaryIdData", "1");
        return "diaryId";
    }

    @GetMapping("diary")
    public String hello(@RequestParam("userName") String userName, Model model) {
        model.addAttribute("userName", userName);
        return "getAllDiaryTemplate";
    }
}
