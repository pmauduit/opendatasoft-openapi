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
 * RecordRecordFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-23T18:48:41.952623+01:00[Europe/Paris]")
public class RecordRecordFields {
  public static final String SERIALIZED_NAME_FIELD1 = "field1";
  @SerializedName(SERIALIZED_NAME_FIELD1)
  private String field1;

  public static final String SERIALIZED_NAME_FIELD2 = "field2";
  @SerializedName(SERIALIZED_NAME_FIELD2)
  private Integer field2;

  public RecordRecordFields() {
  }

  public RecordRecordFields field1(String field1) {
    
    this.field1 = field1;
    return this;
  }

   /**
   * Get field1
   * @return field1
  **/
  @javax.annotation.Nullable

  public String getField1() {
    return field1;
  }


  public void setField1(String field1) {
    this.field1 = field1;
  }


  public RecordRecordFields field2(Integer field2) {
    
    this.field2 = field2;
    return this;
  }

   /**
   * Get field2
   * @return field2
  **/
  @javax.annotation.Nullable

  public Integer getField2() {
    return field2;
  }


  public void setField2(Integer field2) {
    this.field2 = field2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordRecordFields recordRecordFields = (RecordRecordFields) o;
    return Objects.equals(this.field1, recordRecordFields.field1) &&
        Objects.equals(this.field2, recordRecordFields.field2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field1, field2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordRecordFields {\n");
    sb.append("    field1: ").append(toIndentedString(field1)).append("\n");
    sb.append("    field2: ").append(toIndentedString(field2)).append("\n");
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
    openapiFields.add("field1");
    openapiFields.add("field2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecordRecordFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecordRecordFields.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordRecordFields is not found in the empty JSON string", RecordRecordFields.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecordRecordFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordRecordFields` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("field1") != null && !jsonObj.get("field1").isJsonNull()) && !jsonObj.get("field1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field1").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordRecordFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordRecordFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordRecordFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordRecordFields.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordRecordFields>() {
           @Override
           public void write(JsonWriter out, RecordRecordFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordRecordFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecordRecordFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecordRecordFields
  * @throws IOException if the JSON string is invalid with respect to RecordRecordFields
  */
  public static RecordRecordFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordRecordFields.class);
  }

 /**
  * Convert an instance of RecordRecordFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

