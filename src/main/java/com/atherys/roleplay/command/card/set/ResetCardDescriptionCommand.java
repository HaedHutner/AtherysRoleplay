package com.atherys.roleplay.command.card.set;

import com.atherys.core.command.PlayerCommand;
import com.atherys.core.command.annotation.Aliases;
import com.atherys.core.command.annotation.Description;
import com.atherys.roleplay.AtherysRoleplay;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.entity.living.player.Player;

import javax.annotation.Nonnull;

@Aliases("description")
@Description("Resets your description.")
public class ResetCardDescriptionCommand implements PlayerCommand {

    @Nonnull
    @Override
    public CommandResult execute(@Nonnull Player source, @Nonnull CommandContext args) {
        AtherysRoleplay.getInstance().getCardFacade().setCardDescription(source, "");
        return CommandResult.success();
    }
}
