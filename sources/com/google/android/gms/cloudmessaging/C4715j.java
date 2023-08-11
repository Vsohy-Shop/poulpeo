package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import p276x5.C10406g;

/* renamed from: com.google.android.gms.cloudmessaging.j */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
abstract class C4715j<T> {

    /* renamed from: a */
    final int f4860a;

    /* renamed from: b */
    final C10406g<T> f4861b = new C10406g<>();

    /* renamed from: c */
    final int f4862c;

    /* renamed from: d */
    final Bundle f4863d;

    C4715j(int i, int i2, Bundle bundle) {
        this.f4860a = i;
        this.f4862c = i2;
        this.f4863d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo32327a(Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo32328b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo32329c(zzq zzq) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzq);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f4861b.mo45097b(zzq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo32330d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f4861b.mo45098c(t);
    }

    public final String toString() {
        int i = this.f4862c;
        int i2 = this.f4860a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(mo32328b());
        sb.append("}");
        return sb.toString();
    }
}
