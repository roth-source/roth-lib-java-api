package roth.lib.java.api.rackspace;

import roth.lib.java.Characters;
import roth.lib.java.api.JsonApiClient;
import roth.lib.java.api.rackspace.identity.IdentityClient;
import roth.lib.java.api.rackspace.model.AuthToken;
import roth.lib.java.api.rackspace.model.Endpoint;
import roth.lib.java.api.rackspace.type.ServiceType;
import roth.lib.java.http.HttpResponse;

public abstract class RackspaceClient extends JsonApiClient<Object, Object> implements Characters
{
	protected IdentityClient identityClient;
	
	protected RackspaceClient(boolean debug)
	{
		super(debug);
	}
	
	protected RackspaceClient(IdentityClient identityClient, boolean debug)
	{
		super(debug);
		this.identityClient = identityClient;
	}
	
	public IdentityClient getIdentityClient()
	{
		return identityClient;
	}
	
	public AuthToken getAuthToken()
	{
		return identityClient.getAuthToken();
	}
	
	public String getAutoTokenId()
	{
		return getAuthToken().getId();
	}
	
	public Endpoint getEndpoint(ServiceType serviceType)
	{
		return identityClient.getEndpoint(serviceType);
	}
	
	@Override
	protected <T> void checkResponse(HttpResponse<T> response)
	{
		
	}
	
}
