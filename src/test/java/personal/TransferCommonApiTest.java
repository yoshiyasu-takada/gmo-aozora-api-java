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


package personal;

import common.ApiException;
import org.junit.Ignore;
import org.junit.Test;
import personal.model.TransferCancelRequest;
import personal.model.TransferCancelResponse;
import personal.model.TransferRequestResultResponse;

/**
 * API tests for TransferCommonApi
 */
@Ignore
public class TransferCommonApiTest {

    private final TransferCommonApi api = new TransferCommonApi();

    
    /**
     * 振込取消依頼
     *
     * 振込・振込予約・総合振込の取消を申請します  ■取消対象ステータス ・申請中以降のステータスで照会が可能です ・依頼中、作成中の状態は照会対象外です ■取消対象キー区分   ・取消対象の取引の内容について指定して下さい ・取消対象キー区分と、取消対象の振込申請番号の状態がマッチしない場合は、「400 Bad  Request」を返却します ・1または3の場合、申請者による申請中ステータスの「取下」が可能。ビジネスID管理未利用だと、指定不可 ・2または4の場合、ビジネスID管理利用中だと、承認者可能者による予約中ステータスの「承認取消」が可能 ・1または2の場合、振込・振替/一括振込が対象 ・3または4の場合、総合振込が対象 ■2重依頼について ・振込取消依頼は前回の振込取消依頼期限切れとなるまで依頼はできません（2重依頼は不可） ■照会対象となる明細   ・振込・振替・およびその予約と申請です ・定額自動振込契約から作成された振込みは照会対象となります ・定額自動振込契約そのものの申請状態や、状況は対象外となります 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transferCancelUsingPOSTTest() throws ApiException {
        TransferCancelRequest body = null;
        String xAccessToken = null;
        TransferCancelResponse response = api.transferCancelUsingPOST(body, xAccessToken);

        // TODO: test validations
    }
    
    /**
     * 振込依頼結果照会
     *
     * 振込更新系のAPIの処理状態を照会します 振込依頼、総合振込依頼、振込取消依頼での依頼のみが照会対象 振込取消依頼をした場合は、最後の依頼の結果コードが照会対象となります 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transferRequestResultUsingGETTest() throws ApiException {
        String accountId = null;
        String applyNo = null;
        String xAccessToken = null;
        TransferRequestResultResponse response = api.transferRequestResultUsingGET(accountId, applyNo, xAccessToken);

        // TODO: test validations
    }
    
}
