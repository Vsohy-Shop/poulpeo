package p195q;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.SourceDebugExtension;
import p195q.C9083d;
import p259w.C10064d;
import p259w.C10067g;
import p259w.C10080q;

@SourceDebugExtension({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 Logs.kt\ncoil/util/-Logs\n*L\n1#1,112:1\n31#2:113\n21#3,4:114\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n*L\n26#1:113\n28#1:114,4\n*E\n"})
/* renamed from: q.e */
/* compiled from: NetworkObserver.kt */
public final class C9085e {
    /* renamed from: a */
    public static final C9083d m18457a(Context context, C9083d.C9084a aVar, C10080q qVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !C10064d.m21132e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (qVar != null && qVar.mo44656a() <= 5) {
                qVar.mo44657b("NetworkObserver", 5, "Unable to register network observer.", (Throwable) null);
            }
            return new C9082c();
        }
        try {
            return new C9086f(connectivityManager, aVar);
        } catch (Exception e) {
            if (qVar != null) {
                C10067g.m21136a(qVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e));
            }
            return new C9082c();
        }
    }
}
