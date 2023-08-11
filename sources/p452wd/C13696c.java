package p452wd;

import java.io.PrintWriter;

/* renamed from: wd.c */
/* compiled from: StatsSnapshot */
public class C13696c {

    /* renamed from: a */
    public final int f22062a;

    /* renamed from: b */
    public final int f22063b;

    /* renamed from: c */
    public final long f22064c;

    /* renamed from: d */
    public final long f22065d;

    /* renamed from: e */
    public final long f22066e;

    /* renamed from: f */
    public final long f22067f;

    /* renamed from: g */
    public final long f22068g;

    /* renamed from: h */
    public final long f22069h;

    /* renamed from: i */
    public final long f22070i;

    /* renamed from: j */
    public final long f22071j;

    /* renamed from: k */
    public final int f22072k;

    /* renamed from: l */
    public final int f22073l;

    /* renamed from: m */
    public final int f22074m;

    /* renamed from: n */
    public final long f22075n;

    public C13696c(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f22062a = i;
        this.f22063b = i2;
        this.f22064c = j;
        this.f22065d = j2;
        this.f22066e = j3;
        this.f22067f = j4;
        this.f22068g = j5;
        this.f22069h = j6;
        this.f22070i = j7;
        this.f22071j = j8;
        this.f22072k = i3;
        this.f22073l = i4;
        this.f22074m = i5;
        this.f22075n = j9;
    }

    /* renamed from: a */
    public void mo53361a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f22062a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f22063b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f22063b) / ((float) this.f22062a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f22064c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f22065d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f22072k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f22066e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f22069h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f22073l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f22067f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f22074m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f22068g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f22070i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f22071j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f22062a + ", size=" + this.f22063b + ", cacheHits=" + this.f22064c + ", cacheMisses=" + this.f22065d + ", downloadCount=" + this.f22072k + ", totalDownloadSize=" + this.f22066e + ", averageDownloadSize=" + this.f22069h + ", totalOriginalBitmapSize=" + this.f22067f + ", totalTransformedBitmapSize=" + this.f22068g + ", averageOriginalBitmapSize=" + this.f22070i + ", averageTransformedBitmapSize=" + this.f22071j + ", originalBitmapCount=" + this.f22073l + ", transformedBitmapCount=" + this.f22074m + ", timeStamp=" + this.f22075n + '}';
    }
}
