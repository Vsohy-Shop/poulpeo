package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p036b5.C2888a;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public interface C5734f1 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(C5785i1 i1Var);

    void getAppInstanceId(C5785i1 i1Var);

    void getCachedAppInstanceId(C5785i1 i1Var);

    void getConditionalUserProperties(String str, String str2, C5785i1 i1Var);

    void getCurrentScreenClass(C5785i1 i1Var);

    void getCurrentScreenName(C5785i1 i1Var);

    void getGmpAppId(C5785i1 i1Var);

    void getMaxUserProperties(String str, C5785i1 i1Var);

    void getTestFlag(C5785i1 i1Var, int i);

    void getUserProperties(String str, String str2, boolean z, C5785i1 i1Var);

    void initForTests(Map map);

    void initialize(C2888a aVar, C5884o1 o1Var, long j);

    void isDataCollectionEnabled(C5785i1 i1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, C5785i1 i1Var, long j);

    void logHealthData(int i, String str, C2888a aVar, C2888a aVar2, C2888a aVar3);

    void onActivityCreated(C2888a aVar, Bundle bundle, long j);

    void onActivityDestroyed(C2888a aVar, long j);

    void onActivityPaused(C2888a aVar, long j);

    void onActivityResumed(C2888a aVar, long j);

    void onActivitySaveInstanceState(C2888a aVar, C5785i1 i1Var, long j);

    void onActivityStarted(C2888a aVar, long j);

    void onActivityStopped(C2888a aVar, long j);

    void performAction(Bundle bundle, C5785i1 i1Var, long j);

    void registerOnMeasurementEventListener(C5836l1 l1Var);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(C2888a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C5836l1 l1Var);

    void setInstanceIdProvider(C5868n1 n1Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, C2888a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(C5836l1 l1Var);
}
