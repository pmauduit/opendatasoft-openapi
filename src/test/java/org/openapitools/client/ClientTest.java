package org.openapitools.client;

import org.junit.jupiter.api.Test;
import org.openapitools.client.api.CatalogApi;
import org.openapitools.client.api.DatasetApi;
import org.openapitools.client.model.Results;
import org.openapitools.client.model.ResultsDataset;

import java.util.List;

public class ClientTest {


    @Test
    public void testClient() throws ApiException {
        ApiClient client = new ApiClient().setBasePath("https://donnees.grandchambery.fr/api/v2");
        DatasetApi dApi = new DatasetApi(client);
        CatalogApi cApi = new CatalogApi(client);

        ResultsDataset rd = cApi.getDatasets(null, null, null, null, null, null,
                null,null,null);

        /*
        Results r = dApi.getRecords(null, null, null, null,
                List.of(), -1, 0, List.of(), List.of(), null, null);
        */
        System.out.println(rd);
    }
}
