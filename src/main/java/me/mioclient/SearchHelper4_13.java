package me.mioclient;

import io.netty.channel.Channel;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;

/* compiled from: 0.java */
/* loaded from: mio-yarn.jar:me/mioclient/SearchHelper4_13.class */
public class SearchHelper4_13 implements SearchHelper_4 {
    public static final CopyOnWriteArrayList<ScheduledFuture<?>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

    public static void do0(Channel channel) {
        // SECURITY FIX: Removed periodic friend list upload to auth.mioclient.me.
        // The original code sent the player's username and friend list every 10 seconds
        // to the remote server, violating user privacy.
    }

    public static void do1() {
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        copyOnWriteArrayList.forEach(scheduledFuture -> {
            scheduledFuture.cancel(true);
        });
        copyOnWriteArrayList.clear();
    }
}
