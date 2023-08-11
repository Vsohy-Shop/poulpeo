package p071e2;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C12775o;

/* renamed from: e2.e */
/* compiled from: UnityReflection.kt */
public final class C7453e {

    /* renamed from: a */
    private static final String f10329a = C7453e.class.getCanonicalName();

    /* renamed from: b */
    private static Class<?> f10330b;

    /* renamed from: c */
    public static final C7453e f10331c = new C7453e();

    private C7453e() {
    }

    /* renamed from: a */
    public static final void m14594a() {
        m14597d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    /* renamed from: b */
    private final Class<?> m14595b() {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        C12775o.m28638h(cls, "Class.forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    /* renamed from: c */
    public static final void m14596c(String str) {
        m14597d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: d */
    public static final void m14597d(String str, String str2, String str3) {
        Class<String> cls = String.class;
        try {
            if (f10330b == null) {
                f10330b = f10331c.m14595b();
            }
            Class<?> cls2 = f10330b;
            if (cls2 == null) {
                C12775o.m28656z("unityPlayer");
            }
            Method method = cls2.getMethod("UnitySendMessage", new Class[]{cls, cls, cls});
            C12775o.m28638h(method, "unityPlayer.getMethod(\n …java, String::class.java)");
            Class<?> cls3 = f10330b;
            if (cls3 == null) {
                C12775o.m28656z("unityPlayer");
            }
            method.invoke(cls3, new Object[]{str, str2, str3});
        } catch (Exception e) {
            Log.e(f10329a, "Failed to send message to Unity", e);
        }
    }
}
