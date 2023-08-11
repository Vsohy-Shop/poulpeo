package com.google.protobuf;

/* renamed from: com.google.protobuf.j1 */
/* compiled from: TextFormatEscaper */
final class C7121j1 {

    /* renamed from: com.google.protobuf.j1$a */
    /* compiled from: TextFormatEscaper */
    static class C7122a implements C7123b {

        /* renamed from: a */
        final /* synthetic */ C7086h f9642a;

        C7122a(C7086h hVar) {
            this.f9642a = hVar;
        }

        /* renamed from: a */
        public byte mo40456a(int i) {
            return this.f9642a.mo40328d(i);
        }

        public int size() {
            return this.f9642a.size();
        }
    }

    /* renamed from: com.google.protobuf.j1$b */
    /* compiled from: TextFormatEscaper */
    private interface C7123b {
        /* renamed from: a */
        byte mo40456a(int i);

        int size();
    }

    /* renamed from: a */
    static String m13327a(C7086h hVar) {
        return m13328b(new C7122a(hVar));
    }

    /* renamed from: b */
    static String m13328b(C7123b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte a = bVar.mo40456a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
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
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
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

    /* renamed from: c */
    static String m13329c(String str) {
        return m13327a(C7086h.m13063s(str));
    }
}
