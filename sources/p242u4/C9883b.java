package p242u4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* renamed from: u4.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C9883b {
    /* renamed from: A */
    private static <T extends Parcelable> void m20520A(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m20521a(@NonNull Parcel parcel) {
        return m20544x(parcel, 20293);
    }

    /* renamed from: b */
    public static void m20522b(@NonNull Parcel parcel, int i) {
        m20545y(parcel, i);
    }

    /* renamed from: c */
    public static void m20523c(@NonNull Parcel parcel, int i, boolean z) {
        m20546z(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m20524d(@NonNull Parcel parcel, int i, @NonNull Boolean bool, boolean z) {
        if (bool != null) {
            m20546z(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m20525e(@NonNull Parcel parcel, int i, @NonNull Bundle bundle, boolean z) {
        if (bundle != null) {
            int x = m20544x(parcel, i);
            parcel.writeBundle(bundle);
            m20545y(parcel, x);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m20526f(@NonNull Parcel parcel, int i, @NonNull byte[] bArr, boolean z) {
        if (bArr != null) {
            int x = m20544x(parcel, i);
            parcel.writeByteArray(bArr);
            m20545y(parcel, x);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: g */
    public static void m20527g(@NonNull Parcel parcel, int i, double d) {
        m20546z(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: h */
    public static void m20528h(@NonNull Parcel parcel, int i, @NonNull Double d, boolean z) {
        if (d != null) {
            m20546z(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: i */
    public static void m20529i(@NonNull Parcel parcel, int i, float f) {
        m20546z(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: j */
    public static void m20530j(@NonNull Parcel parcel, int i, @NonNull Float f, boolean z) {
        if (f != null) {
            m20546z(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m20531k(@NonNull Parcel parcel, int i, @NonNull IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int x = m20544x(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m20545y(parcel, x);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: l */
    public static void m20532l(@NonNull Parcel parcel, int i, int i2) {
        m20546z(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: m */
    public static void m20533m(@NonNull Parcel parcel, int i, @NonNull int[] iArr, boolean z) {
        if (iArr != null) {
            int x = m20544x(parcel, i);
            parcel.writeIntArray(iArr);
            m20545y(parcel, x);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m20534n(@NonNull Parcel parcel, int i, @NonNull Integer num, boolean z) {
        if (num != null) {
            m20546z(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static void m20535o(@NonNull Parcel parcel, int i, long j) {
        m20546z(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: p */
    public static void m20536p(@NonNull Parcel parcel, int i, @NonNull long[] jArr, boolean z) {
        if (jArr != null) {
            int x = m20544x(parcel, i);
            parcel.writeLongArray(jArr);
            m20545y(parcel, x);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m20537q(@NonNull Parcel parcel, int i, @NonNull Long l, boolean z) {
        if (l != null) {
            m20546z(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static void m20538r(@NonNull Parcel parcel, int i, @NonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int x = m20544x(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m20545y(parcel, x);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: s */
    public static void m20539s(@NonNull Parcel parcel, int i, @NonNull String str, boolean z) {
        if (str != null) {
            int x = m20544x(parcel, i);
            parcel.writeString(str);
            m20545y(parcel, x);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: t */
    public static void m20540t(@NonNull Parcel parcel, int i, @NonNull String[] strArr, boolean z) {
        if (strArr != null) {
            int x = m20544x(parcel, i);
            parcel.writeStringArray(strArr);
            m20545y(parcel, x);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static void m20541u(@NonNull Parcel parcel, int i, @NonNull List<String> list, boolean z) {
        if (list != null) {
            int x = m20544x(parcel, i);
            parcel.writeStringList(list);
            m20545y(parcel, x);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: v */
    public static <T extends Parcelable> void m20542v(@NonNull Parcel parcel, int i, @NonNull T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int x = m20544x(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m20520A(parcel, t, i2);
                }
            }
            m20545y(parcel, x);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: w */
    public static <T extends Parcelable> void m20543w(@NonNull Parcel parcel, int i, @NonNull List<T> list, boolean z) {
        if (list != null) {
            int x = m20544x(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m20520A(parcel, parcelable, 0);
                }
            }
            m20545y(parcel, x);
        } else if (z) {
            m20546z(parcel, i, 0);
        }
    }

    /* renamed from: x */
    private static int m20544x(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: y */
    private static void m20545y(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: z */
    private static void m20546z(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }
}
