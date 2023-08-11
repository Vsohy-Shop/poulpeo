package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p002ui.input.key.KeyEventType;
import androidx.compose.p002ui.input.key.KeyEvent_androidKt;
import androidx.compose.p002ui.input.key.Key_androidKt;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nClickable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.android.kt\nandroidx/compose/foundation/Clickable_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,74:1\n76#2:75\n*S KotlinDebug\n*F\n+ 1 Clickable.android.kt\nandroidx/compose/foundation/Clickable_androidKt\n*L\n36#1:75\n*E\n"})
/* compiled from: Clickable.android.kt */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ((long) ViewConfiguration.getTapTimeout());

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* renamed from: isClick-ZmokQxo  reason: not valid java name */
    public static final boolean m32996isClickZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "$this$isClick");
        if (!KeyEventType.m37019equalsimpl0(KeyEvent_androidKt.m37027getTypeZmokQxo(keyEvent), KeyEventType.Companion.m37024getKeyUpCS__XNY()) || !m32997isEnterZmokQxo(keyEvent)) {
            return false;
        }
        return true;
    }

    @Composable
    public static final C13074a<Boolean> isComposeRootInScrollableContainer(Composer composer, int i) {
        composer.startReplaceableGroup(-1990508712);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1990508712, i, -1, "androidx.compose.foundation.isComposeRootInScrollableContainer (Clickable.android.kt:34)");
        }
        Clickable_androidKt$isComposeRootInScrollableContainer$1 clickable_androidKt$isComposeRootInScrollableContainer$1 = new Clickable_androidKt$isComposeRootInScrollableContainer$1((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return clickable_androidKt$isComposeRootInScrollableContainer$1;
    }

    /* renamed from: isEnter-ZmokQxo  reason: not valid java name */
    private static final boolean m32997isEnterZmokQxo(KeyEvent keyEvent) {
        int r2 = Key_androidKt.m37037getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent));
        if (r2 == 23 || r2 == 66 || r2 == 160) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* renamed from: isPress-ZmokQxo  reason: not valid java name */
    public static final boolean m32998isPressZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "$this$isPress");
        if (!KeyEventType.m37019equalsimpl0(KeyEvent_androidKt.m37027getTypeZmokQxo(keyEvent), KeyEventType.Companion.m37023getKeyDownCS__XNY()) || !m32997isEnterZmokQxo(keyEvent)) {
            return false;
        }
        return true;
    }
}
