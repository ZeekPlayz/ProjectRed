package mrtjp.projectred.illumination;

import mrtjp.projectred.ProjectRedIllumination;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.NetClientHandler;
import codechicken.lib.packet.PacketCustom;
import codechicken.lib.packet.PacketCustom.IClientPacketHandler;

public class IlluminationCPH implements IClientPacketHandler
{
    public static Object channel = ProjectRedIllumination.instance;

    @Override
    public void handlePacket(PacketCustom packet, NetClientHandler nethandler, Minecraft mc)
    {
        switch (packet.getType()) {
        }
    }

}
