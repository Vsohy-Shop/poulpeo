package androidx.compose.foundation.layout;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WindowInsets.android.kt */
public final class WindowInsetsHolder {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static boolean testInsets;
    /* access modifiers changed from: private */
    public static final WeakHashMap<View, WindowInsetsHolder> viewMap = new WeakHashMap<>();
    private int accessCount;
    private final AndroidWindowInsets captionBar;
    private final ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;
    private final AndroidWindowInsets displayCutout;
    private final AndroidWindowInsets ime;
    private final ValueInsets imeAnimationSource;
    private final ValueInsets imeAnimationTarget;
    private final InsetsListener insetsListener;
    private final AndroidWindowInsets mandatorySystemGestures;
    private final AndroidWindowInsets navigationBars;
    private final ValueInsets navigationBarsIgnoringVisibility;
    private final WindowInsets safeContent;
    private final WindowInsets safeDrawing;
    private final WindowInsets safeGestures;
    private final AndroidWindowInsets statusBars;
    private final ValueInsets statusBarsIgnoringVisibility;
    private final AndroidWindowInsets systemBars;
    private final ValueInsets systemBarsIgnoringVisibility;
    private final AndroidWindowInsets systemGestures;
    private final AndroidWindowInsets tappableElement;
    private final ValueInsets tappableElementIgnoringVisibility;
    private final ValueInsets waterfall;

