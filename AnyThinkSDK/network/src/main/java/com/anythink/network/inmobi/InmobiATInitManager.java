package com.anythink.network.inmobi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.customtabs.CustomTabsService;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;

import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATSDK;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.inmobi.sdk.InMobiSdk;
import com.squareup.picasso.Picasso;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.OkHttpClient;
import okio.Okio;

/**
 * Created by Z on 2018/1/30.
 */

public class InmobiATInitManager extends ATInitMediation {

    private static final String TAG = InmobiATInitManager.class.getSimpleName();
    private String mAccountId;
    private static InmobiATInitManager sInstance;

    private Handler mHandler;

    private InmobiATInitManager() {
        mHandler = new Handler(Looper.getMainLooper());
    }

    public static InmobiATInitManager getInstance() {
        if (sInstance == null) {
            sInstance = new InmobiATInitManager();
        }
        return sInstance;
    }


    public void postDelay(Runnable runnable, long time) {
        mHandler.postDelayed(runnable, time);
    }

    public void post(Runnable runnable) {
        mHandler.post(runnable);
    }


    @Override
    public void initSDK(final Context context, final Map<String, Object> serviceExtras) {
        initSDK(context, serviceExtras, null);
    }

    public void initSDK(final Context context, final Map<String, Object> serviceExtras, final OnInitCallback callback) {
        final String accountId = (String) serviceExtras.get("app_id");

        post(new Runnable() {
            @Override
            public void run() {
                if (!TextUtils.isEmpty(accountId)) {
                    //Must be executed by the main thread
                    try {
                        if (accountId.equals(mAccountId)) {
                            if (callback != null) {
                                callback.onFinish();
                            }
                            return;
                        }
                        JSONObject jsonObject = new JSONObject();

                        try {
                            if (serviceExtras.containsKey("gdpr_consent") && serviceExtras.containsKey("need_set_gdpr")) {
                                //Whether to agree to collect data
                                boolean gdp_consent = (boolean) serviceExtras.get("gdpr_consent");
                                //Whether to set the GDPR of the network
                                boolean need_set_gdpr = (boolean) serviceExtras.get("need_set_gdpr");
                                if (need_set_gdpr) {
                                    //Is in EU?
                                    String gdprScope = ATSDK.isEUTraffic(context) ? "1" : "0";
                                    // Provide correct consent value to sdk which is obtained by User

                                    jsonObject.put(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE, gdp_consent);

                                    // Provide 0 if GDPR is not applicable and 1 if applicable
                                    jsonObject.put("gdpr", gdprScope);
                                    InMobiSdk.updateGDPRConsent(jsonObject);
                                }

                            }
                            logGDPRSetting(InmobiATConst.NETWORK_FIRM_ID);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        InMobiSdk.init(context, accountId, jsonObject);
                        InMobiSdk.setLogLevel(ATSDK.NETWORK_LOG_DEBUG ? InMobiSdk.LogLevel.DEBUG : InMobiSdk.LogLevel.NONE);
                        mAccountId = accountId;

                        if (callback != null) {
                            callback.onFinish();
                        }
                    } catch (Throwable e) {
                        if (callback != null) {
                            callback.onFinish();
                        }
                    }
                }
            }
        });

    }

    public interface OnInitCallback {
        void onFinish();
    }

    @Override
    public String getNetworkName() {
        return "Inmobi";
    }

    @Override
    public String getNetworkSDKClass() {
        return "com.inmobi.sdk.InMobiSdk";
    }

    @Override
    public Map<String, Boolean> getPluginClassStatus() {
        HashMap<String, Boolean> pluginMap = new HashMap<>();
        pluginMap.put("okhttp-*.jar", false);
        pluginMap.put("okio-*.jar", false);
        pluginMap.put("picasso-*.aar", false);

        pluginMap.put("play-services-ads-identifier-*.aar", false);
        pluginMap.put("play-services-basement-*.aar", false);
        pluginMap.put("recyclerview-v7-*.aar", false);
        pluginMap.put("support-customtabs-*.aar", false);

        Class clazz;
        try {
            clazz = OkHttpClient.class;
            pluginMap.put("okhttp-*.jar", true);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        try {
            clazz = Okio.class;
            pluginMap.put("okio-*.jar", true);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        try {
            clazz = Picasso.class;
            pluginMap.put("picasso-*.aar", true);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        try {
            clazz = AdvertisingIdClient.class;
            pluginMap.put("play-services-ads-identifier-*.aar", true);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        try {
            clazz = GoogleSignatureVerifier.class;
            pluginMap.put("play-services-basement-*.aar", true);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        try {
            clazz = RecyclerView.class;
            pluginMap.put("recyclerview-v7-*.aar", true);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        try {
            clazz = CustomTabsService.class;
            pluginMap.put("support-customtabs-*.aar", true);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        return pluginMap;
    }

    @Override
    public List getActivityStatus() {
        ArrayList<String> list = new ArrayList<>();
        list.add("com.inmobi.ads.rendering.InMobiAdActivity");
        return list;
    }

    @Override
    public List getProviderStatus() {
        ArrayList<String> list = new ArrayList<>();
        list.add("com.squareup.picasso.PicassoProvider");
        return list;
    }
}