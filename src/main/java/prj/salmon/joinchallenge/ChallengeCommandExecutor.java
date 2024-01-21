package prj.salmon.joinchallenge;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChallengeCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(!(sender instanceof Player)) return false;  //コマンド実行者はプレイヤーですか？
        Player player = (Player) sender;  //コマンド実行者をプレイヤーにする
        player.sendMessage(player+"さんに問題です！");
        player.sendMessage("Q1. みくにはくさい？");
        player.sendMessage("はい→/answer kusai");
        player.sendMessage("いいえ→/answer kusakunai");
        return false;
    }
}
