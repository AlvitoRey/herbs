package StructureData.Response

import com.google.gson.annotations.SerializedName

data class GetFailureResponse(
    @SerializedName("status") val status: String,
    @SerializedName("message") val message: String,
)
