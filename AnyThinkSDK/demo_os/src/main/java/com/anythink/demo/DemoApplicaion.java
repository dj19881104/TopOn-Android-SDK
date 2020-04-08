package com.anythink.demo;

import android.support.multidex.MultiDexApplication;

import com.anythink.core.api.ATSDK;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.stetho.Stetho;

/**
 * Created by Z on 2018/1/10.
 */

public class DemoApplicaion extends MultiDexApplication {
    public static final String appid = "a5aa1f9deda26d";
    public static final String appKey = "4f7b9ac17decb9babec83aac078742c7";
    public static final String mPlacementId_native_all = "b5aa1fa2cae775";
    public static final String mPlacementId_native_facebook = "b5aa1fa4165ea3";
    public static final String mPlacementId_native_admob = "b5aa1fa501d9f6";
    public static final String mPlacementId_native_inmobi = "b5aa1fa5d10190";
    public static final String mPlacementId_native_flurry = "b5aa1fa6c00d2f";
    public static final String mPlacementId_native_applovin = "b5aa1fa7956158";
    public static final String mPlacementId_native_mintegral = "b5aa1fa85b86d5";
    public static final String mPlacementId_native_GDT = "b5ab8590d44f82";
    public static final String mPlacementId_native_mopub = "b5ab858fb0175f";
    public static final String mPlacementId_native_appnext = "b5bc7f369610cd";
    public static final String mPlacementId_native_toutiao = "b5c2c97629da0d";
    public static final String mPlacementId_native_toutiao_drawer = "b5c355d79ef9be";
    public static final String mPlacementId_native_nend = "b5cb95ead9e60a";
    public static final String mPlacementId_native_baidu = "b5d148f9f2e47d";
    public static final String mPlacementId_native_luomi = "b5d1ef61e17981";
    public static final String mPlacementId_native_kuaishou = "b5e4105d4f21b6";

    //RewardedVideo
    public static final String mPlacementId_rewardvideo_all = "b5b449fb3d89d7";
    public static final String mPlacementId_rewardvideo_facebook = "b5b449eefcab50";
    public static final String mPlacementId_rewardvideo_admob = "b5b449f025ec7c";
    public static final String mPlacementId_rewardvideo_inmobi = "b5b449f0c6b84a";
    public static final String mPlacementId_rewardvideo_flurry = "b5b449f15d04ca";
    public static final String mPlacementId_rewardvideo_applovin = "b5b449f20155a7";
    public static final String mPlacementId_rewardvideo_mintegral = "b5b449f2f58cd7";
    public static final String mPlacementId_rewardvideo_mopub = "b5b449f4927359";
    public static final String mPlacementId_rewardvideo_GDT = "b5c2c880cb9d52";
    public static final String mPlacementId_rewardvideo_CHARTBOOST = "b5b449f548e010";
    public static final String mPlacementId_rewardvideo_TAPJOY = "b5b449f66ceaf5";
    public static final String mPlacementId_rewardvideo_IRONSOURCE = "b5b449f75948c5";
    public static final String mPlacementId_rewardvideo_UNITYAD = "b5b449f809139c";
    public static final String mPlacementId_rewardvideo_vungle = "b5b449f97e0b5f";
    public static final String mPlacementId_rewardvideo_adcolony = "b5b449faa95391";
    public static final String mPlacementId_rewardvideo_toutiao = "b5b728e7a08cd4";
    public static final String mPlacementId_rewardvideo_uniplay = "b5badef36435e7";
    public static final String mPlacementId_rewardvideo_oneway = "b5badf5b390201";
    public static final String mPlacementId_rewardvideo_ksyun = "b5bbd61d0aa571";
    public static final String mPlacementId_rewardvideo_appnext = "b5bc7f38df0a73";
    public static final String mPlacementId_rewardvideo_baidu = "b5c2c800fb3a52";
    public static final String mPlacementId_rewardvideo_nend = "b5cb95efa0c793";
    public static final String mPlacementId_rewardvideo_maio = "b5cb961e495a18";
    public static final String mPlacementId_rewardvideo_startapp = "b5cff0d063ac32";
    public static final String mPlacementId_rewardvideo_superawesome = "b5cff0d2157805";
    public static final String mPlacementId_rewardvideo_ks = "b5d67459a3e535";
    public static final String mPlacementId_rewardvideo_sigmob = "b5d7228c6c5d6a";
    public static final String mPlacementId_rewardvideo_myoffer = "b5db6c3764aea3";
    public static final String mPlacementId_rewardvideo_ogury = "b5dde267f73eb4";

