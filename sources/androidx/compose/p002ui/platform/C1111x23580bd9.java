package androidx.compose.p002ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import p308ag.C10894d;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 */
/* compiled from: WindowRecomposer.android.kt */
public final class C1111x23580bd9 extends ContentObserver {
    final /* synthetic */ C10894d<C11921v> $channel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1111x23580bd9(C10894d<C11921v> dVar, Handler handler) {
        super(handler);
        this.$channel = dVar;
    }

    public void onChange(boolean z, Uri uri) {
        this.$channel.mo45894m(C11921v.f18618a);
    }
}
