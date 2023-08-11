package androidx.compose.p002ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidViewsHandler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1855#2,2:99\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n*L\n54#1:99,2\n61#1:101,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidViewsHandler */
/* compiled from: AndroidViewsHandler.android.kt */
public final class AndroidViewsHandler extends ViewGroup {
    private final HashMap<AndroidViewHolder, LayoutNode> holderToLayoutNode = new HashMap<>();
    private final HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewsHandler(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
        setClipChildren(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void drawView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        C12775o.m28639i(androidViewHolder, "view");
        C12775o.m28639i(canvas, "canvas");
        androidViewHolder.draw(canvas);
    }

    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    public Void invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    public void onDescendantInvalidated(View view, View view2) {
        C12775o.m28639i(view, "child");
        C12775o.m28639i(view2, TypedValues.AttributesType.S_TARGET);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Set<AndroidViewHolder> keySet = this.holderToLayoutNode.keySet();
        C12775o.m28638h(keySet, "holderToLayoutNode.keys");
        for (AndroidViewHolder androidViewHolder : keySet) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                z2 = false;
            }
            if (z2) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                Set<AndroidViewHolder> keySet = this.holderToLayoutNode.keySet();
                C12775o.m28638h(keySet, "holderToLayoutNode.keys");
                for (AndroidViewHolder remeasure : keySet) {
                    remeasure.remeasure();
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutNode layoutNode = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, 1, (Object) null);
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
