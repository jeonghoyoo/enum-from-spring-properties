package com.pseudocoder.scan.componentscan.interfaces;

import com.pseudocoder.scan.componentscan.domain.code.PracticeEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/practice")

public class PracticeController {

    @GetMapping("print")
    public void print() {
        System.out.println(PracticeEnum.FIRST.getTypeDefaultValue());
    }
}
