package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import java.util.EnumSet;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8300j;
import p292z.C10732c;

/* renamed from: bo.app.a5 */
public final class C2998a5 {

    /* renamed from: b */
    public static final C2999a f1441b = new C2999a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f1442a;

    /* renamed from: bo.app.a5$a */
    public static final class C2999a {
        public /* synthetic */ C2999a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2999a() {
        }
    }

    public C2998a5(Context context, String str, String str2) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "userId");
        C12775o.m28639i(str2, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(C12775o.m28647q("com.braze.storage.sdk_metadata_cache", C8300j.m16489c(context, str, str2)), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.f1442a = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo28601a(EnumSet<C10732c> enumSet) {
        C12775o.m28639i(enumSet, "sdkMetadata");
        this.f1442a.edit().putStringSet(APIIncludes.TAGS, C3724u0.m3970a(enumSet)).apply();
    }

    /* renamed from: b */
    public final EnumSet<C10732c> mo28602b(EnumSet<C10732c> enumSet) {
        C12775o.m28639i(enumSet, "newSdkMetadata");
        if (C12775o.m28634d(C3724u0.m3970a(enumSet), this.f1442a.getStringSet(APIIncludes.TAGS, C12731y0.m28551e()))) {
            return null;
        }
        return enumSet;
    }
}
