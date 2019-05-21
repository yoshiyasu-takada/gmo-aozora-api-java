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


package corporate;

import common.ApiException;
import corporate.model.VaCloseRequest;
import corporate.model.VaCloseRequestResponse;
import corporate.model.VaDepositTransactionsResponse;
import corporate.model.VaIssueRequest;
import corporate.model.VaIssueResponse;
import corporate.model.VaListRequest;
import corporate.model.VaListResponse;
import corporate.model.VaStatusChangeRequest;
import corporate.model.VaStatusChangeResponse;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for VirtualAccountApi
 */
@Ignore
public class VirtualAccountApiTest {

    private final VirtualAccountApi api = new VirtualAccountApi();

    
    /**
     * 振込入金口座入金明細照会
     *
     * 振込入金口座の入金明細を照会します ※個人事業主のみ対象となり、個人は対象外となります 対象期間From、対象期間Toを設定しない場合、当日分の入金明細を返却します ■ページング ・1回のリクエストで照会できる明細は、最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次明細キーを追加してリクエストしてください  ■ソート順 ・デフォルト　取引日の昇順です。 　ソート順コードを指定することにより、ソート順を変更できます。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void depositTransactionsUsingGETTest() throws ApiException {
        String xAccessToken = null;
        String vaContractAuthKey = null;
        String raId = null;
        String vaId = null;
        String dateFrom = null;
        String dateTo = null;
        String sortOrderCode = null;
        String nextItemKey = null;
        VaDepositTransactionsResponse response = api.depositTransactionsUsingGET(xAccessToken, vaContractAuthKey, raId, vaId, dateFrom, dateTo, sortOrderCode, nextItemKey);

        // TODO: test validations
    }
    
    /**
     * 振込入金口座発行
     *
     * 振込入金口座の発行を行います ※個人事業主のみ対象となり、個人は対象外となります 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueUsingPOSTTest() throws ApiException {
        String xAccessToken = null;
        VaIssueRequest body = null;
        VaIssueResponse response = api.issueUsingPOST(xAccessToken, body);

        // TODO: test validations
    }
    
    /**
     * 振込入金口座状態変更
     *
     * 振込入金口座の状態変更（停止・再開・削除）を行います ※個人事業主のみ対象となり、個人は対象外となります 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusChangeUsingPOSTTest() throws ApiException {
        String xAccessToken = null;
        VaStatusChangeRequest body = null;
        VaStatusChangeResponse response = api.statusChangeUsingPOST(xAccessToken, body);

        // TODO: test validations
    }
    
    /**
     * 振込入金口座解約申込
     *
     * 振込入金口座契約の解約申込を行います ※個人事業主のみ対象となり、個人は対象外となります 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vaCloseRequestUsingPOSTTest() throws ApiException {
        String xAccessToken = null;
        VaCloseRequest body = null;
        VaCloseRequestResponse response = api.vaCloseRequestUsingPOST(xAccessToken, body);

        // TODO: test validations
    }
    
    /**
     * 振込入金口座一覧照会
     *
     * 振込入金口座一覧を照会します ※個人事業主のみ対象となり、個人は対象外となります ソート順コードを指定しない場合、発行日時の昇順です ■ページング ・1回のリクエストで照会できる明細は、最大500件です ・2ページ目以降を照会する際は、初回と同じリクエスト内容に、初回レスポンスの次一覧キーを追加してリクエストしてください ■振込入金口座API認証情報 ・提携企業契約時は必須で、この値が設定されていない場合、銀行契約の一覧照会を提供する 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vaListUsingPOSTTest() throws ApiException {
        String xAccessToken = null;
        VaListRequest body = null;
        VaListResponse response = api.vaListUsingPOST(xAccessToken, body);

        // TODO: test validations
    }
    
}