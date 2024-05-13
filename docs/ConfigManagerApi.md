# ConfigManagerApi

All URIs are relative to *https://config-manager.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**configManagerBulkSetConfigs**](ConfigManagerApi.md#configManagerBulkSetConfigs) | **POST** /configmanager.ConfigManager/BulkSetConfigs | BulkSetConfigs |
| [**configManagerGetConfig**](ConfigManagerApi.md#configManagerGetConfig) | **POST** /configmanager.ConfigManager/GetConfig | GetConfig |
| [**configManagerGetTenantIdByCode**](ConfigManagerApi.md#configManagerGetTenantIdByCode) | **POST** /configmanager.ConfigManager/GetTenantIdByCode |  |


<a id="configManagerBulkSetConfigs"></a>
# **configManagerBulkSetConfigs**
> Object configManagerBulkSetConfigs(body)

BulkSetConfigs

Bulk set configs

### Example
```java
// Import classes:
import GeminiCommerce_Configmanager.ApiClient;
import GeminiCommerce_Configmanager.ApiException;
import GeminiCommerce_Configmanager.Configuration;
import GeminiCommerce_Configmanager.auth.*;
import GeminiCommerce_Configmanager.models.*;
import org.openapitools.client.api.ConfigManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://config-manager.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ConfigManagerApi apiInstance = new ConfigManagerApi(defaultClient);
    ConfigmanagerBulkSetConfigsRequest body = new ConfigmanagerBulkSetConfigsRequest(); // ConfigmanagerBulkSetConfigsRequest | 
    try {
      Object result = apiInstance.configManagerBulkSetConfigs(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigManagerApi#configManagerBulkSetConfigs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ConfigmanagerBulkSetConfigsRequest**](ConfigmanagerBulkSetConfigsRequest.md)|  | |

### Return type

**Object**

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="configManagerGetConfig"></a>
# **configManagerGetConfig**
> ConfigmanagerConfigResponse configManagerGetConfig(body)

GetConfig

Get a config

### Example
```java
// Import classes:
import GeminiCommerce_Configmanager.ApiClient;
import GeminiCommerce_Configmanager.ApiException;
import GeminiCommerce_Configmanager.Configuration;
import GeminiCommerce_Configmanager.auth.*;
import GeminiCommerce_Configmanager.models.*;
import org.openapitools.client.api.ConfigManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://config-manager.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ConfigManagerApi apiInstance = new ConfigManagerApi(defaultClient);
    ConfigmanagerGetConfigRequest body = new ConfigmanagerGetConfigRequest(); // ConfigmanagerGetConfigRequest | 
    try {
      ConfigmanagerConfigResponse result = apiInstance.configManagerGetConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigManagerApi#configManagerGetConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ConfigmanagerGetConfigRequest**](ConfigmanagerGetConfigRequest.md)|  | |

### Return type

[**ConfigmanagerConfigResponse**](ConfigmanagerConfigResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="configManagerGetTenantIdByCode"></a>
# **configManagerGetTenantIdByCode**
> ConfigmanagerGetTenantIdByCodeResponse configManagerGetTenantIdByCode(body)



### Example
```java
// Import classes:
import GeminiCommerce_Configmanager.ApiClient;
import GeminiCommerce_Configmanager.ApiException;
import GeminiCommerce_Configmanager.Configuration;
import GeminiCommerce_Configmanager.auth.*;
import GeminiCommerce_Configmanager.models.*;
import org.openapitools.client.api.ConfigManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://config-manager.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ConfigManagerApi apiInstance = new ConfigManagerApi(defaultClient);
    ConfigmanagerGetTenantIdByCodeRequest body = new ConfigmanagerGetTenantIdByCodeRequest(); // ConfigmanagerGetTenantIdByCodeRequest | 
    try {
      ConfigmanagerGetTenantIdByCodeResponse result = apiInstance.configManagerGetTenantIdByCode(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigManagerApi#configManagerGetTenantIdByCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ConfigmanagerGetTenantIdByCodeRequest**](ConfigmanagerGetTenantIdByCodeRequest.md)|  | |

### Return type

[**ConfigmanagerGetTenantIdByCodeResponse**](ConfigmanagerGetTenantIdByCodeResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

