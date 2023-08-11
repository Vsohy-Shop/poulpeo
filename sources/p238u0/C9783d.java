package p238u0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.braze.configuration.C4218b;
import com.braze.p055ui.inappmessage.InAppMessageOperation;
import com.braze.p055ui.inappmessage.views.C4337b;
import com.braze.p055ui.inappmessage.views.C4338c;
import com.braze.p055ui.inappmessage.views.C4343f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p018a0.C2106e;
import p018a0.C2109g;
import p019a1.C2117c;
import p031b0.C2811f;
import p031b0.C2813h;
import p031b0.C2815j;
import p069e0.C7358a;
import p069e0.C7399m;
import p126j0.C8266c;
import p126j0.C8278g;
import p126j0.C8287i;
import p156m0.C8794b;
import p270x.C10156b;
import p270x.C10299e;
import p282y0.C10612c;
import p282y0.C10640f;
import p282y0.C10641g;
import p282y0.C10643i;
import p293z0.C10735a;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: u0.d */
/* compiled from: BrazeInAppMessageManager.kt */
public class C9783d extends C9863q {

    /* renamed from: G */
    public static final C9784a f14623G = new C9784a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static final ReentrantLock f14624H = new ReentrantLock();
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static volatile C9783d f14625I;

    /* renamed from: A */
    private C2811f<C2815j> f14626A;

    /* renamed from: B */
    private Integer f14627B;

    /* renamed from: C */
    private C4218b f14628C;

    /* renamed from: D */
    private C9860n f14629D;

    /* renamed from: E */
    private C7358a f14630E;

    /* renamed from: F */
    private C7358a f14631F;

    /* renamed from: v */
    private final C10641g f14632v = new C10612c();

    /* renamed from: w */
    public final AtomicBoolean f14633w = new AtomicBoolean(false);

    /* renamed from: x */
    private final Stack<C7358a> f14634x = new Stack<>();

    /* renamed from: y */
    private final Map<C7358a, C2813h> f14635y = new LinkedHashMap();

    /* renamed from: z */
    private C2811f<C2813h> f14636z;

    /* renamed from: u0.d$a */
    /* compiled from: BrazeInAppMessageManager.kt */
    public static final class C9784a {
        private C9784a() {
        }

        public /* synthetic */ C9784a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final C9783d mo44312a() {
            if (C9783d.f14625I != null) {
                C9783d q = C9783d.f14625I;
                if (q != null) {
                    return q;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
            }
            ReentrantLock r = C9783d.f14624H;
            r.lock();
            try {
                if (C9783d.f14625I == null) {
                    C9783d.f14625I = new C9783d();
                }
                C11921v vVar = C11921v.f18618a;
                r.unlock();
                C9783d q2 = C9783d.f14625I;
                if (q2 != null) {
                    return q2;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.BrazeInAppMessageManager");
            } catch (Throwable th) {
                r.unlock();
                throw th;
            }
        }
    }

    /* renamed from: u0.d$a0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9785a0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9785a0 f14637g = new C9785a0();

        C9785a0() {
            super(0);
        }

        public final String invoke() {
            return "Adding previously unregistered in-app message.";
        }
    }

    /* renamed from: u0.d$b */
    /* compiled from: BrazeInAppMessageManager.kt */
    public /* synthetic */ class C9786b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14638a;

        static {
            int[] iArr = new int[InAppMessageOperation.values().length];
            iArr[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            iArr[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            iArr[InAppMessageOperation.DISCARD.ordinal()] = 3;
            f14638a = iArr;
        }
    }

    /* renamed from: u0.d$b0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9787b0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9787b0 f14639g = new C9787b0();

        C9787b0() {
            super(0);
        }

        public final String invoke() {
            return "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.";
        }
    }

    /* renamed from: u0.d$c */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9788c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9788c f14640g = new C9788c();

        C9788c() {
            super(0);
        }

        public final String invoke() {
            return "Creating view wrapper for immersive in-app message.";
        }
    }

    /* renamed from: u0.d$c0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9789c0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9789c0 f14641g = new C9789c0();

        C9789c0() {
            super(0);
        }

        public final String invoke() {
            return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
        }
    }

    /* renamed from: u0.d$d */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9790d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9790d f14642g = new C9790d();

        C9790d() {
            super(0);
        }

        public final String invoke() {
            return "Creating view wrapper for base in-app message.";
        }
    }

