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
 * AccountsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class AccountsResponse {
  @SerializedName("baseDate")
  private String baseDate = null;

  @SerializedName("baseTime")
  private String baseTime = null;

  @SerializedName("accounts")
  private List<Account> accounts = new ArrayList<>();

  @SerializedName("spAccounts")
  private List<SpAccount> spAccounts = null;

  public AccountsResponse baseDate(String baseDate) {
    this.baseDate = baseDate;
    return this;
  }

   /**
   * 基準日 一覧照会の基準日を示します YYYY-MM-DD形式 
   * @return baseDate
  **/
  @ApiModelProperty(example = "2018-08-10", required = true, value = "基準日 一覧照会の基準日を示します YYYY-MM-DD形式 ")
  public String getBaseDate() {
    return baseDate;
  }

  public void setBaseDate(String baseDate) {
    this.baseDate = baseDate;
  }

  public AccountsResponse baseTime(String baseTime) {
    this.baseTime = baseTime;
    return this;
  }

   /**
   * 基準時刻 一覧照会の基準時刻を示します HH:MM:SS+09:00形式 
   * @return baseTime
  **/
  @ApiModelProperty(example = "10:00:00+09:00", required = true, value = "基準時刻 一覧照会の基準時刻を示します HH:MM:SS+09:00形式 ")
  public String getBaseTime() {
    return baseTime;
  }

  public void setBaseTime(String baseTime) {
    this.baseTime = baseTime;
  }

  public AccountsResponse accounts(List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public AccountsResponse addAccountsItem(Account accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * 口座情報リスト 
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "口座情報リスト ")
  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public AccountsResponse spAccounts(List<SpAccount> spAccounts) {
    this.spAccounts = spAccounts;
    return this;
  }

  public AccountsResponse addSpAccountsItem(SpAccount spAccountsItem) {
    if (this.spAccounts == null) {
      this.spAccounts = new ArrayList<>();
    }
    this.spAccounts.add(spAccountsItem);
    return this;
  }

   /**
   * つかいわけ口座情報リスト 該当する情報が無い場合は、項目自体を設定しません 
   * @return spAccounts
  **/
  @ApiModelProperty(value = "つかいわけ口座情報リスト 該当する情報が無い場合は、項目自体を設定しません ")
  public List<SpAccount> getSpAccounts() {
    return spAccounts;
  }

  public void setSpAccounts(List<SpAccount> spAccounts) {
    this.spAccounts = spAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsResponse accountsResponse = (AccountsResponse) o;
    return Objects.equals(this.baseDate, accountsResponse.baseDate) &&
        Objects.equals(this.baseTime, accountsResponse.baseTime) &&
        Objects.equals(this.accounts, accountsResponse.accounts) &&
        Objects.equals(this.spAccounts, accountsResponse.spAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseDate, baseTime, accounts, spAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsResponse {\n");
    
    sb.append("    baseDate: ").append(toIndentedString(baseDate)).append("\n");
    sb.append("    baseTime: ").append(toIndentedString(baseTime)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    spAccounts: ").append(toIndentedString(spAccounts)).append("\n");
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

