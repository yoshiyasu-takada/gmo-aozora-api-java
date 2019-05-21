
# Balance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | 口座ID 半角英数字 口座を識別するID  | 
**accountTypeCode** | **String** | 科目コード 半角数字 ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用） ・11&#x3D;円定期預金 ・51&#x3D;外貨普通預金 ・81&#x3D;証券コネクト口座  | 
**accountTypeName** | **String** | 科目名 全角文字 科目コードの名称  | 
**balance** | **String** | 現在残高 半角数字　マイナス含む 基準日時における現在残高 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用） ・11&#x3D;円定期預金 ・81&#x3D;証券コネクト口座  |  [optional]
**baseDate** | **String** | 基準日 半角文字 残高および引出可能額を照会した基準日を示します YYYY-MM-DD形式  | 
**baseTime** | **String** | 基準時刻 半角文字 残高および引出可能額を照会した基準時刻を示します HH:MM:SS+09:00形式  | 
**withdrawableAmount** | **String** | 支払可能残高 半角数字　マイナス含む 応答時点での引出可能額を示します 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  |  [optional]
**previousDayBalance** | **String** | 前日残高 半角数字　マイナス含む 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  |  [optional]
**previousMonthBalance** | **String** | 前月末残高 半角数字　マイナス含む 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・01&#x3D;普通預金（有利息） ・02&#x3D;普通預金（決済用）  |  [optional]
**currencyCode** | **String** | 通貨コード 半角文字 ISO4217に準拠した通貨コード  | 
**currencyName** | **String** | 通貨名 全角文字 ISO4217に準拠した通貨コードの当行での名称  | 
**fcyTotalBalance** | **String** | 外貨残高 半角数字　少数点および小数部最大3桁　マイナス含む 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・51&#x3D;外貨普通預金  |  [optional]
**ttb** | **String** | 外貨レート 半角数字　少数点および小数部最大3桁　マイナス含む 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・51&#x3D;外貨普通預金  |  [optional]
**baseRateDate** | **String** | 外貨レート基準日 半角文字 外貨レートの基準日を示します YYYY-MM-DD形式 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・51&#x3D;外貨普通預金  |  [optional]
**baseRateTime** | **String** | 外貨レート基準時刻 半角文字 外貨レートの基準時刻を示します HH:MM:SS+09:00形式 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・51&#x3D;外貨普通預金  |  [optional]
**yenEquivalent** | **String** | 外貨円換算額 半角数字　マイナス含む 外貨残高を円に換算した額 科目コードが以下の場合のみ設定されます。　該当しない場合はNULL ・51&#x3D;外貨普通預金  |  [optional]


