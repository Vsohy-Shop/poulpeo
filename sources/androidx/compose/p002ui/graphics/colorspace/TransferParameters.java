package androidx.compose.p002ui.graphics.colorspace;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.graphics.colorspace.TransferParameters */
/* compiled from: TransferParameters.kt */
public final class TransferParameters {

    /* renamed from: a */
    private final double f274a;

    /* renamed from: b */
    private final double f275b;

    /* renamed from: c */
    private final double f276c;

    /* renamed from: d */
    private final double f277d;

    /* renamed from: e */
    private final double f278e;

    /* renamed from: f */
    private final double f279f;
    private final double gamma;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        if ((r2 == 0.0d) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0093, code lost:
        if ((r2 == 0.0d) != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TransferParameters(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        /*
            r1 = this;
            r1.<init>()
            r1.gamma = r2
            r1.f274a = r4
            r1.f275b = r6
            r1.f276c = r8
            r1.f277d = r10
            r1.f278e = r12
            r1.f279f = r14
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r6)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r8)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r10)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r12)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r14)
            if (r6 != 0) goto L_0x00d9
            boolean r6 = java.lang.Double.isNaN(r2)
            if (r6 != 0) goto L_0x00d9
            r6 = 0
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 < 0) goto L_0x00c2
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x00c2
            int r14 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            r15 = 1
            r0 = 0
            if (r14 != 0) goto L_0x004f
            r14 = r15
            goto L_0x0050
        L_0x004f:
            r14 = r0
        L_0x0050:
            if (r14 == 0) goto L_0x006d
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x0058
            r14 = r15
            goto L_0x0059
        L_0x0058:
            r14 = r0
        L_0x0059:
            if (r14 != 0) goto L_0x0065
            int r14 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x0061
            r14 = r15
            goto L_0x0062
        L_0x0061:
            r14 = r0
        L_0x0062:
            if (r14 != 0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameter a or g is zero, the transfer function is constant"
            r2.<init>(r3)
            throw r2
        L_0x006d:
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0083
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0077
            r10 = r15
            goto L_0x0078
        L_0x0077:
            r10 = r0
        L_0x0078:
            if (r10 != 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameter c is zero, the transfer function is constant"
            r2.<init>(r3)
            throw r2
        L_0x0083:
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0089
            r10 = r15
            goto L_0x008a
        L_0x0089:
            r10 = r0
        L_0x008a:
            if (r10 != 0) goto L_0x0095
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0092
            r10 = r15
            goto L_0x0093
        L_0x0092:
            r10 = r0
        L_0x0093:
            if (r10 == 0) goto L_0x009d
        L_0x0095:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r15 = r0
        L_0x009b:
            if (r15 != 0) goto L_0x00ba
        L_0x009d:
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00b2
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x00aa
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x00aa
            return
        L_0x00aa:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The transfer function must be positive or increasing"
            r2.<init>(r3)
            throw r2
        L_0x00b2:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The transfer function must be increasing"
            r2.<init>(r3)
            throw r2
        L_0x00ba:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameter a or g is zero, and c is zero, the transfer function is constant"
            r2.<init>(r3)
            throw r2
        L_0x00c2:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Parameter d must be in the range [0..1], was "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x00d9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameters cannot be NaN"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.colorspace.TransferParameters.<init>(double, double, double, double, double, double, double):void");
    }

    public static /* synthetic */ TransferParameters copy$default(TransferParameters transferParameters, double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, Object obj) {
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        TransferParameters transferParameters2 = transferParameters;
        if ((i & 1) != 0) {
            d8 = transferParameters2.gamma;
        } else {
            d8 = d;
        }
        if ((i & 2) != 0) {
            d9 = transferParameters2.f274a;
        } else {
            d9 = d2;
        }
        if ((i & 4) != 0) {
            d10 = transferParameters2.f275b;
        } else {
            d10 = d3;
        }
        if ((i & 8) != 0) {
            d11 = transferParameters2.f276c;
        } else {
            d11 = d4;
        }
        if ((i & 16) != 0) {
            d12 = transferParameters2.f277d;
        } else {
            d12 = d5;
        }
        if ((i & 32) != 0) {
            d13 = transferParameters2.f278e;
        } else {
            d13 = d6;
        }
        if ((i & 64) != 0) {
            d14 = transferParameters2.f279f;
        } else {
            d14 = d7;
        }
        return transferParameters.copy(d8, d9, d10, d11, d12, d13, d14);
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.f274a;
    }

    public final double component3() {
        return this.f275b;
    }

    public final double component4() {
        return this.f276c;
    }

    public final double component5() {
        return this.f277d;
    }

    public final double component6() {
        return this.f278e;
    }

    public final double component7() {
        return this.f279f;
    }

    public final TransferParameters copy(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        return new TransferParameters(d, d2, d3, d4, d5, d6, d7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        if (Double.compare(this.gamma, transferParameters.gamma) == 0 && Double.compare(this.f274a, transferParameters.f274a) == 0 && Double.compare(this.f275b, transferParameters.f275b) == 0 && Double.compare(this.f276c, transferParameters.f276c) == 0 && Double.compare(this.f277d, transferParameters.f277d) == 0 && Double.compare(this.f278e, transferParameters.f278e) == 0 && Double.compare(this.f279f, transferParameters.f279f) == 0) {
            return true;
        }
        return false;
    }

    public final double getA() {
        return this.f274a;
    }

    public final double getB() {
        return this.f275b;
    }

    public final double getC() {
        return this.f276c;
    }

    public final double getD() {
        return this.f277d;
    }

    public final double getE() {
        return this.f278e;
    }

    public final double getF() {
        return this.f279f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.gamma) * 31) + Double.hashCode(this.f274a)) * 31) + Double.hashCode(this.f275b)) * 31) + Double.hashCode(this.f276c)) * 31) + Double.hashCode(this.f277d)) * 31) + Double.hashCode(this.f278e)) * 31) + Double.hashCode(this.f279f);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.f274a + ", b=" + this.f275b + ", c=" + this.f276c + ", d=" + this.f277d + ", e=" + this.f278e + ", f=" + this.f279f + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransferParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, d5, (i & 32) != 0 ? 0.0d : d6, (i & 64) != 0 ? 0.0d : d7);
    }
}
