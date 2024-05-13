/*
 * Config Manager Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BulkSetConfigsRequestConfig;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_Configmanager.JSON;

/**
 * ConfigmanagerBulkSetConfigsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T11:00:21.069888808Z[Etc/UTC]")
public class ConfigmanagerBulkSetConfigsRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_CONFIGS = "configs";
  @SerializedName(SERIALIZED_NAME_CONFIGS)
  private List<BulkSetConfigsRequestConfig> configs = new ArrayList<>();

  public ConfigmanagerBulkSetConfigsRequest() {
  }

  public ConfigmanagerBulkSetConfigsRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public ConfigmanagerBulkSetConfigsRequest configs(List<BulkSetConfigsRequestConfig> configs) {
    this.configs = configs;
    return this;
  }

  public ConfigmanagerBulkSetConfigsRequest addConfigsItem(BulkSetConfigsRequestConfig configsItem) {
    if (this.configs == null) {
      this.configs = new ArrayList<>();
    }
    this.configs.add(configsItem);
    return this;
  }

   /**
   * Get configs
   * @return configs
  **/
  @javax.annotation.Nonnull
  public List<BulkSetConfigsRequestConfig> getConfigs() {
    return configs;
  }

  public void setConfigs(List<BulkSetConfigsRequestConfig> configs) {
    this.configs = configs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigmanagerBulkSetConfigsRequest configmanagerBulkSetConfigsRequest = (ConfigmanagerBulkSetConfigsRequest) o;
    return Objects.equals(this.tenantId, configmanagerBulkSetConfigsRequest.tenantId) &&
        Objects.equals(this.configs, configmanagerBulkSetConfigsRequest.configs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, configs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigmanagerBulkSetConfigsRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tenantId");
    openapiFields.add("configs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("configs");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConfigmanagerBulkSetConfigsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigmanagerBulkSetConfigsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigmanagerBulkSetConfigsRequest is not found in the empty JSON string", ConfigmanagerBulkSetConfigsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigmanagerBulkSetConfigsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigmanagerBulkSetConfigsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConfigmanagerBulkSetConfigsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("configs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configs` to be an array in the JSON string but got `%s`", jsonObj.get("configs").toString()));
      }

      JsonArray jsonArrayconfigs = jsonObj.getAsJsonArray("configs");
      // validate the required field `configs` (array)
      for (int i = 0; i < jsonArrayconfigs.size(); i++) {
        BulkSetConfigsRequestConfig.validateJsonElement(jsonArrayconfigs.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigmanagerBulkSetConfigsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigmanagerBulkSetConfigsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigmanagerBulkSetConfigsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigmanagerBulkSetConfigsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigmanagerBulkSetConfigsRequest>() {
           @Override
           public void write(JsonWriter out, ConfigmanagerBulkSetConfigsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigmanagerBulkSetConfigsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigmanagerBulkSetConfigsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigmanagerBulkSetConfigsRequest
  * @throws IOException if the JSON string is invalid with respect to ConfigmanagerBulkSetConfigsRequest
  */
  public static ConfigmanagerBulkSetConfigsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigmanagerBulkSetConfigsRequest.class);
  }

 /**
  * Convert an instance of ConfigmanagerBulkSetConfigsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

