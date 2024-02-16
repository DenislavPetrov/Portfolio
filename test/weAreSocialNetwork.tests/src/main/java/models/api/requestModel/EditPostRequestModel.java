package models.api.requestModel;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class EditPostRequestModel {
    @SerializedName("content")
    private String content;
    @SerializedName("picture")
    private String picture;
    @SerializedName("public")
    private boolean isPublic;

}
