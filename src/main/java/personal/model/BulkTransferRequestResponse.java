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


package personal.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * BulkTransferRequestResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class BulkTransferRequestResponse {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("resultCode")
  private String resultCode = null;

  @SerializedName("applyNo")
  private String applyNo = null;

  @SerializedName("applyEndDatetime")
  private String applyEndDatetime = null;

  public BulkTransferRequestResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 口座ID 半角英数字 口座を識別するID 
   * @return accountId
  **/
  @ApiModelProperty(example = "101011234567", required = true, value = "口座ID 半角英数字 口座を識別するID ")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public BulkTransferRequestResponse resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 結果コード 半角数字 1:完了　2：未完了 
   * @return resultCode
  **/
  @ApiModelProperty(example = "1", required = true, value = "結果コード 半角数字 1:完了　2：未完了 ")
  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  public BulkTransferRequestResponse applyNo(String applyNo) {
    this.applyNo = applyNo;
    return this;
  }

   /**
   * 受付番号（振込申請番号） 半角数字 すべての振込・総合振込で採番される、照会の基本単位となる番号 
   * @return applyNo
  **/
  @ApiModelProperty(example = "2018072902345678", required = true, value = "受付番号（振込申請番号） 半角数字 すべての振込・総合振込で採番される、照会の基本単位となる番号 ")
  public String getApplyNo() {
    return applyNo;
  }

  public void setApplyNo(String applyNo) {
    this.applyNo = applyNo;
  }

  public BulkTransferRequestResponse applyEndDatetime(String applyEndDatetime) {
    this.applyEndDatetime = applyEndDatetime;
    return this;
  }

   /**
   * 振込依頼完了日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 結果コードが、1:完了のときのみセット それ以外は項目自体を設定しません 
   * @return applyEndDatetime
  **/
  @ApiModelProperty(example = "2018-07-29T10:00:00+09:00", value = "振込依頼完了日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 結果コードが、1:完了のときのみセット それ以外は項目自体を設定しません ")
  public String getApplyEndDatetime() {
    return applyEndDatetime;
  }

  public void setApplyEndDatetime(String applyEndDatetime) {
    this.applyEndDatetime = applyEndDatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkTransferRequestResponse bulkTransferRequestResponse = (BulkTransferRequestResponse) o;
    return Objects.equals(this.accountId, bulkTransferRequestResponse.accountId) &&
        Objects.equals(this.resultCode, bulkTransferRequestResponse.resultCode) &&
        Objects.equals(this.applyNo, bulkTransferRequestResponse.applyNo) &&
        Objects.equals(this.applyEndDatetime, bulkTransferRequestResponse.applyEndDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, resultCode, applyNo, applyEndDatetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkTransferRequestResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    applyNo: ").append(toIndentedString(applyNo)).append("\n");
    sb.append("    applyEndDatetime: ").append(toIndentedString(applyEndDatetime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
