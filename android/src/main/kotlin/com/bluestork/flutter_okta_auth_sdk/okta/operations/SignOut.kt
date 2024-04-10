package com.bluestork.flutter_okta_auth_sdk.okta.operations

import android.app.Activity
import com.bluestork.flutter_okta_auth_sdk.okta.entities.OktaClient
import com.okta.oidc.RequestCallback
import com.okta.oidc.Tokens
import com.okta.oidc.util.AuthorizationException


fun signOut(activity: Activity) {
    registerCallback(activity)
    OktaClient.getWebClient().signOutOfOkta(activity)

//    try {
//        val token: Tokens = OktaClient.getWebClient().sessionClient.tokens
//        OktaClient.getWebClient().sessionClient.revokeToken(token.refreshToken,
//                object : RequestCallback<Boolean, AuthorizationException?> {
//                    override fun onSuccess(result: Boolean) {
//                        //handle result
//                    }
//
//                    override fun onError(error: String, exception: AuthorizationException?) {
//                        //handle request error
//                    }
//                })
//    } catch (e: AuthorizationException) {
//        //handle error
//    }
    OktaClient.getWebClient().sessionClient.clear()
}