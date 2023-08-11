package p140k4;

import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* renamed from: k4.a */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final /* synthetic */ class C8559a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CastSeekBar f12224b;

    public /* synthetic */ C8559a(CastSeekBar castSeekBar) {
        this.f12224b = castSeekBar;
    }

    public final void run() {
        this.f12224b.sendAccessibilityEvent(4);
    }
}