    @SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,767:1\n76#2:768\n361#3,7:769\n1#4:776\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n610#1:768\n628#1:769,7\n*E\n"})
    /* compiled from: WindowInsets.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final WindowInsetsHolder getOrCreateFor(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.viewMap) {
                WeakHashMap access$getViewMap$cp = WindowInsetsHolder.viewMap;
                Object obj = access$getViewMap$cp.get(view);
                if (obj == null) {
                    obj = new WindowInsetsHolder((WindowInsetsCompat) null, view, (DefaultConstructorMarker) null);
                    access$getViewMap$cp.put(view, obj);
                }
                windowInsetsHolder = (WindowInsetsHolder) obj;
            }
            return windowInsetsHolder;
        }

        /* access modifiers changed from: private */
        public final AndroidWindowInsets systemInsets(WindowInsetsCompat windowInsetsCompat, int i, String str) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i, str);
            if (windowInsetsCompat != null) {
                androidWindowInsets.update$foundation_layout_release(windowInsetsCompat, i);
            }
            return androidWindowInsets;
        }

        /* access modifiers changed from: private */
        public final ValueInsets valueInsetsIgnoringVisibility(WindowInsetsCompat windowInsetsCompat, int i, String str) {
            Insets insets;
            if (windowInsetsCompat == null || (insets = windowInsetsCompat.getInsetsIgnoringVisibility(i)) == null) {
                insets = Insets.NONE;
            }
            C12775o.m28638h(insets, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return WindowInsets_androidKt.ValueInsets(insets, str);
        }

        @Composable
        public final WindowInsetsHolder current(Composer composer, int i) {
            composer.startReplaceableGroup(-1366542614);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:608)");
            }
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            EffectsKt.DisposableEffect((Object) orCreateFor, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new WindowInsetsHolder$Companion$current$1(orCreateFor, view), composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return orCreateFor;
        }

        public final void setUseTestInsets(boolean z) {
            WindowInsetsHolder.testInsets = z;
        }
    }

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsetsCompat, view);
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i);
    }

    public final void decrementAccessors(View view) {
        C12775o.m28639i(view, "view");
        int i = this.accessCount - 1;
        this.accessCount = i;
        if (i == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, (OnApplyWindowInsetsListener) null);
            ViewCompat.setWindowInsetsAnimationCallback(view, (WindowInsetsAnimationCompat.Callback) null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    public final ValueInsets getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    public final ValueInsets getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }

    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    public final AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final void incrementAccessors(View view) {
        C12775o.m28639i(view, "view");
        if (this.accessCount == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            ViewCompat.setWindowInsetsAnimationCallback(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void update(WindowInsetsCompat windowInsetsCompat, int i) {
        C12775o.m28639i(windowInsetsCompat, "windowInsets");
        if (testInsets) {
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            C12775o.m28636f(windowInsets);
            windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        }
        C12775o.m28638h(windowInsetsCompat, "if (testInsets) {\n      …   windowInsets\n        }");
        this.captionBar.update$foundation_layout_release(windowInsetsCompat, i);
        this.ime.update$foundation_layout_release(windowInsetsCompat, i);
        this.displayCutout.update$foundation_layout_release(windowInsetsCompat, i);
        this.navigationBars.update$foundation_layout_release(windowInsetsCompat, i);
        this.statusBars.update$foundation_layout_release(windowInsetsCompat, i);
        this.systemBars.update$foundation_layout_release(windowInsetsCompat, i);
        this.systemGestures.update$foundation_layout_release(windowInsetsCompat, i);
        this.tappableElement.update$foundation_layout_release(windowInsetsCompat, i);
        this.mandatorySystemGestures.update$foundation_layout_release(windowInsetsCompat, i);
        if (i == 0) {
            ValueInsets valueInsets = this.captionBarIgnoringVisibility;
            Insets insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.captionBar());
            C12775o.m28638h(insetsIgnoringVisibility, "insets.getInsetsIgnoring…aptionBar()\n            )");
            valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility));
            ValueInsets valueInsets2 = this.navigationBarsIgnoringVisibility;
            Insets insetsIgnoringVisibility2 = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars());
            C12775o.m28638h(insetsIgnoringVisibility2, "insets.getInsetsIgnoring…ationBars()\n            )");
            valueInsets2.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility2));
            ValueInsets valueInsets3 = this.statusBarsIgnoringVisibility;
            Insets insetsIgnoringVisibility3 = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.statusBars());
            C12775o.m28638h(insetsIgnoringVisibility3, "insets.getInsetsIgnoring…tatusBars()\n            )");
            valueInsets3.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility3));
            ValueInsets valueInsets4 = this.systemBarsIgnoringVisibility;
            Insets insetsIgnoringVisibility4 = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
            C12775o.m28638h(insetsIgnoringVisibility4, "insets.getInsetsIgnoring…ystemBars()\n            )");
            valueInsets4.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility4));
            ValueInsets valueInsets5 = this.tappableElementIgnoringVisibility;
            Insets insetsIgnoringVisibility5 = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement());
            C12775o.m28638h(insetsIgnoringVisibility5, "insets.getInsetsIgnoring…leElement()\n            )");
            valueInsets5.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility5));
            DisplayCutoutCompat displayCutout2 = windowInsetsCompat.getDisplayCutout();
            if (displayCutout2 != null) {
                Insets waterfallInsets = displayCutout2.getWaterfallInsets();
                C12775o.m28638h(waterfallInsets, "cutout.waterfallInsets");
                this.waterfall.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(waterfallInsets));
            }
        }
        Snapshot.Companion.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(WindowInsetsCompat windowInsetsCompat) {
        C12775o.m28639i(windowInsetsCompat, "windowInsets");
        ValueInsets valueInsets = this.imeAnimationSource;
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        C12775o.m28638h(insets, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets));
    }

    public final void updateImeAnimationTarget(WindowInsetsCompat windowInsetsCompat) {
        C12775o.m28639i(windowInsetsCompat, "windowInsets");
        ValueInsets valueInsets = this.imeAnimationTarget;
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        C12775o.m28638h(insets, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0079, code lost:
        r7 = (r7 = r10.getDisplayCutout()).getWaterfallInsets();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private WindowInsetsHolder(androidx.core.view.WindowInsetsCompat r10, android.view.View r11) {
        /*
            r9 = this;
            r9.<init>()
            androidx.compose.foundation.layout.WindowInsetsHolder$Companion r0 = Companion
            int r1 = androidx.core.view.WindowInsetsCompat.Type.captionBar()
            java.lang.String r2 = "captionBar"
            androidx.compose.foundation.layout.AndroidWindowInsets r1 = r0.systemInsets(r10, r1, r2)
            r9.captionBar = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.displayCutout()
            java.lang.String r2 = "displayCutout"
            androidx.compose.foundation.layout.AndroidWindowInsets r1 = r0.systemInsets(r10, r1, r2)
            r9.displayCutout = r1
            int r2 = androidx.core.view.WindowInsetsCompat.Type.ime()
            java.lang.String r3 = "ime"
            androidx.compose.foundation.layout.AndroidWindowInsets r2 = r0.systemInsets(r10, r2, r3)
            r9.ime = r2
            int r3 = androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures()
            java.lang.String r4 = "mandatorySystemGestures"
            androidx.compose.foundation.layout.AndroidWindowInsets r3 = r0.systemInsets(r10, r3, r4)
            r9.mandatorySystemGestures = r3
            int r4 = androidx.core.view.WindowInsetsCompat.Type.navigationBars()
            java.lang.String r5 = "navigationBars"
            androidx.compose.foundation.layout.AndroidWindowInsets r4 = r0.systemInsets(r10, r4, r5)
            r9.navigationBars = r4
            int r4 = androidx.core.view.WindowInsetsCompat.Type.statusBars()
            java.lang.String r5 = "statusBars"
            androidx.compose.foundation.layout.AndroidWindowInsets r4 = r0.systemInsets(r10, r4, r5)
            r9.statusBars = r4
            int r4 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            java.lang.String r5 = "systemBars"
            androidx.compose.foundation.layout.AndroidWindowInsets r4 = r0.systemInsets(r10, r4, r5)
            r9.systemBars = r4
            int r5 = androidx.core.view.WindowInsetsCompat.Type.systemGestures()
            java.lang.String r6 = "systemGestures"
            androidx.compose.foundation.layout.AndroidWindowInsets r5 = r0.systemInsets(r10, r5, r6)
            r9.systemGestures = r5
            int r6 = androidx.core.view.WindowInsetsCompat.Type.tappableElement()
            java.lang.String r7 = "tappableElement"
            androidx.compose.foundation.layout.AndroidWindowInsets r6 = r0.systemInsets(r10, r6, r7)
            r9.tappableElement = r6
            if (r10 == 0) goto L_0x007f
            androidx.core.view.DisplayCutoutCompat r7 = r10.getDisplayCutout()
            if (r7 == 0) goto L_0x007f
            androidx.core.graphics.Insets r7 = r7.getWaterfallInsets()
            if (r7 != 0) goto L_0x0081
        L_0x007f:
            androidx.core.graphics.Insets r7 = androidx.core.graphics.Insets.NONE
        L_0x0081:
            java.lang.String r8 = "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE"
            kotlin.jvm.internal.C12775o.m28638h(r7, r8)
            java.lang.String r8 = "waterfall"
            androidx.compose.foundation.layout.ValueInsets r7 = androidx.compose.foundation.layout.WindowInsets_androidKt.ValueInsets(r7, r8)
            r9.waterfall = r7
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsetsKt.union(r4, r2)
            androidx.compose.foundation.layout.WindowInsets r1 = androidx.compose.foundation.layout.WindowInsetsKt.union(r2, r1)
            r9.safeDrawing = r1
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsetsKt.union(r6, r3)
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsetsKt.union(r2, r5)
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsetsKt.union(r2, r7)
            r9.safeGestures = r2
            androidx.compose.foundation.layout.WindowInsets r1 = androidx.compose.foundation.layout.WindowInsetsKt.union(r1, r2)
            r9.safeContent = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.captionBar()
            java.lang.String r2 = "captionBarIgnoringVisibility"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.valueInsetsIgnoringVisibility(r10, r1, r2)
            r9.captionBarIgnoringVisibility = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.navigationBars()
            java.lang.String r2 = "navigationBarsIgnoringVisibility"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.valueInsetsIgnoringVisibility(r10, r1, r2)
            r9.navigationBarsIgnoringVisibility = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.statusBars()
            java.lang.String r2 = "statusBarsIgnoringVisibility"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.valueInsetsIgnoringVisibility(r10, r1, r2)
            r9.statusBarsIgnoringVisibility = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            java.lang.String r2 = "systemBarsIgnoringVisibility"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.valueInsetsIgnoringVisibility(r10, r1, r2)
            r9.systemBarsIgnoringVisibility = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.tappableElement()
            java.lang.String r2 = "tappableElementIgnoringVisibility"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.valueInsetsIgnoringVisibility(r10, r1, r2)
            r9.tappableElementIgnoringVisibility = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.ime()
            java.lang.String r2 = "imeAnimationTarget"
            androidx.compose.foundation.layout.ValueInsets r1 = r0.valueInsetsIgnoringVisibility(r10, r1, r2)
            r9.imeAnimationTarget = r1
            int r1 = androidx.core.view.WindowInsetsCompat.Type.ime()
            java.lang.String r2 = "imeAnimationSource"
            androidx.compose.foundation.layout.ValueInsets r10 = r0.valueInsetsIgnoringVisibility(r10, r1, r2)
            r9.imeAnimationSource = r10
            android.view.ViewParent r10 = r11.getParent()
            boolean r11 = r10 instanceof android.view.View
            r0 = 0
            if (r11 == 0) goto L_0x010c
            android.view.View r10 = (android.view.View) r10
            goto L_0x010d
        L_0x010c:
            r10 = r0
        L_0x010d:
            if (r10 == 0) goto L_0x0116
            int r11 = androidx.compose.p002ui.C0954R.C0956id.consume_window_insets_tag
            java.lang.Object r10 = r10.getTag(r11)
            goto L_0x0117
        L_0x0116:
            r10 = r0
        L_0x0117:
            boolean r11 = r10 instanceof java.lang.Boolean
            if (r11 == 0) goto L_0x011e
            r0 = r10
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x011e:
            if (r0 == 0) goto L_0x0125
            boolean r10 = r0.booleanValue()
            goto L_0x0126
        L_0x0125:
            r10 = 1
        L_0x0126:
            r9.consumes = r10
            androidx.compose.foundation.layout.InsetsListener r10 = new androidx.compose.foundation.layout.InsetsListener
            r10.<init>(r9)
            r9.insetsListener = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsHolder.<init>(androidx.core.view.WindowInsetsCompat, android.view.View):void");
    }
}
