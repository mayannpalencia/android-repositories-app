package com.metromart.repositoriesapp.network

import com.google.gson.annotations.SerializedName

data class Repository(
    @SerializedName("id") var id: Int,
    @SerializedName("name") var name: String,
    @SerializedName("full_name") var fullName: String,
    @SerializedName("description") var description: String
)