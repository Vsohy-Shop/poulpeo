package p126j0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p336ef.C11904j;
import p404of.C13074a;

/* renamed from: j0.f */
public final class C8275f {

    /* renamed from: a */
    public static final C8275f f11660a = new C8275f();

    /* renamed from: b */
    private static final Lazy f11661b = C11901h.m25689a(C11904j.NONE, C8277b.f11664g);

    /* renamed from: j0.f$a */
    static final class C8276a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ ComponentName f11662g;

        /* renamed from: h */
        final /* synthetic */ Intent f11663h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8276a(ComponentName componentName, Intent intent) {
            super(0);
            this.f11662g = componentName;
            this.f11663h = intent;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Sent intent with component " + this.f11662g + " and explicit intent " + this.f11663h;
        }
    }

    /* renamed from: j0.f$b */
    static final class C8277b extends C12777p implements C13074a<Random> {

        /* renamed from: g */
        public static final C8277b f11664g = new C8277b();

        C8277b() {
            super(0);
        }

        /* renamed from: b */
        public final Random invoke() {
            return new Random();
        }
    }

    private C8275f() {
    }

    /* renamed from: a */
    public static final void m16440a(Context context, Intent intent) {
        List<ResolveInfo> list;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            list = context.getPackageManager().queryBroadcastReceivers(intent, PackageManager.ResolveInfoFlags.of(0));
        } else {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        }
        C12775o.m28638h(list, "if (Build.VERSION.SDK_IN…vers(intent, 0)\n        }");
        for (ResolveInfo resolveInfo : list) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setComponent(componentName);
            context.sendBroadcast(intent2);
            C8266c.m16396e(C8266c.f11641a, f11660a, C8266c.C8267a.f11650f, (Throwable) null, false, new C8276a(componentName, intent2), 6, (Object) null);
        }
    }

    /* renamed from: b */
    public static final int m16441b() {
        return 67108864;
    }

    /* renamed from: c */
    public static final int m16442c() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 33554432;
        }
        return 0;
    }

    /* renamed from: d */
    private final Random m16443d() {
        return (Random) f11661b.getValue();
    }

    /* renamed from: e */
    public static final int m16444e() {
        return f11660a.m16443d().nextInt(1073741823) + AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
    }
}
