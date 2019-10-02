package com.example.pragnas.retrofitusingjava;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Nag on 29/09/2019.
 */

public interface Api {
    //Actual URL
    //https://simplifiedcoding.net/demos/marvel/

    //Response
    /*[
    {
        "name": "Captain America",
            "realname": "Steve Rogers",
            "team": "Avengers",
            "firstappearance": "1941",
            "createdby": "Joe Simon",
            "publisher": "Marvel Comics",
            "imageurl": "https://www.simplifiedcoding.net/demos/marvel/captainamerica.jpg",
            "bio": "\r\n\t\tSteven Rogers was born in the Lower East Side of Manhattan, New York City, in 1925 to poor Irish immigrants, Sarah and Joseph Rogers.[54] Joseph died when Steve was a child, and Sarah died of pneumonia while Steve was a teen. By early 1940, before America's entry into World War II, Rogers is a tall, scrawny fine arts student specializing in illustration and a comic book writer and artist.\r\n\t\t"
    },
            .
            .
            .]*/
    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
