package p096g3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p002ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import com.appboy.Constants;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,175:1\n76#2:176\n102#2,2:177\n76#2:179\n102#2,2:180\n245#3:182\n47#4,7:183\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainter\n*L\n58#1:176\n58#1:177,2\n59#1:179\n59#1:180,2\n126#1:182\n133#1:183,7\n*E\n"})
/* renamed from: g3.a */
/* compiled from: DrawablePainter.kt */
public final class C7766a extends Painter implements RememberObserver {

    /* renamed from: b */
    private final Drawable f10786b;

    /* renamed from: c */
    private final MutableState f10787c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: d */
    private final MutableState f10788d;

    /* renamed from: e */
    private final Lazy f10789e;

    /* renamed from: g3.a$a */
    /* compiled from: DrawablePainter.kt */
    public /* synthetic */ class C7767a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10790a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.p002ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p002ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p002ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f10790a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p096g3.C7766a.C7767a.<clinit>():void");
        }
    }

    /* renamed from: g3.a$b */
    /* compiled from: DrawablePainter.kt */
    static final class C7768b extends C12777p implements C13074a<C7769a> {

        /* renamed from: g */
        final /* synthetic */ C7766a f10791g;

        /* renamed from: g3.a$b$a */
        /* compiled from: DrawablePainter.kt */
        public static final class C7769a implements Drawable.Callback {

            /* renamed from: b */
            final /* synthetic */ C7766a f10792b;

            C7769a(C7766a aVar) {
                this.f10792b = aVar;
            }

            public void invalidateDrawable(Drawable drawable) {
                C12775o.m28639i(drawable, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
                C7766a aVar = this.f10792b;
                aVar.m15149h(aVar.m15147e() + 1);
                C7766a aVar2 = this.f10792b;
                aVar2.m15150i(C7770b.m15155c(aVar2.mo41413f()));
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C12775o.m28639i(drawable, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
                C12775o.m28639i(runnable, "what");
                C7770b.m15156d().postAtTime(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C12775o.m28639i(drawable, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
                C12775o.m28639i(runnable, "what");
                C7770b.m15156d().removeCallbacks(runnable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7768b(C7766a aVar) {
            super(0);
            this.f10791g = aVar;
        }

        /* renamed from: b */
        public final C7769a invoke() {
            return new C7769a(this.f10791g);
        }
    }

    public C7766a(Drawable drawable) {
        C12775o.m28639i(drawable, "drawable");
        this.f10786b = drawable;
        this.f10788d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m35479boximpl(C7770b.m15155c(drawable)), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f10789e = C11901h.m25690b(new C7768b(this));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    /* renamed from: d */
    private final Drawable.Callback m15146d() {
        return (Drawable.Callback) this.f10789e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final int m15147e() {
        return ((Number) this.f10787c.getValue()).intValue();
    }

    /* renamed from: g */
    private final long m15148g() {
        return ((Size) this.f10788d.getValue()).m35496unboximpl();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m15149h(int i) {
        this.f10787c.setValue(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m15150i(long j) {
        this.f10788d.setValue(Size.m35479boximpl(j));
    }

    /* access modifiers changed from: protected */
    public boolean applyAlpha(float f) {
        this.f10786b.setAlpha(C13537l.m30886m(C13265c.m30134c(f * ((float) 255)), 0, 255));
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean applyColorFilter(ColorFilter colorFilter) {
        android.graphics.ColorFilter colorFilter2;
        Drawable drawable = this.f10786b;
        if (colorFilter != null) {
            colorFilter2 = AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter);
        } else {
            colorFilter2 = null;
        }
        drawable.setColorFilter(colorFilter2);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        Drawable drawable = this.f10786b;
        int i = C7767a.f10790a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i2);
    }

    /* renamed from: f */
    public final Drawable mo41413f() {
        return this.f10786b;
    }

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long m38735getIntrinsicSizeNHjbRc() {
        return m15148g();
    }

    public void onAbandoned() {
        onForgotten();
    }

    /* access modifiers changed from: protected */
    public void onDraw(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "<this>");
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        m15147e();
        this.f10786b.setBounds(0, 0, C13265c.m30134c(Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc())), C13265c.m30134c(Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc())));
        try {
            canvas.save();
            this.f10786b.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }

    public void onForgotten() {
        Drawable drawable = this.f10786b;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        this.f10786b.setVisible(false, false);
        this.f10786b.setCallback((Drawable.Callback) null);
    }

    public void onRemembered() {
        this.f10786b.setCallback(m15146d());
        this.f10786b.setVisible(true, true);
        Drawable drawable = this.f10786b;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
