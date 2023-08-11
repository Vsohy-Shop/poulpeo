package p096g3;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import kotlin.Lazy;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11904j;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,175:1\n36#2:176\n1114#3,6:177\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainterKt\n*L\n152#1:176\n152#1:177,6\n*E\n"})
/* renamed from: g3.b */
/* compiled from: DrawablePainter.kt */
public final class C7770b {

    /* renamed from: a */
    private static final Lazy f10793a = C11901h.m25689a(C11904j.NONE, C7771a.f10794g);

    /* renamed from: g3.b$a */
    /* compiled from: DrawablePainter.kt */
    static final class C7771a extends C12777p implements C13074a<Handler> {

        /* renamed from: g */
        public static final C7771a f10794g = new C7771a();

        C7771a() {
            super(0);
        }

        /* renamed from: b */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final long m15155c(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return Size.Companion.m35499getUnspecifiedNHjbRc();
        }
        return SizeKt.Size((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final Handler m15156d() {
        return (Handler) f10793a.getValue();
    }
}
