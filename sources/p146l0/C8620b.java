package p146l0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.enums.Channel;
import com.appboy.p054ui.activities.AppboyFeedActivity;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: l0.b */
/* compiled from: NewsfeedAction.kt */
public class C8620b implements C8619a {

    /* renamed from: a */
    private final Bundle f12321a;

    /* renamed from: b */
    private final Channel f12322b;

    /* renamed from: l0.b$a */
    /* compiled from: NewsfeedAction.kt */
    static final class C8621a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8621a f12323g = new C8621a();

        C8621a() {
            super(0);
        }

        public final String invoke() {
            return "AppboyFeedActivity was not opened successfully.";
        }
    }

    public C8620b(Bundle bundle, Channel channel) {
        C12775o.m28639i(channel, "channel");
        this.f12321a = bundle;
        this.f12322b = channel;
    }

    /* renamed from: a */
    public void mo42702a(Context context) {
        C12775o.m28639i(context, "context");
        try {
            Intent intent = new Intent(context, AppboyFeedActivity.class);
            Bundle bundle = this.f12321a;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C8621a.f12323g, 4, (Object) null);
        }
    }
}
