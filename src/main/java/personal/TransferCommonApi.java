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

import common.ApiCallback;
import common.ApiClient;
import common.ApiException;
import common.ApiResponse;
import common.BeanValidationException;
import common.Configuration;
import common.Pair;
import common.ProgressRequestBody;
import common.ProgressResponseBody;
import com.google.gson.reflect.TypeToken;
import personal.model.TransferCancelRequest;
import personal.model.TransferCancelResponse;
import personal.model.TransferRequestResultResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.executable.ExecutableValidator;

public class TransferCommonApi {
    private ApiClient apiClient;

    public TransferCommonApi() {
        this(Configuration.getPersonalApiClient());
    }

    public TransferCommonApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for transferCancelUsingPOST
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call transferCancelUsingPOSTCall(TransferCancelRequest body, String xAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/transfer/cancel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xAccessToken != null)
        localVarHeaderParams.put("x-access-token", apiClient.parameterToString(xAccessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call transferCancelUsingPOSTValidateBeforeCall(TransferCancelRequest body, String xAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { body, xAccessToken };
            Method method = this.getClass().getMethod("transferCancelUsingPOSTWithHttpInfo", TransferCancelRequest.class, String.class);
            Set<ConstraintViolation<TransferCommonApi>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                com.squareup.okhttp.Call call = transferCancelUsingPOSTCall(body, xAccessToken, progressListener, progressRequestListener);
                return call;

            } else {
                throw new BeanValidationException((Set) violations);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }

    }

    /**
     * 振込取消依頼
     * 振込・振込予約・総合振込の取消を申請します  ■取消対象ステータス ・申請中以降のステータスで照会が可能です ・依頼中、作成中の状態は照会対象外です ■取消対象キー区分   ・取消対象の取引の内容について指定して下さい ・取消対象キー区分と、取消対象の振込申請番号の状態がマッチしない場合は、「400 Bad  Request」を返却します ・1または3の場合、申請者による申請中ステータスの「取下」が可能。ビジネスID管理未利用だと、指定不可 ・2または4の場合、ビジネスID管理利用中だと、承認者可能者による予約中ステータスの「承認取消」が可能 ・1または2の場合、振込・振替/一括振込が対象 ・3または4の場合、総合振込が対象 ■2重依頼について ・振込取消依頼は前回の振込取消依頼期限切れとなるまで依頼はできません（2重依頼は不可） ■照会対象となる明細   ・振込・振替・およびその予約と申請です ・定額自動振込契約から作成された振込みは照会対象となります ・定額自動振込契約そのものの申請状態や、状況は対象外となります 
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @return TransferCancelResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransferCancelResponse transferCancelUsingPOST(TransferCancelRequest body, String xAccessToken) throws ApiException {
        ApiResponse<TransferCancelResponse> resp = transferCancelUsingPOSTWithHttpInfo(body, xAccessToken);
        return resp.getData();
    }

    /**
     * 振込取消依頼
     * 振込・振込予約・総合振込の取消を申請します  ■取消対象ステータス ・申請中以降のステータスで照会が可能です ・依頼中、作成中の状態は照会対象外です ■取消対象キー区分   ・取消対象の取引の内容について指定して下さい ・取消対象キー区分と、取消対象の振込申請番号の状態がマッチしない場合は、「400 Bad  Request」を返却します ・1または3の場合、申請者による申請中ステータスの「取下」が可能。ビジネスID管理未利用だと、指定不可 ・2または4の場合、ビジネスID管理利用中だと、承認者可能者による予約中ステータスの「承認取消」が可能 ・1または2の場合、振込・振替/一括振込が対象 ・3または4の場合、総合振込が対象 ■2重依頼について ・振込取消依頼は前回の振込取消依頼期限切れとなるまで依頼はできません（2重依頼は不可） ■照会対象となる明細   ・振込・振替・およびその予約と申請です ・定額自動振込契約から作成された振込みは照会対象となります ・定額自動振込契約そのものの申請状態や、状況は対象外となります 
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @return ApiResponse&lt;TransferCancelResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransferCancelResponse> transferCancelUsingPOSTWithHttpInfo(TransferCancelRequest body, String xAccessToken) throws ApiException {
        com.squareup.okhttp.Call call = transferCancelUsingPOSTValidateBeforeCall(body, xAccessToken, null, null);
        Type localVarReturnType = new TypeToken<TransferCancelResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 振込取消依頼 (asynchronously)
     * 振込・振込予約・総合振込の取消を申請します  ■取消対象ステータス ・申請中以降のステータスで照会が可能です ・依頼中、作成中の状態は照会対象外です ■取消対象キー区分   ・取消対象の取引の内容について指定して下さい ・取消対象キー区分と、取消対象の振込申請番号の状態がマッチしない場合は、「400 Bad  Request」を返却します ・1または3の場合、申請者による申請中ステータスの「取下」が可能。ビジネスID管理未利用だと、指定不可 ・2または4の場合、ビジネスID管理利用中だと、承認者可能者による予約中ステータスの「承認取消」が可能 ・1または2の場合、振込・振替/一括振込が対象 ・3または4の場合、総合振込が対象 ■2重依頼について ・振込取消依頼は前回の振込取消依頼期限切れとなるまで依頼はできません（2重依頼は不可） ■照会対象となる明細   ・振込・振替・およびその予約と申請です ・定額自動振込契約から作成された振込みは照会対象となります ・定額自動振込契約そのものの申請状態や、状況は対象外となります 
     * @param body HTTPリクエストボディ (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call transferCancelUsingPOSTAsync(TransferCancelRequest body, String xAccessToken, final ApiCallback<TransferCancelResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = transferCancelUsingPOSTValidateBeforeCall(body, xAccessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransferCancelResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for transferRequestResultUsingGET
     * @param accountId 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29  (required)
     * @param applyNo 受付番号（振込申請番号） 半角数字 すべての振込・総合振込で採番される、照会の基本単位となる番号  minLength: 16 maxLength: 16  (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call transferRequestResultUsingGETCall(String accountId, String applyNo, String xAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transfer/request-result";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accountId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accountId", accountId));
        if (applyNo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("applyNo", applyNo));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xAccessToken != null)
        localVarHeaderParams.put("x-access-token", apiClient.parameterToString(xAccessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call transferRequestResultUsingGETValidateBeforeCall(String accountId, String applyNo, String xAccessToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { accountId, applyNo, xAccessToken };
            Method method = this.getClass().getMethod("transferRequestResultUsingGETWithHttpInfo", String.class, String.class, String.class);
            Set<ConstraintViolation<TransferCommonApi>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                com.squareup.okhttp.Call call = transferRequestResultUsingGETCall(accountId, applyNo, xAccessToken, progressListener, progressRequestListener);
                return call;

            } else {
                throw new BeanValidationException((Set) violations);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }

    }

    /**
     * 振込依頼結果照会
     * 振込更新系のAPIの処理状態を照会します 振込依頼、総合振込依頼、振込取消依頼での依頼のみが照会対象 振込取消依頼をした場合は、最後の依頼の結果コードが照会対象となります 
     * @param accountId 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29  (required)
     * @param applyNo 受付番号（振込申請番号） 半角数字 すべての振込・総合振込で採番される、照会の基本単位となる番号  minLength: 16 maxLength: 16  (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @return TransferRequestResultResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransferRequestResultResponse transferRequestResultUsingGET(String accountId, String applyNo, String xAccessToken) throws ApiException {
        ApiResponse<TransferRequestResultResponse> resp = transferRequestResultUsingGETWithHttpInfo(accountId, applyNo, xAccessToken);
        return resp.getData();
    }

    /**
     * 振込依頼結果照会
     * 振込更新系のAPIの処理状態を照会します 振込依頼、総合振込依頼、振込取消依頼での依頼のみが照会対象 振込取消依頼をした場合は、最後の依頼の結果コードが照会対象となります 
     * @param accountId 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29  (required)
     * @param applyNo 受付番号（振込申請番号） 半角数字 すべての振込・総合振込で採番される、照会の基本単位となる番号  minLength: 16 maxLength: 16  (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @return ApiResponse&lt;TransferRequestResultResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransferRequestResultResponse> transferRequestResultUsingGETWithHttpInfo(String accountId, String applyNo, String xAccessToken) throws ApiException {
        com.squareup.okhttp.Call call = transferRequestResultUsingGETValidateBeforeCall(accountId, applyNo, xAccessToken, null, null);
        Type localVarReturnType = new TypeToken<TransferRequestResultResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 振込依頼結果照会 (asynchronously)
     * 振込更新系のAPIの処理状態を照会します 振込依頼、総合振込依頼、振込取消依頼での依頼のみが照会対象 振込取消依頼をした場合は、最後の依頼の結果コードが照会対象となります 
     * @param accountId 口座ID 半角数字 口座を識別するID  minLength: 12 maxLength: 29  (required)
     * @param applyNo 受付番号（振込申請番号） 半角数字 すべての振込・総合振込で採番される、照会の基本単位となる番号  minLength: 16 maxLength: 16  (required)
     * @param xAccessToken アクセストークン  minLength: 1 maxLength: 128  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call transferRequestResultUsingGETAsync(String accountId, String applyNo, String xAccessToken, final ApiCallback<TransferRequestResultResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = transferRequestResultUsingGETValidateBeforeCall(accountId, applyNo, xAccessToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransferRequestResultResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