    /* renamed from: u0.d$d0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9791d0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9791d0 f14643g = new C9791d0();

        C9791d0() {
            super(0);
        }

        public final String invoke() {
            return "A in-app message is currently being displayed. Ignoring request to display in-app message.";
        }
    }

    /* renamed from: u0.d$e */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9792e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9792e f14644g = new C9792e();

        C9792e() {
            super(0);
        }

        public final String invoke() {
            return "Creating view wrapper for in-app message.";
        }
    }

    /* renamed from: u0.d$e0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9793e0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9793e0 f14645g = new C9793e0();

        C9793e0() {
            super(0);
        }

        public final String invoke() {
            return "The in-app message stack is empty. No in-app message will be displayed.";
        }
    }

    /* renamed from: u0.d$f */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9794f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9794f f14646g = new C9794f();

        C9794f() {
            super(0);
        }

        public final String invoke() {
            return "In-app message view includes HTML. Delaying display until the content has finished loading.";
        }
    }

    /* renamed from: u0.d$f0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9795f0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9795f0 f14647g = new C9795f0();

        C9795f0() {
            super(0);
        }

        public final String invoke() {
            return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.";
        }
    }

    /* renamed from: u0.d$g */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9796g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9796g f14648g = new C9796g();

        C9796g() {
            super(0);
        }

        public final String invoke() {
            return "Page has finished loading. Opening in-app message view wrapper.";
        }
    }

    /* renamed from: u0.d$g0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9797g0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9797g0 f14649g = new C9797g0();

        C9797g0() {
            super(0);
        }

        public final String invoke() {
            return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
        }
    }

    /* renamed from: u0.d$h */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9798h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9798h f14650g = new C9798h();

        C9798h() {
            super(0);
        }

        public final String invoke() {
            return "Failed to open view wrapper in page finished listener";
        }
    }

    /* renamed from: u0.d$h0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9799h0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9799h0 f14651g = new C9799h0();

        C9799h0() {
            super(0);
        }

        public final String invoke() {
            return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.";
        }
    }

    /* renamed from: u0.d$i */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9800i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C7358a f14652g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9800i(C7358a aVar) {
            super(0);
            this.f14652g = aVar;
        }

        public final String invoke() {
            return C12775o.m28647q("Could not display in-app message with payload: ", C8278g.m16456j((JSONObject) this.f14652g.forJsonPut()));
        }
    }

    /* renamed from: u0.d$i0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9801i0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9801i0 f14653g = new C9801i0();

        C9801i0() {
            super(0);
        }

        public final String invoke() {
            return "Error running requestDisplayInAppMessage";
        }
    }

    /* renamed from: u0.d$j */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9802j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C7358a f14654g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9802j(C7358a aVar) {
            super(0);
            this.f14654g = aVar;
        }

        public final String invoke() {
            return C12775o.m28647q("Attempting to display in-app message with payload: ", C8278g.m16456j((JSONObject) this.f14654g.forJsonPut()));
        }
    }

    /* renamed from: u0.d$j0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9803j0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9803j0 f14655g = new C9803j0();

        C9803j0() {
            super(0);
        }

        public final String invoke() {
            return "Using the control in-app message manager listener.";
        }
    }

    /* renamed from: u0.d$k */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9804k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9804k f14656g = new C9804k();

        C9804k() {
            super(0);
        }

        public final String invoke() {
            return "A in-app message is currently being displayed. Adding in-app message back on the stack.";
        }
    }

    /* renamed from: u0.d$k0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9805k0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9805k0 f14657g = new C9805k0();

        C9805k0() {
            super(0);
        }

        public final String invoke() {
            return "Resetting after in-app message close.";
        }
    }

    /* renamed from: u0.d$l */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9806l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9806l f14658g = new C9806l();

        C9806l() {
            super(0);
        }

        public final String invoke() {
            return "Expiration timestamp not defined. Continuing.";
        }
    }

    /* renamed from: u0.d$l0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9807l0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Integer f14659g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9807l0(Integer num) {
            super(0);
            this.f14659g = num;
        }

        public final String invoke() {
            return C12775o.m28647q("Setting requested orientation to original orientation ", this.f14659g);
        }
    }

    /* renamed from: u0.d$m */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9808m extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9808m f14660g = new C9808m();

        C9808m() {
            super(0);
        }

        public final String invoke() {
            return "Not checking expiration status for carry-over in-app message.";
        }
    }

    /* renamed from: u0.d$m0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9809m0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Activity f14661g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9809m0(Activity activity) {
            super(0);
            this.f14661g = activity;
        }

        public final String invoke() {
            Activity activity = this.f14661g;
            return C12775o.m28647q("Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: ", activity == null ? null : activity.getLocalClassName());
        }
    }

    /* renamed from: u0.d$n */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9810n extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9810n f14662g = new C9810n();

        C9810n() {
            super(0);
        }

        public final String invoke() {
            return "Not displaying control in-app message. Logging impression and ending display execution.";
        }
    }

    /* renamed from: u0.d$n0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9811n0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9811n0 f14663g = new C9811n0();

        C9811n0() {
            super(0);
        }

        public final String invoke() {
            return "Null Activity passed to unregisterInAppMessageManager.";
        }
    }

    /* renamed from: u0.d$o */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9812o extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9812o f14664g = new C9812o();

        C9812o() {
            super(0);
        }

        public final String invoke() {
            return "Cannot show message containing an invalid Braze Action.";
        }
    }

    /* renamed from: u0.d$o0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9813o0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Activity f14665g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9813o0(Activity activity) {
            super(0);
            this.f14665g = activity;
        }

        public final String invoke() {
            return C12775o.m28647q("Unregistering InAppMessageManager from activity: ", this.f14665g.getLocalClassName());
        }
    }

    /* renamed from: u0.d$p */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9814p extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9814p f14666g = new C9814p();

        C9814p() {
            super(0);
        }

        public final String invoke() {
            return "Attempting to perform any fallback actions.";
        }
    }

    /* renamed from: u0.d$p0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9815p0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9815p0 f14667g = new C9815p0();

        C9815p0() {
            super(0);
        }

        public final String invoke() {
            return "In-app message view includes HTML. Removing the page finished listener.";
        }
    }

    /* renamed from: u0.d$q */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9816q extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9816q f14668g = new C9816q();

        C9816q() {
            super(0);
        }

        public final String invoke() {
            return "Cannot show message containing a Braze Actions Push Prompt due to existing push prompt status, Android API version, or Target SDK level.";
        }
    }

    /* renamed from: u0.d$q0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9817q0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9817q0 f14669g = new C9817q0();

        C9817q0() {
            super(0);
        }

        public final String invoke() {
            return "Cannot verify orientation status with null Activity.";
        }
    }

    /* renamed from: u0.d$r */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9818r extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9818r f14670g = new C9818r();

        C9818r() {
            super(0);
        }

        public final String invoke() {
            return "Attempting to perform any fallback actions.";
        }
    }

    /* renamed from: u0.d$r0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9819r0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9819r0 f14671g = new C9819r0();

        C9819r0() {
            super(0);
        }

        public final String invoke() {
            return "Running on tablet. In-app message can be displayed in any orientation.";
        }
    }

    /* renamed from: u0.d$s */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9820s extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9820s f14672g = new C9820s();

        C9820s() {
            super(0);
        }

        public final String invoke() {
            return "Removing existing in-app message event subscriber before subscribing a new one.";
        }
    }

    /* renamed from: u0.d$s0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9821s0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9821s0 f14673g = new C9821s0();

        C9821s0() {
            super(0);
        }

        public final String invoke() {
            return "Any orientation specified. In-app message can be displayed in any orientation.";
        }
    }

    /* renamed from: u0.d$t */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9822t extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9822t f14674g = new C9822t();

        C9822t() {
            super(0);
        }

        public final String invoke() {
            return "Subscribing in-app message event subscriber";
        }
    }

    /* renamed from: u0.d$t0 */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9823t0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9823t0 f14675g = new C9823t0();

        C9823t0() {
            super(0);
        }

        public final String invoke() {
            return "Requesting orientation lock.";
        }
    }

    /* renamed from: u0.d$u */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9824u extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9824u f14676g = new C9824u();

        C9824u() {
            super(0);
        }

        public final String invoke() {
            return "Removing existing sdk data wipe event subscriber before subscribing a new one.";
        }
    }

    /* renamed from: u0.d$v */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9825v extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9825v f14677g = new C9825v();

        C9825v() {
            super(0);
        }

        public final String invoke() {
            return "Subscribing sdk data wipe subscriber";
        }
    }

    /* renamed from: u0.d$w */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9826w extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9826w f14678g = new C9826w();

        C9826w() {
            super(0);
        }

        public final String invoke() {
            return "Null Activity passed to registerInAppMessageManager. Doing nothing";
        }
    }

    /* renamed from: u0.d$x */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9827x extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Activity f14679g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9827x(Activity activity) {
            super(0);
            this.f14679g = activity;
        }

        public final String invoke() {
            return C12775o.m28647q("Registering InAppMessageManager with activity: ", this.f14679g.getLocalClassName());
        }
    }

    /* renamed from: u0.d$y */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9828y extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9828y f14680g = new C9828y();

        C9828y() {
            super(0);
        }

        public final String invoke() {
            return "Activity had null applicationContext in registerInAppMessageManager. Doing Nothing.";
        }
    }

    /* renamed from: u0.d$z */
    /* compiled from: BrazeInAppMessageManager.kt */
    static final class C9829z extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9829z f14681g = new C9829z();

        C9829z() {
            super(0);
        }

        public final String invoke() {
            return "Requesting display of carryover in-app message.";
        }
    }

    /* renamed from: A */
    public static final C9783d m20394A() {
        return f14623G.mo44312a();
    }

    /* renamed from: u */
    private final C2811f<C2813h> m20401u() {
        return new C9782c(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m20402v(C9783d dVar, C2813h hVar) {
        C12775o.m28639i(dVar, "this$0");
        C12775o.m28639i(hVar, NotificationCompat.CATEGORY_EVENT);
        C7358a a = hVar.mo28294a();
        dVar.f14635y.put(a, hVar);
        dVar.mo44309t(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m20403x(C9860n nVar, C9783d dVar, Activity activity) {
        C12775o.m28639i(dVar, "this$0");
        if (nVar != null) {
            try {
                C8266c.m16396e(C8266c.f11641a, dVar, (C8266c.C8267a) null, (Throwable) null, false, C9796g.f14648g, 7, (Object) null);
                nVar.mo44338b(activity);
            } catch (Exception e) {
                C9783d dVar2 = dVar;
                C8266c.m16396e(C8266c.f11641a, dVar2, C8266c.C8267a.f11649e, e, false, C9798h.f14650g, 4, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m20404z(C9783d dVar, C2815j jVar) {
        C12775o.m28639i(dVar, "this$0");
        C12775o.m28639i(jVar, "it");
        dVar.f14634x.clear();
        dVar.f14630E = null;
        dVar.f14631F = null;
    }

    /* renamed from: B */
    public void mo44302B(boolean z) {
        mo44385m(false);
        C9860n nVar = this.f14629D;
        if (nVar != null) {
            if (z) {
                this.f14632v.mo45566g(nVar.mo44341d(), nVar.mo44339c());
            }
            nVar.close();
        }
    }

    /* renamed from: C */
    public void mo44303C(Activity activity) {
        C4218b bVar;
        if (activity == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C9826w.f14678g, 6, (Object) null);
            return;
        }
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C9827x(activity), 6, (Object) null);
        this.f14730d = activity;
        if (this.f14731e == null) {
            Context applicationContext = activity.getApplicationContext();
            this.f14731e = applicationContext;
            if (applicationContext == null) {
                C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, C9828y.f14680g, 6, (Object) null);
                return;
            }
        }
        if (this.f14628C == null) {
            Context context = this.f14731e;
            if (context == null) {
                bVar = null;
            } else {
                bVar = new C4218b(context);
            }
            this.f14628C = bVar;
        }
        C7358a aVar = this.f14630E;
        if (aVar != null) {
            if (aVar != null) {
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9829z.f14681g, 7, (Object) null);
                aVar.mo40946K(false);
                mo44310w(aVar, true);
            }
            this.f14630E = null;
        } else {
            C7358a aVar2 = this.f14631F;
            if (aVar2 != null) {
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9785a0.f14637g, 7, (Object) null);
                mo44309t(aVar2);
                mo44306F((C7358a) null);
            }
        }
        Context context2 = this.f14731e;
        if (context2 != null) {
            mo44311y(context2);
        }
    }

    /* renamed from: D */
    public boolean mo44304D() {
        InAppMessageOperation inAppMessageOperation;
        try {
            if (this.f14730d == null) {
                if (!this.f14634x.empty()) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C9787b0.f14639g, 6, (Object) null);
                    this.f14631F = this.f14634x.pop();
                } else {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9789c0.f14641g, 7, (Object) null);
                }
                return false;
            } else if (this.f14633w.get()) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9791d0.f14643g, 7, (Object) null);
                return false;
            } else if (this.f14634x.isEmpty()) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9793e0.f14645g, 7, (Object) null);
                return false;
            } else {
                C7358a pop = this.f14634x.pop();
                if (!pop.isControl()) {
                    C10640f i = mo44381i();
                    C12775o.m28638h(pop, "inAppMessage");
                    inAppMessageOperation = i.mo45559h(pop);
                } else {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9803j0.f14655g, 7, (Object) null);
                    C10640f c = mo44375c();
                    C12775o.m28638h(pop, "inAppMessage");
                    inAppMessageOperation = c.mo45559h(pop);
                }
                int i2 = C9786b.f14638a[inAppMessageOperation.ordinal()];
                if (i2 == 1) {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9795f0.f14647g, 7, (Object) null);
                } else if (i2 == 2) {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9797g0.f14649g, 7, (Object) null);
                    this.f14634x.push(pop);
                    return false;
                } else if (i2 == 3) {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9799h0.f14651g, 7, (Object) null);
                    return false;
                }
                C10735a.m22892g(pop);
                return true;
            }
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C9801i0.f14653g, 4, (Object) null);
            return false;
        }
    }

    /* renamed from: E */
    public void mo44305E() {
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, C9805k0.f14657g, 6, (Object) null);
        this.f14629D = null;
        Activity activity = this.f14730d;
        Integer num = this.f14627B;
        this.f14633w.set(false);
        if (activity != null && num != null) {
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C9807l0(num), 7, (Object) null);
            C2117c.m1472k(activity, num.intValue());
            this.f14627B = null;
        }
    }

    /* renamed from: F */
    public final void mo44306F(C7358a aVar) {
        this.f14631F = aVar;
    }

    /* renamed from: G */
    public void mo44307G(Activity activity) {
        C7358a aVar;
        if (mo44384l()) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C9809m0(activity), 7, (Object) null);
            mo44385m(false);
            return;
        }
        if (activity == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C9811n0.f14663g, 6, (Object) null);
        } else {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C9813o0(activity), 6, (Object) null);
        }
        C9860n nVar = this.f14629D;
        if (nVar != null) {
            View d = nVar.mo44341d();
            if (d instanceof C4343f) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9815p0.f14667g, 7, (Object) null);
                ((C4343f) d).setHtmlPageFinishedListener((C10643i) null);
            }
            C2117c.m1471j(d);
            if (nVar.mo44337a()) {
                this.f14632v.mo45562c(nVar.mo44339c());
                aVar = null;
            } else {
                aVar = nVar.mo44339c();
            }
            this.f14630E = aVar;
            this.f14629D = null;
        } else {
            this.f14630E = null;
        }
        this.f14730d = null;
        this.f14633w.set(false);
    }

    @VisibleForTesting
    /* renamed from: H */
    public boolean mo44308H(C7358a aVar) {
        C12775o.m28639i(aVar, "inAppMessage");
        Activity activity = this.f14730d;
        C2109g orientation = aVar.getOrientation();
        if (activity == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C9817q0.f14669g, 6, (Object) null);
        } else if (C2117c.m1470i(activity)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9819r0.f14671g, 7, (Object) null);
        } else if (orientation == C2109g.ANY) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9821s0.f14673g, 7, (Object) null);
        } else if (!C2117c.m1467f(activity.getResources().getConfiguration().orientation, orientation)) {
            return false;
        } else {
            if (this.f14627B != null) {
                return true;
            }
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9823t0.f14675g, 7, (Object) null);
            this.f14627B = Integer.valueOf(activity.getRequestedOrientation());
            C2117c.m1472k(activity, 14);
            return true;
        }
        return true;
    }

    /* renamed from: t */
    public void mo44309t(C7358a aVar) {
        if (aVar != null) {
            this.f14634x.push(aVar);
            mo44304D();
        }
    }

    /* renamed from: w */
    public void mo44310w(C7358a aVar, boolean z) {
        C7358a aVar2;
        Throwable th;
        View view;
        Activity activity;
        C9860n nVar;
        C9860n nVar2;
        C7358a aVar3 = aVar;
        C12775o.m28639i(aVar3, "inAppMessage");
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C9802j(aVar3), 6, (Object) null);
        if (!this.f14633w.compareAndSet(false, true)) {
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9804k.f14656g, 7, (Object) null);
            this.f14634x.push(aVar3);
            return;
        }
        try {
            Activity activity2 = this.f14730d;
            if (activity2 != null) {
                if (!z) {
                    try {
                        long P = aVar.mo40950P();
                        if (P > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis > P) {
                                throw new Exception("In-app message is expired. Doing nothing. Expiration: " + P + ". Current time: " + currentTimeMillis);
                            }
                        } else {
                            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9806l.f14658g, 7, (Object) null);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar3;
                        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, th, false, new C9800i(aVar2), 4, (Object) null);
                        mo44305E();
                    }
                } else {
                    C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9808m.f14660g, 7, (Object) null);
                }
                if (!mo44308H(aVar)) {
                    C7358a aVar4 = aVar3;
                    throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
                } else if (aVar.isControl()) {
                    C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9810n.f14662g, 7, (Object) null);
                    aVar.logImpression();
                    mo44305E();
                } else if (C8794b.m17809c(aVar)) {
                    C2813h hVar = this.f14635y.get(aVar3);
                    C8266c.C8267a aVar5 = C8266c.C8267a.I;
                    C8266c.m16396e(cVar, this, aVar5, (Throwable) null, false, C9812o.f14664g, 6, (Object) null);
                    if (hVar != null) {
                        C8266c.m16396e(cVar, this, aVar5, (Throwable) null, false, C9814p.f14666g, 6, (Object) null);
                        Context applicationContext = activity2.getApplicationContext();
                        C12775o.m28638h(applicationContext, "activity.applicationContext");
                        C10299e.m21651k(applicationContext, hVar);
                    }
                    mo44305E();
                } else {
                    if (C8794b.m17807a(aVar)) {
                        if (!C8287i.m16474e(activity2)) {
                            C2813h hVar2 = this.f14635y.get(aVar3);
                            C8266c.C8267a aVar6 = C8266c.C8267a.I;
                            C8266c.m16396e(cVar, this, aVar6, (Throwable) null, false, C9816q.f14668g, 6, (Object) null);
                            if (hVar2 != null) {
                                C8266c.m16396e(cVar, this, aVar6, (Throwable) null, false, C9818r.f14670g, 6, (Object) null);
                                Context applicationContext2 = activity2.getApplicationContext();
                                C12775o.m28638h(applicationContext2, "activity.applicationContext");
                                C10299e.m21651k(applicationContext2, hVar2);
                            }
                            mo44305E();
                            return;
                        }
                    }
                    C9859m j = mo44382j(aVar);
                    if (j != null) {
                        View a = j.mo44369a(activity2, aVar3);
                        if (a == null) {
                            aVar3.mo40958b(C2106e.DISPLAY_VIEW_GENERATION);
                            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
                        } else if (a.getParent() == null) {
                            C4218b bVar = this.f14628C;
                            if (bVar != null) {
                                Animation b = mo44380h().mo44368b(aVar3);
                                Animation a2 = mo44380h().mo44367a(aVar3);
                                C9861o k = mo44383k();
                                if (a instanceof C4337b) {
                                    C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9788c.f14640g, 7, (Object) null);
                                    C4337b bVar2 = (C4337b) a;
                                    int size = ((C7399m) aVar3).mo40975R().size();
                                    View view2 = a;
                                    Activity activity3 = activity2;
                                    C7358a aVar7 = aVar3;
                                    try {
                                        nVar = k.mo44370a(a, aVar, this.f14632v, bVar, b, a2, bVar2.getMessageClickableView(), bVar2.getMessageButtonViews(size), bVar2.getMessageCloseButtonView());
                                        C7358a aVar8 = aVar7;
                                        activity = activity3;
                                        view = view2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        aVar2 = aVar7;
                                        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, th, false, new C9800i(aVar2), 4, (Object) null);
                                        mo44305E();
                                    }
                                } else {
                                    C4218b bVar3 = bVar;
                                    View view3 = a;
                                    Activity activity4 = activity2;
                                    C7358a aVar9 = aVar3;
                                    try {
                                        if (view3 instanceof C4338c) {
                                            aVar2 = aVar9;
                                            activity = activity4;
                                            view = view3;
                                            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9790d.f14642g, 7, (Object) null);
                                            nVar2 = k.mo44371b(view, aVar, this.f14632v, bVar3, b, a2, ((C4338c) view).getMessageClickableView());
                                        } else {
                                            C7358a aVar10 = aVar9;
                                            activity = activity4;
                                            view = view3;
                                            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9792e.f14644g, 7, (Object) null);
                                            nVar2 = k.mo44371b(view, aVar, this.f14632v, bVar3, b, a2, view);
                                        }
                                        nVar = nVar2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th;
                                        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, th, false, new C9800i(aVar2), 4, (Object) null);
                                        mo44305E();
                                    }
                                }
                                this.f14629D = nVar;
                                if (view instanceof C4343f) {
                                    C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9794f.f14646g, 7, (Object) null);
                                    ((C4343f) view).setHtmlPageFinishedListener(new C9781b(nVar, this, activity));
                                } else if (nVar != null) {
                                    nVar.mo44338b(activity);
                                }
                            } else {
                                C7358a aVar11 = aVar3;
                                throw new Exception("configurationProvider is null. The in-app message will not be displayed and will not beput back on the stack.");
                            }
                        } else {
                            aVar3.mo40958b(C2106e.DISPLAY_VIEW_GENERATION);
                            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
                        }
                    } else {
                        aVar3.mo40958b(C2106e.DISPLAY_VIEW_GENERATION);
                        throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
                    }
                }
            } else {
                this.f14630E = aVar3;
                throw new Exception("No Activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next Activity registers to receive in-app messages.");
            }
        } catch (Throwable th5) {
            th = th5;
            aVar2 = aVar3;
            th = th;
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, th, false, new C9800i(aVar2), 4, (Object) null);
            mo44305E();
        }
    }

    /* renamed from: y */
    public void mo44311y(Context context) {
        C12775o.m28639i(context, "context");
        if (this.f14636z != null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9820s.f14672g, 7, (Object) null);
            C10156b.f15345m.mo44811g(context).mo44781a(this.f14636z, C2813h.class);
        }
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9822t.f14674g, 7, (Object) null);
        C2811f<C2813h> u = m20401u();
        C10156b.C10157a aVar = C10156b.f15345m;
        aVar.mo44811g(context).mo44762A0(u);
        this.f14636z = u;
        Class<C2815j> cls = C2815j.class;
        if (this.f14626A != null) {
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, C9824u.f14676g, 6, (Object) null);
            aVar.mo44811g(context).mo44781a(this.f14626A, cls);
        }
        C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, C9825v.f14677g, 6, (Object) null);
        C9780a aVar2 = new C9780a(this);
        aVar.mo44811g(context).mo44764H(aVar2, cls);
        this.f14626A = aVar2;
    }
}
