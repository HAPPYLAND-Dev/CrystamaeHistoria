package io.github.sefiraat.crystamaehistoria.commands;

import io.github.mooy1.infinitylib.commands.SubCommand;
import io.github.sefiraat.crystamaehistoria.player.PlayerStatistics;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public class GetRanks extends SubCommand {

    public GetRanks() {
        super("rank", "显示你的魔法等级", false);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void execute(CommandSender sender, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ThemeType.prefix() + PlayerStatistics.getSpellRankString(player.getUniqueId()));
            player.sendMessage(ThemeType.prefix() + PlayerStatistics.getStoryRankString(player.getUniqueId()));
            player.sendMessage(ThemeType.prefix() + PlayerStatistics.getGildingRankString(player.getUniqueId()));
        }
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void complete(CommandSender commandSender, String[] strings, List<String> list) {
        // Not required
    }
}