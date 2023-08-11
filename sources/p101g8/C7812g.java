package p101g8;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: g8.g */
/* compiled from: ImageData */
public class C7812g {
    @NonNull

    /* renamed from: a */
    private final String f10878a;
    @Nullable

    /* renamed from: b */
    private final Bitmap f10879b;

    /* renamed from: g8.g$a */
    /* compiled from: ImageData */
    public static class C7813a {
        @Nullable

        /* renamed from: a */
        private String f10880a;
        @Nullable

        /* renamed from: b */
        private Bitmap f10881b;

        /* renamed from: a */
        public C7812g mo41506a() {
            if (!TextUtils.isEmpty(this.f10880a)) {
                return new C7812g(this.f10880a, this.f10881b);
            }
            throw new IllegalArgumentException("ImageData model must have an imageUrl");
        }

        /* renamed from: b */
        public C7813a mo41507b(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f10880a = str;
            }
            return this;
        }
    }

    public C7812g(@NonNull String str, @Nullable Bitmap bitmap) {
        this.f10878a = str;
        this.f10879b = bitmap;
    }

    /* renamed from: a */
    public static C7813a m15263a() {
        return new C7813a();
    }

    @NonNull
    /* renamed from: b */
    public String mo41503b() {
        return this.f10878a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7812g)) {
            return false;
        }
        C7812g gVar = (C7812g) obj;
        if (hashCode() == gVar.hashCode() && this.f10878a.equals(gVar.f10878a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        Bitmap bitmap = this.f10879b;
        if (bitmap != null) {
            i = bitmap.hashCode();
        } else {
            i = 0;
        }
        return this.f10878a.hashCode() + i;
    }
}
