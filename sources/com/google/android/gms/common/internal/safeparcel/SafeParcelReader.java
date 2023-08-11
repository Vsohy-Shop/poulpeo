package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: A */
    public static int m6707A(@NonNull Parcel parcel) {
        String str;
        int s = m6728s(parcel);
        int y = m6734y(parcel, s);
        int dataPosition = parcel.dataPosition();
        if (m6721l(s) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(s));
            if (valueOf.length() != 0) {
                str = "Expected object header. Got 0x".concat(valueOf);
            } else {
                str = new String("Expected object header. Got 0x");
            }
            throw new ParseException(str, parcel);
        }
        int i = y + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }

    /* renamed from: B */
    private static void m6708B(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: C */
    private static void m6709C(Parcel parcel, int i, int i2) {
        int y = m6734y(parcel, i);
        if (y != i2) {
            String hexString = Integer.toHexString(y);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(y);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    @NonNull
    /* renamed from: a */
    public static Bundle m6710a(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + y);
        return readBundle;
    }

    @NonNull
    /* renamed from: b */
    public static byte[] m6711b(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + y);
        return createByteArray;
    }

    @NonNull
    /* renamed from: c */
    public static int[] m6712c(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + y);
        return createIntArray;
    }

    @NonNull
    /* renamed from: d */
    public static long[] m6713d(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + y);
        return createLongArray;
    }

    @NonNull
    /* renamed from: e */
    public static <T extends Parcelable> T m6714e(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int y = m6734y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + y);
        return t;
    }

    @NonNull
    /* renamed from: f */
    public static String m6715f(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + y);
        return readString;
    }

    @NonNull
    /* renamed from: g */
    public static String[] m6716g(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + y);
        return createStringArray;
    }

    @NonNull
    /* renamed from: h */
    public static ArrayList<String> m6717h(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + y);
        return createStringArrayList;
    }

    @NonNull
    /* renamed from: i */
    public static <T> T[] m6718i(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int y = m6734y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + y);
        return createTypedArray;
    }

    @NonNull
    /* renamed from: j */
    public static <T> ArrayList<T> m6719j(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int y = m6734y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + y);
        return createTypedArrayList;
    }

    /* renamed from: k */
    public static void m6720k(@NonNull Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: l */
    public static int m6721l(int i) {
        return (char) i;
    }

    /* renamed from: m */
    public static boolean m6722m(@NonNull Parcel parcel, int i) {
        m6709C(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: n */
    public static Boolean m6723n(@NonNull Parcel parcel, int i) {
        boolean z;
        int y = m6734y(parcel, i);
        if (y == 0) {
            return null;
        }
        m6708B(parcel, i, y, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: o */
    public static double m6724o(@NonNull Parcel parcel, int i) {
        m6709C(parcel, i, 8);
        return parcel.readDouble();
    }

    @NonNull
    /* renamed from: p */
    public static Double m6725p(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        if (y == 0) {
            return null;
        }
        m6708B(parcel, i, y, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: q */
    public static float m6726q(@NonNull Parcel parcel, int i) {
        m6709C(parcel, i, 4);
        return parcel.readFloat();
    }

    @NonNull
    /* renamed from: r */
    public static Float m6727r(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        if (y == 0) {
            return null;
        }
        m6708B(parcel, i, y, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: s */
    public static int m6728s(@NonNull Parcel parcel) {
        return parcel.readInt();
    }

    @NonNull
    /* renamed from: t */
    public static IBinder m6729t(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + y);
        return readStrongBinder;
    }

    /* renamed from: u */
    public static int m6730u(@NonNull Parcel parcel, int i) {
        m6709C(parcel, i, 4);
        return parcel.readInt();
    }

    @NonNull
    /* renamed from: v */
    public static Integer m6731v(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        if (y == 0) {
            return null;
        }
        m6708B(parcel, i, y, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: w */
    public static long m6732w(@NonNull Parcel parcel, int i) {
        m6709C(parcel, i, 8);
        return parcel.readLong();
    }

    @NonNull
    /* renamed from: x */
    public static Long m6733x(@NonNull Parcel parcel, int i) {
        int y = m6734y(parcel, i);
        if (y == 0) {
            return null;
        }
        m6708B(parcel, i, y, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: y */
    public static int m6734y(@NonNull Parcel parcel, int i) {
        if ((i & SupportMenu.CATEGORY_MASK) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    /* renamed from: z */
    public static void m6735z(@NonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m6734y(parcel, i));
    }
}
