# DatasetApi

All URIs are relative to *https://data.opendatasoft.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportRecords**](DatasetApi.md#exportRecords) | **GET** /catalog/datasets/{dataset_id}/exports/{format} | Export a dataset |
| [**getDataset**](DatasetApi.md#getDataset) | **GET** /catalog/datasets/{dataset_id} | Show dataset information |
| [**getDatasetAttachments**](DatasetApi.md#getDatasetAttachments) | **GET** /catalog/datasets/{dataset_id}/attachments | List dataset attachments |
| [**getRecord**](DatasetApi.md#getRecord) | **GET** /catalog/datasets/{dataset_id}/records/{record_id} | Read a dataset record |
| [**getRecords**](DatasetApi.md#getRecords) | **GET** /catalog/datasets/{dataset_id}/records | Query dataset records |
| [**getRecordsFacets**](DatasetApi.md#getRecordsFacets) | **GET** /catalog/datasets/{dataset_id}/facets | List dataset facets |


<a name="exportRecords"></a>
# **exportRecords**
> exportRecords(datasetId, format, select, where, orderBy, limit, offset, refine, exclude, lang, timezone)

Export a dataset

Export a dataset in the desired format.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://data.opendatasoft.com/api/v2");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    String format = "json"; // String | 
    String select = "select_example"; // String | Examples: - `select=size` - Example of select, which only return the \"size\" field. - `select=size * 2 as bigger_size` - Example of a complex expression with a label, which returns a new field named \"bigger_size\" and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard ('*'): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label.
    String where = "where_example"; // String | An array of filters.  A filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](<https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause>) reference documentation.
    List<String> orderBy = Arrays.asList(); // List<String> | Example: `order_by=sum(age) desc, name asc`  A comma-separated list of field names or aggregations to sort on, followed by an order (`asc` or `desc`).  Results are sorted in ascending order by default. To sort results in descending order, use the `desc` keyword.
    Integer limit = -1; // Integer | Number of items to return in export.  Use -1 (default) to retrieve all records 
    Integer offset = 0; // Integer | Index of the first item to return (starting at 0).  To use with the limit parameter to implement pagination. 
    List<String> refine = Arrays.asList(); // List<String> | Example: `refine=modified:2020` - Return only the value `2020` from the `modified` facet.  An array of facet filters used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: `refine=<FACETNAME>:<FACETVALUE>`  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **`refine` must not be confused with a `where` filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.**
    List<String> exclude = Arrays.asList(); // List<String> | Examples: - `exclude=city:Paris` - Exclude the value `Paris` from the `city` facet. Facets enumeration will display `Paris` as `excluded` without any count information. - `exclude=modified:2019/12` - Exclude the value `2019/12` from the `modified` facet. Facets enumeration will display `2020` as `excluded` without any count information.  An array of facet filters used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  `exclude` uses the following syntax: `exclude=<FACETNAME>:<FACETVALUE>`  **`exclude` must not be confused with a `where` filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.**
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    try {
      apiInstance.exportRecords(datasetId, format, select, where, orderBy, limit, offset, refine, exclude, lang, timezone);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#exportRecords");
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
| **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. | |
| **format** | **String**|  | [enum: json, geojson, shp, csv, xls, jsonl, jsonld, rdfxml, turtle, n3] |
| **select** | **String**| Examples: - &#x60;select&#x3D;size&#x60; - Example of select, which only return the \&quot;size\&quot; field. - &#x60;select&#x3D;size * 2 as bigger_size&#x60; - Example of a complex expression with a label, which returns a new field named \&quot;bigger_size\&quot; and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard (&#39;*&#39;): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label. | [optional] |
| **where** | **String**| An array of filters.  A filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](&lt;https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause&gt;) reference documentation. | [optional] |
| **orderBy** | [**List&lt;String&gt;**](String.md)| Example: &#x60;order_by&#x3D;sum(age) desc, name asc&#x60;  A comma-separated list of field names or aggregations to sort on, followed by an order (&#x60;asc&#x60; or &#x60;desc&#x60;).  Results are sorted in ascending order by default. To sort results in descending order, use the &#x60;desc&#x60; keyword. | [optional] |
| **limit** | **Integer**| Number of items to return in export.  Use -1 (default) to retrieve all records  | [optional] [default to -1] |
| **offset** | **Integer**| Index of the first item to return (starting at 0).  To use with the limit parameter to implement pagination.  | [optional] [default to 0] |
| **refine** | [**List&lt;String&gt;**](String.md)| Example: &#x60;refine&#x3D;modified:2020&#x60; - Return only the value &#x60;2020&#x60; from the &#x60;modified&#x60; facet.  An array of facet filters used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: &#x60;refine&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **&#x60;refine&#x60; must not be confused with a &#x60;where&#x60; filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.** | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Examples: - &#x60;exclude&#x3D;city:Paris&#x60; - Exclude the value &#x60;Paris&#x60; from the &#x60;city&#x60; facet. Facets enumeration will display &#x60;Paris&#x60; as &#x60;excluded&#x60; without any count information. - &#x60;exclude&#x3D;modified:2019/12&#x60; - Exclude the value &#x60;2019/12&#x60; from the &#x60;modified&#x60; facet. Facets enumeration will display &#x60;2020&#x60; as &#x60;excluded&#x60; without any count information.  An array of facet filters used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  &#x60;exclude&#x60; uses the following syntax: &#x60;exclude&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  **&#x60;exclude&#x60; must not be confused with a &#x60;where&#x60; filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.** | [optional] |
| **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv] |
| **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC] |

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return a file |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getDataset"></a>
# **getDataset**
> Dataset getDataset(datasetId, select, lang, timezone)

Show dataset information

Returns a list of available endpoints for the specified dataset, with metadata and endpoints.  The response includes the following links: * the attachments endpoint * the files endpoint * the records endpoint * the catalog endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://data.opendatasoft.com/api/v2");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    String select = "select_example"; // String | Examples: - `select=size` - Example of select, which only return the \"size\" field. - `select=size * 2 as bigger_size` - Example of a complex expression with a label, which returns a new field named \"bigger_size\" and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard ('*'): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label.
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    try {
      Dataset result = apiInstance.getDataset(datasetId, select, lang, timezone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getDataset");
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
| **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. | |
| **select** | **String**| Examples: - &#x60;select&#x3D;size&#x60; - Example of select, which only return the \&quot;size\&quot; field. - &#x60;select&#x3D;size * 2 as bigger_size&#x60; - Example of a complex expression with a label, which returns a new field named \&quot;bigger_size\&quot; and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard (&#39;*&#39;): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label. | [optional] |
| **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv] |
| **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC] |

### Return type

[**Dataset**](Dataset.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8json, application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The dataset |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getDatasetAttachments"></a>
# **getDatasetAttachments**
> GetDatasetAttachments200Response getDatasetAttachments(datasetId)

List dataset attachments

Returns a list of all available attachments for a dataset. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://data.opendatasoft.com/api/v2");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    try {
      GetDatasetAttachments200Response result = apiInstance.getDatasetAttachments(datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getDatasetAttachments");
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
| **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. | |

### Return type

[**GetDatasetAttachments200Response**](GetDatasetAttachments200Response.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all available attachments |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getRecord"></a>
# **getRecord**
> Record getRecord(datasetId, recordId, select, lang, timezone)

Read a dataset record

Reads a single dataset record based on its identifier. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://data.opendatasoft.com/api/v2");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    String recordId = "recordId_example"; // String | Record identifier
    String select = "select_example"; // String | Examples: - `select=size` - Example of select, which only return the \"size\" field. - `select=size * 2 as bigger_size` - Example of a complex expression with a label, which returns a new field named \"bigger_size\" and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard ('*'): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label.
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    try {
      Record result = apiInstance.getRecord(datasetId, recordId, select, lang, timezone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getRecord");
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
| **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. | |
| **recordId** | **String**| Record identifier | |
| **select** | **String**| Examples: - &#x60;select&#x3D;size&#x60; - Example of select, which only return the \&quot;size\&quot; field. - &#x60;select&#x3D;size * 2 as bigger_size&#x60; - Example of a complex expression with a label, which returns a new field named \&quot;bigger_size\&quot; and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard (&#39;*&#39;): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label. | [optional] |
| **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv] |
| **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC] |

### Return type

[**Record**](Record.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A single record |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getRecords"></a>
# **getRecords**
> Results getRecords(datasetId, select, where, groupBy, orderBy, limit, offset, refine, exclude, lang, timezone)

Query dataset records

Perform a query on dataset records.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://data.opendatasoft.com/api/v2");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    String select = "select_example"; // String | Examples: - `select=size` - Example of select, which only return the \"size\" field. - `select=size * 2 as bigger_size` - Example of a complex expression with a label, which returns a new field named \"bigger_size\" and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard ('*'): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label.
    String where = "where_example"; // String | An array of filters.  A filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](<https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause>) reference documentation.
    String groupBy = "groupBy_example"; // String | Example: `group_by='city_field as city'`  A group by expression defines a grouping function for an aggregation. It can be:  - a field name: group result by each value of this field  - a range function: group result by range  - a date function: group result by date  It is possible to specify a custom name with the 'as name' notation.
    List<String> orderBy = Arrays.asList(); // List<String> | Example: `order_by=sum(age) desc, name asc`  A comma-separated list of field names or aggregations to sort on, followed by an order (`asc` or `desc`).  Results are sorted in ascending order by default. To sort results in descending order, use the `desc` keyword.
    Integer limit = 10; // Integer | Number of items to return.  To use with the offset parameter to implement pagination.  Maximum value is 100, to retrieve more than 100 items use the `/export` endpoints. 
    Integer offset = 0; // Integer | Index of the first item to return (starting at 0).  To use with the limit parameter to implement pagination. 
    List<String> refine = Arrays.asList(); // List<String> | Example: `refine=modified:2020` - Return only the value `2020` from the `modified` facet.  An array of facet filters used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: `refine=<FACETNAME>:<FACETVALUE>`  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **`refine` must not be confused with a `where` filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.**
    List<String> exclude = Arrays.asList(); // List<String> | Examples: - `exclude=city:Paris` - Exclude the value `Paris` from the `city` facet. Facets enumeration will display `Paris` as `excluded` without any count information. - `exclude=modified:2019/12` - Exclude the value `2019/12` from the `modified` facet. Facets enumeration will display `2020` as `excluded` without any count information.  An array of facet filters used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  `exclude` uses the following syntax: `exclude=<FACETNAME>:<FACETVALUE>`  **`exclude` must not be confused with a `where` filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.**
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    try {
      Results result = apiInstance.getRecords(datasetId, select, where, groupBy, orderBy, limit, offset, refine, exclude, lang, timezone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getRecords");
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
| **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. | |
| **select** | **String**| Examples: - &#x60;select&#x3D;size&#x60; - Example of select, which only return the \&quot;size\&quot; field. - &#x60;select&#x3D;size * 2 as bigger_size&#x60; - Example of a complex expression with a label, which returns a new field named \&quot;bigger_size\&quot; and containing the double of size field value.  A select expression can be used to add, remove or change the fields to return. An expression can be:   - a wildcard (&#39;*&#39;): all fields are returned.   - A field name: only the specified field is returned.   - An include/exclude function: All fields matching the include or exclude expression are included or excluded. This expression can contain wildcard.   - A complex expression. The result of the expression is returned. A label can be set for this expression, and in that case, the field will be named after this label. | [optional] |
| **where** | **String**| An array of filters.  A filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](&lt;https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause&gt;) reference documentation. | [optional] |
| **groupBy** | **String**| Example: &#x60;group_by&#x3D;&#39;city_field as city&#39;&#x60;  A group by expression defines a grouping function for an aggregation. It can be:  - a field name: group result by each value of this field  - a range function: group result by range  - a date function: group result by date  It is possible to specify a custom name with the &#39;as name&#39; notation. | [optional] |
| **orderBy** | [**List&lt;String&gt;**](String.md)| Example: &#x60;order_by&#x3D;sum(age) desc, name asc&#x60;  A comma-separated list of field names or aggregations to sort on, followed by an order (&#x60;asc&#x60; or &#x60;desc&#x60;).  Results are sorted in ascending order by default. To sort results in descending order, use the &#x60;desc&#x60; keyword. | [optional] |
| **limit** | **Integer**| Number of items to return.  To use with the offset parameter to implement pagination.  Maximum value is 100, to retrieve more than 100 items use the &#x60;/export&#x60; endpoints.  | [optional] [default to 10] |
| **offset** | **Integer**| Index of the first item to return (starting at 0).  To use with the limit parameter to implement pagination.  | [optional] [default to 0] |
| **refine** | [**List&lt;String&gt;**](String.md)| Example: &#x60;refine&#x3D;modified:2020&#x60; - Return only the value &#x60;2020&#x60; from the &#x60;modified&#x60; facet.  An array of facet filters used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: &#x60;refine&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **&#x60;refine&#x60; must not be confused with a &#x60;where&#x60; filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.** | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Examples: - &#x60;exclude&#x3D;city:Paris&#x60; - Exclude the value &#x60;Paris&#x60; from the &#x60;city&#x60; facet. Facets enumeration will display &#x60;Paris&#x60; as &#x60;excluded&#x60; without any count information. - &#x60;exclude&#x3D;modified:2019/12&#x60; - Exclude the value &#x60;2019/12&#x60; from the &#x60;modified&#x60; facet. Facets enumeration will display &#x60;2020&#x60; as &#x60;excluded&#x60; without any count information.  An array of facet filters used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  &#x60;exclude&#x60; uses the following syntax: &#x60;exclude&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  **&#x60;exclude&#x60; must not be confused with a &#x60;where&#x60; filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.** | [optional] |
| **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv] |
| **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC] |

### Return type

[**Results**](Results.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Records |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getRecordsFacets"></a>
# **getRecordsFacets**
> GetDatasetsFacets200Response getRecordsFacets(datasetId, where, refine, exclude, facet, lang, timezone)

List dataset facets

Enumerates facet values for records and returns a list of values for each facet. Can be used to implement guided navigation in large result sets. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://data.opendatasoft.com/api/v2");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String datasetId = "datasetId_example"; // String | The identifier of the dataset to be queried.  You can find it in the \"Information\" tab of the dataset page or in the dataset URL, right after `/datasets/`.
    String where = "where_example"; // String | An array of filters.  A filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](<https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause>) reference documentation.
    List<String> refine = Arrays.asList(); // List<String> | Example: `refine=modified:2020` - Return only the value `2020` from the `modified` facet.  An array of facet filters used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: `refine=<FACETNAME>:<FACETVALUE>`  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **`refine` must not be confused with a `where` filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.**
    List<String> exclude = Arrays.asList(); // List<String> | Examples: - `exclude=city:Paris` - Exclude the value `Paris` from the `city` facet. Facets enumeration will display `Paris` as `excluded` without any count information. - `exclude=modified:2019/12` - Exclude the value `2019/12` from the `modified` facet. Facets enumeration will display `2020` as `excluded` without any count information.  An array of facet filters used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  `exclude` uses the following syntax: `exclude=<FACETNAME>:<FACETVALUE>`  **`exclude` must not be confused with a `where` filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.**
    List<String> facet = Arrays.asList(); // List<String> | A facet is a field used for simple filtering (through the `refine` and `exclude` parameters) or exploration (with the `/facets` endpoint).  Facets can be configured in the back-office or with this parameter. 
    String lang = "en"; // String | A language value.  If specified, the `lang` value override the default language, which is \"fr\". The language is used to format string, for example in the `date_format` function.
    String timezone = "UTC"; // String | Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml).
    try {
      GetDatasetsFacets200Response result = apiInstance.getRecordsFacets(datasetId, where, refine, exclude, facet, lang, timezone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getRecordsFacets");
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
| **datasetId** | **String**| The identifier of the dataset to be queried.  You can find it in the \&quot;Information\&quot; tab of the dataset page or in the dataset URL, right after &#x60;/datasets/&#x60;. | |
| **where** | **String**| An array of filters.  A filter is a text expression performing a simple full-text search that can also include logical operations (NOT, AND, OR...) and lots of other functions to perform complex and precise search operations.  For more information, see [Opendatasoft Query Language (ODSQL)](&lt;https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause&gt;) reference documentation. | [optional] |
| **refine** | [**List&lt;String&gt;**](String.md)| Example: &#x60;refine&#x3D;modified:2020&#x60; - Return only the value &#x60;2020&#x60; from the &#x60;modified&#x60; facet.  An array of facet filters used to limit the result set. Using this parameter, you can refine your query to display only the selected facet value in the response.  Refinement uses the following syntax: &#x60;refine&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  For date, and other hierarchical facets, when refining on one value, all second-level values related to that entry will appear in facets enumeration. For example, after refining on the year 2019, the related second-level month will appear. And when refining on August 2019, the third-level day will appear.  **&#x60;refine&#x60; must not be confused with a &#x60;where&#x60; filter. Refining with a facet is equivalent to selecting an entry in the left navigation panel.** | [optional] |
| **exclude** | [**List&lt;String&gt;**](String.md)| Examples: - &#x60;exclude&#x3D;city:Paris&#x60; - Exclude the value &#x60;Paris&#x60; from the &#x60;city&#x60; facet. Facets enumeration will display &#x60;Paris&#x60; as &#x60;excluded&#x60; without any count information. - &#x60;exclude&#x3D;modified:2019/12&#x60; - Exclude the value &#x60;2019/12&#x60; from the &#x60;modified&#x60; facet. Facets enumeration will display &#x60;2020&#x60; as &#x60;excluded&#x60; without any count information.  An array of facet filters used to exclude a facet value from the result set. Using this parameter, you can filter your query to exclude the selected facet value in the response.  &#x60;exclude&#x60; uses the following syntax: &#x60;exclude&#x3D;&lt;FACETNAME&gt;:&lt;FACETVALUE&gt;&#x60;  **&#x60;exclude&#x60; must not be confused with a &#x60;where&#x60; filter. Excluding a facet value is equivalent to removing an entry in the left navigation panel.** | [optional] |
| **facet** | [**List&lt;String&gt;**](String.md)| A facet is a field used for simple filtering (through the &#x60;refine&#x60; and &#x60;exclude&#x60; parameters) or exploration (with the &#x60;/facets&#x60; endpoint).  Facets can be configured in the back-office or with this parameter.  | [optional] |
| **lang** | **String**| A language value.  If specified, the &#x60;lang&#x60; value override the default language, which is \&quot;fr\&quot;. The language is used to format string, for example in the &#x60;date_format&#x60; function. | [optional] [enum: en, fr, nl, pt, it, ar, de, es, ca, eu, sv] |
| **timezone** | **String**| Set the timezone for datetime fields.  Timezone IDs are defined by the [Unicode CLDR project](https://github.com/unicode-org/cldr). The list of timezone IDs is available in [timezone.xml](https://github.com/unicode-org/cldr/blob/master/common/bcp47/timezone.xml). | [optional] [default to UTC] |

### Return type

[**GetDatasetsFacets200Response**](GetDatasetsFacets200Response.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Facets enumeration |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal Server Error |  -  |

