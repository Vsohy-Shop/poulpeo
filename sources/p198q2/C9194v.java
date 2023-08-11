package p198q2;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.C4579r;
import com.facebook.FacebookSdk;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q2.v */
/* compiled from: Logger.kt */
public final class C9194v {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final HashMap<String, String> f13503e = new HashMap<>();

    /* renamed from: f */
    public static final C9195a f13504f = new C9195a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C4579r f13505a;

    /* renamed from: b */
    private final String f13506b;

    /* renamed from: c */
    private StringBuilder f13507c;

    /* renamed from: d */
    private int f13508d = 3;

    /* renamed from: q2.v$a */
    /* compiled from: Logger.kt */
    public static final class C9195a {
        private C9195a() {
        }

        public /* synthetic */ C9195a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: g */
        private final synchronized String m18835g(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : C9194v.f13503e.entrySet()) {
                str2 = C13754v.m31521A(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            return str2;
        }

        /* renamed from: a */
        public final void mo43480a(C4579r rVar, int i, String str, String str2) {
            C12775o.m28639i(rVar, "behavior");
            C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
            C12775o.m28639i(str2, TypedValues.Custom.S_STRING);
            if (FacebookSdk.isLoggingBehaviorEnabled(rVar)) {
                String g = m18835g(str2);
                if (!C13754v.m31525E(str, "FacebookSDK.", false, 2, (Object) null)) {
                    str = "FacebookSDK." + str;
                }
                Log.println(i, str, g);
                if (rVar == C4579r.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        /* renamed from: b */
        public final void mo43481b(C4579r rVar, int i, String str, String str2, Object... objArr) {
            C12775o.m28639i(rVar, "behavior");
            C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
            C12775o.m28639i(str2, "format");
            C12775o.m28639i(objArr, "args");
            if (FacebookSdk.isLoggingBehaviorEnabled(rVar)) {
                C12770k0 k0Var = C12770k0.f20423a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                mo43480a(rVar, i, str, format);
            }
        }

        /* renamed from: c */
        public final void mo43482c(C4579r rVar, String str, String str2) {
            C12775o.m28639i(rVar, "behavior");
            C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
            C12775o.m28639i(str2, TypedValues.Custom.S_STRING);
            mo43480a(rVar, 3, str, str2);
        }

        /* renamed from: d */
        public final void mo43483d(C4579r rVar, String str, String str2, Object... objArr) {
            C12775o.m28639i(rVar, "behavior");
            C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
            C12775o.m28639i(str2, "format");
            C12775o.m28639i(objArr, "args");
            if (FacebookSdk.isLoggingBehaviorEnabled(rVar)) {
                C12770k0 k0Var = C12770k0.f20423a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                mo43480a(rVar, 3, str, format);
            }
        }

        /* renamed from: e */
        public final synchronized void mo43484e(String str) {
            C12775o.m28639i(str, "accessToken");
            if (!FacebookSdk.isLoggingBehaviorEnabled(C4579r.INCLUDE_ACCESS_TOKENS)) {
                mo43485f(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        /* renamed from: f */
        public final synchronized void mo43485f(String str, String str2) {
            C12775o.m28639i(str, "original");
            C12775o.m28639i(str2, "replace");
            C9194v.f13503e.put(str, str2);
        }
    }

    public C9194v(C4579r rVar, String str) {
        C12775o.m28639i(rVar, "behavior");
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C9144e0.m18692k(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        this.f13505a = rVar;
        this.f13506b = "FacebookSDK." + str;
        this.f13507c = new StringBuilder();
    }

    /* renamed from: g */
    private final boolean m18829g() {
        return FacebookSdk.isLoggingBehaviorEnabled(this.f13505a);
    }

    /* renamed from: b */
    public final void mo43475b(String str) {
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        if (m18829g()) {
            this.f13507c.append(str);
        }
    }

    /* renamed from: c */
    public final void mo43476c(String str, Object... objArr) {
        C12775o.m28639i(str, "format");
        C12775o.m28639i(objArr, "args");
        if (m18829g()) {
            StringBuilder sb = this.f13507c;
            C12770k0 k0Var = C12770k0.f20423a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            sb.append(format);
        }
    }

    /* renamed from: d */
    public final void mo43477d(String str, Object obj) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(obj, "value");
        mo43476c("  %s:\t%s\n", str, obj);
    }

    /* renamed from: e */
    public final void mo43478e() {
        String sb = this.f13507c.toString();
        C12775o.m28638h(sb, "contents.toString()");
        mo43479f(sb);
        this.f13507c = new StringBuilder();
    }

    /* renamed from: f */
    public final void mo43479f(String str) {
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        f13504f.mo43480a(this.f13505a, this.f13508d, this.f13506b, str);
    }
}
