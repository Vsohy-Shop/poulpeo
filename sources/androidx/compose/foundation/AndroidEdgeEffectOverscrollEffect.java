package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.input.pointer.PointerId;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p002ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,589:1\n33#2,6:590\n101#2,2:597\n33#2,6:599\n103#2:605\n33#2,6:607\n135#3:596\n245#4:606\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n123#1:590,6\n266#1:597,2\n266#1:599,6\n266#1:605\n445#1:607,6\n341#1:596\n351#1:606\n*E\n"})
/* compiled from: AndroidOverscroll.kt */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    private final List<EdgeEffect> allEffects;
    /* access modifiers changed from: private */
    public final EdgeEffect bottomEffect;
    /* access modifiers changed from: private */
    public final EdgeEffect bottomEffectNegation;
    /* access modifiers changed from: private */
    public long containerSize;
    private final Modifier effectModifier;
    private boolean invalidationEnabled;
    /* access modifiers changed from: private */
    public final EdgeEffect leftEffect;
    /* access modifiers changed from: private */
    public final EdgeEffect leftEffectNegation;
    private final Function1<IntSize, C11921v> onNewSize;
    private final OverscrollConfiguration overscrollConfig;
    /* access modifiers changed from: private */
    public PointerId pointerId;
    /* access modifiers changed from: private */
    public Offset pointerPosition;
    private final MutableState<C11921v> redrawSignal;
    /* access modifiers changed from: private */
    public final EdgeEffect rightEffect;
    /* access modifiers changed from: private */
    public final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;
    /* access modifiers changed from: private */
    public final EdgeEffect topEffect;
    /* access modifiers changed from: private */
    public final EdgeEffect topEffectNegation;

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfiguration) {
        Function1 function1;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(overscrollConfiguration, "overscrollConfig");
        this.overscrollConfig = overscrollConfiguration;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect create = edgeEffectCompat.create(context, (AttributeSet) null);
        this.topEffect = create;
        EdgeEffect create2 = edgeEffectCompat.create(context, (AttributeSet) null);
        this.bottomEffect = create2;
        EdgeEffect create3 = edgeEffectCompat.create(context, (AttributeSet) null);
        this.leftEffect = create3;
        EdgeEffect create4 = edgeEffectCompat.create(context, (AttributeSet) null);
        this.rightEffect = create4;
        List<EdgeEffect> n = C12726w.m28527n(create3, create, create4, create2);
        this.allEffects = n;
        this.topEffectNegation = edgeEffectCompat.create(context, (AttributeSet) null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, (AttributeSet) null);
        this.leftEffectNegation = edgeEffectCompat.create(context, (AttributeSet) null);
        this.rightEffectNegation = edgeEffectCompat.create(context, (AttributeSet) null);
        int size = n.size();
        for (int i = 0; i < size; i++) {
            n.get(i).setColor(ColorKt.m35725toArgb8_81llA(this.overscrollConfig.m33025getGlowColor0d7_KjU()));
        }
        C11921v vVar = C11921v.f18618a;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(vVar, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.Companion.m35500getZeroNHjbRc();
        AndroidEdgeEffectOverscrollEffect$onNewSize$1 androidEdgeEffectOverscrollEffect$onNewSize$1 = new AndroidEdgeEffectOverscrollEffect$onNewSize$1(this);
        this.onNewSize = androidEdgeEffectOverscrollEffect$onNewSize$1;
        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion.then(AndroidOverscrollKt.StretchOverscrollNonClippingLayer), (Object) vVar, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, (C12074d<? super AndroidEdgeEffectOverscrollEffect$effectModifier$1>) null)), androidEdgeEffectOverscrollEffect$onNewSize$1);
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0345x9a0aa7c(this);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        this.effectModifier = onSizeChanged.then(new DrawOverscrollModifier(this, function1));
    }

    /* access modifiers changed from: private */
    public final void animateToRelease() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            if (edgeEffect.isFinished() || z) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m35491getWidthimpl(this.containerSize), (-Size.m35488getHeightimpl(this.containerSize)) + drawScope.m38449toPx0680j_4(this.overscrollConfig.getDrawPadding().m33278calculateBottomPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m35488getHeightimpl(this.containerSize), drawScope.m38449toPx0680j_4(this.overscrollConfig.getDrawPadding().m33279calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int c = C13265c.m30134c(Size.m35491getWidthimpl(this.containerSize));
        float r2 = this.overscrollConfig.getDrawPadding().m33280calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-((float) c)) + drawScope.m38449toPx0680j_4(r2));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.m38449toPx0680j_4(this.overscrollConfig.getDrawPadding().m33281calculateTopPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(C11921v.f18618a);
        }
    }

    /* renamed from: pullBottom-0a9Yr6o  reason: not valid java name */
    private final float m32946pullBottom0a9Yr6o(long j, long j2) {
        float r8 = Offset.m35422getXimpl(j2) / Size.m35491getWidthimpl(this.containerSize);
        float r9 = Offset.m35423getYimpl(j) / Size.m35488getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        boolean z = true;
        float r82 = (-edgeEffectCompat.onPullDistanceCompat(this.bottomEffect, -r9, ((float) 1) - r8)) * Size.m35488getHeightimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) != 0.0f) {
            z = false;
        }
        if (!z) {
            return Offset.m35423getYimpl(j);
        }
        return r82;
    }

    /* renamed from: pullLeft-0a9Yr6o  reason: not valid java name */
    private final float m32947pullLeft0a9Yr6o(long j, long j2) {
        float r8 = Offset.m35423getYimpl(j2) / Size.m35488getHeightimpl(this.containerSize);
        float r9 = Offset.m35422getXimpl(j) / Size.m35491getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        boolean z = true;
        float onPullDistanceCompat = edgeEffectCompat.onPullDistanceCompat(this.leftEffect, r9, ((float) 1) - r8) * Size.m35491getWidthimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) != 0.0f) {
            z = false;
        }
        if (!z) {
            return Offset.m35422getXimpl(j);
        }
        return onPullDistanceCompat;
    }

    /* renamed from: pullRight-0a9Yr6o  reason: not valid java name */
    private final float m32948pullRight0a9Yr6o(long j, long j2) {
        boolean z;
        float r6 = Offset.m35423getYimpl(j2) / Size.m35488getHeightimpl(this.containerSize);
        float r7 = Offset.m35422getXimpl(j) / Size.m35491getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float r62 = (-edgeEffectCompat.onPullDistanceCompat(this.rightEffect, -r7, r6)) * Size.m35491getWidthimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return Offset.m35422getXimpl(j);
        }
        return r62;
    }

    /* renamed from: pullTop-0a9Yr6o  reason: not valid java name */
    private final float m32949pullTop0a9Yr6o(long j, long j2) {
        boolean z;
        float r6 = Offset.m35422getXimpl(j2) / Size.m35491getWidthimpl(this.containerSize);
        float r7 = Offset.m35423getYimpl(j) / Size.m35488getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float onPullDistanceCompat = edgeEffectCompat.onPullDistanceCompat(this.topEffect, r7, r6) * Size.m35488getHeightimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return Offset.m35423getYimpl(j);
        }
        return onPullDistanceCompat;
    }

    /* renamed from: releaseOppositeOverscroll-k-4lQ0M  reason: not valid java name */
    private final boolean m32950releaseOppositeOverscrollk4lQ0M(long j) {
        boolean z;
        boolean z2 = false;
        if (this.leftEffect.isFinished() || Offset.m35422getXimpl(j) >= 0.0f) {
            z = false;
        } else {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.leftEffect, Offset.m35422getXimpl(j));
            z = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && Offset.m35422getXimpl(j) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.rightEffect, Offset.m35422getXimpl(j));
            if (z || this.rightEffect.isFinished()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!this.topEffect.isFinished() && Offset.m35423getYimpl(j) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.topEffect, Offset.m35423getYimpl(j));
            if (z || this.topEffect.isFinished()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (this.bottomEffect.isFinished() || Offset.m35423getYimpl(j) <= 0.0f) {
            return z;
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.bottomEffect, Offset.m35423getYimpl(j));
        if (z || this.bottomEffect.isFinished()) {
            z2 = true;
        }
        return z2;
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long r0 = SizeKt.m35501getCenteruvyYCjk(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        boolean z5 = false;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m32947pullLeft0a9Yr6o(Offset.Companion.m35438getZeroF1C5BW0(), r0);
            z2 = true;
        } else {
            z2 = false;
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            m32948pullRight0a9Yr6o(Offset.Companion.m35438getZeroF1C5BW0(), r0);
            z2 = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            m32949pullTop0a9Yr6o(Offset.Companion.m35438getZeroF1C5BW0(), r0);
            z2 = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            z5 = true;
        }
        if (z5) {
            return z2;
        }
        m32946pullBottom0a9Yr6o(Offset.Companion.m35438getZeroF1C5BW0(), r0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0132 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: applyToFling-BMRW4eQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m32951applyToFlingBMRW4eQ(long r12, p404of.C13088o<? super androidx.compose.p002ui.unit.Velocity, ? super p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity>, ? extends java.lang.Object> r14, p355hf.C12074d<? super p336ef.C11921v> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1 r0 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1 r0 = new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r5) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            long r12 = r0.J$0
            java.lang.Object r14 = r0.L$0
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r14 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r14
            p336ef.C11910n.m25701b(r15)
            goto L_0x0134
        L_0x0035:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003d:
            p336ef.C11910n.m25701b(r15)
            goto L_0x0059
        L_0x0041:
            p336ef.C11910n.m25701b(r15)
            long r7 = r11.containerSize
            boolean r15 = androidx.compose.p002ui.geometry.Size.m35493isEmptyimpl(r7)
            if (r15 == 0) goto L_0x005c
            androidx.compose.ui.unit.Velocity r12 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r12)
            r0.label = r5
            java.lang.Object r12 = r14.invoke(r12, r0)
            if (r12 != r1) goto L_0x0059
            return r1
        L_0x0059:
            ef.v r12 = p336ef.C11921v.f18618a
            return r12
        L_0x005c:
            float r15 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x0087
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r2 = r11.leftEffect
            float r2 = r15.getDistanceCompat(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0072
            r2 = r5
            goto L_0x0073
        L_0x0072:
            r2 = r4
        L_0x0073:
            if (r2 != 0) goto L_0x0087
            android.widget.EdgeEffect r2 = r11.leftEffect
            float r7 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r12)
            int r7 = p418qf.C13265c.m30134c(r7)
            r15.onAbsorbCompat(r2, r7)
            float r15 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r12)
            goto L_0x00b4
        L_0x0087:
            float r15 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x00b3
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r2 = r11.rightEffect
            float r2 = r15.getDistanceCompat(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x009d
            r2 = r5
            goto L_0x009e
        L_0x009d:
            r2 = r4
        L_0x009e:
            if (r2 != 0) goto L_0x00b3
            android.widget.EdgeEffect r2 = r11.rightEffect
            float r7 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r12)
            int r7 = p418qf.C13265c.m30134c(r7)
            int r7 = -r7
            r15.onAbsorbCompat(r2, r7)
            float r15 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r12)
            goto L_0x00b4
        L_0x00b3:
            r15 = r6
        L_0x00b4:
            float r2 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r12)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x00df
            androidx.compose.foundation.EdgeEffectCompat r2 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r7 = r11.topEffect
            float r7 = r2.getDistanceCompat(r7)
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 != 0) goto L_0x00ca
            r7 = r5
            goto L_0x00cb
        L_0x00ca:
            r7 = r4
        L_0x00cb:
            if (r7 != 0) goto L_0x00df
            android.widget.EdgeEffect r5 = r11.topEffect
            float r7 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r12)
            int r7 = p418qf.C13265c.m30134c(r7)
            r2.onAbsorbCompat(r5, r7)
            float r2 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r12)
            goto L_0x010b
        L_0x00df:
            float r2 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r12)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x010a
            androidx.compose.foundation.EdgeEffectCompat r2 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r7 = r11.bottomEffect
            float r7 = r2.getDistanceCompat(r7)
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 != 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r5 = r4
        L_0x00f5:
            if (r5 != 0) goto L_0x010a
            android.widget.EdgeEffect r5 = r11.bottomEffect
            float r7 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r12)
            int r7 = p418qf.C13265c.m30134c(r7)
            int r7 = -r7
            r2.onAbsorbCompat(r5, r7)
            float r2 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r12)
            goto L_0x010b
        L_0x010a:
            r2 = r6
        L_0x010b:
            long r7 = androidx.compose.p002ui.unit.VelocityKt.Velocity(r15, r2)
            androidx.compose.ui.unit.Velocity$Companion r15 = androidx.compose.p002ui.unit.Velocity.Companion
            long r9 = r15.m38704getZero9UxMQ8M()
            boolean r15 = androidx.compose.p002ui.unit.Velocity.m38692equalsimpl0(r7, r9)
            if (r15 != 0) goto L_0x011e
            r11.invalidateOverscroll()
        L_0x011e:
            long r12 = androidx.compose.p002ui.unit.Velocity.m38696minusAH228Gc(r12, r7)
            androidx.compose.ui.unit.Velocity r15 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r12)
            r0.L$0 = r11
            r0.J$0 = r12
            r0.label = r3
            java.lang.Object r15 = r14.invoke(r15, r0)
            if (r15 != r1) goto L_0x0133
            return r1
        L_0x0133:
            r14 = r11
        L_0x0134:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.p002ui.unit.Velocity) r15
            long r0 = r15.m38702unboximpl()
            long r12 = androidx.compose.p002ui.unit.Velocity.m38696minusAH228Gc(r12, r0)
            r14.scrollCycleInProgress = r4
            float r15 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x0158
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r0 = r14.leftEffect
            float r1 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r12)
            int r1 = p418qf.C13265c.m30134c(r1)
            r15.onAbsorbCompat(r0, r1)
            goto L_0x0170
        L_0x0158:
            float r15 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x0170
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r0 = r14.rightEffect
            float r1 = androidx.compose.p002ui.unit.Velocity.m38693getXimpl(r12)
            int r1 = p418qf.C13265c.m30134c(r1)
            int r1 = -r1
            r15.onAbsorbCompat(r0, r1)
        L_0x0170:
            float r15 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x0188
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r0 = r14.topEffect
            float r1 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r12)
            int r1 = p418qf.C13265c.m30134c(r1)
            r15.onAbsorbCompat(r0, r1)
            goto L_0x01a0
        L_0x0188:
            float r15 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x01a0
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r0 = r14.bottomEffect
            float r1 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r12)
            int r1 = p418qf.C13265c.m30134c(r1)
            int r1 = -r1
            r15.onAbsorbCompat(r0, r1)
        L_0x01a0:
            androidx.compose.ui.unit.Velocity$Companion r15 = androidx.compose.p002ui.unit.Velocity.Companion
            long r0 = r15.m38704getZero9UxMQ8M()
            boolean r12 = androidx.compose.p002ui.unit.Velocity.m38692equalsimpl0(r12, r0)
            if (r12 != 0) goto L_0x01af
            r14.invalidateOverscroll()
        L_0x01af:
            r14.animateToRelease()
            ef.v r12 = p336ef.C11921v.f18618a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.m32951applyToFlingBMRW4eQ(long, of.o, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0180  */
    /* renamed from: applyToScroll-Rhakbz0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m32952applyToScrollRhakbz0(long r18, int r20, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.geometry.Offset, androidx.compose.p002ui.geometry.Offset> r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r21
            java.lang.String r4 = "performScroll"
            kotlin.jvm.internal.C12775o.m28639i(r3, r4)
            long r4 = r0.containerSize
            boolean r4 = androidx.compose.p002ui.geometry.Size.m35493isEmptyimpl(r4)
            if (r4 == 0) goto L_0x0022
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r18)
            java.lang.Object r1 = r3.invoke(r1)
            androidx.compose.ui.geometry.Offset r1 = (androidx.compose.p002ui.geometry.Offset) r1
            long r1 = r1.m35432unboximpl()
            return r1
        L_0x0022:
            boolean r4 = r0.scrollCycleInProgress
            r5 = 1
            if (r4 != 0) goto L_0x002c
            r17.stopOverscrollAnimation()
            r0.scrollCycleInProgress = r5
        L_0x002c:
            androidx.compose.ui.geometry.Offset r4 = r0.pointerPosition
            if (r4 == 0) goto L_0x0035
            long r6 = r4.m35432unboximpl()
            goto L_0x003b
        L_0x0035:
            long r6 = r0.containerSize
            long r6 = androidx.compose.p002ui.geometry.SizeKt.m35501getCenteruvyYCjk(r6)
        L_0x003b:
            float r4 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r18)
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            r9 = 0
            if (r4 != 0) goto L_0x0047
            r4 = r5
            goto L_0x0048
        L_0x0047:
            r4 = r9
        L_0x0048:
            if (r4 == 0) goto L_0x004c
        L_0x004a:
            r10 = r8
            goto L_0x009d
        L_0x004c:
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r10 = r0.topEffect
            float r10 = r4.getDistanceCompat(r10)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x005a
            r10 = r5
            goto L_0x005b
        L_0x005a:
            r10 = r9
        L_0x005b:
            if (r10 != 0) goto L_0x0076
            float r10 = r0.m32949pullTop0a9Yr6o(r1, r6)
            android.widget.EdgeEffect r11 = r0.topEffect
            float r4 = r4.getDistanceCompat(r11)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x006d
            r4 = r5
            goto L_0x006e
        L_0x006d:
            r4 = r9
        L_0x006e:
            if (r4 == 0) goto L_0x009d
            android.widget.EdgeEffect r4 = r0.topEffect
            r4.onRelease()
            goto L_0x009d
        L_0x0076:
            android.widget.EdgeEffect r10 = r0.bottomEffect
            float r10 = r4.getDistanceCompat(r10)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0082
            r10 = r5
            goto L_0x0083
        L_0x0082:
            r10 = r9
        L_0x0083:
            if (r10 != 0) goto L_0x004a
            float r10 = r0.m32946pullBottom0a9Yr6o(r1, r6)
            android.widget.EdgeEffect r11 = r0.bottomEffect
            float r4 = r4.getDistanceCompat(r11)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0095
            r4 = r5
            goto L_0x0096
        L_0x0095:
            r4 = r9
        L_0x0096:
            if (r4 == 0) goto L_0x009d
            android.widget.EdgeEffect r4 = r0.bottomEffect
            r4.onRelease()
        L_0x009d:
            float r4 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r18)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00a7
            r4 = r5
            goto L_0x00a8
        L_0x00a7:
            r4 = r9
        L_0x00a8:
            if (r4 == 0) goto L_0x00ab
            goto L_0x00fe
        L_0x00ab:
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r11 = r0.leftEffect
            float r11 = r4.getDistanceCompat(r11)
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x00b9
            r11 = r5
            goto L_0x00ba
        L_0x00b9:
            r11 = r9
        L_0x00ba:
            if (r11 != 0) goto L_0x00d6
            float r11 = r0.m32947pullLeft0a9Yr6o(r1, r6)
            android.widget.EdgeEffect r12 = r0.leftEffect
            float r4 = r4.getDistanceCompat(r12)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00cc
            r4 = r5
            goto L_0x00cd
        L_0x00cc:
            r4 = r9
        L_0x00cd:
            if (r4 == 0) goto L_0x00d4
            android.widget.EdgeEffect r4 = r0.leftEffect
            r4.onRelease()
        L_0x00d4:
            r8 = r11
            goto L_0x00fe
        L_0x00d6:
            android.widget.EdgeEffect r11 = r0.rightEffect
            float r11 = r4.getDistanceCompat(r11)
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x00e2
            r11 = r5
            goto L_0x00e3
        L_0x00e2:
            r11 = r9
        L_0x00e3:
            if (r11 != 0) goto L_0x00fe
            float r11 = r0.m32948pullRight0a9Yr6o(r1, r6)
            android.widget.EdgeEffect r12 = r0.rightEffect
            float r4 = r4.getDistanceCompat(r12)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00f5
            r4 = r5
            goto L_0x00f6
        L_0x00f5:
            r4 = r9
        L_0x00f6:
            if (r4 == 0) goto L_0x00d4
            android.widget.EdgeEffect r4 = r0.rightEffect
            r4.onRelease()
            goto L_0x00d4
        L_0x00fe:
            long r10 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r8, r10)
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.p002ui.geometry.Offset.Companion
            long r12 = r4.m35438getZeroF1C5BW0()
            boolean r4 = androidx.compose.p002ui.geometry.Offset.m35419equalsimpl0(r10, r12)
            if (r4 != 0) goto L_0x0111
            r17.invalidateOverscroll()
        L_0x0111:
            long r12 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r1, r10)
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r12)
            java.lang.Object r3 = r3.invoke(r4)
            androidx.compose.ui.geometry.Offset r3 = (androidx.compose.p002ui.geometry.Offset) r3
            long r3 = r3.m35432unboximpl()
            long r12 = androidx.compose.p002ui.geometry.Offset.m35426minusMKHz9U(r12, r3)
            androidx.compose.ui.input.nestedscroll.NestedScrollSource$Companion r8 = androidx.compose.p002ui.input.nestedscroll.NestedScrollSource.Companion
            int r8 = r8.m37068getDragWNlRxjI()
            r14 = r20
            boolean r8 = androidx.compose.p002ui.input.nestedscroll.NestedScrollSource.m37063equalsimpl0(r14, r8)
            if (r8 == 0) goto L_0x0173
            float r8 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r12)
            r14 = 1056964608(0x3f000000, float:0.5)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r15 = -1090519040(0xffffffffbf000000, float:-0.5)
            if (r8 <= 0) goto L_0x0146
            r0.m32947pullLeft0a9Yr6o(r12, r6)
        L_0x0144:
            r8 = r5
            goto L_0x0153
        L_0x0146:
            float r8 = androidx.compose.p002ui.geometry.Offset.m35422getXimpl(r12)
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x0152
            r0.m32948pullRight0a9Yr6o(r12, r6)
            goto L_0x0144
        L_0x0152:
            r8 = r9
        L_0x0153:
            float r16 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r12)
            int r14 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0160
            r0.m32949pullTop0a9Yr6o(r12, r6)
        L_0x015e:
            r6 = r5
            goto L_0x016d
        L_0x0160:
            float r14 = androidx.compose.p002ui.geometry.Offset.m35423getYimpl(r12)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x016c
            r0.m32946pullBottom0a9Yr6o(r12, r6)
            goto L_0x015e
        L_0x016c:
            r6 = r9
        L_0x016d:
            if (r8 != 0) goto L_0x0171
            if (r6 == 0) goto L_0x0173
        L_0x0171:
            r6 = r5
            goto L_0x0174
        L_0x0173:
            r6 = r9
        L_0x0174:
            boolean r1 = r17.m32950releaseOppositeOverscrollk4lQ0M(r18)
            if (r1 != 0) goto L_0x017e
            if (r6 == 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r5 = r9
        L_0x017e:
            if (r5 == 0) goto L_0x0183
            r17.invalidateOverscroll()
        L_0x0183:
            long r1 = androidx.compose.p002ui.geometry.Offset.m35427plusMKHz9U(r10, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.m32952applyToScrollRhakbz0(long, int, kotlin.jvm.functions.Function1):long");
    }

    public final void drawOverscroll(DrawScope drawScope) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C12775o.m28639i(drawScope, "<this>");
        if (!Size.m35493isEmptyimpl(this.containerSize)) {
            androidx.compose.p002ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
            this.redrawSignal.getValue();
            Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
            EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
            boolean z8 = true;
            if (edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
                this.leftEffectNegation.finish();
            }
            if (!this.leftEffect.isFinished()) {
                z2 = drawLeft(drawScope, this.leftEffect, nativeCanvas);
                edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
            } else {
                z2 = false;
            }
            if (edgeEffectCompat.getDistanceCompat(this.topEffectNegation) == 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
                this.topEffectNegation.finish();
            }
            if (!this.topEffect.isFinished()) {
                if (drawTop(drawScope, this.topEffect, nativeCanvas) || z2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
            }
            if (edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
                this.rightEffectNegation.finish();
            }
            if (!this.rightEffect.isFinished()) {
                if (drawRight(drawScope, this.rightEffect, nativeCanvas) || z2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
            }
            if (edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) == 0.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
                this.bottomEffectNegation.finish();
            }
            if (!this.bottomEffect.isFinished()) {
                if (!drawBottom(drawScope, this.bottomEffect, nativeCanvas) && !z2) {
                    z8 = false;
                }
                edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
                z2 = z8;
            }
            if (z2) {
                invalidateOverscroll();
            }
        }
    }

    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.invalidationEnabled;
    }

    public boolean isInProgress() {
        boolean z;
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i)) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.invalidationEnabled = z;
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }
}
