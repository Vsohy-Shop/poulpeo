package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,555:1\n76#2:556\n102#2,2:557\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n120#1:556\n120#1:557,2\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorComponent */
/* compiled from: Vector.kt */
public final class VectorComponent extends VNode {
    private final DrawCache cacheDrawScope = new DrawCache();
    private final Function1<DrawScope, C11921v> drawVectorBlock = new VectorComponent$drawVectorBlock$1(this);
    private final MutableState intrinsicColorFilter$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
    private C13074a<C11921v> invalidateCallback = VectorComponent$invalidateCallback$1.INSTANCE;
    private boolean isDirty = true;
    private long previousDrawSize = Size.Companion.m35499getUnspecifiedNHjbRc();
    private final GroupComponent root;
    private float viewportHeight;
    private float viewportWidth;

    public VectorComponent() {
        super((DefaultConstructorMarker) null);
        GroupComponent groupComponent = new GroupComponent();
        groupComponent.setPivotX(0.0f);
        groupComponent.setPivotY(0.0f);
        groupComponent.setInvalidateListener$ui_release(new VectorComponent$root$1$1(this));
        this.root = groupComponent;
    }

    /* access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    public final void draw(DrawScope drawScope, float f, ColorFilter colorFilter) {
        C12775o.m28639i(drawScope, "<this>");
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui_release();
        }
        if (this.isDirty || !Size.m35487equalsimpl0(this.previousDrawSize, drawScope.m36274getSizeNHjbRc())) {
            this.root.setScaleX(Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc()) / this.viewportWidth);
            this.root.setScaleY(Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc()) / this.viewportHeight);
            this.cacheDrawScope.m36370drawCachedImageCJJARo(IntSizeKt.IntSize((int) ((float) Math.ceil((double) Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc()))), (int) ((float) Math.ceil((double) Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc())))), drawScope, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope.m36274getSizeNHjbRc();
        }
        this.cacheDrawScope.drawInto(drawScope, f, colorFilter);
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    public final C13074a<C11921v> getInvalidateCallback$ui_release() {
        return this.invalidateCallback;
    }

    public final String getName() {
        return this.root.getName();
    }

    public final GroupComponent getRoot() {
        return this.root;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui_release(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "<set-?>");
        this.invalidateCallback = aVar;
    }

    public final void setName(String str) {
        C12775o.m28639i(str, "value");
        this.root.setName(str);
    }

    public final void setViewportHeight(float f) {
        boolean z;
        if (this.viewportHeight == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.viewportHeight = f;
            doInvalidate();
        }
    }

    public final void setViewportWidth(float f) {
        boolean z;
        if (this.viewportWidth == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.viewportWidth = f;
            doInvalidate();
        }
    }

    public String toString() {
        String str = "Params: " + "\tname: " + getName() + "\n" + "\tviewportWidth: " + this.viewportWidth + "\n" + "\tviewportHeight: " + this.viewportHeight + "\n";
        C12775o.m28638h(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public void draw(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "<this>");
        draw(drawScope, 1.0f, (ColorFilter) null);
    }
}
