package org.pursuit.lipstickrush.network;

import org.pursuit.lipstickrush.model.MakeupPOJO;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MakeUpService {

    @GET("api/v1/products.json")
    Call<MakeupPOJO> getMakeUpDetails();
}
