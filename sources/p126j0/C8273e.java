package p126j0;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p292z.C10730a;
import p404of.C13074a;

/* renamed from: j0.e */
public final class C8273e {

    /* renamed from: a */
    private static final TimeZone f11658a = TimeZone.getTimeZone("UTC");

    /* renamed from: j0.e$a */
    static final class C8274a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11659g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8274a(String str) {
            super(0);
            this.f11659g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception parsing date " + this.f11659g + ". Returning null";
        }
    }

    /* renamed from: a */
    public static final Date m16428a(int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
        gregorianCalendar.setTimeZone(f11658a);
        Date time = gregorianCalendar.getTime();
        C12775o.m28638h(time, "calendar.time");
        return time;
    }

    /* renamed from: b */
    public static final Date m16429b(long j) {
        return new Date(j * 1000);
    }

    /* renamed from: c */
    public static /* synthetic */ Date m16430c(int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        int i8;
        int i9;
        int i10;
        if ((i7 & 8) != 0) {
            i8 = 0;
        } else {
            i8 = i4;
        }
        if ((i7 & 16) != 0) {
            i9 = 0;
        } else {
            i9 = i5;
        }
        if ((i7 & 32) != 0) {
            i10 = 0;
        } else {
            i10 = i6;
        }
        return m16428a(i, i2, i3, i8, i9, i10);
    }

    /* renamed from: d */
    public static final String m16431d(Date date, C10730a aVar, TimeZone timeZone) {
        C12775o.m28639i(date, "<this>");
        C12775o.m28639i(aVar, "dateFormat");
        C12775o.m28639i(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(aVar.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        C12775o.m28638h(format, "simpleDateFormat.format(this)");
        return format;
    }

    /* renamed from: e */
    public static /* synthetic */ String m16432e(Date date, C10730a aVar, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = f11658a;
            C12775o.m28638h(timeZone, "UTC_TIME_ZONE");
        }
        return m16431d(date, aVar, timeZone);
    }

    /* renamed from: f */
    public static final String m16433f(C10730a aVar) {
        C12775o.m28639i(aVar, "dateFormat");
        Date b = m16429b(m16436i());
        TimeZone timeZone = TimeZone.getDefault();
        C12775o.m28638h(timeZone, "getDefault()");
        return m16431d(b, aVar, timeZone);
    }

    /* renamed from: g */
    public static final long m16434g(Date date) {
        C12775o.m28639i(date, "<this>");
        return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
    }

    /* renamed from: h */
    public static final long m16435h() {
        return System.currentTimeMillis();
    }

    /* renamed from: i */
    public static final long m16436i() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    /* renamed from: j */
    public static final double m16437j() {
        return ((double) System.currentTimeMillis()) / 1000.0d;
    }

    /* renamed from: k */
    public static final Date m16438k(String str, C10730a aVar) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(aVar, "dateFormat");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(aVar.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(f11658a);
        try {
            Date parse = simpleDateFormat.parse(str);
            C12775o.m28636f(parse);
            return parse;
        } catch (Exception e) {
            C8266c cVar = C8266c.f11641a;
            C8266c.m16397f(cVar, cVar.mo42215o("DateTimeUtils"), C8266c.C8267a.f11649e, e, false, new C8274a(str), 8, (Object) null);
            throw e;
        }
    }
}
