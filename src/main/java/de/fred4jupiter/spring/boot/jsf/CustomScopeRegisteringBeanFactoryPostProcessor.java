package de.fred4jupiter.spring.boot.jsf;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import de.fred4jupiter.spring.boot.jsf.scope.ScopeName;
import de.fred4jupiter.spring.boot.jsf.scope.ViewScope;

/**
 * BeanPostProcessor that registeres the view scope.
 * 
 * @author MIS
 *
 */
@Component
public class CustomScopeRegisteringBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.registerScope(ScopeName.VIEW, new ViewScope());
    }
}
