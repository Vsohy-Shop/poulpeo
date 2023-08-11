package p197q1;

import androidx.annotation.NonNull;
import p177o1.C8948b;

/* renamed from: q1.e */
/* compiled from: GifDrawableResource */
public class C9105e extends C8948b<C9102c> {
    public C9105e(C9102c cVar) {
        super(cVar);
    }

    @NonNull
    /* renamed from: a */
    public Class<C9102c> mo31365a() {
        return C9102c.class;
    }

    public int getSize() {
        return ((C9102c) this.f12986b).mo43339i();
    }

    public void initialize() {
        ((C9102c) this.f12986b).mo43332e().prepareToDraw();
    }

    public void recycle() {
        ((C9102c) this.f12986b).stop();
        ((C9102c) this.f12986b).mo43341k();
    }
}
