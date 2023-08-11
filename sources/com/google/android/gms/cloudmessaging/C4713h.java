package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import p170n4.C8911h;

/* renamed from: com.google.android.gms.cloudmessaging.h */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class C4713h {
    @Nullable

    /* renamed from: a */
    private final Messenger f4858a;
    @Nullable

    /* renamed from: b */
    private final C8911h f4859b;

    C4713h(IBinder iBinder) {
        String str;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f4858a = new Messenger(iBinder);
            this.f4859b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f4859b = new C8911h(iBinder);
            this.f4858a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32326a(Message message) {
        Messenger messenger = this.f4858a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C8911h hVar = this.f4859b;
        if (hVar != null) {
            hVar.mo43055b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
