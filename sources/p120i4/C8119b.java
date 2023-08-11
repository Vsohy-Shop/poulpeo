package p120i4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.media.C4633a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p109h4.C7928f;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: i4.b */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class C8119b extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C8119b> CREATOR = new C8165s0();

    /* renamed from: b */
    private String f11437b;

    /* renamed from: c */
    private final List f11438c;

    /* renamed from: d */
    private boolean f11439d;

    /* renamed from: e */
    private C7928f f11440e;

    /* renamed from: f */
    private final boolean f11441f;
    @Nullable

    /* renamed from: g */
    private final C4633a f11442g;

    /* renamed from: h */
    private final boolean f11443h;

    /* renamed from: i */
    private final double f11444i;

    /* renamed from: j */
    private final boolean f11445j;

    /* renamed from: k */
    private final boolean f11446k;

    /* renamed from: l */
    private final boolean f11447l;

    /* renamed from: m */
    private List f11448m;

    /* renamed from: n */
    private final boolean f11449n;

    /* renamed from: o */
    private final int f11450o;

    C8119b(String str, List list, boolean z, C7928f fVar, boolean z2, @Nullable C4633a aVar, boolean z3, double d, boolean z4, boolean z5, boolean z6, List list2, boolean z7, int i) {
        String str2;
        int i2;
        C7928f fVar2;
        List list3 = list;
        if (true == TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f11437b = str2;
        if (list3 == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        ArrayList arrayList = new ArrayList(i2);
        this.f11438c = arrayList;
        if (i2 > 0) {
            arrayList.addAll(list);
        }
        this.f11439d = z;
        if (fVar == null) {
            fVar2 = new C7928f();
        } else {
            fVar2 = fVar;
        }
        this.f11440e = fVar2;
        this.f11441f = z2;
        this.f11442g = aVar;
        this.f11443h = z3;
        this.f11444i = d;
        this.f11445j = z4;
        this.f11446k = z5;
        this.f11447l = z6;
        this.f11448m = list2;
        this.f11449n = z7;
        this.f11450o = i;
    }

    @Nullable
    /* renamed from: A */
    public C4633a mo41983A() {
        return this.f11442g;
    }

    /* renamed from: F */
    public boolean mo41984F() {
        return this.f11443h;
    }

    @NonNull
    /* renamed from: G */
    public C7928f mo41985G() {
        return this.f11440e;
    }

    @NonNull
    /* renamed from: H */
    public String mo41986H() {
        return this.f11437b;
    }

    /* renamed from: I */
    public boolean mo41987I() {
        return this.f11441f;
    }

    /* renamed from: J */
    public boolean mo41988J() {
        return this.f11439d;
    }

    @NonNull
    /* renamed from: K */
    public List<String> mo41989K() {
        return Collections.unmodifiableList(this.f11438c);
    }

    @Deprecated
    /* renamed from: L */
    public double mo41990L() {
        return this.f11444i;
    }

    @NonNull
    /* renamed from: M */
    public final List mo41991M() {
        return Collections.unmodifiableList(this.f11448m);
    }

    /* renamed from: N */
    public final boolean mo41992N() {
        return this.f11446k;
    }

    /* renamed from: O */
    public final boolean mo41993O() {
        return this.f11447l;
    }

    /* renamed from: P */
    public final boolean mo41994P() {
        return this.f11449n;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, mo41986H(), false);
        C9883b.m20541u(parcel, 3, mo41989K(), false);
        C9883b.m20523c(parcel, 4, mo41988J());
        C9883b.m20538r(parcel, 5, mo41985G(), i, false);
        C9883b.m20523c(parcel, 6, mo41987I());
        C9883b.m20538r(parcel, 7, mo41983A(), i, false);
        C9883b.m20523c(parcel, 8, mo41984F());
        C9883b.m20527g(parcel, 9, mo41990L());
        C9883b.m20523c(parcel, 10, this.f11445j);
        C9883b.m20523c(parcel, 11, this.f11446k);
        C9883b.m20523c(parcel, 12, this.f11447l);
        C9883b.m20541u(parcel, 13, Collections.unmodifiableList(this.f11448m), false);
        C9883b.m20523c(parcel, 14, this.f11449n);
        C9883b.m20532l(parcel, 15, this.f11450o);
        C9883b.m20522b(parcel, a);
    }
}
