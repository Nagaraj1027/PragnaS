package com.example.pragnas.retrofit;


import com.example.pragnas.retrofit.UsersList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Eyehunt Team on 19/08/19.
 */

public interface Api {

    @GET("users?q=rokano")
    Call<UsersList> getUsers();
}
