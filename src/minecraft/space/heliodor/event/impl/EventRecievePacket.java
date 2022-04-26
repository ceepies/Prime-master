package space.heliodor.event.impl;

import net.minecraft.network.Packet;
import space.heliodor.event.Event;

public class EventRecievePacket extends Event {
    public Packet packet;
    public boolean isCancelled;

    public EventRecievePacket(Packet packet) {
        this.packet = packet;
    }

    public Packet getPacket() {
        return packet;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
}
