package p261w1;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p250v1.C9916c;
import p294z1.C10792k;

/* renamed from: w1.a */
/* compiled from: CustomTarget */
public abstract class C10101a<T> implements C10104d<T> {

    /* renamed from: b */
    private final int f15261b;

    /* renamed from: c */
    private final int f15262c;
    @Nullable

    /* renamed from: d */
    private C9916c f15263d;

    public C10101a() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Nullable
    /* renamed from: a */
    public final C9916c mo44675a() {
        return this.f15263d;
    }

    /* renamed from: b */
    public final void mo44676b(@Nullable C9916c cVar) {
        this.f15263d = cVar;
    }

    /* renamed from: c */
    public final void mo44677c(@NonNull C10103c cVar) {
        cVar.mo44501d(this.f15261b, this.f15262c);
    }

    public C10101a(int i, int i2) {
        if (C10792k.m22967r(i, i2)) {
            this.f15261b = i;
            this.f15262c = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }

    /* renamed from: e */
    public void mo31210e() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    /* renamed from: f */
    public final void mo44678f(@NonNull C10103c cVar) {
    }

    /* renamed from: g */
    public void mo44679g(@Nullable Drawable drawable) {
    }

    /* renamed from: h */
    public void mo44680h(@Nullable Drawable drawable) {
    }
}
