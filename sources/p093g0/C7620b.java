package p093g0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.Constants;
import com.braze.push.BrazePushReceiver;
import com.google.firebase.messaging.C7011s0;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: g0.b */
/* compiled from: BrazeFirebaseMessagingService.kt */
public class C7620b extends FirebaseMessagingService {

    /* renamed from: h */
    public static final C7621a f10593h = new C7621a((DefaultConstructorMarker) null);

    /* renamed from: g0.b$a */
    /* compiled from: BrazeFirebaseMessagingService.kt */
    public static final class C7621a {

        /* renamed from: g0.b$a$a */
        /* compiled from: BrazeFirebaseMessagingService.kt */
        static final class C7622a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ C7011s0 f10594g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7622a(C7011s0 s0Var) {
                super(0);
                this.f10594g = s0Var;
            }

            public final String invoke() {
                return C12775o.m28647q("Remote message did not originate from Braze. Not consuming remote message: ", this.f10594g);
            }
        }

        /* renamed from: g0.b$a$b */
        /* compiled from: BrazeFirebaseMessagingService.kt */
        static final class C7623b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ Map<String, String> f10595g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7623b(Map<String, String> map) {
                super(0);
                this.f10595g = map;
            }

            public final String invoke() {
                return C12775o.m28647q("Got remote message from FCM: ", this.f10595g);
            }
        }

        /* renamed from: g0.b$a$c */
        /* compiled from: BrazeFirebaseMessagingService.kt */
        static final class C7624c extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f10596g;

            /* renamed from: h */
            final /* synthetic */ String f10597h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7624c(String str, String str2) {
                super(0);
                this.f10596g = str;
                this.f10597h = str2;
            }

            public final String invoke() {
                return "Adding bundle item from FCM remote data with key: " + this.f10596g + " and value: " + this.f10597h;
            }
        }

        private C7621a() {
        }

        public /* synthetic */ C7621a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo41359a(Context context, C7011s0 s0Var) {
            C7011s0 s0Var2 = s0Var;
            C12775o.m28639i(context, "context");
            C12775o.m28639i(s0Var2, "remoteMessage");
            if (!mo41360b(s0Var2)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C7622a(s0Var2), 6, (Object) null);
                return false;
            }
            Map<String, String> A = s0Var.mo39983A();
            C12775o.m28638h(A, "remoteMessage.data");
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C7623b(A), 6, (Object) null);
            Intent intent = new Intent("firebase_messaging_service_routing_action");
            Bundle bundle = new Bundle();
            for (Map.Entry next : A.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C7624c(str, str2), 6, (Object) null);
                bundle.putString(str, str2);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.C4249a.m4947i(BrazePushReceiver.f3510a, context, intent, false, 4, (Object) null);
            return true;
        }

        /* renamed from: b */
        public final boolean mo41360b(C7011s0 s0Var) {
            C12775o.m28639i(s0Var, "remoteMessage");
            Map<String, String> A = s0Var.mo39983A();
            C12775o.m28638h(A, "remoteMessage.data");
            return C12775o.m28634d("true", A.get(Constants.APPBOY_PUSH_APPBOY_KEY));
        }
    }
}
