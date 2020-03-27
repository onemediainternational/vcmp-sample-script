package com.github.newk5.vcmp.samplescript.commands;

import com.maxorator.vcmp.java.tools.commands.Command;
import com.maxorator.vcmp.java.plugin.integration.player.Player;
import com.maxorator.vcmp.java.tools.commands.CommandController;
import com.maxorator.vcmp.java.plugin.integration.generic.Colour;
import static com.github.newk5.vcmp.samplescript.controllers.MainController.server;
import java.util.concurrent.TimeUnit;

public class PlayerCommands implements CommandController {

    private final static Colour LIGHT_GREEN = new Colour(200, 255, 200);

    public PlayerCommands() {
    }

    @Override
    public boolean checkAccess(Player player) {
        return true;
    }

    @Command(usage = "<playerID>")
    public void fps(Player player, Integer id) {
        Player p = server.getPlayer(id);
        if (p != null) {
            server.sendClientMessage(player, LIGHT_GREEN, p.getName() + "'s fps: " + p.getFPS());
        }
    }
    
    @Command(usage = "<playerID>")
    public void ping(Player player, Integer id) {
        Player p = server.getPlayer(id);
        if (p != null) {
            server.sendClientMessage(player, LIGHT_GREEN, p.getName() + "'s ping: " + p.getPing());
        }
    }
    
    @Command
    public void e(Player player){
        player.removeFromVehicle();
    }
    
    @Command
    public void heal(Player player) throws InterruptedException{
        TimeUnit.SECONDS.sleep(5);
        player.setHealth(100);
    }
    
    @Command
    public void disarm(Player player){
        player.removeAllWeapons();
    }
    
    @Command(usage = "<weaponID>")
    public void wep(Player player, Integer id){
        switch(id){
            case 1:
                player.giveWeapon(1, 999999);
                break;
            case 2:
                player.giveWeapon(2, 999999);
                break;
            case 3:
                player.giveWeapon(3, 999999);
                break;
            case 4:
                player.giveWeapon(4, 999999);
                break;
            case 5:
                player.giveWeapon(5, 999999);
                break;
            case 6:
                player.giveWeapon(6, 999999);
                break;
            case 7:
                player.giveWeapon(7, 999999);
                break;
            case 8:
                player.giveWeapon(8, 999999);
                break;
            case 9:
                player.giveWeapon(9, 999999);
                break;
            case 10:
                player.giveWeapon(10, 999999);
                break;
            case 11:
                player.giveWeapon(11, 999999);
                break;
            case 12:
                player.giveWeapon(12, 999999);
                break;
            case 13:
                player.giveWeapon(13, 999999);
                break;
            case 14:
                player.giveWeapon(14, 999999);
                break;
            case 15:
                player.giveWeapon(15, 999999);
                break;
            case 16:
                player.giveWeapon(16, 999999);
                break;
            case 17:
                player.giveWeapon(17, 999999);
                break;
            case 18:
                player.giveWeapon(18, 999999);
                break;
            case 19:
                player.giveWeapon(19, 999999);
                break;
            case 20:
                player.giveWeapon(20, 999999);
                break;
            case 21:
                player.giveWeapon(21, 999999);
                break;
            case 22:
                player.giveWeapon(22, 999999);
                break;
            case 23:
                player.giveWeapon(23, 999999);
                break;
            case 24:
                player.giveWeapon(24, 999999);
                break;
            case 25:
                player.giveWeapon(25, 999999);
                break;
            case 26:
                player.giveWeapon(26, 999999);
                break;
            case 27:
                player.giveWeapon(27, 999999);
                break;
            case 28:
                player.giveWeapon(28, 999999);
                break;
            case 29:
                player.giveWeapon(29, 999999);
                break;
            case 30:
                player.giveWeapon(30, 999999);
                break;
            case 31:
                player.giveWeapon(31, 999999);
                break;
            case 32:
                player.giveWeapon(32, 999999);
                break;
            case 33:
                player.giveWeapon(33, 999999);
                break;
            case 36:
                player.giveWeapon(36, 999999);
                break;
        }
    }
    
    @Command
    public void cmds(Player player){
        server.sendClientMessage(player, LIGHT_GREEN, "/fps, /ping.");
        server.sendClientMessage(player, LIGHT_GREEN, "/e, /wep, /heal, /disarm.");
    }
}