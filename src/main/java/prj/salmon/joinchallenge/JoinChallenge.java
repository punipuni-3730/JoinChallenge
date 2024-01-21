package prj.salmon.joinchallenge;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinChallenge extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("challenge").setExecutor(new ChallengeCommandExecutor());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
