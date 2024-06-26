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
import java.util.Arrays;

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
 * BulkSetConfigsRequestConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T11:00:21.069888808Z[Etc/UTC]")
public class BulkSetConfigsRequestConfig {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_BUSINESS_DOMAIN = "businessDomain";
  @SerializedName(SERIALIZED_NAME_BUSINESS_DOMAIN)
  private String businessDomain;

  public BulkSetConfigsRequestConfig() {
  }

  public BulkSetConfigsRequestConfig key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public BulkSetConfigsRequestConfig value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public BulkSetConfigsRequestConfig businessDomain(String businessDomain) {
    this.businessDomain = businessDomain;
    return this;
  }

   /**
   * Get businessDomain
   * @return businessDomain
  **/
  @javax.annotation.Nullable
  public String getBusinessDomain() {
    return businessDomain;
  }

  public void setBusinessDomain(String businessDomain) {
    this.businessDomain = businessDomain;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSetConfigsRequestConfig bulkSetConfigsRequestConfig = (BulkSetConfigsRequestConfig) o;
    return Objects.equals(this.key, bulkSetConfigsRequestConfig.key) &&
        Objects.equals(this.value, bulkSetConfigsRequestConfig.value) &&
        Objects.equals(this.businessDomain, bulkSetConfigsRequestConfig.businessDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, businessDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSetConfigsRequestConfig {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    businessDomain: ").append(toIndentedString(businessDomain)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("value");
    openapiFields.add("businessDomain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BulkSetConfigsRequestConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BulkSetConfigsRequestConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkSetConfigsRequestConfig is not found in the empty JSON string", BulkSetConfigsRequestConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BulkSetConfigsRequestConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkSetConfigsRequestConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BulkSetConfigsRequestConfig.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("businessDomain") != null && !jsonObj.get("businessDomain").isJsonNull()) && !jsonObj.get("businessDomain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessDomain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessDomain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkSetConfigsRequestConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkSetConfigsRequestConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkSetConfigsRequestConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkSetConfigsRequestConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkSetConfigsRequestConfig>() {
           @Override
           public void write(JsonWriter out, BulkSetConfigsRequestConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkSetConfigsRequestConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BulkSetConfigsRequestConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BulkSetConfigsRequestConfig
  * @throws IOException if the JSON string is invalid with respect to BulkSetConfigsRequestConfig
  */
  public static BulkSetConfigsRequestConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkSetConfigsRequestConfig.class);
  }

 /**
  * Convert an instance of BulkSetConfigsRequestConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

