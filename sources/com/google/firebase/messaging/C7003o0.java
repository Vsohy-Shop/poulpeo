package com.google.firebase.messaging;

import android.content.Context;
import androidx.annotation.NonNull;
import p276x5.C10406g;

/* renamed from: com.google.firebase.messaging.o0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C7003o0 implements Runnable {
    @NonNull

    /* renamed from: b */
    public /* synthetic */ Context f9342b;

    /* renamed from: c */
    public /* synthetic */ boolean f9343c;
    @NonNull

    /* renamed from: d */
    public /* synthetic */ C10406g f9344d;

    public /* synthetic */ C7003o0(@NonNull Context context, boolean z, @NonNull C10406g gVar) {
        this.f9342b = context;
        this.f9343c = z;
        this.f9344d = gVar;
    }

    public final void run() {
        C7007q0.m12407d(this.f9342b, this.f9343c, this.f9344d);
    }
}
