package android.support.p001v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0044a();

    /* renamed from: b */
    private final int f63b;

    /* renamed from: c */
    private final float f64c;

    /* renamed from: d */
    private Object f65d;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    class C0044a implements Parcelable.Creator<RatingCompat> {
        C0044a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    @RequiresApi(19)
    /* renamed from: android.support.v4.media.RatingCompat$b */
    private static class C0045b {
        @DoNotInline
        /* renamed from: a */
        static float m107a(Rating rating) {
            return rating.getPercentRating();
        }

        @DoNotInline
        /* renamed from: b */
        static int m108b(Rating rating) {
            return rating.getRatingStyle();
        }

        @DoNotInline
        /* renamed from: c */
        static float m109c(Rating rating) {
            return rating.getStarRating();
        }

        @DoNotInline
        /* renamed from: d */
        static boolean m110d(Rating rating) {
            return rating.hasHeart();
        }

        @DoNotInline
        /* renamed from: e */
        static boolean m111e(Rating rating) {
            return rating.isRated();
        }

        @DoNotInline
        /* renamed from: f */
        static boolean m112f(Rating rating) {
            return rating.isThumbUp();
        }

        @DoNotInline
        /* renamed from: g */
        static Rating m113g(boolean z) {
            return Rating.newHeartRating(z);
        }

        @DoNotInline
        /* renamed from: h */
        static Rating m114h(float f) {
            return Rating.newPercentageRating(f);
        }

        @DoNotInline
        /* renamed from: i */
        static Rating m115i(int i, float f) {
            return Rating.newStarRating(i, f);
        }

        @DoNotInline
        /* renamed from: j */
        static Rating m116j(boolean z) {
            return Rating.newThumbRating(z);
        }

        @DoNotInline
        /* renamed from: k */
        static Rating m117k(int i) {
            return Rating.newUnratedRating(i);
        }
    }

    RatingCompat(int i, float f) {
        this.f63b = i;
        this.f64c = f;
    }

    /* renamed from: a */
    public static RatingCompat m99a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int b = C0045b.m108b(rating);
            if (C0045b.m111e(rating)) {
                switch (b) {
                    case 1:
                        ratingCompat = m100b(C0045b.m110d(rating));
                        break;
                    case 2:
                        ratingCompat = m103e(C0045b.m112f(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = m102d(b, C0045b.m109c(rating));
                        break;
                    case 6:
                        ratingCompat = m101c(C0045b.m107a(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = m104f(b);
            }
            ratingCompat.f65d = obj;
        }
        return ratingCompat;
    }

    /* renamed from: b */
    public static RatingCompat m100b(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return new RatingCompat(1, f);
    }

    /* renamed from: c */
    public static RatingCompat m101c(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    /* renamed from: d */
    public static RatingCompat m102d(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new RatingCompat(i, f);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    /* renamed from: e */
    public static RatingCompat m103e(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return new RatingCompat(2, f);
    }

    /* renamed from: f */
    public static RatingCompat m104f(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public int describeContents() {
        return this.f63b;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f63b);
        sb.append(" rating=");
        float f = this.f64c;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f63b);
        parcel.writeFloat(this.f64c);
    }
}
