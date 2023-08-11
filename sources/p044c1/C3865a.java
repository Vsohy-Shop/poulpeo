package p044c1;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* renamed from: c1.a */
/* compiled from: GifDecoder */
public interface C3865a {

    /* renamed from: c1.a$a */
    /* compiled from: GifDecoder */
    public interface C3866a {
        @NonNull
        /* renamed from: a */
        Bitmap mo29899a(int i, int i2, @NonNull Bitmap.Config config);

        @NonNull
        /* renamed from: b */
        int[] mo29900b(int i);

        /* renamed from: c */
        void mo29901c(@NonNull Bitmap bitmap);

        /* renamed from: d */
        void mo29902d(@NonNull byte[] bArr);

        @NonNull
        /* renamed from: e */
        byte[] mo29903e(int i);

        /* renamed from: f */
        void mo29904f(@NonNull int[] iArr);
    }

    @Nullable
    /* renamed from: a */
    Bitmap mo29889a();

    /* renamed from: b */
    void mo29890b();

    /* renamed from: c */
    int mo29891c();

    void clear();

    /* renamed from: d */
    int mo29893d();

    /* renamed from: e */
    void mo29894e(@NonNull Bitmap.Config config);

    /* renamed from: f */
    void mo29895f();

    /* renamed from: g */
    int mo29896g();

    @NonNull
    ByteBuffer getData();

    /* renamed from: h */
    int mo29898h();
}
