package p363ig;

import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* renamed from: ig.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12152b implements EventListener.Factory {

    /* renamed from: a */
    public final /* synthetic */ EventListener f19035a;

    public /* synthetic */ C12152b(EventListener eventListener) {
        this.f19035a = eventListener;
    }

    public final EventListener create(Call call) {
        return Util.m38875asFactory$lambda8(this.f19035a, call);
    }
}
