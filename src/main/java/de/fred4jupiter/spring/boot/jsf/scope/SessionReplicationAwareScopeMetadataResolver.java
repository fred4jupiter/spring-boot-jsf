package de.fred4jupiter.spring.boot.jsf.scope;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationScopeMetadataResolver;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;
import org.springframework.context.annotation.ScopedProxyMode;

/**
 * With this class you can configure to be all session and view scoped beans to be proxied with a target based proxy.
 * The generated proxy implements Serializable and handles the spring bean (de)serialization for session replication.
 *
 * <p>Enable this class in ComponentScan annotation</p>
 */
public class SessionReplicationAwareScopeMetadataResolver extends AnnotationScopeMetadataResolver implements ScopeMetadataResolver {

    @Override
    public ScopeMetadata resolveScopeMetadata(BeanDefinition definition) {
        ScopeMetadata scopeMetadata = super.resolveScopeMetadata(definition);
        final String scopeName = scopeMetadata.getScopeName();
        if (scopeName.equals(ScopeName.SESSION) || scopeName.equals(ScopeName.VIEW)) {
            scopeMetadata.setScopedProxyMode(ScopedProxyMode.TARGET_CLASS);
        }
        return scopeMetadata;
    }
}