    //Banner
    public static final String mPlacementId_banner_facebook = "b5bbdc51a35e29";
    public static final String mPlacementId_banner_admob = "b5baca41a2536f";
    public static final String mPlacementId_banner_inmobi = "b5bbdc535a9d1a";
    public static final String mPlacementId_banner_flurry = "b5bbdc584f1368";
    public static final String mPlacementId_banner_applovin = "b5bbdc59f88520";
    public static final String mPlacementId_banner_mintegral = "b5dd388839bf5e";
    public static final String mPlacementId_banner_mopub = "b5bbdc5c857b2f";
    public static final String mPlacementId_banner_GDT = "b5baca43951901";
    public static final String mPlacementId_banner_all = "b5baca4f74c3d8";
    public static final String mPlacementId_banner_toutiao = "b5baca45138428";
    public static final String mPlacementId_banner_uniplay = "b5baca4aebcb93";
    public static final String mPlacementId_banner_appnext = "b5bc7f3b034a2b";
    public static final String mPLacementId_banner_baidu = "b5c0508c4c073f";
    public static final String mPlacementId_banner_nend = "b5cb95ed13203c";

    //Interstitial
    public static final String mPlacementId_interstitial_facebook = "b5bbdc69a21187";
    public static final String mPlacementId_interstitial_admob = "b5baca54674522";
    public static final String mPlacementId_interstitial_inmobi = "b5bbdc6b63458f";
    public static final String mPlacementId_interstitial_flurry = "b5bbdc6d5e1362";
    public static final String mPlacementId_interstitial_applovin = "b5bbdc6fc65dd1";
    public static final String mPlacementId_interstitial_mintegral = "b5bbdc725768fa";
    public static final String mPlacementId_interstitial_video_mintegral = "b5bbdc855a1506";
    public static final String mPlacementId_interstitial_mopub = "b5bbdc86dd8e3b";
    public static final String mPlacementId_interstitial_GDT = "b5baca561bc100";
    public static final String mPlacementId_interstitial_all = "b5baca53984692";
    public static final String mPlacementId_interstitial_CHARTBOOST = "b5bbdc8a68d901";
    public static final String mPlacementId_interstitial_TAPJOY = "b5bbdc8b6e9829";
    public static final String mPlacementId_interstitial_IRONSOURCE = "b5bbdc8e9ef916";
    public static final String mPlacementId_interstitial_vungle = "b5bbdc9182f9f2";
    public static final String mPlacementId_interstitial_adcolony = "b5bbdc92f49ce7";
    public static final String mPlacementId_interstitial_toutiao = "b5baca585a8fef";
    public static final String mPlacementId_interstitial_video_toutiao = "b5baca599c7c61";
    public static final String mPlacementId_interstitial_uniplay = "b5baca5d16c597";
    public static final String mPlacementId_interstitial_oneway = "b5baca5e3d2b29";
    public static final String mPlacementId_interstitial_appnext = "b5bc7f3ec5b952";
    public static final String mPlacementId_interstitial_baidu = "b5c0508e2c84d4";
    public static final String mPlacementId_interstitial_UNITYAD = "b5c21a303c25e0";
    public static final String mPlacementId_interstitial_nend = "b5cb95eeb7e908";
    public static final String mPlacementId_interstitia_maio = "b5cb961d9d3414";
    public static final String mPlacementId_interstitia_startapp = "b5d5e641d9c30a";
    public static final String mPlacementId_interstitial_ks = "b5d6745b8133f2";
    public static final String mPlacementId_interstitial_sigmob = "b5d7614ab30695";
    public static final String mPlacementId_interstitial_myoffer = "b5db6c39aed9c5";
    public static final String mPlacementId_interstitial_ogury = "b5dde269060938";

    //Splash
    public static final String mPlacementId_splash_all = "b5bea7cc9a4497";
    public static final String mPlacementId_splash_gdt = "b5bea7bfd93f01";
    public static final String mPlacementId_splash_toutiao = "b5bea7c1b653ef";
    public static final String mPlacementId_splash_baidu = "b5c05090192a58";
    public static final String mPlacementId_splash_sigmob = "b5d76150bab3ad";

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(getApplicationContext());
        Fresco.initialize(getApplicationContext());
        ATSDK.setNetworkLogDebug(true);
        ATSDK.integrationChecking(getApplicationContext());
        ATSDK.init(this, appid, appKey);

    }
}