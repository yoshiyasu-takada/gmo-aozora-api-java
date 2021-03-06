/*
 * GMO Aozora Net Bank Open API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package corporate.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * VaCloseRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class VaCloseRequest {
  @SerializedName("vaContractAuthKey")
  private String vaContractAuthKey = null;

  public VaCloseRequest vaContractAuthKey(String vaContractAuthKey) {
    this.vaContractAuthKey = vaContractAuthKey;
    return this;
  }

   /**
   * 振込入金口座API認証情報 半角英数字 NULLを設定 値が設定されている場合は「400 Bad Request」を返却 
   * @return vaContractAuthKey
  **/
  @ApiModelProperty(example = "5CSDFG1515A54DF", value = "振込入金口座API認証情報 半角英数字 NULLを設定 値が設定されている場合は「400 Bad Request」を返却 ")
  public String getVaContractAuthKey() {
    return vaContractAuthKey;
  }

  public void setVaContractAuthKey(String vaContractAuthKey) {
    this.vaContractAuthKey = vaContractAuthKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaCloseRequest vaCloseRequest = (VaCloseRequest) o;
    return Objects.equals(this.vaContractAuthKey, vaCloseRequest.vaContractAuthKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaContractAuthKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaCloseRequest {\n");

    sb.append("    vaContractAuthKey: ").append(toIndentedString(vaContractAuthKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

