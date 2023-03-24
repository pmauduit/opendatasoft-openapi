/*
 * Explore API
 * The Opendatasoft [Explore API v2](https://help.opendatasoft.com/apis/ods-explore-v2/) is organized around REST. It provides access to all the data available through the platform in a coherent, hierarchical way.  - Only the HTTP `GET` method is supported. - All API endpoints return JSON. - Endpoints are organized in a hierarchical way describing the relative relationship between objects. - All responses contain a list of links allowing easy and relevant navigation through the API endpoints. - All endpoints use the [Opendatasoft Query Language (ODSQL)](https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)). This means that, most of the time, parameters work the same way for all endpoints.
 *
 * The version of the OpenAPI document: V2
 * Contact: support@opendatasoft.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-23T18:48:41.952623+01:00[Europe/Paris]")
public class GetDatasets429Response {
  public static final String SERIALIZED_NAME_ERRORCODE = "errorcode";
  @SerializedName(SERIALIZED_NAME_ERRORCODE)
  private BigDecimal errorcode;

  public static final String SERIALIZED_NAME_RESET_TIME = "reset_time";
  @SerializedName(SERIALIZED_NAME_RESET_TIME)
  private String resetTime;

  public static final String SERIALIZED_NAME_LIMIT_TIME_UNIT = "limit_time_unit";
  @SerializedName(SERIALIZED_NAME_LIMIT_TIME_UNIT)
  private String limitTimeUnit;

  public static final String SERIALIZED_NAME_CALL_LIMIT = "call_limit";
  @SerializedName(SERIALIZED_NAME_CALL_LIMIT)
  private BigDecimal callLimit;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public GetDatasets429Response() {
  }

  public GetDatasets429Response errorcode(BigDecimal errorcode) {
    
    this.errorcode = errorcode;
    return this;
  }

   /**
   * Get errorcode
   * @return errorcode
  **/
  @javax.annotation.Nonnull

  public BigDecimal getErrorcode() {
    return errorcode;
  }


  public void setErrorcode(BigDecimal errorcode) {
    this.errorcode = errorcode;
  }


  public GetDatasets429Response resetTime(String resetTime) {
    
    this.resetTime = resetTime;
    return this;
  }

   /**
   * Get resetTime
   * @return resetTime
  **/
  @javax.annotation.Nonnull

  public String getResetTime() {
    return resetTime;
  }


  public void setResetTime(String resetTime) {
    this.resetTime = resetTime;
  }


  public GetDatasets429Response limitTimeUnit(String limitTimeUnit) {
    
    this.limitTimeUnit = limitTimeUnit;
    return this;
  }

   /**
   * Get limitTimeUnit
   * @return limitTimeUnit
  **/
  @javax.annotation.Nonnull

  public String getLimitTimeUnit() {
    return limitTimeUnit;
  }


  public void setLimitTimeUnit(String limitTimeUnit) {
    this.limitTimeUnit = limitTimeUnit;
  }


  public GetDatasets429Response callLimit(BigDecimal callLimit) {
    
    this.callLimit = callLimit;
    return this;
  }

   /**
   * Get callLimit
   * @return callLimit
  **/
  @javax.annotation.Nonnull

  public BigDecimal getCallLimit() {
    return callLimit;
  }


  public void setCallLimit(BigDecimal callLimit) {
    this.callLimit = callLimit;
  }


  public GetDatasets429Response error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nonnull

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDatasets429Response getDatasets429Response = (GetDatasets429Response) o;
    return Objects.equals(this.errorcode, getDatasets429Response.errorcode) &&
        Objects.equals(this.resetTime, getDatasets429Response.resetTime) &&
        Objects.equals(this.limitTimeUnit, getDatasets429Response.limitTimeUnit) &&
        Objects.equals(this.callLimit, getDatasets429Response.callLimit) &&
        Objects.equals(this.error, getDatasets429Response.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorcode, resetTime, limitTimeUnit, callLimit, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDatasets429Response {\n");
    sb.append("    errorcode: ").append(toIndentedString(errorcode)).append("\n");
    sb.append("    resetTime: ").append(toIndentedString(resetTime)).append("\n");
    sb.append("    limitTimeUnit: ").append(toIndentedString(limitTimeUnit)).append("\n");
    sb.append("    callLimit: ").append(toIndentedString(callLimit)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
    openapiFields.add("errorcode");
    openapiFields.add("reset_time");
    openapiFields.add("limit_time_unit");
    openapiFields.add("call_limit");
    openapiFields.add("error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("errorcode");
    openapiRequiredFields.add("reset_time");
    openapiRequiredFields.add("limit_time_unit");
    openapiRequiredFields.add("call_limit");
    openapiRequiredFields.add("error");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetDatasets429Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetDatasets429Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDatasets429Response is not found in the empty JSON string", GetDatasets429Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetDatasets429Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDatasets429Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetDatasets429Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("reset_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reset_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reset_time").toString()));
      }
      if (!jsonObj.get("limit_time_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit_time_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit_time_unit").toString()));
      }
      if (!jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDatasets429Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDatasets429Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDatasets429Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDatasets429Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDatasets429Response>() {
           @Override
           public void write(JsonWriter out, GetDatasets429Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDatasets429Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDatasets429Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDatasets429Response
  * @throws IOException if the JSON string is invalid with respect to GetDatasets429Response
  */
  public static GetDatasets429Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDatasets429Response.class);
  }

 /**
  * Convert an instance of GetDatasets429Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

