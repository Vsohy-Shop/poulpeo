package p109h4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150l4.C8673a;
import p160m4.C8823b;
import p220s4.C9493a;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: h4.g */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C7931g extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C7931g> CREATOR = new C7961r0();

    /* renamed from: f */
    private static final String[] f11102f = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};

    /* renamed from: g */
    private static final C7959q0 f11103g;

    /* renamed from: b */
    private final List f11104b;

    /* renamed from: c */
    final Bundle f11105c;

    /* renamed from: d */
    private int f11106d;

    /* renamed from: e */
    private final C7932a f11107e;

    /* renamed from: h4.g$a */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public class C7932a {
        public C7932a() {
        }
    }

    static {
        C7959q0 q0Var = new C7959q0();
        q0Var.mo41804b("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        q0Var.mo41804b("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        f11103g = q0Var;
    }

    public C7931g() {
        this(0);
    }

    /* renamed from: I */
    public static void m15578I(@NonNull String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            int a = f11103g.mo41803a(str);
            if (a != i && a != 0) {
                String str2 = f11102f[i];
                throw new IllegalArgumentException("Value for " + str + " must be a " + str2);
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    /* renamed from: L */
    private final boolean m15579L(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            Object obj2 = bundle2.get(next);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m15579L((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(next)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    /* renamed from: A */
    public List<C9493a> mo41708A() {
        return this.f11104b;
    }

    /* renamed from: F */
    public int mo41709F() {
        return this.f11106d;
    }

    @Nullable
    /* renamed from: G */
    public String mo41710G(@NonNull String str) {
        m15578I(str, 1);
        return this.f11105c.getString(str);
    }

    /* renamed from: H */
    public boolean mo41711H() {
        List list = this.f11104b;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ca, code lost:
        r4 = f11103g;
     */
    @androidx.annotation.NonNull
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo41712J() {
        /*
            r18 = this;
            r0 = r18
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "metadataType"
            int r3 = r0.f11106d     // Catch:{ JSONException -> 0x000e }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x000e }
        L_0x000e:
            java.util.List r2 = r0.f11104b
            org.json.JSONArray r2 = p160m4.C8823b.m17883b(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "images"
            r1.put(r3, r2)     // Catch:{ JSONException -> 0x001f }
        L_0x001f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.f11106d
            java.lang.String r4 = "com.google.android.gms.cast.metadata.RELEASE_DATE"
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            java.lang.String r10 = "com.google.android.gms.cast.metadata.SUBTITLE"
            java.lang.String r11 = "com.google.android.gms.cast.metadata.TITLE"
            if (r3 == 0) goto L_0x0096
            if (r3 == r9) goto L_0x008c
            if (r3 == r8) goto L_0x007c
            if (r3 == r7) goto L_0x0064
            if (r3 == r6) goto L_0x004c
            if (r3 == r5) goto L_0x003e
            goto L_0x009f
        L_0x003e:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.CHAPTER_NUMBER"
            java.lang.String r4 = "com.google.android.gms.cast.metadata.BOOK_TITLE"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.CHAPTER_TITLE"
            java.lang.String[] r3 = new java.lang.String[]{r12, r3, r11, r4, r10}
            java.util.Collections.addAll(r2, r3)
            goto L_0x009f
        L_0x004c:
            java.lang.String r10 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r11 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.LOCATION_NAME"
            java.lang.String r13 = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE"
            java.lang.String r14 = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE"
            java.lang.String r15 = "com.google.android.gms.cast.metadata.WIDTH"
            java.lang.String r16 = "com.google.android.gms.cast.metadata.HEIGHT"
            java.lang.String r17 = "com.google.android.gms.cast.metadata.CREATION_DATE"
            java.lang.String[] r3 = new java.lang.String[]{r10, r11, r12, r13, r14, r15, r16, r17}
            java.util.Collections.addAll(r2, r3)
            goto L_0x009f
        L_0x0064:
            java.lang.String r10 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r11 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.ALBUM_TITLE"
            java.lang.String r13 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            java.lang.String r14 = "com.google.android.gms.cast.metadata.COMPOSER"
            java.lang.String r15 = "com.google.android.gms.cast.metadata.TRACK_NUMBER"
            java.lang.String r16 = "com.google.android.gms.cast.metadata.DISC_NUMBER"
            java.lang.String r17 = "com.google.android.gms.cast.metadata.RELEASE_DATE"
            java.lang.String[] r3 = new java.lang.String[]{r10, r11, r12, r13, r14, r15, r16, r17}
            java.util.Collections.addAll(r2, r3)
            goto L_0x009f
        L_0x007c:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.EPISODE_NUMBER"
            java.lang.String r4 = "com.google.android.gms.cast.metadata.BROADCAST_DATE"
            java.lang.String r10 = "com.google.android.gms.cast.metadata.SERIES_TITLE"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.SEASON_NUMBER"
            java.lang.String[] r3 = new java.lang.String[]{r11, r10, r12, r3, r4}
            java.util.Collections.addAll(r2, r3)
            goto L_0x009f
        L_0x008c:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.STUDIO"
            java.lang.String[] r3 = new java.lang.String[]{r11, r3, r10, r4}
            java.util.Collections.addAll(r2, r3)
            goto L_0x009f
        L_0x0096:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.ARTIST"
            java.lang.String[] r3 = new java.lang.String[]{r11, r3, r10, r4}
            java.util.Collections.addAll(r2, r3)
        L_0x009f:
            java.lang.String r3 = "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER"
            java.lang.String r4 = "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"
            java.lang.String r10 = "com.google.android.gms.cast.metadata.SECTION_DURATION"
            java.lang.String r11 = "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"
            java.lang.String r12 = "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME"
            java.lang.String[] r3 = new java.lang.String[]{r10, r11, r12, r3, r4}
            java.util.Collections.addAll(r2, r3)
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x0149 }
        L_0x00b4:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x0149 }
            if (r3 == 0) goto L_0x010d
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x0149 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x0149 }
            if (r3 == 0) goto L_0x00b4
            android.os.Bundle r4 = r0.f11105c     // Catch:{ JSONException -> 0x0149 }
            boolean r4 = r4.containsKey(r3)     // Catch:{ JSONException -> 0x0149 }
            if (r4 == 0) goto L_0x00b4
            h4.q0 r4 = f11103g     // Catch:{ JSONException -> 0x0149 }
            java.lang.String r10 = r4.mo41805c(r3)     // Catch:{ JSONException -> 0x0149 }
            if (r10 == 0) goto L_0x00b4
            int r4 = r4.mo41803a(r3)     // Catch:{ JSONException -> 0x0149 }
            if (r4 == r9) goto L_0x0103
            if (r4 == r8) goto L_0x00f9
            if (r4 == r7) goto L_0x00ef
            if (r4 == r6) goto L_0x0103
            if (r4 == r5) goto L_0x00e1
            goto L_0x00b4
        L_0x00e1:
            android.os.Bundle r4 = r0.f11105c     // Catch:{ JSONException -> 0x0149 }
            long r3 = r4.getLong(r3)     // Catch:{ JSONException -> 0x0149 }
            double r3 = p150l4.C8673a.m17443b(r3)     // Catch:{ JSONException -> 0x0149 }
            r1.put(r10, r3)     // Catch:{ JSONException -> 0x0149 }
            goto L_0x00b4
        L_0x00ef:
            android.os.Bundle r4 = r0.f11105c     // Catch:{ JSONException -> 0x0149 }
            double r3 = r4.getDouble(r3)     // Catch:{ JSONException -> 0x0149 }
            r1.put(r10, r3)     // Catch:{ JSONException -> 0x0149 }
            goto L_0x00b4
        L_0x00f9:
            android.os.Bundle r4 = r0.f11105c     // Catch:{ JSONException -> 0x0149 }
            int r3 = r4.getInt(r3)     // Catch:{ JSONException -> 0x0149 }
            r1.put(r10, r3)     // Catch:{ JSONException -> 0x0149 }
            goto L_0x00b4
        L_0x0103:
            android.os.Bundle r4 = r0.f11105c     // Catch:{ JSONException -> 0x0149 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ JSONException -> 0x0149 }
            r1.put(r10, r3)     // Catch:{ JSONException -> 0x0149 }
            goto L_0x00b4
        L_0x010d:
            android.os.Bundle r2 = r0.f11105c     // Catch:{ JSONException -> 0x0149 }
            java.util.Set r2 = r2.keySet()     // Catch:{ JSONException -> 0x0149 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x0149 }
        L_0x0117:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x0149 }
            if (r3 == 0) goto L_0x0149
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x0149 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x0149 }
            java.lang.String r4 = "com.google."
            boolean r4 = r3.startsWith(r4)     // Catch:{ JSONException -> 0x0149 }
            if (r4 != 0) goto L_0x0117
            android.os.Bundle r4 = r0.f11105c     // Catch:{ JSONException -> 0x0149 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ JSONException -> 0x0149 }
            boolean r5 = r4 instanceof java.lang.String     // Catch:{ JSONException -> 0x0149 }
            if (r5 == 0) goto L_0x0139
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x0149 }
            goto L_0x0117
        L_0x0139:
            boolean r5 = r4 instanceof java.lang.Integer     // Catch:{ JSONException -> 0x0149 }
            if (r5 == 0) goto L_0x0141
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x0149 }
            goto L_0x0117
        L_0x0141:
            boolean r5 = r4 instanceof java.lang.Double     // Catch:{ JSONException -> 0x0149 }
            if (r5 == 0) goto L_0x0117
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x0149 }
            goto L_0x0117
        L_0x0149:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p109h4.C7931g.mo41712J():org.json.JSONObject");
    }

    /* renamed from: K */
    public final void mo41713K(@NonNull JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        clear();
        this.f11106d = 0;
        try {
            this.f11106d = jSONObject2.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        if (optJSONArray != null) {
            C8823b.m17884c(this.f11104b, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.f11106d;
        if (i == 0) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i == 1) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i == 2) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"});
        } else if (i == 3) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i == 4) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"});
        } else if (i == 5) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE"});
        }
        Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"});
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    C7959q0 q0Var = f11103g;
                    String d = q0Var.mo41806d(next);
                    if (d == null) {
                        Object obj = jSONObject2.get(next);
                        if (obj instanceof String) {
                            this.f11105c.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f11105c.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f11105c.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(d)) {
                        try {
                            Object obj2 = jSONObject2.get(next);
                            if (obj2 != null) {
                                int a = q0Var.mo41803a(d);
                                if (a != 1) {
                                    if (a != 2) {
                                        if (a == 3) {
                                            double optDouble = jSONObject2.optDouble(next);
                                            if (!Double.isNaN(optDouble)) {
                                                this.f11105c.putDouble(d, optDouble);
                                            }
                                        } else if (a != 4) {
                                            if (a == 5) {
                                                this.f11105c.putLong(d, C8673a.m17446e(jSONObject2.optLong(next)));
                                            }
                                        } else if (obj2 instanceof String) {
                                            String str = (String) obj2;
                                            if (C8823b.m17882a(str) != null) {
                                                this.f11105c.putString(d, str);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.f11105c.putInt(d, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.f11105c.putString(d, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public void clear() {
        this.f11105c.clear();
        this.f11104b.clear();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7931g)) {
            return false;
        }
        C7931g gVar = (C7931g) obj;
        if (!m15579L(this.f11105c, gVar.f11105c) || !this.f11104b.equals(gVar.f11104b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        Bundle bundle = this.f11105c;
        int i2 = 17;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = this.f11105c.get(str);
                int i3 = i2 * 31;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
        }
        return (i2 * 31) + this.f11104b.hashCode();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20543w(parcel, 2, mo41708A(), false);
        C9883b.m20525e(parcel, 3, this.f11105c, false);
        C9883b.m20532l(parcel, 4, mo41709F());
        C9883b.m20522b(parcel, a);
    }

    public C7931g(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    C7931g(List list, Bundle bundle, int i) {
        this.f11107e = new C7932a();
        this.f11104b = list;
        this.f11105c = bundle;
        this.f11106d = i;
    }
}
