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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BulkTransferDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class BulkTransferDetail {
  @SerializedName("transferStatus")
  private String transferStatus = null;

  @SerializedName("transferStatusName")
  private String transferStatusName = null;

  @SerializedName("transferTypeName")
  private String transferTypeName = null;

  @SerializedName("remitterCode")
  private String remitterCode = null;

  @SerializedName("isFeeFreeUse")
  private Boolean isFeeFreeUse = null;

  @SerializedName("isFeePointUse")
  private Boolean isFeePointUse = null;

  @SerializedName("pointName")
  private String pointName = null;

  @SerializedName("feeLaterPaymentFlg")
  private Boolean feeLaterPaymentFlg = null;

  @SerializedName("totalFee")
  private String totalFee = null;

  @SerializedName("totalDebitAmount")
  private String totalDebitAmount = null;

  @SerializedName("transferApplies")
  private List<TransferApply> transferApplies = null;

  @SerializedName("transferAccepts")
  private List<TransferAccept> transferAccepts = null;

  @SerializedName("bulktransferResponses")
  private List<BulkTransferResponse> bulktransferResponses = null;

  public BulkTransferDetail transferStatus(String transferStatus) {
    this.transferStatus = transferStatus;
    return this;
  }

   /**
   * 振込ステータス 半角数字 2:申請中、3:差戻、4:取下げ、5:期限切れ、8:承認取消/予約取消、 11:予約中、12:手続中、13:リトライ中、 20:手続済、30:不能・組戻あり、40:手続不成立 
   * @return transferStatus
  **/
  @ApiModelProperty(example = "3", value = "振込ステータス 半角数字 2:申請中、3:差戻、4:取下げ、5:期限切れ、8:承認取消/予約取消、 11:予約中、12:手続中、13:リトライ中、 20:手続済、30:不能・組戻あり、40:手続不成立 ")
  public String getTransferStatus() {
    return transferStatus;
  }

  public void setTransferStatus(String transferStatus) {
    this.transferStatus = transferStatus;
  }

  public BulkTransferDetail transferStatusName(String transferStatusName) {
    this.transferStatusName = transferStatusName;
    return this;
  }

   /**
   * 振込ステータス名 全角文字 
   * @return transferStatusName
  **/
  @ApiModelProperty(example = "リトライ中", value = "振込ステータス名 全角文字 ")
  public String getTransferStatusName() {
    return transferStatusName;
  }

  public void setTransferStatusName(String transferStatusName) {
    this.transferStatusName = transferStatusName;
  }

  public BulkTransferDetail transferTypeName(String transferTypeName) {
    this.transferTypeName = transferTypeName;
    return this;
  }

   /**
   * 種類 全角文字 総合振込　を表示 
   * @return transferTypeName
  **/
  @ApiModelProperty(example = "総合振込", value = "種類 全角文字 総合振込　を表示 ")
  public String getTransferTypeName() {
    return transferTypeName;
  }

  public void setTransferTypeName(String transferTypeName) {
    this.transferTypeName = transferTypeName;
  }

  public BulkTransferDetail remitterCode(String remitterCode) {
    this.remitterCode = remitterCode;
    return this;
  }

   /**
   * 会社コード(振込依頼人コード) 銀行側で番号を付与している場合のみ表示 該当する情報が無い場合は項目自体を設定しない 
   * @return remitterCode
  **/
  @ApiModelProperty(example = "1234567890", value = "会社コード(振込依頼人コード) 銀行側で番号を付与している場合のみ表示 該当する情報が無い場合は項目自体を設定しない ")
  public String getRemitterCode() {
    return remitterCode;
  }

  public void setRemitterCode(String remitterCode) {
    this.remitterCode = remitterCode;
  }

  public BulkTransferDetail isFeeFreeUse(Boolean isFeeFreeUse) {
    this.isFeeFreeUse = isFeeFreeUse;
    return this;
  }

   /**
   * 振込無料回数利用可否 振込利用回数の利用可否（無料回数の利用可否の設定であり、実際の利用有無ではありません） 総合振込では無料回数は利用できないため、常にfalse 
   * @return isFeeFreeUse
  **/
  @ApiModelProperty(example = "true", value = "振込無料回数利用可否 振込利用回数の利用可否（無料回数の利用可否の設定であり、実際の利用有無ではありません） 総合振込では無料回数は利用できないため、常にfalse ")
  public Boolean isIsFeeFreeUse() {
    return isFeeFreeUse;
  }

  public void setIsFeeFreeUse(Boolean isFeeFreeUse) {
    this.isFeeFreeUse = isFeeFreeUse;
  }

  public BulkTransferDetail isFeePointUse(Boolean isFeePointUse) {
    this.isFeePointUse = isFeePointUse;
    return this;
  }

   /**
   * ポイント利用可否 ポイント会社の利用可否 
   * @return isFeePointUse
  **/
  @ApiModelProperty(example = "true", value = "ポイント利用可否 ポイント会社の利用可否 ")
  public Boolean isIsFeePointUse() {
    return isFeePointUse;
  }

  public void setIsFeePointUse(Boolean isFeePointUse) {
    this.isFeePointUse = isFeePointUse;
  }

  public BulkTransferDetail pointName(String pointName) {
    this.pointName = pointName;
    return this;
  }

   /**
   * ポイント会社名 全角文字 
   * @return pointName
  **/
  @ApiModelProperty(example = "GMOポイント", value = "ポイント会社名 全角文字 ")
  public String getPointName() {
    return pointName;
  }

  public void setPointName(String pointName) {
    this.pointName = pointName;
  }

  public BulkTransferDetail feeLaterPaymentFlg(Boolean feeLaterPaymentFlg) {
    this.feeLaterPaymentFlg = feeLaterPaymentFlg;
    return this;
  }

   /**
   * 手数料後払区分 「true&#x3D;後払い」以外の場合は項目自体を設定しません 
   * @return feeLaterPaymentFlg
  **/
  @ApiModelProperty(example = "false", value = "手数料後払区分 「true=後払い」以外の場合は項目自体を設定しません ")
  public Boolean isFeeLaterPaymentFlg() {
    return feeLaterPaymentFlg;
  }

  public void setFeeLaterPaymentFlg(Boolean feeLaterPaymentFlg) {
    this.feeLaterPaymentFlg = feeLaterPaymentFlg;
  }

  public BulkTransferDetail totalFee(String totalFee) {
    this.totalFee = totalFee;
    return this;
  }

   /**
   * 合計手数料 半角数字 振り込み完了時以外は、予定の手数料 
   * @return totalFee
  **/
  @ApiModelProperty(example = "345", value = "合計手数料 半角数字 振り込み完了時以外は、予定の手数料 ")
  public String getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(String totalFee) {
    this.totalFee = totalFee;
  }

  public BulkTransferDetail totalDebitAmount(String totalDebitAmount) {
    this.totalDebitAmount = totalDebitAmount;
    return this;
  }

   /**
   * 合計出金金額 半角数字 手数料+振込金額　ただし、振込完了時以外は、予定の手数料 
   * @return totalDebitAmount
  **/
  @ApiModelProperty(example = "123456", value = "合計出金金額 半角数字 手数料+振込金額　ただし、振込完了時以外は、予定の手数料 ")
  public String getTotalDebitAmount() {
    return totalDebitAmount;
  }

  public void setTotalDebitAmount(String totalDebitAmount) {
    this.totalDebitAmount = totalDebitAmount;
  }

  public BulkTransferDetail transferApplies(List<TransferApply> transferApplies) {
    this.transferApplies = transferApplies;
    return this;
  }

  public BulkTransferDetail addTransferAppliesItem(TransferApply transferAppliesItem) {
    if (this.transferApplies == null) {
      this.transferApplies = new ArrayList<>();
    }
    this.transferApplies.add(transferAppliesItem);
    return this;
  }

   /**
   * 振込申請情報 振込申請情報のリスト 該当する情報が無い場合は項目自体を設定しません 
   * @return transferApplies
  **/
  @ApiModelProperty(value = "振込申請情報 振込申請情報のリスト 該当する情報が無い場合は項目自体を設定しません ")
  public List<TransferApply> getTransferApplies() {
    return transferApplies;
  }

  public void setTransferApplies(List<TransferApply> transferApplies) {
    this.transferApplies = transferApplies;
  }

  public BulkTransferDetail transferAccepts(List<TransferAccept> transferAccepts) {
    this.transferAccepts = transferAccepts;
    return this;
  }

  public BulkTransferDetail addTransferAcceptsItem(TransferAccept transferAcceptsItem) {
    if (this.transferAccepts == null) {
      this.transferAccepts = new ArrayList<>();
    }
    this.transferAccepts.add(transferAcceptsItem);
    return this;
  }

   /**
   * 振込受付情報 振込受付情報のリスト 該当する情報が無い場合は空のリストを返却 
   * @return transferAccepts
  **/
  @ApiModelProperty(value = "振込受付情報 振込受付情報のリスト 該当する情報が無い場合は空のリストを返却 ")
  public List<TransferAccept> getTransferAccepts() {
    return transferAccepts;
  }

  public void setTransferAccepts(List<TransferAccept> transferAccepts) {
    this.transferAccepts = transferAccepts;
  }

  public BulkTransferDetail bulktransferResponses(List<BulkTransferResponse> bulktransferResponses) {
    this.bulktransferResponses = bulktransferResponses;
    return this;
  }

  public BulkTransferDetail addBulktransferResponsesItem(BulkTransferResponse bulktransferResponsesItem) {
    if (this.bulktransferResponses == null) {
      this.bulktransferResponses = new ArrayList<>();
    }
    this.bulktransferResponses.add(bulktransferResponsesItem);
    return this;
  }

   /**
   * 総合振込レスポンス情報 総合振込レスポンス情報のリスト 該当する情報が無い場合は空のリストを返却 
   * @return bulktransferResponses
  **/
  @ApiModelProperty(value = "総合振込レスポンス情報 総合振込レスポンス情報のリスト 該当する情報が無い場合は空のリストを返却 ")
  public List<BulkTransferResponse> getBulktransferResponses() {
    return bulktransferResponses;
  }

  public void setBulktransferResponses(List<BulkTransferResponse> bulktransferResponses) {
    this.bulktransferResponses = bulktransferResponses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkTransferDetail bulkTransferDetail = (BulkTransferDetail) o;
    return Objects.equals(this.transferStatus, bulkTransferDetail.transferStatus) &&
        Objects.equals(this.transferStatusName, bulkTransferDetail.transferStatusName) &&
        Objects.equals(this.transferTypeName, bulkTransferDetail.transferTypeName) &&
        Objects.equals(this.remitterCode, bulkTransferDetail.remitterCode) &&
        Objects.equals(this.isFeeFreeUse, bulkTransferDetail.isFeeFreeUse) &&
        Objects.equals(this.isFeePointUse, bulkTransferDetail.isFeePointUse) &&
        Objects.equals(this.pointName, bulkTransferDetail.pointName) &&
        Objects.equals(this.feeLaterPaymentFlg, bulkTransferDetail.feeLaterPaymentFlg) &&
        Objects.equals(this.totalFee, bulkTransferDetail.totalFee) &&
        Objects.equals(this.totalDebitAmount, bulkTransferDetail.totalDebitAmount) &&
        Objects.equals(this.transferApplies, bulkTransferDetail.transferApplies) &&
        Objects.equals(this.transferAccepts, bulkTransferDetail.transferAccepts) &&
        Objects.equals(this.bulktransferResponses, bulkTransferDetail.bulktransferResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferStatus, transferStatusName, transferTypeName, remitterCode, isFeeFreeUse, isFeePointUse, pointName, feeLaterPaymentFlg, totalFee, totalDebitAmount, transferApplies, transferAccepts, bulktransferResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkTransferDetail {\n");
    
    sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
    sb.append("    transferStatusName: ").append(toIndentedString(transferStatusName)).append("\n");
    sb.append("    transferTypeName: ").append(toIndentedString(transferTypeName)).append("\n");
    sb.append("    remitterCode: ").append(toIndentedString(remitterCode)).append("\n");
    sb.append("    isFeeFreeUse: ").append(toIndentedString(isFeeFreeUse)).append("\n");
    sb.append("    isFeePointUse: ").append(toIndentedString(isFeePointUse)).append("\n");
    sb.append("    pointName: ").append(toIndentedString(pointName)).append("\n");
    sb.append("    feeLaterPaymentFlg: ").append(toIndentedString(feeLaterPaymentFlg)).append("\n");
    sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
    sb.append("    totalDebitAmount: ").append(toIndentedString(totalDebitAmount)).append("\n");
    sb.append("    transferApplies: ").append(toIndentedString(transferApplies)).append("\n");
    sb.append("    transferAccepts: ").append(toIndentedString(transferAccepts)).append("\n");
    sb.append("    bulktransferResponses: ").append(toIndentedString(bulktransferResponses)).append("\n");
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
