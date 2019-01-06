package com.image.awesomephoto

import android.app.Application
import com.adobe.creativesdk.foundation.AdobeCSDKFoundation
import com.adobe.creativesdk.foundation.auth.IAdobeAuthClientCredentials
import com.adobe.creativesdk.foundation.internal.analytics.IAdobeAnalyticsSessionCallback
import com.image.awesomephoto.utils.Constant
import com.image.awesomephoto.utils.Constant.Companion.CREATIVE_SDK_CLIENT_ID
import com.image.awesomephoto.utils.Constant.Companion.CREATIVE_SDK_REDIRECT_URI
import com.image.awesomephoto.utils.Constant.Companion.CREATIVE_SDK_SCOPES

open class MVPViewApplication : Application(),IAdobeAuthClientCredentials {

    override fun onCreate() {
        super.onCreate()
        AdobeCSDKFoundation.initializeCSDKFoundation(this);
    }

    override fun getClientSecret(): String {
        return Constant.CREATIVE_SDK_CLIENT_SECRET;
    }

    override fun getRedirectURI(): String {
        return CREATIVE_SDK_REDIRECT_URI
    }

    override fun getAdditionalScopesList(): Array<String> {
        return CREATIVE_SDK_SCOPES
    }

    override fun getClientID(): String {
        return CREATIVE_SDK_CLIENT_ID
    }
}