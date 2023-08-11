package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.jf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4983jf {
    /* renamed from: a */
    static String m7106a(C4980jc jcVar) {
        StringBuilder sb = new StringBuilder(jcVar.mo32730j());
        for (int i = 0; i < jcVar.mo32730j(); i++) {
            byte b = jcVar.mo32728b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b >= 32 && b <= 126) {
                            sb.append((char) b);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
