package androidx.constraintlayout.core.parser;

import java.util.Iterator;

public class CLObject extends CLContainer implements Iterable<CLKey> {

    private class CLObjectIterator implements Iterator {
        int index = 0;
        CLObject myObject;

        public CLObjectIterator(CLObject cLObject) {
            this.myObject = cLObject;
        }

        public boolean hasNext() {
            if (this.index < this.myObject.size()) {
                return true;
            }
            return false;
        }

        public Object next() {
            CLKey cLKey = (CLKey) this.myObject.mElements.get(this.index);
            this.index++;
            return cLKey;
        }
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static CLObject allocate(char[] cArr) {
        return new CLObject(cArr);
    }

    public Iterator iterator() {
        return new CLObjectIterator(this);
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "{ ");
        Iterator<CLElement> it = this.mElements.iterator();
        boolean z = true;
        while (it.hasNext()) {
            CLElement next = it.next();
            if (!z) {
                sb.append(", ");
            } else {
                z = false;
            }
            sb.append(next.toJSON());
        }
        sb.append(" }");
        return sb.toString();
    }

    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder(getDebugName());
        sb.append("{\n");
        Iterator<CLElement> it = this.mElements.iterator();
        boolean z = true;
        while (it.hasNext()) {
            CLElement next = it.next();
            if (!z) {
                sb.append(",\n");
            } else {
                z = false;
            }
            sb.append(next.toFormattedJSON(CLElement.BASE_INDENT + i, i2 - 1));
        }
        sb.append("\n");
        addIndent(sb, i);
        sb.append("}");
        return sb.toString();
    }
}
