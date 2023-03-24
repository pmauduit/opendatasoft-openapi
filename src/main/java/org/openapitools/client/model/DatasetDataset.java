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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.DatasetDatasetAttachmentsInner;
import org.openapitools.client.model.DatasetDatasetFieldsInner;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * DatasetDataset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-23T18:48:41.952623+01:00[Europe/Paris]")
public class DatasetDataset {
  public static final String SERIALIZED_NAME_DATASET_ID = "dataset_id";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_DATASET_UID = "dataset_uid";
  @SerializedName(SERIALIZED_NAME_DATASET_UID)
  private String datasetUid;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<DatasetDatasetAttachmentsInner> attachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_HAS_RECORDS = "has_records";
  @SerializedName(SERIALIZED_NAME_HAS_RECORDS)
  private Boolean hasRecords;

  public static final String SERIALIZED_NAME_DATA_VISIBLE = "data_visible";
  @SerializedName(SERIALIZED_NAME_DATA_VISIBLE)
  private Boolean dataVisible;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<String> features = new ArrayList<>();

  public static final String SERIALIZED_NAME_METAS = "metas";
  @SerializedName(SERIALIZED_NAME_METAS)
  private Object metas;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<DatasetDatasetFieldsInner> fields = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDITIONAL_PROPERTIES = "additionalProperties";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PROPERTIES)
  private Object additionalProperties = null;

  public DatasetDataset() {
  }

  
  public DatasetDataset(
     String datasetUid
  ) {
    this();
    this.datasetUid = datasetUid;
  }

  public DatasetDataset datasetId(String datasetId) {
    
    this.datasetId = datasetId;
    return this;
  }

   /**
   * Get datasetId
   * @return datasetId
  **/
  @javax.annotation.Nullable

  public String getDatasetId() {
    return datasetId;
  }


  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


   /**
   * Get datasetUid
   * @return datasetUid
  **/
  @javax.annotation.Nullable

  public String getDatasetUid() {
    return datasetUid;
  }




  public DatasetDataset attachments(List<DatasetDatasetAttachmentsInner> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public DatasetDataset addAttachmentsItem(DatasetDatasetAttachmentsInner attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable

  public List<DatasetDatasetAttachmentsInner> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<DatasetDatasetAttachmentsInner> attachments) {
    this.attachments = attachments;
  }


  public DatasetDataset hasRecords(Boolean hasRecords) {
    
    this.hasRecords = hasRecords;
    return this;
  }

   /**
   * Get hasRecords
   * @return hasRecords
  **/
  @javax.annotation.Nullable

  public Boolean getHasRecords() {
    return hasRecords;
  }


  public void setHasRecords(Boolean hasRecords) {
    this.hasRecords = hasRecords;
  }


  public DatasetDataset dataVisible(Boolean dataVisible) {
    
    this.dataVisible = dataVisible;
    return this;
  }

   /**
   * Get dataVisible
   * @return dataVisible
  **/
  @javax.annotation.Nullable

  public Boolean getDataVisible() {
    return dataVisible;
  }


  public void setDataVisible(Boolean dataVisible) {
    this.dataVisible = dataVisible;
  }


  public DatasetDataset features(List<String> features) {
    
    this.features = features;
    return this;
  }

  public DatasetDataset addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * A map of available features for a dataset, with the fields they apply to. 
   * @return features
  **/
  @javax.annotation.Nullable

  public List<String> getFeatures() {
    return features;
  }


  public void setFeatures(List<String> features) {
    this.features = features;
  }


  public DatasetDataset metas(Object metas) {
    
    this.metas = metas;
    return this;
  }

   /**
   * Get metas
   * @return metas
  **/
  @javax.annotation.Nullable

  public Object getMetas() {
    return metas;
  }


  public void setMetas(Object metas) {
    this.metas = metas;
  }


  public DatasetDataset fields(List<DatasetDatasetFieldsInner> fields) {
    
    this.fields = fields;
    return this;
  }

  public DatasetDataset addFieldsItem(DatasetDatasetFieldsInner fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable

  public List<DatasetDatasetFieldsInner> getFields() {
    return fields;
  }


  public void setFields(List<DatasetDatasetFieldsInner> fields) {
    this.fields = fields;
  }


  public DatasetDataset additionalProperties(Object additionalProperties) {
    
    this.additionalProperties = additionalProperties;
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @javax.annotation.Nullable

  public Object getAdditionalProperties() {
    return additionalProperties;
  }


  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetDataset datasetDataset = (DatasetDataset) o;
    return Objects.equals(this.datasetId, datasetDataset.datasetId) &&
        Objects.equals(this.datasetUid, datasetDataset.datasetUid) &&
        Objects.equals(this.attachments, datasetDataset.attachments) &&
        Objects.equals(this.hasRecords, datasetDataset.hasRecords) &&
        Objects.equals(this.dataVisible, datasetDataset.dataVisible) &&
        Objects.equals(this.features, datasetDataset.features) &&
        Objects.equals(this.metas, datasetDataset.metas) &&
        Objects.equals(this.fields, datasetDataset.fields) &&
        Objects.equals(this.additionalProperties, datasetDataset.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetId, datasetUid, attachments, hasRecords, dataVisible, features, metas, fields, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetDataset {\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    datasetUid: ").append(toIndentedString(datasetUid)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    hasRecords: ").append(toIndentedString(hasRecords)).append("\n");
    sb.append("    dataVisible: ").append(toIndentedString(dataVisible)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    metas: ").append(toIndentedString(metas)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("dataset_id");
    openapiFields.add("dataset_uid");
    openapiFields.add("attachments");
    openapiFields.add("has_records");
    openapiFields.add("data_visible");
    openapiFields.add("features");
    openapiFields.add("metas");
    openapiFields.add("fields");
    openapiFields.add("additionalProperties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatasetDataset
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DatasetDataset.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasetDataset is not found in the empty JSON string", DatasetDataset.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DatasetDataset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasetDataset` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("dataset_id") != null && !jsonObj.get("dataset_id").isJsonNull()) && !jsonObj.get("dataset_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataset_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataset_id").toString()));
      }
      if ((jsonObj.get("dataset_uid") != null && !jsonObj.get("dataset_uid").isJsonNull()) && !jsonObj.get("dataset_uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataset_uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataset_uid").toString()));
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            DatasetDatasetAttachmentsInner.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("features") != null && !jsonObj.get("features").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            DatasetDatasetFieldsInner.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasetDataset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasetDataset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasetDataset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasetDataset.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasetDataset>() {
           @Override
           public void write(JsonWriter out, DatasetDataset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasetDataset read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasetDataset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasetDataset
  * @throws IOException if the JSON string is invalid with respect to DatasetDataset
  */
  public static DatasetDataset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasetDataset.class);
  }

 /**
  * Convert an instance of DatasetDataset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
