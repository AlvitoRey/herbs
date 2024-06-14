package StructureData.Response

import StructureData.Response.Data.RecipeData
import com.google.gson.annotations.SerializedName

data class GetRecipeByIngredientResponse(
    @SerializedName("status") val status: String,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: List<RecipeData>
)
