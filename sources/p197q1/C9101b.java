package p197q1;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p044c1.C3865a;
import p106h1.C7883b;
import p106h1.C7885d;

/* renamed from: q1.b */
/* compiled from: GifBitmapProvider */
public final class C9101b implements C3865a.C3866a {

    /* renamed from: a */
    private final C7885d f13246a;
    @Nullable

    /* renamed from: b */
    private final C7883b f13247b;

    public C9101b(C7885d dVar, @Nullable C7883b bVar) {
        this.f13246a = dVar;
        this.f13247b = bVar;
    }

    @NonNull
    /* renamed from: a */
    public Bitmap mo29899a(int i, int i2, @NonNull Bitmap.Config config) {
        return this.f13246a.mo41603e(i, i2, config);
    }

    @NonNull
    /* renamed from: b */
    public int[] mo29900b(int i) {
        C7883b bVar = this.f13247b;
        if (bVar == null) {
            return new int[i];
        }
        return (int[]) bVar.mo41595d(i, int[].class);
    }

    /* renamed from: c */
    public void mo29901c(@NonNull Bitmap bitmap) {
        this.f13246a.mo31429c(bitmap);
    }

    /* renamed from: d */
    public void mo29902d(@NonNull byte[] bArr) {
        C7883b bVar = this.f13247b;
        if (bVar != null) {
            bVar.put(bArr);
        }
    }

    @NonNull
    /* renamed from: e */
    public byte[] mo29903e(int i) {
        C7883b bVar = this.f13247b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo41595d(i, byte[].class);
    }

    /* renamed from: f */
    public void mo29904f(@NonNull int[] iArr) {
        C7883b bVar = this.f13247b;
        if (bVar != null) {
            bVar.put(iArr);
        }
    }
}
