package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,350:1\n135#2:351\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n73#1:351\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt */
/* compiled from: PointerInteropFilter.android.kt */
public final class PointerInteropFilter_androidKt {
    @ExperimentalComposeUiApi
    public static final Modifier motionEventSpy(Modifier modifier, Function1<? super MotionEvent, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "watcher");
        return SuspendingPointerInputFilterKt.pointerInput(modifier, (Object) function1, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new PointerInteropFilter_androidKt$motionEventSpy$1(function1, (C12074d<? super PointerInteropFilter_androidKt$motionEventSpy$1>) null));
    }

    @ExperimentalComposeUiApi
    public static final Modifier pointerInteropFilter(Modifier modifier, AndroidViewHolder androidViewHolder) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(androidViewHolder, "view");
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder));
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    public static /* synthetic */ Modifier pointerInteropFilter$default(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, function1);
    }

    @ExperimentalComposeUiApi
    public static final Modifier pointerInteropFilter(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, Function1<? super MotionEvent, Boolean> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onTouchEvent");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new C1037xeacf5c03(requestDisallowInterceptTouchEvent, function1) : InspectableValueKt.getNoInspectorInfo(), new PointerInteropFilter_androidKt$pointerInteropFilter$2(function1, requestDisallowInterceptTouchEvent));
    }
}
