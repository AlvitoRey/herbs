package StructureData.Response.Data
import com.google.gson.annotations.SerializedName

data class IngredientData(
    @SerializedName("id") val id: String,
    @SerializedName("id_picture") val idPicture: String,
    @SerializedName("name") val name: String,
    @SerializedName("benefit") val benefit: List<String>
)
