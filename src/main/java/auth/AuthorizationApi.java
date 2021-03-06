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


package auth;

import com.squareup.okhttp.Request;
import common.ApiClient;
import common.ApiException;
import common.BeanValidationException;
import common.Configuration;
import common.Pair;
import common.ProgressRequestBody;
import common.ProgressResponseBody;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.executable.ExecutableValidator;

public class AuthorizationApi {
    private ApiClient apiClient;

    public AuthorizationApi() {
        this(Configuration.getAuthApiClient());
    }

    public AuthorizationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for authorization
     * @param clientId クライアントID (当社が事前に発行する貴社向けのID)  minLength: 1 maxLength: 128  (required)
     * @param redirectUri 貴社が指定する認可コードをリダイレクトするためのURI  minLength: 1 maxLength: 256  (required)
     * @param responseType 認可フロータイプ。 code固定 (required)
     * @param scope 要求されるアクセス権限を示すスコープID。 複数設定する場合は半角スペース区切りにて連結。 リフレッシュトークンを発行する場合は offline_access scope値が必要。  minLength: 1 maxLength: 256  (required)
     * @param state 貴社にて指定。(要求と応答の間で維持されるランダム値) CSRF対策として同一のセッションであることを確認するために利用する項目。  minLength: 1 maxLength: 128  (required)
     * @param nonce Client セッションと ID Token を紐づける文字列。設定された場合はそのままの値をID Tokenに含めて返却する。 リプレイアタック攻撃を防止するため、リクエスト毎にランダム値(十分な不規則性となる値)を設定し ID Tokenに含まれるnonce値が認可エンドポイントリクエスト時と同一であることを一度だけ検証するために利用する項目。  minLength: 1 maxLength: 128  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Request authorizationRequest(String clientId, String redirectUri, String responseType, String scope, String state, String nonce, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/authorization";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clientId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("client_id", clientId));
        if (redirectUri != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("redirect_uri", redirectUri));
        if (responseType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("response_type", responseType));
        if (scope != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("scope", scope));
        if (state != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("state", state));
        if (nonce != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("nonce", nonce));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
        return apiClient.buildRequest(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Request authorizationValidateBeforeCall(String clientId, String redirectUri, String responseType, String scope, String state, String nonce, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { clientId, redirectUri, responseType, scope, state, nonce };
            Method method = this.getClass().getMethod("authorizationWithHttpInfo", String.class, String.class, String.class, String.class, String.class, String.class);
            Set<ConstraintViolation<AuthorizationApi>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                return authorizationRequest(clientId, redirectUri, responseType, scope, state, nonce, progressListener, progressRequestListener);

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
     * 認可
     * クライアントがユーザーの認証・認可を得るためのエンドポイント
     * @param clientId クライアントID (当社が事前に発行する貴社向けのID)  minLength: 1 maxLength: 128  (required)
     * @param redirectUri 貴社が指定する認可コードをリダイレクトするためのURI  minLength: 1 maxLength: 256  (required)
     * @param responseType 認可フロータイプ。 code固定 (required)
     * @param scope 要求されるアクセス権限を示すスコープID。 複数設定する場合は半角スペース区切りにて連結。 リフレッシュトークンを発行する場合は offline_access scope値が必要。  minLength: 1 maxLength: 256  (required)
     * @param state 貴社にて指定。(要求と応答の間で維持されるランダム値) CSRF対策として同一のセッションであることを確認するために利用する項目。  minLength: 1 maxLength: 128  (required)
     * @param nonce Client セッションと ID Token を紐づける文字列。設定された場合はそのままの値をID Tokenに含めて返却する。 リプレイアタック攻撃を防止するため、リクエスト毎にランダム値(十分な不規則性となる値)を設定し ID Tokenに含まれるnonce値が認可エンドポイントリクエスト時と同一であることを一度だけ検証するために利用する項目。  minLength: 1 maxLength: 128  (optional)
     * @return AuthorizationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public URL authorizationGetUrl(String clientId, String redirectUri, String responseType, String scope, String state, String nonce) throws ApiException {
        return authorizationWithHttpInfo(clientId, redirectUri, responseType, scope, state, nonce).url();
    }

    /**
     * 認可
     * クライアントがユーザーの認証・認可を得るためのエンドポイント
     * @param clientId クライアントID (当社が事前に発行する貴社向けのID)  minLength: 1 maxLength: 128  (required)
     * @param redirectUri 貴社が指定する認可コードをリダイレクトするためのURI  minLength: 1 maxLength: 256  (required)
     * @param responseType 認可フロータイプ。 code固定 (required)
     * @param scope 要求されるアクセス権限を示すスコープID。 複数設定する場合は半角スペース区切りにて連結。 リフレッシュトークンを発行する場合は offline_access scope値が必要。  minLength: 1 maxLength: 256  (required)
     * @param state 貴社にて指定。(要求と応答の間で維持されるランダム値) CSRF対策として同一のセッションであることを確認するために利用する項目。  minLength: 1 maxLength: 128  (required)
     * @param nonce Client セッションと ID Token を紐づける文字列。設定された場合はそのままの値をID Tokenに含めて返却する。 リプレイアタック攻撃を防止するため、リクエスト毎にランダム値(十分な不規則性となる値)を設定し ID Tokenに含まれるnonce値が認可エンドポイントリクエスト時と同一であることを一度だけ検証するために利用する項目。  minLength: 1 maxLength: 128  (optional)
     * @return ApiResponse&lt;AuthorizationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Request authorizationWithHttpInfo(String clientId, String redirectUri, String responseType, String scope, String state, String nonce) throws ApiException {
        return authorizationValidateBeforeCall(clientId, redirectUri, responseType, scope, state, nonce, null, null);
    }

}
