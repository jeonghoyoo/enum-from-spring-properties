package com.pseudocoder.scan.componentscan.domain.code;

import com.pseudocoder.scan.componentscan.domain.support.PracticeProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public enum  PracticeEnum {
    FIRST ("") {
        @Override
        public String getTypeDefaultValue() {
            return "https://" + FIRST.defaultValue;
        }
    };

    private String defaultValue;
    PracticeEnum(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    private void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public abstract String getTypeDefaultValue();

    @Component
    public static class PracticePropertyInjector {
        private final PracticeProperties properties;

        public PracticePropertyInjector(PracticeProperties properties) {
            this.properties = properties;
        }

        @PostConstruct
        public void postConstruct() {
            PracticeEnum.FIRST.setDefaultValue(properties.getInjectValue());
        }
    }
}
