package p416qd;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.poulpeo.R;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p368jd.C12616b;
import p404of.C13074a;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;
import p446vd.C13633n;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: qd.b */
/* compiled from: FullScreenVideoActivity.kt */
public class C13244b extends C12616b {

    /* renamed from: q */
    public static final C13245a f21116q = new C13245a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final int f21117r = 8;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final IntentDelegate.Int f21118s = new IntentDelegate.Int("videoResourceId");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final IntentDelegate.String f21119t = new IntentDelegate.String("trackingTag");

    /* renamed from: m */
    private final int f21120m;

    /* renamed from: n */
    private Integer f21121n;

    /* renamed from: o */
    private final Lazy f21122o = C11901h.m25690b(new C13246b(this));

    /* renamed from: p */
    public Map<Integer, View> f21123p = new LinkedHashMap();

    /* renamed from: qd.b$a */
    /* compiled from: FullScreenVideoActivity.kt */
    public static final class C13245a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f21124a;

        static {
            Class<C13245a> cls = C13245a.class;
            f21124a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "videoResourceId", "getVideoResourceId(Landroid/content/Intent;)I", 0)), C12764h0.m28590f(new C12783v(cls, "trackingTag", "getTrackingTag(Landroid/content/Intent;)Ljava/lang/String;", 0))};
        }

        private C13245a() {
        }

        public /* synthetic */ C13245a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final String m30098c(Intent intent) {
            return C13244b.f21119t.getValue(intent, (KProperty<?>) f21124a[1]);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final int m30099d(Intent intent) {
            return C13244b.f21118s.getValue(intent, (KProperty<?>) f21124a[0]).intValue();
        }

        /* renamed from: f */
        private final void m30100f(Intent intent, String str) {
            C13244b.f21119t.setValue(intent, (KProperty<?>) f21124a[1], str);
        }

        /* renamed from: g */
        private final void m30101g(Intent intent, int i) {
            C13244b.f21118s.setValue(intent, (KProperty<?>) f21124a[0], i);
        }

        /* renamed from: e */
        public final <T extends C13244b> Intent mo52899e(Context context, Class<T> cls, int i, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(cls, "videoActivityClass");
            C12775o.m28639i(str, "trackingTag");
            Intent intent = new Intent(context, cls);
            C13245a aVar = C13244b.f21116q;
            aVar.m30101g(intent, i);
            aVar.m30100f(intent, str);
            return intent;
        }
    }

    /* renamed from: qd.b$b */
    /* compiled from: FullScreenVideoActivity.kt */
    static final class C13246b extends C12777p implements C13074a<MediaController> {

        /* renamed from: g */
        final /* synthetic */ C13244b f21125g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13246b(C13244b bVar) {
            super(0);
            this.f21125g = bVar;
        }

        /* renamed from: b */
        public final MediaController invoke() {
            return this.f21125g.m30092G2();
        }
    }

    /* renamed from: qd.b$c */
    /* compiled from: FullScreenVideoActivity.kt */
    public static final class C13247c extends MediaController {

        /* renamed from: b */
        private final Handler f21126b;

        /* renamed from: c */
        public Map<Integer, View> f21127c = new LinkedHashMap();

        /* renamed from: d */
        final /* synthetic */ C13244b f21128d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13247c(C13244b bVar) {
            super(bVar);
            this.f21128d = bVar;
            this.f21126b = new Handler();
            setAnchorView((VideoView) bVar.mo46517B2(C13865f.videoView));
            if (Build.VERSION.SDK_INT >= 28) {
                addOnUnhandledKeyEventListener(new C13249d(this));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final boolean m30105b(C13247c cVar, View view, KeyEvent keyEvent) {
            C12775o.m28639i(cVar, "this$0");
            C12775o.m28638h(keyEvent, NotificationCompat.CATEGORY_EVENT);
            return cVar.m30106c(keyEvent);
        }

        /* renamed from: c */
        private final boolean m30106c(KeyEvent keyEvent) {
            if (keyEvent.getKeyCode() != 4) {
                return false;
            }
            this.f21128d.onBackPressed();
            return true;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
            if (Build.VERSION.SDK_INT >= 28 || !m30106c(keyEvent)) {
                return super.dispatchKeyEvent(keyEvent);
            }
            return true;
        }

        public void hide() {
            ActionBar supportActionBar;
            if (((VideoView) this.f21128d.mo46517B2(C13865f.videoView)).isPlaying()) {
                super.hide();
                if (!isShowing() && (supportActionBar = this.f21128d.getSupportActionBar()) != null) {
                    supportActionBar.hide();
                }
            }
        }

        public void show(int i) {
            ActionBar supportActionBar;
            super.show(0);
            if (((VideoView) this.f21128d.mo46517B2(C13865f.videoView)).isPlaying()) {
                this.f21126b.removeCallbacksAndMessages((Object) null);
                this.f21126b.postDelayed(new C13248c(this), (long) i);
            }
            if (isShowing() && (supportActionBar = this.f21128d.getSupportActionBar()) != null) {
                supportActionBar.show();
            }
        }
    }

    /* renamed from: F2 */
    private final MediaController m30091F2() {
        return (MediaController) this.f21122o.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public final MediaController m30092G2() {
        return new C13247c(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m30093H2(C13244b bVar) {
        C12775o.m28639i(bVar, "this$0");
        try {
            bVar.m30091F2().show(PathInterpolatorCompat.MAX_NUM_POINTS);
        } catch (Exception e) {
            C13633n.m31165u(bVar, e);
        }
    }

    /* renamed from: B2 */
    public View mo46517B2(int i) {
        Map<Integer, View> map = this.f21123p;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_fullscreen_video);
        int i = C13865f.videoView;
        ((VideoView) mo46517B2(i)).setMediaController(m30091F2());
        String packageName = getPackageName();
        C13245a aVar = f21116q;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        int b = aVar.m30099d(intent);
        ((VideoView) mo46517B2(i)).setVideoURI(Uri.parse("android.resource://" + packageName + "/" + b));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        int i = C13865f.videoView;
        this.f21121n = Integer.valueOf(((VideoView) mo46517B2(i)).getCurrentPosition());
        ((VideoView) mo46517B2(i)).pause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f21121n == null) {
            ((VideoView) mo46517B2(C13865f.videoView)).start();
        } else {
            Integer num = this.f21121n;
            C12775o.m28636f(num);
            ((VideoView) mo46517B2(C13865f.videoView)).seekTo(num.intValue());
        }
        new Handler().postDelayed(new C13243a(this), 100);
        C13618g gVar = C13618g.f21930b;
        C13245a aVar = f21116q;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        gVar.mo53280e(new C13615d(aVar.m30098c(intent), C13617f.VIDEO));
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && !m30091F2().isShowing()) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f21120m;
    }
}
