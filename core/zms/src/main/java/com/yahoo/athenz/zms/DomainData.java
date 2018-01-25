//
// This file generated by rdl 1.4.15. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.yahoo.rdl.*;

//
// DomainData - A domain object that includes its roles, policies and services.
//
public class DomainData {
    public String name;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String account;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer ypmId;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean enabled;
    public List<Role> roles;
    public SignedPolicies policies;
    public List<ServiceIdentity> services;
    public List<Entity> entities;
    public Timestamp modified;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String applicationId;

    public DomainData setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public DomainData setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return account;
    }
    public DomainData setYpmId(Integer ypmId) {
        this.ypmId = ypmId;
        return this;
    }
    public Integer getYpmId() {
        return ypmId;
    }
    public DomainData setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public DomainData setRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }
    public List<Role> getRoles() {
        return roles;
    }
    public DomainData setPolicies(SignedPolicies policies) {
        this.policies = policies;
        return this;
    }
    public SignedPolicies getPolicies() {
        return policies;
    }
    public DomainData setServices(List<ServiceIdentity> services) {
        this.services = services;
        return this;
    }
    public List<ServiceIdentity> getServices() {
        return services;
    }
    public DomainData setEntities(List<Entity> entities) {
        this.entities = entities;
        return this;
    }
    public List<Entity> getEntities() {
        return entities;
    }
    public DomainData setModified(Timestamp modified) {
        this.modified = modified;
        return this;
    }
    public Timestamp getModified() {
        return modified;
    }
    public DomainData setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return applicationId;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DomainData.class) {
                return false;
            }
            DomainData a = (DomainData) another;
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (account == null ? a.account != null : !account.equals(a.account)) {
                return false;
            }
            if (ypmId == null ? a.ypmId != null : !ypmId.equals(a.ypmId)) {
                return false;
            }
            if (enabled == null ? a.enabled != null : !enabled.equals(a.enabled)) {
                return false;
            }
            if (roles == null ? a.roles != null : !roles.equals(a.roles)) {
                return false;
            }
            if (policies == null ? a.policies != null : !policies.equals(a.policies)) {
                return false;
            }
            if (services == null ? a.services != null : !services.equals(a.services)) {
                return false;
            }
            if (entities == null ? a.entities != null : !entities.equals(a.entities)) {
                return false;
            }
            if (modified == null ? a.modified != null : !modified.equals(a.modified)) {
                return false;
            }
            if (applicationId == null ? a.applicationId != null : !applicationId.equals(a.applicationId)) {
                return false;
            }
        }
        return true;
    }
}
