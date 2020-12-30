package com.pseudocoder.scan.componentscan.domain.support;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Configuration
@ConfigurationProperties("practice.properties")
public class PracticePropertiesImpl implements PracticeProperties {
    private String injectValue;

    @Override
    public String getInjectValue() {
        return injectValue;
    }

    public void setInjectValue(String injectValue) {
        this.injectValue = injectValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PracticePropertiesImpl)) return false;
        PracticePropertiesImpl that = (PracticePropertiesImpl) o;
        return Objects.equals(injectValue, that.injectValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(injectValue);
    }
}

