package StructureData.Response

import StructureData.Response.Data.IngredientData
import com.google.gson.annotations.SerializedName

data class GetIngredientPostResponse(
    @SerializedName("status") val status: String,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: IngredientData
)
