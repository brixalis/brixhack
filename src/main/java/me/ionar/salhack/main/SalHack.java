package me.ionar.salhack.main;

import com.google.gson.Gson;

import me.ionar.salhack.SalHackMod;
import me.ionar.salhack.friend.Friend;
import me.ionar.salhack.managers.CommandManager;
import me.ionar.salhack.managers.DirectoryManager;
import me.ionar.salhack.managers.DiscordManager;
import me.ionar.salhack.managers.FontManager;
import me.ionar.salhack.managers.FriendManager;
import me.ionar.salhack.managers.HudManager;
import me.ionar.salhack.managers.ImageManager;
import me.ionar.salhack.managers.ModuleManager;
import me.ionar.salhack.managers.NotificationManager;
import me.ionar.salhack.managers.TickRateManager;
import net.minecraft.util.Session;
import net.minecraft.util.text.TextComponentString;

public class SalHack
{
    private static ModuleManager m_ModuleManager = new ModuleManager();
    private static ImageManager m_ImageManager = new ImageManager();
    private static FontManager m_FontManager = new FontManager();
    private static HudManager m_HudManager = new HudManager();
    private static FriendManager m_FriendManager = new FriendManager();
    private static DiscordManager m_DiscordManager = new DiscordManager();
    private static DirectoryManager m_DirectoryManager = new DirectoryManager();
    private static CommandManager m_CommandManager = new CommandManager();
    private static TickRateManager m_TickRateManager = new TickRateManager();
    private static NotificationManager m_NotificationManager = new NotificationManager();

    public static void Init()
    {
        SalHackMod.log.info("initalizing salhack object (all static fields)");
        m_DirectoryManager.Init();

        m_ModuleManager.Init();
        m_HudManager.Init();
        m_CommandManager.InitalizeCommands();
        
        m_FontManager.Load();
        m_ImageManager.Load();
        m_DiscordManager.Start();
    }

    public static ModuleManager GetModuleManager()
    {
        return m_ModuleManager;
    }

    public static ImageManager GetImageManager()
    {
        return m_ImageManager;
    }

    public static FontManager GetFontManager()
    {
        return m_FontManager;
    }

    /// Writes a message to ingame chat
    /// Player must be ingame for this
    public static void SendMessage(String string)
    {
        Wrapper.GetMC().ingameGUI.getChatGUI().printChatMessage(new TextComponentString(string));
    }

    public static HudManager GetHudManager()
    {
        return m_HudManager;
    }

    public static FriendManager GetFriendManager()
    {
        return m_FriendManager;
    }

    public static DiscordManager GetDiscordManager()
    {
        return m_DiscordManager;
    }

    public static DirectoryManager GetDirectoryManager()
    {
        return m_DirectoryManager;
    }

    public static CommandManager GetCommandManager()
    {
        return m_CommandManager;
    }
    
    public static TickRateManager GetTickRateManager()
    {
        return m_TickRateManager;
    }

    public static NotificationManager GetNotificationManager()
    {
        return m_NotificationManager;
    }
}
