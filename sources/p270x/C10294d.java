package p270x;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p042bo.app.C3605r1;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: x.d */
public class C10294d extends BroadcastReceiver {
    private static final String BOOT_COMPLETE_ACTION = "android.intent.action.BOOT_COMPLETED";
    public static final C10295a Companion = new C10295a((DefaultConstructorMarker) null);

    /* renamed from: x.d$a */
    public static final class C10295a {
        public /* synthetic */ C10295a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10295a() {
        }
    }

    /* renamed from: x.d$b */
    static final class C10296b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Intent f15552g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10296b(Intent intent) {
            super(0);
            this.f15552g = intent;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Received broadcast message. Message: ", this.f15552g);
        }
    }

    /* renamed from: x.d$c */
    static final class C10297c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10297c f15553g = new C10297c();

        C10297c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Boot complete intent received. Initializing.";
        }
    }

    /* renamed from: x.d$d */
    static final class C10298d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Intent f15554g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10298d(Intent intent) {
            super(0);
            this.f15554g = intent;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unknown intent " + this.f15554g + " received. Doing nothing.";
        }
    }

    public final boolean handleIncomingIntent(Context context, Intent intent) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        C8266c cVar = C8266c.f11641a;
        C8266c.C8267a aVar = C8266c.C8267a.I;
        C8266c.m16396e(cVar, this, aVar, (Throwable) null, false, new C10296b(intent), 6, (Object) null);
        if (C12775o.m28634d(BOOT_COMPLETE_ACTION, intent.getAction())) {
            C8266c.m16396e(cVar, this, aVar, (Throwable) null, false, C10297c.f15553g, 6, (Object) null);
            C3605r1.m3739a(context);
            C10156b.f15345m.mo44811g(context);
            return true;
        }
        C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10298d(intent), 6, (Object) null);
        return false;
    }

    public void onReceive(Context context, Intent intent) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        handleIncomingIntent(context, intent);
    }
}
