package io.github.sefiraat.crystamaehistoria.slimefun.machines.liquefactionbasin;

import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class SpellRecipe {

    private final int tier;
    private final List<StoryType> storyTypes;

    public SpellRecipe(int tier, StoryType type1, StoryType type2, StoryType type3) {
        this.tier = tier;
        this.storyTypes = Arrays.asList(type1, type2, type3);
    }

    public boolean recipeMatches(Set<StoryType> testTypes, int tier) {
        return this.storyTypes.containsAll(testTypes) && this.tier == tier;
    }

    public int getTier() {
        return this.tier;
    }

    public StoryType getInput(int index) {
        return this.storyTypes.get(index);
    }

}
