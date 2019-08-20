package com.example.pragnas.retrofit

import com.google.gson.annotations.SerializedName

/**
 * Created by Eyehunt Team on 19/08/19.
 */
class UsersList {
    @SerializedName("items")
    var users: List<Users>? = null
}