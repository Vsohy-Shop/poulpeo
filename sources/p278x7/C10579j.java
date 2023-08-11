package p278x7;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.GlideException;
import p058d1.C7214a;
import p101g8.C7817i;
import p223s7.C9567t;
import p250v1.C9919e;
import p261w1.C10104d;

/* renamed from: x7.j */
/* compiled from: GlideErrorListener */
public class C10579j implements C9919e<Object> {

    /* renamed from: a */
    private C7817i f16100a;

    /* renamed from: b */
    private C9567t f16101b;

    C10579j() {
    }

    /* renamed from: a */
    public boolean mo44496a(@Nullable GlideException glideException, Object obj, C10104d<Object> dVar, boolean z) {
        C10584m.m22515a("Image Downloading  Error : " + glideException.getMessage() + ":" + glideException.getCause());
        if (this.f16100a == null || this.f16101b == null) {
            return false;
        }
        if (glideException.getLocalizedMessage().contains("Failed to decode")) {
            this.f16101b.mo29973c(C9567t.C9569b.IMAGE_UNSUPPORTED_FORMAT);
            return false;
        }
        this.f16101b.mo29973c(C9567t.C9569b.UNSPECIFIED_RENDER_ERROR);
        return false;
    }

    /* renamed from: b */
    public boolean mo44497b(Object obj, Object obj2, C10104d<Object> dVar, C7214a aVar, boolean z) {
        C10584m.m22515a("Image Downloading  Success : " + obj);
        return false;
    }
}
