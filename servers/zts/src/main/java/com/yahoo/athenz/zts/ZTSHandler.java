//
// This file generated by rdl 1.4.15. Do not modify!
//
package com.yahoo.athenz.zts;

import com.yahoo.rdl.*;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//
// ZTSHandler is the interface that the service implementation must implement
//
public interface ZTSHandler { 
    public ResourceAccess getResourceAccess(ResourceContext context, String action, String resource, String domain, String checkPrincipal);
    public ResourceAccess getResourceAccessExt(ResourceContext context, String action, String resource, String domain, String checkPrincipal);
    public ServiceIdentity getServiceIdentity(ResourceContext context, String domainName, String serviceName);
    public ServiceIdentityList getServiceIdentityList(ResourceContext context, String domainName);
    public PublicKeyEntry getPublicKeyEntry(ResourceContext context, String domainName, String serviceName, String keyId);
    public HostServices getHostServices(ResourceContext context, String host);
    public void getDomainSignedPolicyData(ResourceContext context, String domainName, String matchingTag, GetDomainSignedPolicyDataResult result);
    public RoleToken getRoleToken(ResourceContext context, String domainName, String role, Integer minExpiryTime, Integer maxExpiryTime, String proxyForPrincipal);
    public RoleToken postRoleCertificateRequest(ResourceContext context, String domainName, String roleName, RoleCertificateRequest req);
    public Access getAccess(ResourceContext context, String domainName, String roleName, String principal);
    public RoleAccess getRoleAccess(ResourceContext context, String domainName, String principal);
    public TenantDomains getTenantDomains(ResourceContext context, String providerDomainName, String userName, String roleName, String serviceName);
    public Identity postInstanceRefreshRequest(ResourceContext context, String domain, String service, InstanceRefreshRequest req);
    public AWSTemporaryCredentials getAWSTemporaryCredentials(ResourceContext context, String domainName, String role);
    public Identity postOSTKInstanceInformation(ResourceContext context, OSTKInstanceInformation info);
    public Identity postOSTKInstanceRefreshRequest(ResourceContext context, String domain, String service, OSTKInstanceRefreshRequest req);
    public void postInstanceRegisterInformation(ResourceContext context, InstanceRegisterInformation info, PostInstanceRegisterInformationResult result);
    public InstanceIdentity postInstanceRefreshInformation(ResourceContext context, String provider, String domain, String service, String instanceId, InstanceRefreshInformation info);
    public InstanceIdentity deleteInstanceIdentity(ResourceContext context, String provider, String domain, String service, String instanceId);
    public DomainMetrics postDomainMetrics(ResourceContext context, String domainName, DomainMetrics req);
    public Status getStatus(ResourceContext context);
    public Schema getRdlSchema(ResourceContext context);
    public ResourceContext newResourceContext(HttpServletRequest request, HttpServletResponse response);
}
