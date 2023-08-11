package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p036b5.C2888a;

/* renamed from: com.google.android.gms.internal.measurement.d1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C5700d1 extends C5883o0 implements C5734f1 {
    C5700d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel E = mo34235E();
        E.writeString(str);
        E.writeLong(j);
        mo34237J(23, E);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel E = mo34235E();
        E.writeString(str);
        E.writeString(str2);
        C5915q0.m9778d(E, bundle);
        mo34237J(9, E);
    }

    public final void clearMeasurementEnabled(long j) {
        Parcel E = mo34235E();
        E.writeLong(j);
        mo34237J(43, E);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel E = mo34235E();
        E.writeString(str);
        E.writeLong(j);
        mo34237J(24, E);
    }

    public final void generateEventId(C5785i1 i1Var) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, i1Var);
        mo34237J(22, E);
    }

    public final void getCachedAppInstanceId(C5785i1 i1Var) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, i1Var);
        mo34237J(19, E);
    }

    public final void getConditionalUserProperties(String str, String str2, C5785i1 i1Var) {
        Parcel E = mo34235E();
        E.writeString(str);
        E.writeString(str2);
        C5915q0.m9779e(E, i1Var);
        mo34237J(10, E);
    }

    public final void getCurrentScreenClass(C5785i1 i1Var) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, i1Var);
        mo34237J(17, E);
    }

    public final void getCurrentScreenName(C5785i1 i1Var) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, i1Var);
        mo34237J(16, E);
    }

    public final void getGmpAppId(C5785i1 i1Var) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, i1Var);
        mo34237J(21, E);
    }

    public final void getMaxUserProperties(String str, C5785i1 i1Var) {
        Parcel E = mo34235E();
        E.writeString(str);
        C5915q0.m9779e(E, i1Var);
        mo34237J(6, E);
    }

    public final void getUserProperties(String str, String str2, boolean z, C5785i1 i1Var) {
        Parcel E = mo34235E();
        E.writeString(str);
        E.writeString(str2);
        C5915q0.m9777c(E, z);
        C5915q0.m9779e(E, i1Var);
        mo34237J(5, E);
    }

    public final void initialize(C2888a aVar, C5884o1 o1Var, long j) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, aVar);
        C5915q0.m9778d(E, o1Var);
        E.writeLong(j);
        mo34237J(1, E);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel E = mo34235E();
        E.writeString(str);
        E.writeString(str2);
        C5915q0.m9778d(E, bundle);
        C5915q0.m9777c(E, z);
        C5915q0.m9777c(E, z2);
        E.writeLong(j);
        mo34237J(2, E);
    }

    public final void logHealthData(int i, String str, C2888a aVar, C2888a aVar2, C2888a aVar3) {
        Parcel E = mo34235E();
        E.writeInt(5);
        E.writeString(str);
        C5915q0.m9779e(E, aVar);
        C5915q0.m9779e(E, aVar2);
        C5915q0.m9779e(E, aVar3);
        mo34237J(33, E);
    }

    public final void onActivityCreated(C2888a aVar, Bundle bundle, long j) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, aVar);
        C5915q0.m9778d(E, bundle);
        E.writeLong(j);
        mo34237J(27, E);
    }

    public final void onActivityDestroyed(C2888a aVar, long j) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, aVar);
        E.writeLong(j);
        mo34237J(28, E);
    }

    public final void onActivityPaused(C2888a aVar, long j) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, aVar);
        E.writeLong(j);
        mo34237J(29, E);
    }

    public final void onActivityResumed(C2888a aVar, long j) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, aVar);
        E.writeLong(j);
        mo34237J(30, E);
    }

    public final void onActivitySaveInstanceState(C2888a aVar, C5785i1 i1Var, long j) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, aVar);
        C5915q0.m9779e(E, i1Var);
        E.writeLong(j);
        mo34237J(31, E);
    }

    public final void onActivityStarted(C2888a aVar, long j) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, aVar);
        E.writeLong(j);
        mo34237J(25, E);
    }

    public final void onActivityStopped(C2888a aVar, long j) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, aVar);
        E.writeLong(j);
        mo34237J(26, E);
    }

    public final void registerOnMeasurementEventListener(C5836l1 l1Var) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, l1Var);
        mo34237J(35, E);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, bundle);
        E.writeLong(j);
        mo34237J(8, E);
    }

    public final void setCurrentScreen(C2888a aVar, String str, String str2, long j) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, aVar);
        E.writeString(str);
        E.writeString(str2);
        E.writeLong(j);
        mo34237J(15, E);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel E = mo34235E();
        C5915q0.m9777c(E, z);
        mo34237J(39, E);
    }

    public final void setEventInterceptor(C5836l1 l1Var) {
        Parcel E = mo34235E();
        C5915q0.m9779e(E, l1Var);
        mo34237J(34, E);
    }

    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel E = mo34235E();
        C5915q0.m9777c(E, z);
        E.writeLong(j);
        mo34237J(11, E);
    }

    public final void setUserId(String str, long j) {
        Parcel E = mo34235E();
        E.writeString(str);
        E.writeLong(j);
        mo34237J(7, E);
    }

    public final void setUserProperty(String str, String str2, C2888a aVar, boolean z, long j) {
        Parcel E = mo34235E();
        E.writeString(str);
        E.writeString(str2);
        C5915q0.m9779e(E, aVar);
        C5915q0.m9777c(E, z);
        E.writeLong(j);
        mo34237J(4, E);
    }
}
