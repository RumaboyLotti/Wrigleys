package org.lime.doublemint.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;


public class EnchantBottle implements Listener {

    @EventHandler
    public void onXPBottleBreak(ExpBottleEvent e) {

       e.setShowEffect(false);
    }

}
