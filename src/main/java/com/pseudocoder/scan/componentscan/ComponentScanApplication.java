package com.pseudocoder.scan.componentscan;

import com.pseudocoder.scan.componentscan.application.ApplicationConfiguration;
import com.pseudocoder.scan.componentscan.domain.DomainConfiguration;
import com.pseudocoder.scan.componentscan.domain.code.PracticeEnum;
import com.pseudocoder.scan.componentscan.interfaces.PracticeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ApplicationConfiguration.class,
        DomainConfiguration.class})
public class ComponentScanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComponentScanApplication.class, args);
        System.out.println(PracticeEnum.FIRST.getTypeDefaultValue());
    }

}
