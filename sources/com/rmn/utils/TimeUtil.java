package com.rmn.utils;

import android.content.Context;
import com.poulpeo.R;
import java.util.Date;

public abstract class TimeUtil {

    enum TypeTimeLabel {
        SECONDS,
        MINUTES,
        HOURS,
        DAYS,
        MONTHS,
        YEARS
    }

    /* renamed from: com.rmn.utils.TimeUtil$a */
    static /* synthetic */ class C11664a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18159a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.rmn.utils.TimeUtil$TypeTimeLabel[] r0 = com.rmn.utils.TimeUtil.TypeTimeLabel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18159a = r0
                com.rmn.utils.TimeUtil$TypeTimeLabel r1 = com.rmn.utils.TimeUtil.TypeTimeLabel.SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18159a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rmn.utils.TimeUtil$TypeTimeLabel r1 = com.rmn.utils.TimeUtil.TypeTimeLabel.MINUTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18159a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rmn.utils.TimeUtil$TypeTimeLabel r1 = com.rmn.utils.TimeUtil.TypeTimeLabel.HOURS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18159a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.rmn.utils.TimeUtil$TypeTimeLabel r1 = com.rmn.utils.TimeUtil.TypeTimeLabel.DAYS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18159a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.rmn.utils.TimeUtil$TypeTimeLabel r1 = com.rmn.utils.TimeUtil.TypeTimeLabel.MONTHS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18159a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.rmn.utils.TimeUtil$TypeTimeLabel r1 = com.rmn.utils.TimeUtil.TypeTimeLabel.YEARS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rmn.utils.TimeUtil.C11664a.<clinit>():void");
        }
    }

    public static String getDateDiffString(Date date, Date date2, Context context) {
        long time = (date2.getTime() - date.getTime()) / 1000;
        if (time <= 0) {
            time = 1;
        }
        if (time < 60) {
            return stringForTime((int) time, TypeTimeLabel.SECONDS, context);
        }
        long j = time / 60;
        if (j < 60) {
            return stringForTime((int) j, TypeTimeLabel.MINUTES, context);
        }
        long j2 = j / 60;
        if (j2 < 24) {
            return stringForTime((int) j2, TypeTimeLabel.HOURS, context);
        }
        long j3 = j2 / 24;
        if (j3 < 30) {
            return stringForTime((int) j3, TypeTimeLabel.DAYS, context);
        }
        long j4 = j3 / 30;
        if (j4 < 12) {
            return stringForTime((int) j4, TypeTimeLabel.MONTHS, context);
        }
        return stringForTime((int) (j4 / 12), TypeTimeLabel.YEARS, context);
    }

    private static String stringForTime(int i, TypeTimeLabel typeTimeLabel, Context context) {
        switch (C11664a.f18159a[typeTimeLabel.ordinal()]) {
            case 1:
                return context.getString(R.string.seconds, new Object[]{String.valueOf(i)});
            case 2:
                return context.getString(R.string.minutes, new Object[]{String.valueOf(i)});
            case 3:
                return context.getString(R.string.hours, new Object[]{String.valueOf(i)});
            case 4:
                if (i <= 1) {
                    return context.getString(R.string.one_day);
                }
                return context.getString(R.string.days, new Object[]{String.valueOf(i)});
            case 5:
                return context.getString(R.string.months, new Object[]{String.valueOf(i)});
            case 6:
                if (i <= 1) {
                    return context.getString(R.string.one_year);
                }
                return context.getString(R.string.years, new Object[]{String.valueOf(i)});
            default:
                return "";
        }
    }
}
