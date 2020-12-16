package org.andengine.d;

import java.io.Closeable;
import java.io.IOException;

public final class d {
    public static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
