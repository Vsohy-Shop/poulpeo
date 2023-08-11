package p177o1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import p094g1.C7743b;
import p094g1.C7744c;
import p197q1.C9102c;
import p294z1.C10791j;

/* renamed from: o1.b */
/* compiled from: DrawableResource */
public abstract class C8948b<T extends Drawable> implements C7744c<T>, C7743b {

    /* renamed from: b */
    protected final T f12986b;

    public C8948b(T t) {
        this.f12986b = (Drawable) C10791j.m22948d(t);
    }

    @NonNull
    /* renamed from: b */
    public final T get() {
        Drawable.ConstantState constantState = this.f12986b.getConstantState();
        if (constantState == null) {
            return this.f12986b;
        }
        return constantState.newDrawable();
    }

    public void initialize() {
        T t = this.f12986b;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C9102c) {
            ((C9102c) t).mo43332e().prepareToDraw();
        }
    }
}
