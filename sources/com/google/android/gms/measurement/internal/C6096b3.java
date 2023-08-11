package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C5883o0;
import com.google.android.gms.internal.measurement.C5915q0;
import java.util.ArrayList;
import java.util.List;
import p201q5.C9257d;

/* renamed from: com.google.android.gms.measurement.internal.b3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6096b3 extends C5883o0 implements C9257d {
    C6096b3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: D1 */
    public final void mo34752D1(C6289s9 s9Var) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, s9Var);
        mo34237J(20, E);
    }

    /* renamed from: F0 */
    public final List<C6103c> mo34753F0(String str, String str2, String str3) {
        Parcel E = mo34235E();
        E.writeString((String) null);
        E.writeString(str2);
        E.writeString(str3);
        Parcel G = mo34236G(17, E);
        ArrayList<C6103c> createTypedArrayList = G.createTypedArrayList(C6103c.CREATOR);
        G.recycle();
        return createTypedArrayList;
    }

    /* renamed from: G1 */
    public final void mo34754G1(long j, String str, String str2, String str3) {
        Parcel E = mo34235E();
        E.writeLong(j);
        E.writeString(str);
        E.writeString(str2);
        E.writeString(str3);
        mo34237J(10, E);
    }

    /* renamed from: J1 */
    public final List<C6190j9> mo34755J1(String str, String str2, boolean z, C6289s9 s9Var) {
        Parcel E = mo34235E();
        E.writeString(str);
        E.writeString(str2);
        C5915q0.m9777c(E, z);
        C5915q0.m9778d(E, s9Var);
        Parcel G = mo34236G(14, E);
        ArrayList<C6190j9> createTypedArrayList = G.createTypedArrayList(C6190j9.CREATOR);
        G.recycle();
        return createTypedArrayList;
    }

    /* renamed from: R */
    public final void mo34756R(Bundle bundle, C6289s9 s9Var) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, bundle);
        C5915q0.m9778d(E, s9Var);
        mo34237J(19, E);
    }

    /* renamed from: S0 */
    public final byte[] mo34757S0(C6290t tVar, String str) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, tVar);
        E.writeString(str);
        Parcel G = mo34236G(9, E);
        byte[] createByteArray = G.createByteArray();
        G.recycle();
        return createByteArray;
    }

    /* renamed from: X */
    public final void mo34758X(C6103c cVar, C6289s9 s9Var) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, cVar);
        C5915q0.m9778d(E, s9Var);
        mo34237J(12, E);
    }

    /* renamed from: e1 */
    public final void mo34759e1(C6289s9 s9Var) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, s9Var);
        mo34237J(4, E);
    }

    /* renamed from: f0 */
    public final List<C6190j9> mo34760f0(String str, String str2, String str3, boolean z) {
        Parcel E = mo34235E();
        E.writeString((String) null);
        E.writeString(str2);
        E.writeString(str3);
        C5915q0.m9777c(E, z);
        Parcel G = mo34236G(15, E);
        ArrayList<C6190j9> createTypedArrayList = G.createTypedArrayList(C6190j9.CREATOR);
        G.recycle();
        return createTypedArrayList;
    }

    /* renamed from: g1 */
    public final List<C6103c> mo34761g1(String str, String str2, C6289s9 s9Var) {
        Parcel E = mo34235E();
        E.writeString(str);
        E.writeString(str2);
        C5915q0.m9778d(E, s9Var);
        Parcel G = mo34236G(16, E);
        ArrayList<C6103c> createTypedArrayList = G.createTypedArrayList(C6103c.CREATOR);
        G.recycle();
        return createTypedArrayList;
    }

    /* renamed from: i0 */
    public final void mo34762i0(C6289s9 s9Var) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, s9Var);
        mo34237J(18, E);
    }

    /* renamed from: r1 */
    public final void mo34763r1(C6289s9 s9Var) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, s9Var);
        mo34237J(6, E);
    }

    /* renamed from: v0 */
    public final String mo34764v0(C6289s9 s9Var) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, s9Var);
        Parcel G = mo34236G(11, E);
        String readString = G.readString();
        G.recycle();
        return readString;
    }

    /* renamed from: x2 */
    public final List<C6190j9> mo34765x2(C6289s9 s9Var, boolean z) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, s9Var);
        C5915q0.m9777c(E, z);
        Parcel G = mo34236G(7, E);
        ArrayList<C6190j9> createTypedArrayList = G.createTypedArrayList(C6190j9.CREATOR);
        G.recycle();
        return createTypedArrayList;
    }

    /* renamed from: y2 */
    public final void mo34766y2(C6190j9 j9Var, C6289s9 s9Var) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, j9Var);
        C5915q0.m9778d(E, s9Var);
        mo34237J(2, E);
    }

    /* renamed from: z1 */
    public final void mo34767z1(C6290t tVar, C6289s9 s9Var) {
        Parcel E = mo34235E();
        C5915q0.m9778d(E, tVar);
        C5915q0.m9778d(E, s9Var);
        mo34237J(1, E);
    }
}
