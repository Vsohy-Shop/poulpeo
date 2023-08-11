package androidx.compose.p002ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p002ui.C0954R;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.MotionDurationScale;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.core.p004os.HandlerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p308ag.C10894d;
import p308ag.C10898g;
import p314bg.C10958d0;
import p314bg.C10971h;
import p314bg.C10972h0;
import p355hf.C12074d;
import p355hf.C12075e;
import p355hf.C12079g;
import p355hf.C12085h;
import p466yf.C13995l0;
import p466yf.C13999m0;

@SourceDebugExtension({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n34#2:427\n361#3,7:428\n1#4:435\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n*L\n98#1:427\n99#1:428,7\n*E\n"})
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt */
/* compiled from: WindowRecomposer.android.kt */
public final class WindowRecomposer_androidKt {
    private static final Map<Context, C10972h0<Float>> animationScale = new LinkedHashMap();

    @ExperimentalComposeUiApi
    public static final Recomposer createLifecycleAwareWindowRecomposer(View view, C12079g gVar, Lifecycle lifecycle) {
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        C12079g gVar2;
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(gVar, "coroutineContext");
        if (gVar.get(C12075e.f18913W) == null || gVar.get(MonotonicFrameClock.Key) == null) {
            gVar = AndroidUiDispatcher.Companion.getCurrentThread().plus(gVar);
        }
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) gVar.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock2.pause();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T t = (MotionDurationScale) gVar.get(MotionDurationScale.Key);
        if (t == null) {
            t = new MotionDurationScaleImpl();
            ref$ObjectRef.f20403b = t;
        }
        if (pausableMonotonicFrameClock != null) {
            gVar2 = pausableMonotonicFrameClock;
        } else {
            gVar2 = C12085h.f18916b;
        }
        C12079g plus = gVar.plus(gVar2).plus(t);
        Recomposer recomposer = new Recomposer(plus);
        C13995l0 a = C13999m0.m32447a(plus);
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            if (lifecycleOwner != null) {
                lifecycle = lifecycleOwner.getLifecycle();
            } else {
                lifecycle = null;
            }
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new C1106xff837ba8(view, recomposer));
            lifecycle.addObserver(new C1107xff837ba9(a, pausableMonotonicFrameClock, recomposer, ref$ObjectRef, view));
            return recomposer;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ Recomposer createLifecycleAwareWindowRecomposer$default(View view, C12079g gVar, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C12085h.f18916b;
        }
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        return createLifecycleAwareWindowRecomposer(view, gVar, lifecycle);
    }

    public static final CompositionContext findViewTreeCompositionContext(View view) {
        C12775o.m28639i(view, "<this>");
        CompositionContext compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        ViewParent parent = view.getParent();
        while (compositionContext == null && (parent instanceof View)) {
            compositionContext = getCompositionContext((View) parent);
            parent = parent.getParent();
        }
        return compositionContext;
    }

    /* access modifiers changed from: private */
    public static final C10972h0<Float> getAnimationScaleFlowFor(Context context) {
        C10972h0<Float> h0Var;
        Map<Context, C10972h0<Float>> map = animationScale;
        synchronized (map) {
            C10972h0<Float> h0Var2 = map.get(context);
            if (h0Var2 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                C10894d b = C10898g.m23419b(-1, (C10886a) null, (Function1) null, 6, (Object) null);
                h0Var2 = C10971h.m23613t(C10971h.m23608o(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new C1111x23580bd9(b, HandlerCompat.createAsync(Looper.getMainLooper())), b, context, (C12074d<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1>) null)), C13999m0.m32448b(), C10958d0.C10959a.m23582b(C10958d0.f16915a, 0, 0, 3, (Object) null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, h0Var2);
            }
            h0Var = h0Var2;
        }
        return h0Var;
    }

    public static final CompositionContext getCompositionContext(View view) {
        C12775o.m28639i(view, "<this>");
        Object tag = view.getTag(C0954R.C0956id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }

    private static final View getContentChild(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            View view3 = view2;
            parent = view2.getParent();
            view = view3;
        }
        return view;
    }

    public static final Recomposer getWindowRecomposer(View view) {
        C12775o.m28639i(view, "<this>");
        if (view.isAttachedToWindow()) {
            View contentChild = getContentChild(view);
            CompositionContext compositionContext = getCompositionContext(contentChild);
            if (compositionContext == null) {
                return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(contentChild);
            }
            if (compositionContext instanceof Recomposer) {
                return (Recomposer) compositionContext;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    public static final void setCompositionContext(View view, CompositionContext compositionContext) {
        C12775o.m28639i(view, "<this>");
        view.setTag(C0954R.C0956id.androidx_compose_ui_view_composition_context, compositionContext);
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }
}
